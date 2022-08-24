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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.SoI;

public class ConnectedToContainerPort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		for (ConnectorEnd end: ((InterfaceConnection) target).getBase_Connector().getEnds()) {
			EObject element = end.getRole().eContainer();
			if (((Element)element).getStereotypeApplications().get(0) instanceof Composite)
				return true;
			if (((Element)element).getStereotypeApplications().get(0) instanceof SoI)
				return true;
		}
		return false; 
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must be connected to Port on container System.";
	}
	
	@Override
	public String getRationale() {
		String rat = "Interface Connections must be connected to the Port on a Container system (i.e. Composite or SoI).\n"
				+ "The other end must be connected inside the Container.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(InterfaceConnection.class);}};
	}
}