package org.eclipse.papyrus.acs.validation;

import org.eclipse.emf.validation.model.IClientSelector;


public class StructureValidationSelector implements IClientSelector {

	@Override
	public boolean selects(Object stereoApplicationObj) {
		for (Class<?> type : Utils.uml_element) 
		    if (type.isInstance(stereoApplicationObj)) {
		    	System.out.println("Selected uml_element: " + type.getSimpleName() + " for validation.");
		        return true;
		    }
    	System.out.println("Skipping : " + stereoApplicationObj.toString());
		return false;
	}
}
