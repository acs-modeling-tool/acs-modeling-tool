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

package org.eclipse.papyrus.acs.wizard.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.acs.wizard.ACSConstants;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureViewpoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;


public class SelectViewPointPage extends WizardPage {

	// disable safety button, as it might confuse users
	// keep code for the moment, until this is finally decided.
	public static final boolean ENABLE_SAFETY = false;

	/** The Constant PAGE_ID. */
	public static final String PAGE_ID = "SelectViewPointPage"; //$NON-NLS-1$

	protected String selectedId;

	protected Button safetyButton;

	protected Composite comp;

	public SelectViewPointPage() {
		super("Select model kind"); //$NON-NLS-1$
		setDescription("Select a template to initialize the project"); //$NON-NLS-1$
	}

	/**
	 * Return the viewpoint ID of the main objective of the associated model
	 */
	public String getSelectedID() {
		return selectedId;
	}

	/**
	 * Set the selected viewpoint from the outside (used by dashboard)
	 */
	public void setSelectedID(String selectedId) {
		for (Control unC : comp.getChildren()) {
			if (unC instanceof Button) {
				Button unB = (Button) unC;
				MergedArchitectureContext context = ArchitectureDomainManager.getInstance().getArchitectureContextById(ACSConstants.ACS_CONTEXT);
				MergedArchitectureViewpoint viewpoint = getViewpointById(context, selectedId);

				if (viewpoint.getId().equals(unB.getData())) {
					setPageComplete(true);
					this.selectedId = (String) unB.getData();
					unB.setSelection(true);
				}
			}
		}
	}

	/**
	 * return the list of selected viewpoint IDs, including optional ones
	 * Add Assertions viewpoint in component definition and system configuration
	 * viewpoint.
	 */
	public String[] getSelectedIDs() {
		List<String> viewPoints = new ArrayList<String>();
		viewPoints.add(selectedId);
		return viewPoints.toArray(new String[0]);
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 */
	@Override
	public void createControl(Composite parent) {
		comp = createComposite(parent, 1, 1, GridData.FILL_BOTH, 0, 0);
		((GridData) comp.getLayoutData()).widthHint = 300;
		setControl(comp);
		Label label = new Label(comp, SWT.NONE);
		//Visible on the project creation page
		label.setText("Templates:"); //$NON-NLS-1$

		MergedArchitectureContext context = ArchitectureDomainManager.getInstance().getArchitectureContextById(ACSConstants.ACS_CONTEXT);

		SelectionListener sl = new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
			}

			@Override
			public void widgetSelected(SelectionEvent se) {
				setPageComplete(true);
				Button button = (Button) se.getSource();
				selectedId = (String) button.getData();
			}

		};
		String first = ACSConstants.ACS_BUILDING;
		String[] tier3_ids = {first};
		addButtons(context, comp, sl, tier3_ids);

		setPageComplete(false);
	}

	protected static void addButtons(MergedArchitectureContext context, Composite comp, SelectionListener sl, String[] ids) {
		for (String id : ids) {
			MergedArchitectureViewpoint viewpoint = getViewpointById(context, id);
			if (viewpoint != null) {
				Button radio = new Button(comp, SWT.RADIO);
				radio.setText(viewpoint.getDescription());
				radio.setData(viewpoint.getId());
				radio.addSelectionListener(sl);
			}
		}

	}

	protected static MergedArchitectureViewpoint getViewpointById(MergedArchitectureContext context, String id) {
		for (MergedArchitectureViewpoint viewpoint : context.getViewpoints()) {
			if (viewpoint.getId().endsWith(id)) {
				return viewpoint;
			}
		}
		return null;
	}

	private static Composite createComposite(Composite parent, int columns, int hspan, int fill, int marginwidth, int marginheight) {
		Composite g = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(columns, false);
		layout.marginWidth = marginwidth;
		layout.marginHeight = marginheight;
		g.setLayout(layout);
		g.setFont(parent.getFont());
		GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
		g.setLayoutData(gd);
		return g;
	}
}
