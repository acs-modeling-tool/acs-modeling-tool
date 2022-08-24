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

package org.eclipse.papyrus.acs.navigation;

import org.eclipse.papyrus.uml.navigation.navigableElement.GenericNavigableElement;
import org.eclipse.uml2.uml.Type;

public class SpecialTargetNavigableElement extends GenericNavigableElement {
	  
	public SpecialTargetNavigableElement(Type type) { // Write a constructor that will call "super(Element elt)" where "elt" is the semantic element that this navigable element wraps
	    super(type);
	  }

	  @Override
	  public String getLabel() {
	    return "Go to special target" + getElementLabel() + "..."; // The convention is to return a string like this
	  }

	  @Override
	  public String getDescription() {
	    return "Go to the special target:" + getElementLabel(); // The convention is to return a string like this
	  }
	}