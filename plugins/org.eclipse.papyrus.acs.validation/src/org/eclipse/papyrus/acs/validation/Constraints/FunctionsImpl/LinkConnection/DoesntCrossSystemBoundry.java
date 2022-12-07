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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;


public class DoesntCrossSystemBoundry implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		
		
		// DOES NOT ACCOUNT FOR BOUNDARY LINKS
		
		
		List<ConnectorEnd> ends = ((LinkConnection)target).getBase_Connector().getEnds();
		
		//The holding system of reference
		EObject holdingSystem = null;
		
		// We want to make sure the ends are within the reference system so we know they don't cross a boundary into a different system
		// This works because one end is a Port and another is a Link Hub, and the parent of the parent of both of these should be the same element (due to link holders).
		for (ConnectorEnd end : ends)
				// If this holding system is set we return true if the second ConnectorEnd has the same holding system
				if (holdingSystem == null)
					holdingSystem = end.getRole().eContainer().eContainer();
				else return holdingSystem == end.getRole().eContainer().eContainer();
		
		return false; // This should only happen if there is only one or zero connector ends which should not be possible
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Cannot cross a System boundary.";
	}
	
	@Override
	public String getRationale() {
		return "Link Connections should only make dependencies between Systems in their scope.\n"
				+ "You should use the Interface Connections to talk out of and into Systems, this is to enforce a cleaner structure.";
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(LinkConnection.class); }};
	}
}
