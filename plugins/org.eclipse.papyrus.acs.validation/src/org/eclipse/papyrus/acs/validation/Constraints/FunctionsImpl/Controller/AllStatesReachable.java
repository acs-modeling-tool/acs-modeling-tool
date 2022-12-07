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

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import org.eclipse.papyrus.acs.profile.model.Controller;

public class AllStatesReachable implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		Region region = con.getBase_StateMachine().getRegions().get(0);
		return UnreachableStates(region) == null;
	}
	
	/*Returns null when all states are reachable*/
	public String UnreachableStates(Region region) {
		// Setup initial data
		Vertex initialState = null;
		Set<Vertex> allStates = new LinkedHashSet<Vertex>();
		for (Vertex v : region.getSubvertices())
			if (v instanceof Pseudostate)
				if (initialState != null)
					return null; // Ignore for now since controller is malformed
				else
					initialState = v;
			else if (v instanceof State)
				allStates.add(v);
		
		if (initialState == null)
			return null; // Ignore for now since controller is malformed
		allStates.add(initialState);
		
		// Find all reachable states
		Set<Vertex> reachedStates = new LinkedHashSet<Vertex>();
		reachedStates.add(initialState);
		boolean found_some = false;
		do {
			found_some = false;
			for (Transition trans: region.getTransitions())
				if (reachedStates.contains(trans.getSource()) && reachedStates.add(trans.getTarget()))
					found_some = true;
		} while (found_some);

		// Check if all states are reachable
		if (allStates.size() == reachedStates.size())
			return null; // All is good
		
		allStates.removeAll(reachedStates);
		return "Cannot reach all states (e.g. '" + allStates.iterator().next().getName() + "' is not reachable).";
	}
	
	@Override
	public String getErrorMSG(EObject target) {
		if (target == null)
			return "(Error message depends on context.)"; // Used to generate constraint documentation
		
		Controller con = (Controller) target;
		Region region = con.getBase_StateMachine().getRegions().get(0);
		String res = UnreachableStates(region);
		return res != null ? res : "Attempted to get error message for non-faulty controller. This is a coding error.";
	}
	
	@Override
	public String getRationale() {
		return "Unreachable states have no function and are thus disallowed.";
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class); }};
	}
}
