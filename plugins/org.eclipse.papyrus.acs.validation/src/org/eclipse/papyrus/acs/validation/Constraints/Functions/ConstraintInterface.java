package org.eclipse.papyrus.acs.validation.Constraints.Functions;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Utils;



public interface ConstraintInterface {
	
	/*Return false if the target doesn't satisfy the constraint*/
	public boolean satisfies(EObject target);
	
	/*ConstraintsEnums that this constraint function is matched to*/
	public ConstraintsEnum getAttachedConstraintEnum();
	
	/*Returns an error MSG for the constraint
	 * If target is null the MSG will be a generic error MSG for this constraint
	 * */
	public default String getErrorMSG(EObject target) {
		return Utils.getMSG(getAttachedConstraintEnum());
	}
	
	/*Returns a short description of the rationale behind this constraint*/
	public default String getRationale() {
		return "Rationale missing for now.";
	};
	
	/*Returns a short description of the rationale behind this constraint*/
	public LinkedList<Class<?>> appliesTo();
}
