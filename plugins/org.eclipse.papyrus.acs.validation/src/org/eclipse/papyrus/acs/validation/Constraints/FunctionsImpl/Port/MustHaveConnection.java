package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.uml2.uml.Element;


@SuppressWarnings("restriction")
public class MustHaveConnection implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {

		Port port = (Port) target;

		@SuppressWarnings("serial")
		List<Connector> connectors = new LinkedList<Connector>() {};
		
		if (port.getBase_Port().eContainer().eContainer() instanceof ModelImpl) {
			SoI sub = (SoI) ((Element) port.getBase_Port().eContainer()).getStereotypeApplications().get(0);
			connectors = sub.getBase_Component().getOwnedConnectors();
		} else {
			ComponentImpl comp = (ComponentImpl) port.getBase_Port().eContainer();
			ComponentImpl comp_p = (ComponentImpl) port.getBase_Port().eContainer().eContainer();
			connectors.addAll(comp.getOwnedConnectors());
			connectors.addAll(comp_p.getOwnedConnectors());
		}

		//If the container has no connectors this port couldn't possibly be connected
		if (connectors.size() == 0)
			return false;
		
		//Check if any of the connectors is connected to this port
		for (Connector conn : connectors)
			for (ConnectorEnd conn_end : conn.getEnds())
				if (conn_end.getRole() == port.getBase_Port())
					//We found it!
					return true;
		
		return false;
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.must_have_connection;
	}
	
	public String getErrorMSG(EObject target) {
		if (target == null)
			return "Missing Connection";
		
		Port port = (Port) target;
		return "missing connection (on: " + ((ComponentImpl) port.getBase_Port().eContainer()).getName() + ")";
	}
	
	@Override
	public String getRationale() {
		String rat = "Dead ends are not allowed, just delete the connection.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Port.class);}};
	}
}
