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
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller.NoStateIsDeadEnd;
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

	
	@SuppressWarnings({ "serial" })
	public static final LinkedList<Class<?>> uml_element = new LinkedList<Class<?>>(){{ 
		add(PackageImportImpl.class); 
	}};
	
	/*To get the name of anything I have to get the UML object and get the name since that is where the name is stored*/
	public static String getName(EObject target) {
		String name = null;
		if (target == null)
			return "Cannot get name of null!";
    	if (target instanceof System)
    		name = ((System) target).getBase_Component().getName();
    	else if (target instanceof SoI)
    		name = ((SoI) target).getBase_Component().getName();
    	else if (target instanceof ACS_Model)
    		name = ((ACS_Model) target).getBase_Model().getName();
    	else if (target instanceof Port)
    		name = ((Port) target).getBase_Port().getName();
    	else if (target instanceof LinkConnection)
    		name = ((LinkConnection) target).getBase_Connector().getName();
    	else if (target instanceof InterfaceConnection)
    		name = ((InterfaceConnection) target).getBase_Connector().getName();
    	else if (target instanceof LinkHub)
    		name = ((LinkHub) target).getBase_Port().getName();
    	else if (target instanceof Controller)
    		name = ((Controller) target).getBase_StateMachine().getName();
    	else if (target instanceof EventDeclaration)
    		name = ((EventDeclaration) target).getBase_StateMachine().getName();
    	else if (target instanceof ActionTransition)
    		name = ((ActionTransition) target).getBase_Transition().getName();
    	else if (target instanceof CONStartState)
    		name = ((CONStartState) target).getBase_Pseudostate().getName();
    	else if (target instanceof CONIntermediateState)
    		name = ((CONIntermediateState) target).getBase_State().getName();
    	else if (target instanceof LinkHolder)
    		name = ((LinkHolder) target).getBase_Component().getName();
    	else if (target instanceof COMStartState)
    		name = ((COMStartState) target).getBase_Pseudostate().getName();
    	else if (target instanceof COMIntermediateState)
    		name = ((COMIntermediateState) target).getBase_State().getName();
    	else if (target instanceof COMEndState)
    		name = ((COMEndState) target).getBase_State().getName();
    	else if (target instanceof Declared_Type)
    		name = ((Declared_Type) target).getBase_Class().getName();
    	else if (target instanceof MainMachine)
    		name = ((MainMachine) target).getBase_Region().getName();
    	else if (target instanceof SubMachine)
    		name = ((SubMachine) target).getBase_Region().getName();
    	else if (target instanceof ImplicitMachine)
    		name = ((ImplicitMachine) target).getBase_Region().getName();
    	else 
    		return "Cannot get name of: " + target.toString();
    	if (name == null)
    		return "Name was null on: " + target.toString();
    	return name;
	}
	
	@SuppressWarnings("serial")
	public static LinkedList<ConstraintInterface> constraintInterfaces = new LinkedList<ConstraintInterface>() {
		{
			/*Atomic System*/
			add(new ExactlyOnePort());
			
			/*Composite*/
			add(new AtleastOnePort());

			/*CONIntermediateState*/
			add(new NotADeadEnd());
			
			/*Controller*/
			add(new AllStatesReachable());
			add(new AtleastOneTransition());
			add(new ExactlyOneInitialNode());
			add(new NoStateIsDeadEnd());

			/*InterfaceConnection*/
			add(new ConnectedToAtomicSystemPort());
			add(new ConnectedToContainerPort());
			add(new ContainerPortAndInterfaceConnectionHaveSameParent());

			/*Link Connection*/
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

			/*Shared*/
			add(new ContainAtleastTwoSystems());
			add(new HasSystemCardinality());
			add(new MustHaveSourceAndTarget());
			add(new NameCannotStartWithDigit());
		}
	};

	public static String getMSG(ConstraintInterface constraint) {
		return constraint.getClass().getSimpleName() + " defines no specific error message.";
	}
}
