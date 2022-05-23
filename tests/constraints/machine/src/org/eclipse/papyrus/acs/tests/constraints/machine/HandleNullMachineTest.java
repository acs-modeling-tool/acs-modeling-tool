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
