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

package org.eclipse.papyrus.acs.newchild.internal;

import org.eclipse.papyrus.infra.newchild.CreationMenuRegistry;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.Folder;

/**
 * Cleans the creation edge menu.
 */
public final class HideContextMenus {
	
	private static final String[] DEACTIVATED_CHILD_MENUS = new String[] { "/resource/UML.creationmenumodel", "/resource/UMLEdges.creationmenumodel" };

	private HideContextMenus() {
	}

	/**
	 * Hide the context click UML menus. We don't support their elements anyways.
	 */
	public static void clean() {
		System.out.println("Cleaning creation menu..");
		CreationMenuRegistry instance = org.eclipse.papyrus.infra.newchild.CreationMenuRegistry.getInstance();
		for (Folder folder : instance.getRootFolder()) {
			System.out.print("Found folder " + folder.eResource().getURI().toString() + ": ");
			boolean deact = false;
			for (String childMenuPath : DEACTIVATED_CHILD_MENUS) {
				if (folder.eResource().getURI().toString().endsWith(childMenuPath)) {
					instance.setCreationMenuVisibility(folder, false);
					deact = true;
				}
			}
			if (deact)
				System.out.println("Deactivated.");
			else System.out.println("Activated.");
		}
	}
}
