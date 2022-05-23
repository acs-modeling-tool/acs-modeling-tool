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
	
	/*To get the name of anything I have to get the UML object so this large if-else is sadly needed*/
	public static String getName(EObject target) {
		String name;
		
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
			add(new ExactlyOnePort());
			add(new NameCannotStartWithDigit());
			add(new ContainAtleastTwoSystems());
			add(new PortNameMatchHostPortName());
			add(new AtleastOnePort());
			add(new ReferencedSoINotNull());
			add(new HasSystemCardinality());
			add(new MustHaveConnection());
			add(new IsBetweenPortAndLinkhub());
			add(new LinkCardinalityNotGreaterThanSystemCardinality());
			add(new PortMustHaveInterfaceConnectionWhenOnContainerSystem());
			add(new DoesntCrossSystemBoundry());
			add(new ConnectedToContainerPort());
			add(new ConnectedToAtomicSystemPort());
			add(new MustContainSelfReferentialOrActiveConnection());
			add(new ContainerPortAndInterfaceConnectionHaveSameParent());
			add(new IfOnBoundryOnlyInterfaceSystemsCanHaveActiveOrSelfReferentialLinkConnectionsToIt());
			add(new ActiveConnectionMustHaveSibling());
			add(new AllStatesReachable());
			add(new NoStateIsDeadEnd());
			add(new ExactlyOneInitialNode());
			add(new MustHaveSourceAndTarget());
			add(new AtleastOneTransition());
			add(new MustBeNoneCyclic());
		}
	};

	public static String getMSG(ConstraintsEnum constraint) {
		switch (constraint) {
		case name_cannot_start_with_digit:
			return "Cannot have digit as first character in name.";
		case exactly_one_port:
			return "Must have exactly one Port.";
		case contain_atleast_two_systems:
			return "Must contain at least two Systems otherwise abstraction is redundant.";
		case atleast_one_port:
			return "Must have at least one Port.";
		case port_name_match_host_port_name:
			return "Port(s) doesn't match the hosts Port(s).";
		case referenced_soi_not_null:
			return "Referenced SoI must be set.";
		case is_between_port_and_linkhub:
			return "Must be placed between Port and Link Hub.";
		case port_must_have_interface_connection_when_on_container_system:
			return "Must have a Interface Connection.";
		case doesnt_cross_system_boundry:
			return "Cannot cross a System boundary.";
		case connected_to_container_port:
			return "Must be connected to Port on container System.";
		case has_system_cardinality:
			return "Must have a System Cardinality.";
		case connected_to_atomic_system_port:
			return "Must be connected to Atomic System.";
		case active_connection_must_have_sibling:
			return "Needs at least one other connection due to its Active connection";
		case must_contain_self_referential_or_active_connection:
			return "Must have either Self referential or Active connection.";
		case container_port_and_interface_connection_have_same_parent:
			return "Port and InterfaceConnection must have same parent.";
		case if_on_boundry_only_interface_systems_can_have_active_or_self_refential_link_connections_to_it:
			return "Only Interface systems can have Active or Self referential connections.";
		case all_states_reachable:
			return "All states must be reachable.";
		case no_state_is_dead_end:
			return "Dead end is not allowed.";
		case exactly_one_initial_node:
			return "You have two or more initial states, exactly one is required.";
		case must_have_source_and_target:
			return "Must have a source and target.";
		case atleast_one_transition:
			return "Must have at least one transition.";
		case must_be_none_cyclic:
			return "Must be none cyclic.";
		default:
			return constraint.name();
		}
	}
}
