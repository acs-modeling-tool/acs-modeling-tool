package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.CONIntermediateState;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.papyrus.acs.profile.model.CONIntermediateState;

public class NotADeadEnd implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		CONIntermediateState con = (CONIntermediateState) target;
		
		StateMachine st = con.getBase_State().containingStateMachine();
		
		boolean not_dead_end = false;
		for (Transition t: st.getRegions().get(0).getTransitions()) 
			if (t.getSource() == con.getBase_State())
				not_dead_end = true;
		
		return not_dead_end;
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.not_a_dead_end;
	}
	
	@Override
	public String getRationale() {
		String rat = "Cannot be dead end.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(CONIntermediateState.class);}};
	}
}
