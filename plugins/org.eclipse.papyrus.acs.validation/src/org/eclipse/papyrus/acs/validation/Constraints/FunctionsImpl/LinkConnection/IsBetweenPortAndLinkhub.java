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
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Port;


public class IsBetweenPortAndLinkhub implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		LinkConnection link = (LinkConnection) target;
		List<ConnectorEnd> ends = link.getBase_Connector().getEnds();
		
		boolean portFound = false;
		boolean linkhubFound = false;
		
		for (ConnectorEnd end : ends) 
			if (end.getRole().getStereotypeApplications().get(0) instanceof LinkHub)
				linkhubFound = true;
			else if (end.getRole().getStereotypeApplications().get(0) instanceof Port)
				portFound = true;
		
		return linkhubFound && portFound;
	}
	
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must be placed between Port and Link Hub.";
	}
	
	@Override
	public String getRationale() {
		String rat = "Link Connection must be between Port and Link Hub.\n"
				+ "This enforces explicit design for communication.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(LinkConnection.class);}};
	}
}
