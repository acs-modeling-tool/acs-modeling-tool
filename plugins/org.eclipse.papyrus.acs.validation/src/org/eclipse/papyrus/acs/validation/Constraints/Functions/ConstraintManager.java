package org.eclipse.papyrus.acs.validation.Constraints.Functions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Utils;

public class ConstraintManager {
	
	public List<ConstraintsEnum> currentConstraints;
	public List<ConstraintInterface> constraintInterfaces;
	String res;
	
	public ConstraintManager() {
		this.currentConstraints = new LinkedList<ConstraintsEnum>();
		this.res = "";
		this.constraintInterfaces = Utils.constraintInterfaces;
	}
	
	public String EvaluateTargetConstraints(EObject target){
		this.res = "";
		for (ConstraintsEnum constraint: this.currentConstraints) {
			boolean foundConstraintFunction = false;
			for (ConstraintInterface constraintinterface: this.constraintInterfaces)
				if (constraintinterface.getAttachedConstraintEnum() == constraint) {
					apply(constraintinterface, target);
					foundConstraintFunction = true;

				}
			if (!foundConstraintFunction)
				System.out.println("Missing constraint function for constraint: " + constraint.name() + " on systemtype: " + target.toString());
		}

		this.currentConstraints = new LinkedList<ConstraintsEnum>();
		return this.res;
	}
	
	public void add(ConstraintsEnum constraint) {
		this.currentConstraints.add(constraint);
	}
	
	public void remove(ConstraintsEnum constraint) {
		this.currentConstraints.remove(constraint);
	}
	
	private void apply(ConstraintInterface constraintinterface, EObject target) {
		if (!constraintinterface.satisfies(target))
			this.res = res + " " + constraintinterface.getErrorMSG(target);
	}
}
