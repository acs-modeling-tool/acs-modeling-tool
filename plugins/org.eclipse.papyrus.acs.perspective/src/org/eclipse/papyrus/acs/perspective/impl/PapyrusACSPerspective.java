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
