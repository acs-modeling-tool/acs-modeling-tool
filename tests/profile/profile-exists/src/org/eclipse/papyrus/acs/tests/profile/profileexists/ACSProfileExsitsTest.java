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

package org.eclipse.papyrus.acs.tests.profile.profileexists;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.acs.profile.AcsResources;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.papyrus.uml.service.validation.Activator;


@SuppressWarnings("unused")
public class ACSProfileExsitsTest {
	

	/**
	 * Test Profile Exists
	 */
	@Test
	public void test() {
		Model model = createACSModel(new ResourceSetImpl(), "test." + UMLResource.FILE_EXTENSION, "test");

		boolean found_acs = false;
		for (Profile pr : model.getAppliedProfiles())
			if (pr.getName().equals("model"))
				found_acs = true;
		Assert.assertTrue("the acs profile must be applied.", found_acs);
	}
	
	public static Model createACSModel(ResourceSet resourceSet, String resourceName, String modelName) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(modelName);
		Resource resource = resourceSet.createResource(URI.createURI(resourceName));
		resource.getContents().add(model);
		Resource standardProfileResource = resourceSet.getResource(URI.createURI(UMLResource.STANDARD_PROFILE_URI), true);
		Profile umlStdProfile = (Profile) EcoreUtil.getObjectByType(standardProfileResource.getContents(), UMLPackage.Literals.PACKAGE);
		model.applyProfile(umlStdProfile);
		Resource ACSProfileResource = resourceSet.getResource(URI.createURI(AcsResources.PROFILE_PATH), true);
		Profile ACSProfile = (Profile) EcoreUtil.getObjectByType(ACSProfileResource.getContents(), UMLPackage.Literals.PACKAGE);
		model.applyProfile(ACSProfile);
		return model;
	}
}
