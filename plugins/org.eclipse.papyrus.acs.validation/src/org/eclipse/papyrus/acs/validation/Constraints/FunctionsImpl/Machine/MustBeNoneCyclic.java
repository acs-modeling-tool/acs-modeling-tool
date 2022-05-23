package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Machine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.papyrus.acs.profile.model.Machine;

public class MustBeNoneCyclic implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Machine machine = (Machine) target;
		
		EList<Transition> transitions = machine.getBase_Region().getTransitions();
		EList<Vertex> vertices = machine.getBase_Region().getSubvertices();

		//hasCycle returns null when there is no cycle
		return hasCycle(transitions, vertices) == null;
	}

	@SuppressWarnings("serial")
	public String hasCycle(EList<Transition> transitions, EList<Vertex> vertices) {

		//Every transition has a list of its parents
		Map<Vertex, Set<Vertex>> parents = new HashMap<Vertex, Set<Vertex>>(){};
		for (Vertex v : vertices)
			parents.put(v, new HashSet<Vertex>() {});

		for (Transition t : transitions) {
			//We add the parent relationship
			parents.get(t.getTarget()).add(t.getSource());
		}
		
		//We expand the parent relationships as long as new parents are found
		try {
			boolean found_new_parents = true;
			while(found_new_parents) {
				//Were done when a expansion has happened without updating a single parent relationship
				//No parents would be deducible at that point.
				found_new_parents = false;
				
				//Do an expansion for every vertex
				for (Map.Entry<Vertex, Set<Vertex>> entry : parents.entrySet()) {
					LinkedList<Vertex> new_parents = new LinkedList<Vertex> () {};
					//For every parent of current vertex
					for (Vertex parent : entry.getValue())
						//For every of the grandfather
						for (Vertex grandfather : parents.get(parent))
							// If we don't have it already in the parent list
							if (!entry.getValue().contains(grandfather)) {
								//Add grandfather as our new parent
								new_parents.add(grandfather);
								//Set that we found a new parent this round
								found_new_parents = true;
							}
					//Add all new found parents
					entry.getValue().addAll(new_parents);
				}
			}
		} catch(Exception e) {
			System.out.print(e.getStackTrace());
		}


		//We detect a cycle if any vertex is also in it's parent set
		for (Map.Entry<Vertex, Set<Vertex>> entry : parents.entrySet())
			if (entry.getValue().contains(entry.getKey()))
				return "Found Cycle as " + entry.getKey().getName() + " can reach itself";
		return null;
	}
	
	@Override
	public String getErrorMSG(EObject target) {
		if (target == null)
			return ConstraintInterface.super.getErrorMSG(null);
		
		Machine machine = (Machine) target;
		
		EList<Transition> transitions = machine.getBase_Region().getTransitions();
		EList<Vertex> vertices = machine.getBase_Region().getSubvertices();
		String res = hasCycle(transitions, vertices);
		if (res == null)
			return "";
		return hasCycle(transitions, vertices);
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
