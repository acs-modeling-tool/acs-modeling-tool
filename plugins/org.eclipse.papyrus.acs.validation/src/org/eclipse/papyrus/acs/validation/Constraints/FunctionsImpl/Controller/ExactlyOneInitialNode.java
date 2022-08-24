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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Vertex;


import org.eclipse.papyrus.acs.profile.model.Controller;

public class ExactlyOneInitialNode implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		Region r = con.getBase_StateMachine().getRegions().get(0);

		Vertex initialState = null;
				
		//Find Initial state
		for (Vertex v : r.getSubvertices())
			if (v instanceof Pseudostate) {
				//If we already set a initial state there are more than one
				if (initialState != null)
					return false;
				//Set this as initial
				initialState = v;
			}
		//Apparently only one initial node exists
		return true;
	}

	@Override
	public String getErrorMSG(EObject target) { 
		return "You have two or more initial states, exactly one is required.";
	}
	
	@Override
	public String getRationale() {
		String rat = "We only support exactly one initial node.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class);}};
	}
}
