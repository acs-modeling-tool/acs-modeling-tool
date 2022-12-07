// Copyright 2022 ACS
//
// This file is part of ACS
//
// ACS is free software: you can redistribute it and/or modify it under
// the terms of the GNU General Public License version 3 as published by the
// Free Software Foundation.
//
// ACS is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
// Public License for more details.
//
// You should have received a copy of the GNU General Public License along
// with ACS. If not, see http://www.gnu.org/licenses/.
//
// Contributors: 
// Emil Palmelund Voldby
// Jonas Madsen
// Sean Kristian Remond Harbo
// Michele Albano
//
// Original repository: https://github.com/acs-modeling-tool/acs-modeling-tool

package org.eclipse.papyrus.acs.validation;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.COMEndState;
import org.eclipse.papyrus.acs.profile.model.COMIntermediateState;
import org.eclipse.papyrus.acs.profile.model.COMStartState;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.Controller;
import org.eclipse.papyrus.acs.profile.model.Declared_Type;
import org.eclipse.papyrus.acs.profile.model.EventDeclaration;
import org.eclipse.papyrus.acs.profile.model.ImplicitMachine;
import org.eclipse.papyrus.acs.profile.model.CONStartState;
import org.eclipse.papyrus.acs.profile.model.CONIntermediateState;
import org.eclipse.papyrus.acs.profile.model.ActionTransition;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.InvocationTransition;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHolder;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Machine;
import org.eclipse.papyrus.acs.profile.model.MainMachine;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.SubMachine;
import org.eclipse.papyrus.acs.profile.model.System;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.AtomicSystem.ExactlyOnePort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.CONIntermediateState.NotADeadEnd;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Composite.AtleastOnePort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller.AllStatesReachable;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller.AtleastOneTransition;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller.ExactlyOneInitialNode;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ConnectedToAtomicSystemPort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ConnectedToContainerPort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ContainerPortAndInterfaceConnectionHaveSameParent;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.DoesntCrossSystemBoundry;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.IsBetweenPortAndLinkhub;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.LinkCardinalityNotGreaterThanSystemCardinality;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.ActiveConnectionMustHaveSibling;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.IfOnBoundryOnlyInterfaceSystemsCanHaveActiveOrSelfReferentialLinkConnectionsToIt;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.MustContainSelfReferentialOrActiveConnection;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Machine.MustBeNoneCyclic;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port.MustHaveConnection;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port.PortMustHaveInterfaceConnectionWhenOnContainerSystem;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference.PortNameMatchHostPortName;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference.ReferencedSoINotNull;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.ContainAtleastTwoSystems;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.HasSystemCardinality;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.MustHaveSourceAndTarget;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.NameCannotStartWithDigit;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.internal.impl.PackageImportImpl;

@SuppressWarnings("restriction")
public abstract class Utils {
	
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> structure_elements_interface = new LinkedList<Class<?>>(){{ 
		add(ACS_Model.class); 
		add(SoI.class); 
		add(Composite.class); 
		add(AtomicSystem.class); 
		add(Reference.class); 
		add(Port.class); 
		add(LinkHub.class); 
		add(LinkHolder.class); 
		add(LinkConnection.class); 
		add(InterfaceConnection.class);
	}};
		
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> controller_elements_interface = new LinkedList<Class<?>>(){{ 
		add(Controller.class); 
		add(CONStartState.class); 
		add(CONIntermediateState.class); 
		add(ActionTransition.class); 
	}};

	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> event_elements_interface = new LinkedList<Class<?>>(){{ 
		add(InvocationTransition.class);
		add(COMStartState.class);
		add(COMIntermediateState.class);
		add(COMEndState.class);
		add(Machine.class); 
		add(SubMachine.class); 
		add(MainMachine.class); 
		add(ImplicitMachine.class); 
	}};
	
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> type_elements_interface = new LinkedList<Class<?>>(){{ 
		add(Declared_Type.class);
	}};

	
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> validatable_types = new LinkedList<Class<?>>(){{ 
		add(PackageImportImpl.class); 
	}};
	
