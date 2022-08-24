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
		
		Region r = con.getBase_StateMachine().getRegions().get(0);
		
		return UnreachableStates(r) == null;
	}
	
	/*Returns null when all states are reachable*/
	@SuppressWarnings("serial")
	public String UnreachableStates(Region r) {

		Vertex initialState = null;
		Set<Vertex> intermediatestates  = new LinkedHashSet<Vertex>() {};
		Set<Transition> transitions = new LinkedHashSet<Transition>() {};
		
		for (Transition trans: r.getTransitions())
			if (trans instanceof Transition) 
				transitions.add(trans);
				
		//Find Initial state
		for (Vertex v : r.getSubvertices())
			if (v instanceof Pseudostate) 
				initialState = v;
			else if(v instanceof State)
				intermediatestates.add(v);
		
		
		Set<Vertex> intermediatestatesCurrentlyReached = new LinkedHashSet<Vertex>() {};
		
		Set<Vertex> foundThisRound = new LinkedHashSet<Vertex>() {};

		
		//Seed the states that are reachable from initialState
		for (Transition trans: transitions)
			if(trans.getSource() == initialState)
				foundThisRound.add(trans.getTarget());

		
		//When we no longer find new states in a round we stop
		while (!foundThisRound.isEmpty()){
			
			//Add all we found to intermediatestatesCurrentlyReached
			intermediatestatesCurrentlyReached.addAll(foundThisRound);
			
			//reset set
			foundThisRound = new LinkedHashSet<Vertex>() {};
			
			//for every reached state
			for (Vertex reached: intermediatestatesCurrentlyReached)
				//Check all transitions
				for (Transition trans: transitions) 
					//If a transitions source is reached
					if (trans.getSource() == reached) 
						//If we haven't added it already
						if (!intermediatestatesCurrentlyReached.contains(trans.getTarget()))
							//We found it this round
							foundThisRound.add(trans.getTarget());
		}

		//If all states are reached we return null
		if (intermediatestatesCurrentlyReached.equals(intermediatestates))
			return null;
				
		intermediatestates.removeAll(intermediatestatesCurrentlyReached);
		
		return "Cannot reach all states (e.g. " + intermediatestates.iterator().next() + " is not reachable.";
	}
	
	@Override
	public String getErrorMSG(EObject target) {
		if (target == null)
			return ConstraintInterface.super.getErrorMSG(null);
		
		Controller con = (Controller) target;
		
		Region r = con.getBase_StateMachine().getRegions().get(0);
		String res = UnreachableStates(r);
		if (res == null)
			return "";
		return res;
	}
	
	@Override
	public String getRationale() {
		String rat = "An unreachable state is useless and only adds confusion.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class); }};
	}
}
