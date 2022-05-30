package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.Element;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;

public class ContainerPortAndInterfaceConnectionHaveSameParent implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		InterfaceConnection icon = (InterfaceConnection) target;
		Element one = (Element) icon.getBase_Connector().getEnds().get(0).getRole().eContainer();
		if (one.getStereotypeApplications().get(0) instanceof AtomicSystem)
			one = (Element) one.eContainer();
		Element two = (Element) icon.getBase_Connector().getEnds().get(1).getRole().eContainer();
		if (one.getStereotypeApplications().get(0) instanceof AtomicSystem)
			one = (Element) one.eContainer();
		return one == two;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Port and InterfaceConnection must have same parent.";
	}
	
	@Override
	public String getRationale() {
		String rat = "This is true when the connected Atomic System is inside the Container (i.e. Composite or SoI).";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{ add(InterfaceConnection.class);}};
	}
}