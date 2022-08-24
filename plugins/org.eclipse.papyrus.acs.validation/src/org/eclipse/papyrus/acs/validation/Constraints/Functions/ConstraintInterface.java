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

package org.eclipse.papyrus.acs.validation.Constraints.Functions;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Utils;

public interface ConstraintInterface {
	
	/*Return false if the target doesn't satisfy the constraint, true otherwise*/
	public boolean satisfies(EObject target);
	
	/*Returns an error MSG for the constraint
	 * If target is null the MSG will be a generic error MSG for this constraint
	 * */
	public default String getErrorMSG(EObject target) {
		return Utils.getMSG(this);
	}
	
	/*Returns a short description of the rationale behind this constraint*/
	public default String getRationale() {
		return "Rationale missing for now.";
	};
	
	/*Returns a list of Classes this constraint applies to*/
	public LinkedList<Class<?>> appliesTo();
}
