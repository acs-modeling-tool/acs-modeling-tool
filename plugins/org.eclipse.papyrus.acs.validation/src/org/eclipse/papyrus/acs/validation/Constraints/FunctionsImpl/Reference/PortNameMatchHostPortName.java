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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
	public String getErrorMSG(EObject target) { 
		return "Port(s) doesn't match the hosts Port(s).";
	}
	
	@Override
	public String getRationale() {
		String rat = "If the Reference Port(s) doesn't match the referenced SoI.\n"
				+ "Then the reference wouldn't be faithful to the Implemented SoI";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Reference.class);}};
	}
}
