package org.eclipse.papyrus.acs.validation;

public enum ConstraintsEnum {
	exactly_one_port, 
	atleast_one_port,
	must_have_connection, 
	referenced_soi_not_null, 
	contain_atleast_two_systems, 
	connected_to_container_port, 
	name_cannot_start_with_digit,
	port_name_match_host_port_name,
	connected_to_atomic_system_port, 
	active_connection_must_have_sibling, 
	must_contain_self_referential_or_active_connection, 
	link_cardinality_not_greater_than_system_cardinality, 
	port_must_have_interface_connection_when_on_container_system, 
	container_port_and_interface_connection_have_same_parent, 
	is_between_port_and_linkhub, 
	doesnt_cross_system_boundry,
	has_system_cardinality,
	if_on_boundry_only_interface_systems_can_have_active_or_self_refential_link_connections_to_it
}
