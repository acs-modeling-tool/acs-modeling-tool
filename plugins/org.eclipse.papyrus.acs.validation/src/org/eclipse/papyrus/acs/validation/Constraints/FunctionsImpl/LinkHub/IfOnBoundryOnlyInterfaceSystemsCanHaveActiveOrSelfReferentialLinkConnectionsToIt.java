package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkHub;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.SoI;

@SuppressWarnings("restriction")
public class IfOnBoundryOnlyInterfaceSystemsCanHaveActiveOrSelfReferentialLinkConnectionsToIt implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		LinkHub linkhub = (LinkHub) target;
		Element parent = (Element) linkhub.getBase_Port().eContainer();
		
		//Check if linkhub is on boundary system i.e. composite
		if (parent.getStereotypeApplications().get(0) instanceof Composite) {

			List<Connector> connectors = null;
			
			if (parent.getStereotypeApplications().get(0) instanceof SoI) {
				SoI soi = (SoI) parent.getStereotypeApplications().get(0);
				connectors =  soi.getBase_Component().getOwnedConnectors();
			} else {
				ComponentImpl comp = (ComponentImpl) parent;
				connectors = comp.getOwnedConnectors();
			}
			
			//If there are no connectors there is not a problem
			if (connectors == null) 
				return true;
			
			@SuppressWarnings("serial")
			List<LinkConnection> linkconnections = new LinkedList<LinkConnection> () {};
			@SuppressWarnings("serial")
			List<InterfaceConnection> interfaceconnections = new LinkedList<InterfaceConnection> () {};

			//Sort connectors
			for (Connector conn : connectors) {
				if (conn.getApplicableStereotypes().get(0) instanceof LinkConnection)
					linkconnections.add((LinkConnection) conn);
				if (conn.getApplicableStereotypes().get(0) instanceof InterfaceConnection)
					interfaceconnections.add((InterfaceConnection) conn);
			}
			
			//I cannot believe this actually works, sorry if you need to update this... ...
			//For each link connection
			for (LinkConnection link : linkconnections)
				//If they are Active or Self referential
				if (link.getDirectionality() == ConnectionTypes.ACTIVE || link.getDirectionality() == ConnectionTypes.SELF_REFERENTIAL)
					//We check each of their ends
					for (ConnectorEnd end: link.getBase_Connector().getEnds())
						//If an end actually touches this link hub
						if (end.getRole() == linkhub.getBase_Port())
							//We need to ensure that the other end actually touches an interface system
							for (ConnectorEnd endd: link.getBase_Connector().getEnds())
								//We find the atomic system in 
								if (endd.getRole().getApplicableStereotypes().get(0) instanceof AtomicSystem) {
									//We check the interface connections
									boolean foundConnectingInterface = false;
									for (InterfaceConnection icon : interfaceconnections) {
										//Each end
										for (ConnectorEnd iconend: icon.getBase_Connector().getEnds()) {
											if (iconend.getRole().eContainer() == endd.getRole().getApplicableStereotypes().get(0))
												foundConnectingInterface = true;
										}
									}
									//If there was not found a connecting interface
									//Then the atomic system is not and interface system and this rule is broken!
									if (!foundConnectingInterface)
										return false;
								}
		}			
		return true;
	}

	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.if_on_boundry_only_interface_systems_can_have_active_or_self_refential_link_connections_to_it); }};
	}
}