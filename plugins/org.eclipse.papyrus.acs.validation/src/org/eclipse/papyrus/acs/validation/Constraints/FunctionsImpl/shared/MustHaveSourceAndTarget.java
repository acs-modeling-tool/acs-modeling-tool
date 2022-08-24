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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.papyrus.acs.profile.model.ActionTransition;
import org.eclipse.papyrus.acs.profile.model.InvocationTransition;

public class MustHaveSourceAndTarget implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		
		Transition t = null;
		if (target instanceof ActionTransition) 
			t = ((ActionTransition) target).getBase_Transition();
		else if (target instanceof InvocationTransition) 
			t = ((InvocationTransition) target).getBase_Transition();
		else
			//If it is not a transition this rule doesn't matter
			return true;
		
		return t.getSource() != null && t.getTarget() != null;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have a source and target.";
	}
	
	@Override
	public String getRationale() {
		String rat = "Cannot have transition with no source or target.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(ActionTransition.class); add(InvocationTransition.class);}};
	}
}
