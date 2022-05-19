package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Controller;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;


import org.eclipse.papyrus.acs.profile.model.Controller;

public class AllStatesReachable implements ConstraintInterface {

	@SuppressWarnings("serial")
	@Override
	public boolean satisfies(EObject target) {
		Controller con = (Controller) target;
		
		Region r = con.getBase_StateMachine().getRegions().get(0);

		Vertex initalState = null;
		Set<Vertex> intermediatestates  = new LinkedHashSet<Vertex>() {};
		Set<Transition> transitions = new LinkedHashSet<Transition>() {};
		
		for (Transition trans: r.getTransitions())
			if (trans instanceof Transition) 
				transitions.add(trans);
				
		//Find Initial state
		for (Vertex v : r.getSubvertices())
			if (v instanceof Pseudostate) 
				initalState = v;
			else if(v instanceof State)
				intermediatestates.add(v);
		
		
		Set<Vertex> intermediatestatesCurrentlyReached = new LinkedHashSet<Vertex>() {};
		
		Set<Vertex> foundThisRound = new LinkedHashSet<Vertex>() {};

		
		//Seed the states that are reachable from initialState
		for (Transition trans: transitions)
			if(trans.getSource() == initalState)
				foundThisRound.add(trans.getTarget());

		
		//When we no longer find new states in a round we stop
		while (!foundThisRound.isEmpty()){
			
			//Add all we found to intermediatestatesCurrentlyReached
			intermediatestatesCurrentlyReached.addAll(foundThisRound);
			
			//reset set
			foundThisRound = new LinkedHashSet<Vertex>() {};
			
			//for every reached state
			for (Vertex reached: intermediatestatesCurrentlyReached)
				//Check all transitions
				for (Transition trans: transitions) 
					//If a transitions source is reached
					if (trans.getSource() == reached) 
						//If we haven't added it already
						if (!intermediatestatesCurrentlyReached.contains(trans.getTarget()))
							//We found it this round
							foundThisRound.add(trans.getTarget());
		}

		//If we reached all states that exists were good
		return intermediatestatesCurrentlyReached.equals(intermediatestates);
	}

	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.all_states_reachable;
	}
	
	@Override
	public String getRationale() {
		String rat = "An unreachable state is useless and only adds confusion.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Controller.class); }};
	}
}
