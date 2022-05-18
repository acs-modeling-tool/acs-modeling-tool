package org.eclipse.papyrus.acs.validation;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHolder;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.System;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.AtomicSystem.ExactlyOnePort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Composite.AtleastOnePort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ConnectedToAtomicSystemPort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ConnectedToContainerPort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ContainerPortAndInterfaceConnectionHaveSameParent;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.DoesntCrossSystemBoundry;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.IsBetweenPortAndLinkhub;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.LinkCardinalityNotGreaterThanSystemCardinality;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.ActiveConnectionMustHaveSibling;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.IfOnBoundryOnlyInterfaceSystemsCanHaveActiveOrSelfReferentialLinkConnectionsToIt;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.MustContainSelfReferentialOrActiveConnection;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port.MustHaveConnection;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port.PortMustHaveInterfaceConnectionWhenOnContainerSystem;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference.PortNameMatchHostPortName;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference.ReferencedSoINotNull;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.ContainAtleastTwoSystems;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.HasSystemCardinality;
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

	@SuppressWarnings({ "serial" })
	public static final LinkedList<Class<?>> uml_element = new LinkedList<Class<?>>(){{ 
		add(PackageImportImpl.class); 
		}};
			
	public static String getName(EObject target) {
    	if (target instanceof System)
    		return ((System) target).getBase_Component().getName();
    	else if (target instanceof SoI)
    		return ((SoI) target).getBase_Component().getName();
    	else if (target instanceof ACS_Model)
    		return ((ACS_Model) target).getBase_Model().getName();
    	else if (target instanceof Port)
    		return ((Port) target).getBase_Port().getName();
    	else if (target instanceof LinkConnection)
    		return ((LinkConnection) target).getBase_Connector().getName();
    	else if (target instanceof InterfaceConnection)
    		return ((InterfaceConnection) target).getBase_Connector().getName();
    	else if (target instanceof LinkHub)
    		return ((LinkHub) target).getBase_Port().getName();
    	else 
    		return "Cannot get name of: " + target.toString();
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
		}
	};

	public static String getMSG(ConstraintsEnum constraint) {
		switch (constraint) {
		case name_cannot_start_with_digit:
			return "Cannot have digit as first character in name.";
		case exactly_one_port:
			return "Must have exactly one Port.";
		case contain_atleast_two_systems:
			return "Must contain atleast two Systems otherwise abstraction is redundant.";
		case atleast_one_port:
			return "Must have atleast one Port.";
		case port_name_match_host_port_name:
			return "Port(s) doesn't match the refenced Port(s).";
		case referenced_soi_not_null:
			return "Referenced SoI must be set.";
		case is_between_port_and_linkhub:
			return "Must be placed between Port and Link Hub.";
		case port_must_have_interface_connection_when_on_container_system:
			return "Must have a Interface Connection.";
		case doesnt_cross_system_boundry:
			return "Cannot cross a System boundry.";
		case connected_to_container_port:
			return "Must be connected to Port on container System.";
		case has_system_cardinality:
			return "Must have a System Cardinality";
		case connected_to_atomic_system_port:
			return "Must be connected to Atomic System.";
		case active_connection_must_have_sibling:
			return "Needs at least one other connection due to its Active connection";
		case must_contain_self_referential_or_active_connection:
			return "Must have either Self referential or Active connection.";
		case container_port_and_interface_connection_have_same_parent:
			return "Port and InterfaceConnection must have same parent.";
		case if_on_boundry_only_interface_systems_can_have_active_or_self_refential_link_connections_to_it:
			return "Only Interface systems can have Active or Self referential connections";
		default:
			return constraint.name();
		}
	}
}
