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

import org.eclipse.emf.validation.model.IClientSelector;


public class StructureValidationSelector implements IClientSelector {

	@Override
	public boolean selects(Object stereoApplicationObj) {
		for (Class<?> type : Utils.uml_element) 
		    if (type.isInstance(stereoApplicationObj)) {
		    	System.out.println("Selected uml_element: " + type.getSimpleName() + " for validation.");
		        return true;
		    }
    	System.out.println("Skipping : " + stereoApplicationObj.toString());
		return false;
	}
}
