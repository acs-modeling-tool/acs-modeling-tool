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
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.SoI;

@SuppressWarnings("restriction")
public class MustContainSelfReferentialOrActiveConnection implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		LinkHub linkhub = (LinkHub) target;
		Element parent = (Element) linkhub.getBase_Port().eContainer().eContainer();
		
		List<Connector> connectors = null;
		
		if (parent.getStereotypeApplications().get(0) instanceof SoI) {
			SoI soi = (SoI) parent.getStereotypeApplications().get(0);
			connectors =  soi.getBase_Component().getOwnedConnectors();
		} else {
			ComponentImpl comp = (ComponentImpl) parent;
			connectors = comp.getOwnedConnectors();
		}
		
		//If there are no connectors there can't be any of the specific types we look for either
		if (connectors == null) 
			return false;
		
		boolean containSelfReferential = false;
		boolean containActive = false;

		for (Connector con : connectors) {
			for (ConnectorEnd conend : con.getEnds()) {
				//If the connector is on target port we check the type
				if (conend.getRole() == linkhub.getBase_Port()) {
					LinkConnection linkconnection = (LinkConnection) con.getStereotypeApplications().get(0);
					if (linkconnection.getDirectionality() == ConnectionTypes.ACTIVE)
						containActive = true;
					else if (linkconnection.getDirectionality() == ConnectionTypes.SELF_REFERENTIAL)
						containSelfReferential = true;
				}
			}
		}

		return containSelfReferential || containActive;
	}

	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.must_contain_self_referential_or_active_connection); }};
	}
}