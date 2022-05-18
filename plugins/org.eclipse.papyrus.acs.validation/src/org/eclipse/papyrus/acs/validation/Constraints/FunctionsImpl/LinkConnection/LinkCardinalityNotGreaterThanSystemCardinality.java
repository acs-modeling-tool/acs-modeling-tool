package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.LinkConnection;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.Subsystem;


public class LinkCardinalityNotGreaterThanSystemCardinality implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		//If the result is the empty string there are no issues with the links cardinality
		return checkCardinality((LinkConnection) target).equals("");
	}
	
	// We use this helper function to both verify and generate error codes
	public String checkCardinality(LinkConnection link) {
		
		//Link cardinality is directly accessible
		String linkcar = link.getCardinality();
		
		// Find the connected system
		Element puresystem = null;
		for (ConnectorEnd end : link.getBase_Connector().getEnds())
			if (end.getRole().getAppliedStereotypes().get(0).getName().equals("Port"))
				puresystem = (Element) end.getRole().eContainer();
		
		// if the system is SoI there wont be any cardinality and this test wont matter
		if (puresystem.getStereotypeApplications().get(0) instanceof SoI)
			return "";
		
		//If it isn't a Subsystem we don't care
		if(!(puresystem.getStereotypeApplications().get(0) instanceof Subsystem)) {
			return "";
		}
		String systemcar = ((Subsystem) puresystem.getStereotypeApplications().get(0)).getCardinality();
		
		if (linkcar == null)
			return "Link cardinality is missing";
		if (systemcar == null)
			return "System cardinality is missing";
		
		if (linkcar.matches("[0-9]+")) {
			if (systemcar.matches("[0-9]+")) {
				//If the cardinality is self referential the link can at most be the size of system - 1 
				//since it can at-most talk to all the other systems minus it self
				if (link.getDirectionality() == ConnectionTypes.SELF_REFERENTIAL)
					if (Integer.parseInt(systemcar) >= Integer.parseInt(linkcar) + 1)
						return "";
					else return "Link cardinality is too big (remember self referential link cardinality must be one smaller than system cardinality)";
				//Otherwise just check that the link number is lower or equal on the system number
				if (Integer.parseInt(systemcar) >= Integer.parseInt(linkcar))
					return "";
				else return "Link cardinality is bigger than system.";
			} else if (systemcar.equals("N")){
				//If link is a number but the system isn't, the system is just always bigger than link
				return "";
			} else if (systemcar.equals("*")) {
				//Only case left is sysCar.car = *, which cannot be accessed with a known number (except with tokens)
				return "System is * cardinality so the link must be * also.";
			} else {
				return "Cardinality must be either [0-9]+ or 'N' or '*' nothing else is allowed";
			}
		} else if (linkcar.equals("N")) {
			if (systemcar.matches("[0-9]+")) {
				//If the link is N and system is number, system is upper-bound
				return "";
			} else if (systemcar.equals("N")) {
				//Always allowed
				return "";
			} else if (systemcar.equals("*")) {
				//Only case left is sysCar.car = *, which cannot be accessed with a known number (except with tokens)
				return "System is * cardinality so the link must be * also.";
			} else {
				return "Cardinality must be either [0-9]+ or 'N' or '*' nothing else is allowed";
			}
		} else if (linkcar.equals("*")) {
			return "";
		}
		//malformed link cardinality
		return "Cardinality must be either [0-9]+ or 'N' or '*' nothing else is allowed";
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.link_cardinality_not_greater_than_system_cardinality;
	}
	
	public String getErrorMSG(EObject target) {
		if (target == null)
			return "Link Cardinality is bad";
		return checkCardinality((LinkConnection) target);
	}
	
	@Override
	public String getRationale() {
		String rat = "We enforce some rules on Link Connections since they are obviously bad.\n"
				+ "If you put a Cardinality of 5 on some Atomic System (i.e. You have 5 of this system).\n"
				+ "Then it wouldnt make sense to say that 6 of these five systems talk over the connection.\n"
				+ "If you put a Cardinality of 2 on some Atomic System (i.e. You have 2 of this system)\n"
				+ "Then it wouldnt make sense to say that two of these Systems talk to themselves (i.e. self referential)\n"
				+ "Since the Initating system would need to part of the Reacting systems.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(LinkConnection.class);}};
	}
}
