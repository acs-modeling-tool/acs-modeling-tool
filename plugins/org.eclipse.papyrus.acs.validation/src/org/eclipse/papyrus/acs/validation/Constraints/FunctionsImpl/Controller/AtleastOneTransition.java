package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Region;


import org.eclipse.papyrus.acs.profile.model.Controller;

public class AtleastOneTransition implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		Region r = con.getBase_StateMachine().getRegions().get(0);
		return !r.getTransitions().isEmpty();
	}

	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have at least one transition.";
	}
	
	@Override
	public String getRationale() {
		String rat = "Must have at least one transition.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class);}};
	}
}
