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

package org.eclipse.papyrus.acs.validation;

import java.util.Optional;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Element;

public class StructureValidation extends AbstractModelConstraint {
	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		Optional<EObject> stereotype = ((Element) target).getStereotypeApplications()
				.stream()
				.filter(type -> type.getClass().getPackage().getName().startsWith("org.eclipse.papyrus.acs.profile.model"))
				.findFirst();
		if (!stereotype.isPresent())
			return context.createSuccessStatus();
		
		// Evaluate constraints
		String res = "";
		for (ConstraintInterface constraint: Utils.allConstraints)
			if (constraint.accepts(stereotype.get()) && !constraint.satisfies(stereotype.get())) {
				if (res != "") 
					res += " \n";
				res += "•" + constraint.getErrorMSG(stereotype.get());
			}
		
		return res == "" 
				? context.createSuccessStatus() 
				: context.createFailureStatus(res);
	}
}
