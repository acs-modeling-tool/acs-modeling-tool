package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.SoI;

public class ConnectedToContainerPort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		for (ConnectorEnd end: ((InterfaceConnection) target).getBase_Connector().getEnds()) {
			EObject element = end.getRole().eContainer();
			if (((Element)element).getStereotypeApplications().get(0) instanceof Composite)
				return true;
			if (((Element)element).getStereotypeApplications().get(0) instanceof SoI)
				return true;
		}
		return false; 
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.connected_to_container_port;
	}
	
	@Override
	public String getRationale() {
		String rat = "Interface Connections must be connected to the Port on a Container system (i.e. Composite or SoI).\n"
				+ "The other end must be connected inside the Container.\n";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(InterfaceConnection.class);}};
	}
}