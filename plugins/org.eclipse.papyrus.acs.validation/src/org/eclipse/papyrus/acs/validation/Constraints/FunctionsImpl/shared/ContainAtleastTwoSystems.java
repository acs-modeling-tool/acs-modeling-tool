package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;


import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.System;

public class ContainAtleastTwoSystems implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		return ((System) target).getBase_Component().getPackagedElements().size() >= 2;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must contain at least two Systems otherwise abstraction is redundant.";
	}
	
	@Override
	public String getRationale() {
		String rat = "If the abstraction doesn't contain at least two systems the abstraction should be represented by Atomic System instead.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Composite.class); add(SoI.class);}};
	}
}
