package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.InterfaceConnection;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;

public class ConnectedToAtomicSystemPort implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		for (ConnectorEnd end: ((InterfaceConnection) target).getBase_Connector().getEnds()) {
			EObject element = end.getRole().eContainer();
			if (((Element)element).getStereotypeApplications().get(0) instanceof AtomicSystem)
				return true;
		}
		return false;
	}

	@SuppressWarnings("serial")
	@Override
	public LinkedList<ConstraintsEnum> getAttachedConstraints() {
		return new LinkedList<ConstraintsEnum>(){{ add(ConstraintsEnum.connected_to_atomic_system_port); }};
	}
}