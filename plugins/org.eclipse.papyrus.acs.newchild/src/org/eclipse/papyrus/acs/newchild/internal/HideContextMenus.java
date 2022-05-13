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
