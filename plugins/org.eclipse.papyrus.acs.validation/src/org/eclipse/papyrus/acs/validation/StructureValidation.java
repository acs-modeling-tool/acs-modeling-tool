package org.eclipse.papyrus.acs.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintManager;

public class StructureValidation extends AbstractModelConstraint {
	static ConstraintManager manager = new ConstraintManager();

	
	@Override
	public IStatus validate(IValidationContext context) {
		
		EObject target = context.getTarget();
		
		//Get the name
    	String name = Utils.getName(target);

		//Find constraints that fit this target
		String res = null;
		for (ConstraintInterface con: Utils.constraintInterfaces)
			for (Class<?> clazz : con.appliesTo())
				if (clazz.isInstance(target))
					manager.add(con.getAttachedConstraintEnum());

		if (manager.currentConstraints.isEmpty())
			System.out.println(name + "Consider to implement constraints for: " + target.toString());

		//Validation happens here
		res = manager.EvaluateTargetConstraints(target);
		
		//Return result
		if (res == "") {
			return context.createSuccessStatus();
		} else {
			System.out.println(name + " was deemed bad with: " + res);
			return context.createFailureStatus(name + ": " + res);
		}
	}
}
