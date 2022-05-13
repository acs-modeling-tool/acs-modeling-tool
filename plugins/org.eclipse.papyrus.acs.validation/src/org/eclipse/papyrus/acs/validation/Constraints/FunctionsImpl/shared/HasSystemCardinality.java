package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.Reference;

public class HasSystemCardinality implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		if (target instanceof AtomicSystem)
			return ((AtomicSystem) target).getCardinality() != null && !((AtomicSystem) target).getCardinality().equals("");
		if (target instanceof Composite)
			return ((Composite) target).getCardinality() != null && !((Composite) target).getCardinality().equals("");
		if (target instanceof Reference)
			return ((Reference) target).getCardinality() != null && !((Reference) target).getCardinality().equals("");
		return true;
	}

	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.has_system_cardinality); }};
	}
}