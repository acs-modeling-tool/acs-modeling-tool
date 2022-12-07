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

package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.AtomicSystem;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.System;

public class ExactlyOnePort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((System) target).getBase_Component().getOwnedPorts().size() == 1;
	}

	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have exactly one Port.";
	}

	@Override
	public String getRationale() {
		return "Atomic Systems need exactly one Port.\n"
				+ "If you give them zero ports they can't communicate with anything and thus meaningless.\n"
				+ "If you want to give them two or more ports you should use a composite instead since that is the composite's purpose.\n"
				+ "If an Atomic System could hold multiple ports it suggest that there are actually two systems inside the atomic system,\n"
				+ "and that would make the idea of an Atomic System moot.";
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(AtomicSystem.class); }};
	}

}