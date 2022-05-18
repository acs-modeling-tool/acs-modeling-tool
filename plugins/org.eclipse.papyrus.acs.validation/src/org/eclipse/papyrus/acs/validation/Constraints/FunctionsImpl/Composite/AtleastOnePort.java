package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Composite;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.System;

public class AtleastOnePort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((System) target).getBase_Component().getOwnedPorts().size() >= 1;
	}

	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.atleast_one_port;
	}
	
	@Override
	public String getRationale() {
		String rat = "Composites must have atleast one Port.\n"
				+ "If you give them zero ports they cant communicate with anything and thus meaningless.\n"
				+ "You can give them more ports as they can combine multiple systems in their abstraction.\n";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Composite.class);}};
	}
}