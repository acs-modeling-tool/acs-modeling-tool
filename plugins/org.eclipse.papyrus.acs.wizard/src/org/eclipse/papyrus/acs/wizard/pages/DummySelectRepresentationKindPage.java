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

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.papyrus.commands.ICreationCommandRegistry;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.widgets.providers.UnsetObject;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.template.ModelTemplateDescription;
import org.eclipse.papyrus.uml.diagram.wizards.template.ModelTemplatesContentProvider;


public class DummySelectRepresentationKindPage extends SelectRepresentationKindPage {

	ModelTemplateDescription templateDescription;

	public DummySelectRepresentationKindPage(boolean allowTemplates, ContextProvider contextProvider, ICreationCommandRegistry creationCommandRegistry) {
		super(allowTemplates, contextProvider, creationCommandRegistry);
	}

	public DummySelectRepresentationKindPage(ContextProvider contextProvider) {
		super(contextProvider);
		setShowTemplateChooser(false);
	}

	public void selectTemplate(String viewpointId) {
		// use viewpoint ID instead of architecture context as language
		String language[] = { viewpointId };
		Object elements[] = new ModelTemplatesContentProvider().getElements(language);
		for (Object element : elements) {
			if (element instanceof ModelTemplateDescription && element != UnsetObject.instance) {
				templateDescription = (ModelTemplateDescription) element;
				return;
			}
		}
	}

	@Override
	public String getTemplatePath() {
		return templateDescription != null ? templateDescription.getUml_path() : null;
	}

	/**
	 * Gets the notation model template path.
	 *
	 * @return the notation template path
	 */
	@Override
	public String getNotationTemplatePath() {
		return templateDescription != null ? templateDescription.getNotation_path() : null;
	}

	/**
	 * Gets the di model template path.
	 *
	 * @return the di template path
	 */
	@Override
	public String getDiTemplatePath() {
		return templateDescription != null ? templateDescription.getDi_path() : null;
	}

	@Override
	public String getTemplatePluginId() {
		return templateDescription != null ? templateDescription.getPluginId() : null;
	}

	/**
	 * This an following functions overload superclass to return empty list, i.e. nothing
	 * new should be done - only load the template
	 * @see org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage#getDiagramName()
	 */
	@Override
	public List<String> getDiagramName() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getProfilesURI() {
		return Collections.emptyList();
	}

	@Override
	public IStatus getProfileDefinitionStatus() {
		return Status.OK_STATUS;
	}

	@Override
	public List<ModelTemplateDescription> getTemplateTransfo() {
		return Collections.emptyList();
	}

	@Override
	public List<RepresentationKind> getSelectedRepresentationKinds(String contextId) {
		return Collections.emptyList();
	}

	@Override
	public String getRootElementName() {
		return getDefaultModelName().getValue();
	}
}
