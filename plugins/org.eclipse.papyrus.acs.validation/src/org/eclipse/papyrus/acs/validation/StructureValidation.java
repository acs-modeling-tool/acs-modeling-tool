package org.eclipse.papyrus.acs.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHolder;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintManager;



public class StructureValidation extends AbstractModelConstraint {
	static ConstraintManager manager = new ConstraintManager();

	
	@Override
	public IStatus validate(IValidationContext context) {
		
		EObject target = context.getTarget();
		
		//Get the name
    	String name = utils.getName(target);

		//Validate and get result 
		String res = null;
		if (target instanceof SoI) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
	    	manager.add(ConstraintsEnum.contain_atleast_two_systems);
		} else if (target instanceof Composite) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
	    	manager.add(ConstraintsEnum.contain_atleast_two_systems);
	    	manager.add(ConstraintsEnum.atleast_one_port);
	    	manager.add(ConstraintsEnum.has_system_cardinality);
		} else if (target instanceof AtomicSystem) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
	    	manager.add(ConstraintsEnum.exactly_one_port);
	    	manager.add(ConstraintsEnum.has_system_cardinality);
		} else if (target instanceof Reference) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
	    	manager.add(ConstraintsEnum.port_name_match_host_port_name);
	    	manager.add(ConstraintsEnum.referenced_soi_not_null);
	    	manager.add(ConstraintsEnum.has_system_cardinality);
		} else if (target instanceof Port) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
	    	manager.add(ConstraintsEnum.must_have_connection);
	    	manager.add(ConstraintsEnum.port_must_have_interface_connection_when_on_container_system);
		} else if (target instanceof ACS_Model) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
		} else if (target instanceof LinkConnection) {
	    	manager.add(ConstraintsEnum.is_between_port_and_linkhub);
	    	manager.add(ConstraintsEnum.doesnt_cross_system_boundry);
	    	manager.add(ConstraintsEnum.link_cardinality_not_greater_than_system_cardinality);
		} else if (target instanceof InterfaceConnection) {
	    	manager.add(ConstraintsEnum.connected_to_container_port);
	    	manager.add(ConstraintsEnum.connected_to_atomic_system_port);
	    	manager.add(ConstraintsEnum.container_port_and_interface_connection_have_same_parent);
		} else if (target instanceof LinkHub) {
	    	manager.add(ConstraintsEnum.must_contain_self_referential_or_active_connection);
	    	manager.add(ConstraintsEnum.active_connection_must_have_sibling);
	    	manager.add(ConstraintsEnum.if_on_boundry_only_interface_systems_can_have_active_or_self_refential_link_connections_to_it);
		} else if (target instanceof LinkHolder) {
	    	manager.add(ConstraintsEnum.name_cannot_start_with_digit);
		} else {
	    	System.out.println("Consider to implement constraint for: " + name);
		}
		
		res = manager.EvaluateTargetConstraints(target);
		if (res == "") {
			return context.createSuccessStatus();
		} else {
			System.out.println(name + " was deemed bad with: " + res);
			return context.createFailureStatus(name + ": " + res);
		}
	}
}
