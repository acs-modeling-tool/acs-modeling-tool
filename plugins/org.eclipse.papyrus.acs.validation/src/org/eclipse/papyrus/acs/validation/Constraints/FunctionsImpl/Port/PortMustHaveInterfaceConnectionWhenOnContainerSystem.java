package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.Port;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;

public class PortMustHaveInterfaceConnectionWhenOnContainerSystem implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		
			
		//The system that holds the port
		Element holdingsystem = (Element) ((Port) target).getBase_Port().eContainer();
			
		//List of connectors in holding system
		List<Connector> connectors = null;
			
		boolean shouldContainInterface = false;
			
		// Composite and SoI are both container systems so they must require the port to also have an interface connection
		if (holdingsystem.getStereotypeApplications().get(0) instanceof Composite) {
			Composite holding = (Composite) holdingsystem.getStereotypeApplications().get(0);
			connectors = holding.getBase_Component().getOwnedConnectors();
			shouldContainInterface = true;
		} else if (holdingsystem.getStereotypeApplications().get(0) instanceof SoI) {
			SoI holding = (SoI) holdingsystem.getStereotypeApplications().get(0);
			connectors = holding.getBase_Component().getOwnedConnectors();
			shouldContainInterface = true;
		}
			
		//If we should contain interface we look at the existing connectors
		//Otherwise we return true as this requirement is fulfilled
		if (shouldContainInterface) {
				//If we should contain interface but no connectors were found then this requirement fails
				if(connectors == null)
					return false;
				//Otherwise we look in the list
				for (Connector conn : connectors) {
					//We only care about interface connections NOT link connections
					if (conn.getStereotypeApplications().get(0) instanceof InterfaceConnection) {
						InterfaceConnection icon = (InterfaceConnection)conn.getStereotypeApplications().get(0);
						List<ConnectorEnd> ends = icon.getBase_Connector().getEnds();
						for (ConnectorEnd end : ends) {
							//If the end is placed on this port this port is good
							if (end.getRole() == ((Port)target).getBase_Port())
								return true;
						}
					}
				}
				//If we didn't succeed in finding a InterfaceConnection this port is bad
				return false;
		}else {
				return true;
		}
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Must have a Interface Connection.";
	}
	
	@Override
	public String getRationale() {
		String rat = "The port must have an InterfaceConnection since the \n"
				+ "container is just an alias for the underlying Atomic System.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(Port.class);}};
	}
}
