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


import java.util.LinkedList;
import java.util.List;

import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationContributor;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.Element;

public class NavigateToConnectedSystem implements NavigationContributor {
	 
	public List<NavigableElement> getNavigableElements(Object fromElement) {
		List<NavigableElement> result = new LinkedList<NavigableElement>();
		Element element = org.eclipse.papyrus.uml.tools.utils.UMLUtil.resolveUMLElement(fromElement);
		if (fromElement instanceof Component) {
			final AtomicSystem atomic = UMLUtil.getStereotypeApplication(element, AtomicSystem.class);
			String myName = atomic.getBase_Component().getName();
			System.out.println("My name: " + myName);
		}
		return result;
	}
}