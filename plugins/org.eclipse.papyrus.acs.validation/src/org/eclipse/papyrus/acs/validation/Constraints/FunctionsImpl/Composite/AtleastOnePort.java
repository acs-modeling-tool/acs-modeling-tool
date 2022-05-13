package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Composite;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.System;

public class AtleastOnePort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((System) target).getBase_Component().getOwnedPorts().size() >= 1;
	}

	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.atleast_one_port); }};
	}
}