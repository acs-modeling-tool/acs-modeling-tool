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
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Element;
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.Subsystem;


public class LinkCardinalityNotGreaterThanSystemCardinality implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		//If the result is the empty string there are no issues with the links cardinality
		return checkCardinality((LinkConnection) target).equals("");
	}
	
	// We use this helper function to both verify and generate error codes
	public String checkCardinality(LinkConnection link) {
		
		// Find the connected system
		Optional<Element> puresystem = link.getBase_Connector().getEnds()
				.stream()
				.map(end -> end.getRole())
				.filter(port -> port.getAppliedStereotypes().get(0).getName().equals("Port"))
				.map(port -> (Element)port.eContainer())
				.findFirst();
		if (!puresystem.isPresent())
			return "";
		
		// If it isn't a Subsystem we don't care
		if(!(puresystem.get().getStereotypeApplications().get(0) instanceof Subsystem))
			return "";

		String systemCar = ((Subsystem)puresystem.get().getStereotypeApplications().get(0)).getCardinality();
		String linkCar = link.getCardinality();


		if (linkCar == null)
			return "Link cardinality is missing";
		if (systemCar == null)
			return "System cardinality is missing";
		
		if (linkCar.matches("[0-9]+")) {
			if (systemCar.matches("[0-9]+")) {
				//If the cardinality is self referential the link can at most be the size of system - 1 
				//since it can at-most talk to all the other systems minus it self
				if (link.getDirectionality() == ConnectionTypes.SELF_REFERENTIAL)
					if (Integer.parseInt(systemCar) >= Integer.parseInt(linkCar) + 1)
						return "";
					else return "Link cardinality is too big (remember self referential link cardinality must be one smaller than system cardinality)";
				//Otherwise just check that the link number is lower or equal on the system number
				if (Integer.parseInt(systemCar) >= Integer.parseInt(linkCar))
					return "";
				else return "Link cardinality is bigger than system.";
			} else if (systemCar.equals("N")){
				//If link is a number but the system isn't, the system is just always bigger than link
				return "";
			} else if (systemCar.equals("*")) {
				//Only case left is sysCar.car = *, which cannot be accessed with a known number (except with tokens)
				return "System is * cardinality so the link must be * also.";
			} else {
				return "Cardinality must be either [0-9]+ or 'N' or '*' nothing else is allowed";
			}
		} else if (linkCar.equals("N")) {
			if (systemCar.matches("[0-9]+")) {
				//If the link is N and system is number, system is upper-bound
				return "";
			} else if (systemCar.equals("N")) {
				//Always allowed
				return "";
			} else if (systemCar.equals("*")) {
				//Only case left is sysCar.car = *, which cannot be accessed with a known number (except with tokens)
				return "System is * cardinality so the link must be * also.";
			} else {
				return "Cardinality must be either [0-9]+ or 'N' or '*' nothing else is allowed";
			}
		} else if (linkCar.equals("*")) {
			return "";
		}
		//malformed link cardinality
		return "Cardinality must be either [0-9]+ or 'N' or '*' nothing else is allowed";
	}
	
	public String getErrorMSG(EObject target) {
		if (target == null)
			return ConstraintInterface.super.getErrorMSG(null);
		return checkCardinality((LinkConnection) target);
	}
	
	@Override
	public String getRationale() {
		return "We enforce some rules on Link Connections since they are obviously bad.\n"
				+ "If you put a Cardinality of 5 on some Atomic System (i.e. You have 5 of this system).\n"
				+ "Then it wouldn't make sense to say that 6 of these five systems talk over the connection.\n"
				+ "If you put a Cardinality of 2 on some Atomic System (i.e. You have 2 of this system)\n"
				+ "Then it wouldn't make sense to say that two of these Systems talk to themselves (i.e. self referential)\n"
				+ "Since the initiating system would need to part of the Reacting systems.";
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(LinkConnection.class);}};
	}
}
