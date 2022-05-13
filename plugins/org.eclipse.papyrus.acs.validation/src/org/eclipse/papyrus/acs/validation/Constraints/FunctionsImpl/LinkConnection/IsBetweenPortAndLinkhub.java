package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Port;


public class IsBetweenPortAndLinkhub implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {

		LinkConnection link = (LinkConnection) target;
		List<ConnectorEnd> ends = link.getBase_Connector().getEnds();
		
		boolean portFound = false;
		boolean linkhubFound = false;
		
		for (ConnectorEnd end : ends) 
			if (end.getRole().getStereotypeApplications().get(0) instanceof LinkHub)
				linkhubFound = true;
			else if (end.getRole().getStereotypeApplications().get(0) instanceof Port)
				portFound = true;
		
		return linkhubFound && portFound;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.is_between_port_and_linkhub); }};
	}
}
