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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.CONIntermediateState;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.papyrus.acs.profile.model.CONIntermediateState;

public class NotADeadEnd implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		CONIntermediateState state = (CONIntermediateState) target;
		StateMachine stateMachine = state.getBase_State().containingStateMachine();

		return stateMachine.getRegions().get(0)
				.getTransitions().stream().anyMatch(t -> t.getSource() == state.getBase_State());
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have an outgoing transition.";
	}
	
	@Override
	public String getRationale() {
		return "The controller must be circular so dead ends are not allowed.";
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(CONIntermediateState.class); }};
	}
}
