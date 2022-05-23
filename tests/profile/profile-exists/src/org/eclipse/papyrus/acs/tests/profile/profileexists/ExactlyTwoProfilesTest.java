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

public class ExactlyTwoProfilesTest {
	

	/**
	 * Test Profile Exists
	 */
	@Test
	public void test() {
		Model model = createACSModel(new ResourceSetImpl(), "test." + UMLResource.FILE_EXTENSION, "test");

		Assert.assertTrue("There must be exactly two profiles.", model.getAppliedProfiles().size() == 2);
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
