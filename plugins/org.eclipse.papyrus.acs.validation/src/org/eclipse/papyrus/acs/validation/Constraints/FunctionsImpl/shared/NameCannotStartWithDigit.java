// Copyright 2022 ACS
//
// This file is part of ACS
//
// ACS is free software: you can redistribute it and/or modify it under
// the terms of the GNU General Public License version 3 as published by the
// Free Software Foundation.
//
// ACS is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
// Public License for more details.
//
// You should have received a copy of the GNU General Public License along
// with ACS. If not, see http://www.gnu.org/licenses/.
//
// Contributors: 
// Emil Palmelund Voldby
// Jonas Madsen
// Sean Kristian Remond Harbo
// Michele Albano
//
// Original repository: https://github.com/acs-modeling-tool/acs-modeling-tool

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
import org.eclipse.papyrus.acs.validation.Utils;
import org.eclipse.papyrus.acs.validation.Constraints.Functions.ConstraintInterface;

public class NameCannotStartWithDigit implements ConstraintInterface {

	@Override
	public boolean satisfies(EObject target) {
		Character firstChar = Utils.getName(target).charAt(0);
		return !Character.isDigit(firstChar);
	}
	
	
	@Override
	public String getRationale() {
		String rat = "For implementation and compliance reasons we have chosen to disallow this.";
		return rat;
	}
	
	@Override
	public String getErrorMSG(EObject target) { 
		return "Cannot have digit as first character in name.";
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