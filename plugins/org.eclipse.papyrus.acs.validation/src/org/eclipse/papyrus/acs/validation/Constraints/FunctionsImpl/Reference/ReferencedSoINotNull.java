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
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.referenced_soi_not_null;
	}
	
	@Override
	public String getRationale() {
		String rat = "Empty referenced SoI is not allowed (What defualt behaviour did you expect from this?).";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Reference.class);}};
	}
}
