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

package org.eclipse.papyrus.acs.perspective.impl;


import org.eclipse.papyrus.uml.perspective.PapyrusPerspective;
import org.eclipse.papyrus.views.validation.internal.ModelValidationView;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Papyrus for ACS perspective
 */
public class PapyrusACSPerspective extends PapyrusPerspective implements IPerspectiveFactory {

	public static final String WIZARD_ID_PROJECT = "org.eclipse.papyrus.acs.wizard.createproject"; //$NON-NLS-1$
	public static final String WIZARD_ID_MODEL = "org.eclipse.papyrus.acs.wizard.createmodel"; //$NON-NLS-1$


	/**
	 * Add Papyrus ACS perspective based on PapyrusPerspective
	 *
	 * @param layout
	 *
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void defineActions(IPageLayout layout) {
		// Add "new wizards".
		layout.addNewWizardShortcut(WIZARD_ID_MODEL);
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder"); //$NON-NLS-1$
		layout.addNewWizardShortcut(WIZARD_ID_PROJECT);
		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(ID_MODELEXPLORER);
		layout.addShowViewShortcut(ModelValidationView.VIEW_ID);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut("org.eclipse.pde.runtime.LogView"); // Error log. //A constant doesn't seem to exist for this ID

		layout.addActionSet("org.eclipse.debug.ui.launchActionSet");

		// add perspectives
		layout.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective");
		layout.addPerspectiveShortcut("org.eclipse.jdt.ui.JavaPerspective");
	}
}
