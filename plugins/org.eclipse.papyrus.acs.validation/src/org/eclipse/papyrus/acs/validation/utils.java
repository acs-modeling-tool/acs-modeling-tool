package org.eclipse.papyrus.acs.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.System;

public abstract class utils {
	public static String getName(EObject target) {
    	if (target instanceof System)
    		return ((System) target).getBase_Component().getName();
    	else if (target instanceof SoI)
    		return ((SoI) target).getBase_Component().getName();
    	else if (target instanceof ACS_Model)
    		return ((ACS_Model) target).getBase_Model().getName();
    	else if (target instanceof Port)
    		return ((Port) target).getBase_Port().getName();
    	else if (target instanceof LinkConnection)
    		return ((LinkConnection) target).getBase_Connector().getName();
    	else if (target instanceof InterfaceConnection)
    		return ((InterfaceConnection) target).getBase_Connector().getName();
    	else if (target instanceof LinkHub)
    		return ((LinkHub) target).getBase_Port().getName();
    	else 
    		return "Cannot get name of: " + target.toString();
	}
}
