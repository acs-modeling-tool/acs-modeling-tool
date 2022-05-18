package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.AtomicSystem;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.System;

public class ExactlyOnePort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((System) target).getBase_Component().getOwnedPorts().size() == 1;
	}

	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.exactly_one_port;
	}

	@Override
	public String getRationale() {
		String rat = "Atomic Systems need exactly one Port.\n"
				+ "If you give them zero ports they cant communicate with anything and thus meaningless.\n"
				+ "If you want to give them two or more ports you should use a composite instead since that is the composites purpose.\n"
				+ "If an Atomic System could hold multiple ports it suggest that there are actually two systems inside the atomic system,\n"
				+ "and that would make the idea of an Atomic System moot.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(AtomicSystem.class);}};
	}

}