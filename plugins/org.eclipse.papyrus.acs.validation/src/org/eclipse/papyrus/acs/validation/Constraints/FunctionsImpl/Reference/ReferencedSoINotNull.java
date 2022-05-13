package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Reference;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.Reference;

public class ReferencedSoINotNull implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((Reference) target).getReferenced_soi() != null;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.referenced_soi_not_null); }};
	}
}
