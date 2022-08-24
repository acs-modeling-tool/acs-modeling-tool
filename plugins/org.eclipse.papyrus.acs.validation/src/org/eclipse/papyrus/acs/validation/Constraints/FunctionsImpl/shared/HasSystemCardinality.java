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
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.Reference;

public class HasSystemCardinality implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		if (target instanceof AtomicSystem)
			return ((AtomicSystem) target).getCardinality() != null && !((AtomicSystem) target).getCardinality().equals("");
		if (target instanceof Composite)
			return ((Composite) target).getCardinality() != null && !((Composite) target).getCardinality().equals("");
		if (target instanceof Reference)
			return ((Reference) target).getCardinality() != null && !((Reference) target).getCardinality().equals("");
		return true;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have a System Cardinality.";
	}
	
	@Override
	public String getRationale() {
		String rat = "A System needs a cardinality for validation.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Composite.class); add(AtomicSystem.class); add(Reference.class);}};
	}
}