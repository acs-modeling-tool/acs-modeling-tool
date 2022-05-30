package org.eclipse.papyrus.acs.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;

public class StructureValidation extends AbstractModelConstraint {
	
	@Override
	public IStatus validate(IValidationContext context) {
		
		EObject target = context.getTarget();
		
		//Get the name
    	String name = Utils.getName(target);

		//Find constraints that fit this target
		String res = null;

		//Find constraints and validate object on each constraint
		for (ConstraintInterface constraint: Utils.constraintInterfaces)
			for (Class<?> clss : constraint.appliesTo())
				if (clss.isInstance(target))
					if (!constraint.satisfies(target))
						if (res == null)
							res = constraint.getErrorMSG(target);
						else
							res = res + " " + constraint.getErrorMSG(target);
					else if (res == null)
						res = "";

		if (res == null) {
			System.out.println("Found no constraint function for: " + target.toString());
			return context.createSuccessStatus();
		} else if(res.equals(""))
			return context.createSuccessStatus();
		else {
			System.out.println(name + " was deemed bad with: " + res);
			return context.createFailureStatus(name + ": " + res);
		}
	}
}
