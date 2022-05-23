package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Vertex;


import org.eclipse.papyrus.acs.profile.model.Controller;

public class ExactlyOneInitialNode implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		Region r = con.getBase_StateMachine().getRegions().get(0);

		Vertex initialState = null;
				
		//Find Initial state
		for (Vertex v : r.getSubvertices())
			if (v instanceof Pseudostate) {
				//If we already set a initial state there are more than one
				if (initialState != null)
					return false;
				//Set this as initial
				initialState = v;
			}
		//Apparently only one initial node exists
		return true;
	}

	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.exactly_one_initial_node;
	}
	
	@Override
	public String getRationale() {
		String rat = "We only support exactly one initial node.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class);}};
	}
}
