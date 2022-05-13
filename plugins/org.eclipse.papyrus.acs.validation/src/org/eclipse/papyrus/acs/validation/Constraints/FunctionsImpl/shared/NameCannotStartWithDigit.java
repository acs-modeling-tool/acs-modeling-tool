package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.utils;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;

public class NameCannotStartWithDigit implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Character firstChar = utils.getName(target).charAt(0);
		return !Character.isDigit(firstChar);
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.name_cannot_start_with_digit); }};
	}
	

}