	/*To get the name of anything I have to get the UML object and get the name since that is where the name is stored*/
	public static String getName(EObject target) {
		if (target == null)
			return "Cannot get name of null!";
		
		EObject base = getBase(target);
		if (base == null)
			return "Cannot get base (in order to get name) of: " + target.toString();

		String name = ((NamedElement)base).getName();
    	if (name == null)
    		return "Name was null on: " + target.toString();
    	
    	return name;
	}
	
	public static EObject getBase(EObject target) {
		if (target == null)
			return null;
		
    	if (target instanceof System)
    		return ((System) target).getBase_Component();
    	else if (target instanceof SoI)
    		return ((SoI) target).getBase_Component();
    	else if (target instanceof ACS_Model)
    		return ((ACS_Model) target).getBase_Model();
    	else if (target instanceof Port)
    		return ((Port) target).getBase_Port();
    	else if (target instanceof LinkConnection)
    		return ((LinkConnection) target).getBase_Connector();
    	else if (target instanceof InterfaceConnection)
    		return ((InterfaceConnection) target).getBase_Connector();
    	else if (target instanceof LinkHub)
    		return ((LinkHub) target).getBase_Port();
    	else if (target instanceof Controller)
    		return ((Controller) target).getBase_StateMachine();
    	else if (target instanceof EventDeclaration)
    		return ((EventDeclaration) target).getBase_StateMachine();
    	else if (target instanceof ActionTransition)
    		return ((ActionTransition) target).getBase_Transition();
    	else if (target instanceof CONStartState)
    		return ((CONStartState) target).getBase_Pseudostate();
    	else if (target instanceof CONIntermediateState)
    		return ((CONIntermediateState) target).getBase_State();
    	else if (target instanceof LinkHolder)
    		return ((LinkHolder) target).getBase_Component();
    	else if (target instanceof COMStartState)
    		return ((COMStartState) target).getBase_Pseudostate();
    	else if (target instanceof COMIntermediateState)
    		return ((COMIntermediateState) target).getBase_State();
    	else if (target instanceof COMEndState)
    		return ((COMEndState) target).getBase_State();
    	else if (target instanceof Declared_Type)
    		return ((Declared_Type) target).getBase_Class();
    	else if (target instanceof MainMachine)
    		return ((MainMachine) target).getBase_Region();
    	else if (target instanceof SubMachine)
    		return ((SubMachine) target).getBase_Region();
    	else if (target instanceof ImplicitMachine)
    		return ((ImplicitMachine) target).getBase_Region();
    	else 
    		throw new RuntimeException("Cannot get base of object: " + target.toString());
	}
	
	@SuppressWarnings("serial")
	public static LinkedList<ConstraintInterface> allConstraints = new LinkedList<ConstraintInterface>() {
		{
			/*Atomic System*/
			add(new ExactlyOnePort());
			
			/*Composite*/
			add(new AtleastOnePort());

			/*InterfaceConnection*/
			add(new ConnectedToAtomicSystemPort());
			add(new ConnectedToContainerPort());
			add(new ContainerPortAndInterfaceConnectionHaveSameParent());

			/*LinkConnection*/
			add(new DoesntCrossSystemBoundry());
			add(new IsBetweenPortAndLinkhub());
			add(new LinkCardinalityNotGreaterThanSystemCardinality());

			/*LinkHub*/
			add(new ActiveConnectionMustHaveSibling());
			add(new IfOnBoundryOnlyInterfaceSystemsCanHaveActiveOrSelfReferentialLinkConnectionsToIt());
			add(new MustContainSelfReferentialOrActiveConnection());

			/*Machine*/
			add(new MustBeNoneCyclic());

			/*Port*/
			add(new MustHaveConnection());
			add(new PortMustHaveInterfaceConnectionWhenOnContainerSystem());

			/*Reference*/
			add(new PortNameMatchHostPortName());
			add(new ReferencedSoINotNull());
			
			
			/*Controller*/
			add(new AllStatesReachable());
			add(new AtleastOneTransition());
			add(new ExactlyOneInitialNode());

			/*CONIntermediateState*/
			add(new NotADeadEnd());
			
			/*ActionTransition*/

			
			/*Shared*/
			add(new ContainAtleastTwoSystems());
			add(new HasSystemCardinality());
			add(new MustHaveSourceAndTarget());
			add(new NameCannotStartWithDigit());
		}
	};
}
