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

import org.eclipse.papyrus.acs.profile.model.MainMachine;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Machine.MustBeNoneCyclic;
import org.junit.Assert;
import org.junit.Test;

public class HandleNullMachineTest {
	

	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void test() {
		MustBeNoneCyclic con = new MustBeNoneCyclic();

		MainMachine machine = null;

		//If target is null we should still get an error msg
		Assert.assertTrue("This should work.", con.getErrorMSG(machine) != "" && con.getErrorMSG(machine) != null);
	}
}
