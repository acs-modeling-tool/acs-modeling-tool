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

package org.eclipse.papyrus.acs.tests.constraints.machine;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.papyrus.acs.profile.model.MainMachine;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Machine.MustBeNoneCyclic;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.acs.profile.AcsResources;
import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Region;

public class CycleDetectionTest {
	

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void test() {
		MustBeNoneCyclic con = new MustBeNoneCyclic();

		Model model = createACSModel(new ResourceSetImpl(), "test." + UMLResource.FILE_EXTENSION, "test");

		Class defaultClass = model.createOwnedClass("defaultClass", false);

		MainMachine machine = (MainMachine) StereotypeApplicationHelper.getInstance(null).applyStereotype(defaultClass, AcsProfilePackage.eINSTANCE.getMainMachine(),null);
		
		Region r = UMLFactory.eINSTANCE.createRegion();
		
		//Create vertices
		r.createSubvertex("one", UMLPackage.Literals.STATE);
		r.createSubvertex("two", UMLPackage.Literals.STATE);
		r.createSubvertex("three", UMLPackage.Literals.STATE);
		
		//Transition one-two
		r.createTransition("fromOneToTwo");
		r.getTransition("fromOneToTwo").setSource(r.getSubvertex("one"));
		r.getTransition("fromOneToTwo").setTarget(r.getSubvertex("two"));

		//Transition two-three
		r.createTransition("fromTwoToThree");
		r.getTransition("fromTwoToThree").setSource(r.getSubvertex("two"));
		r.getTransition("fromTwoToThree").setTarget(r.getSubvertex("three"));
		
		machine.setBase_Region(r);

		Assert.assertTrue("Cycle detection is bad, there is no cycle.", con.satisfies(machine));
	
		//Transition three-one (This now is a cycle one->two->three->one ...)
		r.createTransition("fromThreeToOne");
		r.getTransition("fromThreeToOne").setSource(r.getSubvertex("three"));
		r.getTransition("fromThreeToOne").setTarget(r.getSubvertex("one"));
		
		Assert.assertFalse("Cycle detection is bad, there is a cycle.", con.satisfies(machine));
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
