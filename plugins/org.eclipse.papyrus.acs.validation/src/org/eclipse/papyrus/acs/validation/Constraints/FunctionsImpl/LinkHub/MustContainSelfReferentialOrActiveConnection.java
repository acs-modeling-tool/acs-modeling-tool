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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.SoI;

@SuppressWarnings("restriction")
public class MustContainSelfReferentialOrActiveConnection implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		LinkHub linkhub = (LinkHub) target;
		Element parent = (Element) linkhub.getBase_Port().eContainer().eContainer();
		
		List<Connector> connectors = null;
		
		if (parent.getStereotypeApplications().get(0) instanceof SoI) {
			SoI soi = (SoI) parent.getStereotypeApplications().get(0);
			connectors =  soi.getBase_Component().getOwnedConnectors();
		} else {
			ComponentImpl comp = (ComponentImpl) parent;
			connectors = comp.getOwnedConnectors();
		}
		
		//If there are no connectors there can't be any of the specific types we look for either
		if (connectors == null) 
			return false;
		
		boolean containSelfReferential = false;
		boolean containActive = false;

		for (Connector con : connectors) {
			for (ConnectorEnd conend : con.getEnds()) {
				//If the connector is on target port we check the type
				if (conend.getRole() == linkhub.getBase_Port()) {
					LinkConnection linkconnection = (LinkConnection) con.getStereotypeApplications().get(0);
					if (linkconnection.getDirectionality() == ConnectionTypes.ACTIVE)
						containActive = true;
					else if (linkconnection.getDirectionality() == ConnectionTypes.SELF_REFERENTIAL)
						containSelfReferential = true;
				}
			}
		}

		return containSelfReferential || containActive;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have either Self referential or Active connection.";
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(LinkHub.class);}};
	}
}