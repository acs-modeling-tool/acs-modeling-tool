package org.eclipse.papyrus.acs.validation.Constraints.Functions;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.ConstraintFunctions;

public interface ConstraintInterface {
	/*Return false if the target doesn't satisfy the constraint*/
	public boolean satisfies(EObject target);
	/*Returns a list of constraintsEnums that this constraint function is matched to*/
	public List<ConstraintsEnum> getAttachedConstraints();
	/*Returns an error MSG for the constraint*/
	public default String getErrorMSG(EObject target) {
		return ConstraintFunctions.getMSG(getAttachedConstraints().get(0));
	};
}
