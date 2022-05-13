package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.System;

public class ContainAtleastTwoSystems implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((System) target).getBase_Component().getPackagedElements().size() >= 2;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.contain_atleast_two_systems); }};
	}
}
