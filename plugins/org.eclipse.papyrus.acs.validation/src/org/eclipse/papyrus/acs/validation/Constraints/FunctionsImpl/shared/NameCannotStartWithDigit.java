package org.eclipse.papyrus.acs.validation.Constraints.FunctionsImpl.shared;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.ActionTransition;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.CONIntermediateState;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.Controller;
import org.eclipse.papyrus.acs.profile.model.CONStartState;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.InvocationTransition;
import org.eclipse.papyrus.acs.validation.ConstraintsEnum;
import org.eclipse.papyrus.acs.validation.Utils;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;

public class NameCannotStartWithDigit implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Character firstChar = Utils.getName(target).charAt(0);
		return !Character.isDigit(firstChar);
	}
	
	@Override
	public ConstraintsEnum getAttachedConstraintEnum() {
		return ConstraintsEnum.name_cannot_start_with_digit;
	}
	
	@Override
	public String getRationale() {
		String rat = "For implementation and compliance reasons we have chosen to disallow this.";
		return rat;
	}
	
	@SuppressWarnings("serial")
	@Override
	public LinkedList<Class<?>> appliesTo() {
		return new LinkedList<Class<?>> () {{
			//Structure diagram
			add(Composite.class); 
			add(AtomicSystem.class); 
			add(SoI.class);
			add(ACS_Model.class);
			add(LinkConnection.class);
			add(InterfaceConnection.class);
			add(Port.class);
			add(Reference.class);
			
			//Controller diagram
			add(Controller.class);
			add(CONIntermediateState.class);
			add(CONStartState.class);
			add(ActionTransition.class);
			
			//Event diagram
			add(InvocationTransition.class);
			}};
	}
}