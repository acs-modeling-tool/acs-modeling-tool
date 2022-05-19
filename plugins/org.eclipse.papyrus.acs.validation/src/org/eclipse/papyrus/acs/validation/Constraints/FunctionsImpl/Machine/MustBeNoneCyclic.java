package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Machine;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.papyrus.acs.profile.model.Machine;

public class MustBeNoneCyclic implements ConstraintInterface {

	@SuppressWarnings("serial")
	@Override
	public boolean satisfies(EObject target) {
		Machine machine = (Machine) target;
		EList<Transition> transitions = machine.getBase_Region().getTransitions();
		EList<Vertex> vertices = machine.getBase_Region().getSubvertices();

		Set<Vertex> visitedvertices = new LinkedHashSet<Vertex> () {};
		
		Vertex initalState = null;

		//Find initial 
		for (Vertex v: vertices)
			if (v instanceof Pseudostate) 
				initalState = v;
		
		//add it as visited
		visitedvertices.add(initalState);
		
		//If we find a back ref it is probably a cycle
		boolean no_back_ref = true;
		
		//We keep going until all vertices are visited
		while(!visitedvertices.containsAll(vertices)) {
			List<Vertex> foundThisRound = new LinkedList<Vertex> () {};
			
			//If transition exists 
			for (Transition t : transitions) 
				//from unvisited node
				if (!visitedvertices.contains(t.getSource())) 
					//to visited node
					if (visitedvertices.contains(t.getTarget())) 
						//Then it is a cycle
						no_back_ref = false;
			//If transition exists
			for (Transition t : transitions) {
				//from visited node
				if (visitedvertices.contains(t.getSource())) {
					//To unvisited node
					if (!visitedvertices.contains(t.getTarget())) {
						//Add this as visited this round
						foundThisRound.add(t.getTarget());
					}
				}
			}
			
			//Update visited
			visitedvertices.addAll(foundThisRound);
			
			//If we didn't find any we break
			if (foundThisRound.isEmpty())
				break;
		}
		
		//We didn't find any cycles  when visiting all nodes
		return no_back_ref;
	}

	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.must_be_none_cyclic;
	}
	
	@Override
	public String getRationale() {
		String rat = "Must be none cyclic.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Machine.class);}};
	}
}
