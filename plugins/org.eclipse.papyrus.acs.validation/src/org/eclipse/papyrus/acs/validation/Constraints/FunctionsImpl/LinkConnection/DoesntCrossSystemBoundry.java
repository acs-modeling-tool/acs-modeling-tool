package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;


public class DoesntCrossSystemBoundry implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		
		//Get the connector ends
		List<ConnectorEnd> ends = ((LinkConnection) target).getBase_Connector().getEnds();
		
		//The holding system of reference
		EObject holdingSystem = null;
		
		//We want to make sure the ends are within the reference system so we know they don't cross a boundary into a different system
		for (ConnectorEnd end : ends)
				// If the holdingSystem is not set we set it
				// If this holding system is set we return true if the second ConnectorEnd has the same holding system
				if (holdingSystem == null)
					holdingSystem = end.getRole().eContainer().eContainer();
				else return holdingSystem == end.getRole().eContainer().eContainer();
		// This should only happen if there is only one or zero connector ends which should not be possible
		return false;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.doesnt_cross_system_boundry); }};
	}
}
