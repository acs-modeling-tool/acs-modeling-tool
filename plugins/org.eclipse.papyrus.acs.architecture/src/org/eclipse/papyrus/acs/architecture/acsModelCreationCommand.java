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

package org.eclipse.papyrus.acs.architecture;

import org.eclipse.emf.common.util.URI;
import java.io.IOException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.architecture.commands.IModelCreationCommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;

public class acsModelCreationCommand implements IModelCreationCommand {

	private static final String TEMPLATE_URI = "platform:/plugin/org.eclipse.papyrus.acs.wizard/resources/template.acs.uml"; //$NON-NLS-1$

	@Override
	public void createModel(final ModelSet modelSet) {
		applyTemplate(modelSet);
	}

	protected void applyTemplate(final ModelSet modelSet) {
		final Resource modelResource = UmlUtils.getUmlResource(modelSet);

		URI origURI = modelResource.getURI();
		try {
			modelResource.setURI(URI.createURI(TEMPLATE_URI));
			modelResource.load(null);
		} catch (IOException e) {
			//If the template path is wrong
			System.out.println("Check that " + TEMPLATE_URI + " actually exists!");	
			System.out.println(e);			
		}
		finally {
			modelResource.setURI(origURI);
		}
	}

	protected String getModelName() {
		return "ACS_Model"; //$NON-NLS-1$
	}
}
