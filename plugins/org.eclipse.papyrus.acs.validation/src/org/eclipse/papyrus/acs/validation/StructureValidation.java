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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;

public class StructureValidation extends AbstractModelConstraint {
	
	@Override
	public IStatus validate(IValidationContext context) {
		
		EObject target = context.getTarget();
		
		//Get the name
    	String name = Utils.getName(target);

		//Find constraints that fit this target
		String res = null;

		//Find constraints and validate object on each constraint
		for (ConstraintInterface constraint: Utils.constraintInterfaces)
			for (Class<?> clss : constraint.appliesTo())
				if (clss.isInstance(target))
					if (!constraint.satisfies(target))
						if (res == null)
							res = constraint.getErrorMSG(target);
						else
							res = res + " " + constraint.getErrorMSG(target);
					else if (res == null)
						res = "";

		if (res == null) {
			System.out.println("Found no constraint function for: " + target.toString());
			return context.createSuccessStatus();
		} else if(res.equals(""))
			return context.createSuccessStatus();
		else {
			System.out.println(name + " was deemed bad with: " + res);
			return context.createFailureStatus(name + ": " + res);
		}
	}
}
