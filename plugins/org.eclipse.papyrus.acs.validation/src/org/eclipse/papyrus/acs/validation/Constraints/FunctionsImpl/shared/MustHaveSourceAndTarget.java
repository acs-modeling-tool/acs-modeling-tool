package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.papyrus.acs.profile.model.ActionTransition;
import org.eclipse.papyrus.acs.profile.model.InvocationTransition;

public class MustHaveSourceAndTarget implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		
		Transition t = null;
		if (target instanceof ActionTransition) 
			t = ((ActionTransition) target).getBase_Transition();
		else if (target instanceof InvocationTransition) 
			t = ((InvocationTransition) target).getBase_Transition();
		else
			//If it is not a transition this rule doesn't matter
			return true;
		
		return t.getSource() != null && t.getTarget() != null;
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.must_have_source_and_target;
	}
	
	@Override
	public String getRationale() {
		String rat = "Cannot have transition with no source or target.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(ActionTransition.class); add(InvocationTransition.class);}};
	}
}
