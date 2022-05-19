package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.papyrus.acs.profile.model.Controller;

public class NoStateIsDeadEnd implements ConstraintInterface {

	@SuppressWarnings("serial")
	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		Region r = con.getBase_StateMachine().getRegions().get(0);

		Set<Vertex> intermediatestates  = new LinkedHashSet<Vertex>() {};
		Set<Transition> transitions = new LinkedHashSet<Transition>() {};
		
		for (Transition trans: r.getTransitions())
			if (trans instanceof Transition) 
				transitions.add(trans);
				
		//Find only intermediatestates
		for (Vertex v : r.getSubvertices())
			if(v instanceof State)
				intermediatestates.add(v);
		
		//Every intermediatestate
		for (Vertex state: intermediatestates) {
			
			//Is assumed to have dead end
			boolean dead_end = true;
			
			//We check every transition
			for (Transition trans: r.getTransitions())
				//If we find a source equal to state
				if (trans.getSource() == state)
					//It cannot be dead end
					dead_end = false;
			//If we find a dead_end we can stop here, no need to check more
			if(dead_end)
				return false;
		}
		
		//Apparently no dead ends exists
		return true;
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.no_state_is_dead_end;
	}
	
	@Override
	public String getRationale() {
		String rat = "A deadend is not allowed, must lead to another state.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class);}};
	}
}
