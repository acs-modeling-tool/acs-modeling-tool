package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl;

import java.util.LinkedList;

import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.*;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.AtomicSystem.ExactlyOnePort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.MustContainSelfReferentialOrActiveConnection;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.IfOnBoundryOnlyInterfaceSystemsCanHaveActiveOrSelfReferentialLinkConnectionsToIt;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub.ActiveConnectionMustHaveSibling;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Composite.AtleastOnePort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ConnectedToContainerPort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ConnectedToAtomicSystemPort;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection.ContainerPortAndInterfaceConnectionHaveSameParent;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.MustHaveConnection;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference.PortNameMatchHostPortName;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference.ReferencedSoINotNull;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.ContainAtleastTwoSystems;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.HasSystemCardinality;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared.NameCannotStartWithDigit;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.IsBetweenPortAndLinkhub;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.LinkCardinalityNotGreaterThanSystemCardinality;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection.DoesntCrossSystemBoundry;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port.PortMustHaveInterfaceConnectionWhenOnContainerSystem;

public abstract class ConstraintFunctions {
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
			return "Must have exactly one port.";
		case contain_atleast_two_systems:
			return "Must contain atleast two systems otherwise abstraction is redundant.";
		case atleast_one_port:
			return "Must have atleast one port.";
		case port_name_match_host_port_name:
			return "Port(s) doesn't match the refenced port(s).";
		case referenced_soi_not_null:
			return "Referenced SoI must be set.";
		case is_between_port_and_linkhub:
			return "Must be placed between port and linkhub.";
		case port_must_have_interface_connection_when_on_container_system:
			return "Must have a Interface Connection.";
		case doesnt_cross_system_boundry:
			return "Cannot cross a system boundry.";
		case connected_to_container_port:
			return "Must be connected to port on container system.";
		case has_system_cardinality:
			return "Must have a system cardinality";
		case connected_to_atomic_system_port:
			return "Must be connected to atomic system.";
		case active_connection_must_have_sibling:
			return "Needs atleast one other connection due to its active connection";
		case must_contain_self_referential_or_active_connection:
			return "Must have either self referential or active connection.";
		case container_port_and_interface_connection_have_same_parent:
			return "Port and InterfaceConnection must have same parent.";
		case if_on_boundry_only_interface_systems_can_have_active_or_self_refential_link_connections_to_it:
			return "Only Interface systems can have active or self referential connections";
		default:
			return constraint.name();
		}
	}
}
