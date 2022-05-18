package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.uml2.uml.Port;

public class PortNameMatchHostPortName implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		
		//If there is no referenced SoI they have a more fundamental issue they must fix first so just pretend this issue is not here yet
		if (((Reference) target).getReferenced_soi() == null)
			return true;
		
		// Check if ports on reference match the real SoI ports
		List<Port> ports = ((Reference) target).getBase_Component().getOwnedPorts();
		List<Port> orig_ports = ((Reference) target).getReferenced_soi().getBase_Component().getOwnedPorts();
		if (ports.size() != orig_ports.size())
			return false;
		
		for (Port port : ports) {
			boolean found_equivalent = false;
			for (Port orig_port : orig_ports) {
				if (port.getName().equals(orig_port.getName()))
					found_equivalent = true;
			}
			if (!found_equivalent)
				return false;
		}
		return true;
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.port_name_match_host_port_name;
	}
	
	@Override
	public String getRationale() {
		String rat = "If the Reference Port(s) doesn't match the referenced SoI.\n"
				+ "Then the refference wouldnt be faithful to the Implemented SoI";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Reference.class);}};
	}
}
