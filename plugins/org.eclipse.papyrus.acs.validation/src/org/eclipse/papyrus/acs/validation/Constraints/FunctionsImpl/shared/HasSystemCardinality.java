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
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.has_system_cardinality;
	}
	
	@Override
	public String getRationale() {
		String rat = "A System needs a cardinality for validation.\n";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Composite.class); add(AtomicSystem.class); add(Reference.class);}};
	}
}