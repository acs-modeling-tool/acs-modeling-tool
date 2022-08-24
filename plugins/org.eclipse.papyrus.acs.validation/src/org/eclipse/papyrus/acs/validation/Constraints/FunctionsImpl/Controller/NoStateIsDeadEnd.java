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
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.papyrus.acs.profile.model.Controller;

public class NoStateIsDeadEnd implements ConstraintInterface {

	@SuppressWarnings("serial")
	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		Region r = con.getBase_StateMachine().getRegions().get(0);

		Set<Vertex> intermediatestates  = new LinkedHashSet<Vertex>() {};
		Set<Transition> transitions = new LinkedHashSet<Transition>() {};
		
		for (Transition trans: r.getTransitions())
			if (trans instanceof Transition) 
				transitions.add(trans);
				
		//Find only intermediatestates
		for (Vertex v : r.getSubvertices())
			if(v instanceof State)
				intermediatestates.add(v);
		
		//Every intermediatestate
		for (Vertex state: intermediatestates) {
			
			//Is assumed to have dead end
			boolean dead_end = true;
			
			//We check every transition
			for (Transition trans: r.getTransitions())
				//If we find a source equal to state
				if (trans.getSource() == state)
					//It cannot be dead end
					dead_end = false;
			//If we find a dead_end we can stop here, no need to check more
			if(dead_end)
				return false;
		}
		
		//Apparently no dead ends exists
		return true;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Dead end is not allowed.";
	}
	
	@Override
	public String getRationale() {
		String rat = "A dead end is not allowed, must lead to another state.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class);}};
	}
}
