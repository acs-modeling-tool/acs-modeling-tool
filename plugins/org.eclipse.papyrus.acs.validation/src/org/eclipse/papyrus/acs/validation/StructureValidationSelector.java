package org.eclipse.papyrus.acs.validation;


import java.util.LinkedList;

import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.impl.ACS_ModelImpl;
import org.eclipse.papyrus.acs.profile.model.impl.CompositeImpl;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImportImpl;


@SuppressWarnings("restriction")
public class StructureValidationSelector implements IClientSelector {
	
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> structure_interface = new LinkedList<Class<?>>(){{ 
		add(SoI.class); 
		add(Reference.class); 
		add(Composite.class); 
		add(AtomicSystem.class);
		add(LinkConnection.class);}};
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> structure_impl = new LinkedList<Class<?>>(){{ add(ACS_ModelImpl.class); add(CompositeImpl.class); }};
	@SuppressWarnings("serial")
	public static final LinkedList<Class<?>> uml_element = new LinkedList<Class<?>>(){{ add(ComponentImpl.class); add(ModelImpl.class); add(PackageImportImpl.class); }};
	
	
	@Override
	public boolean selects(Object stereoApplicationObj) {
		for (Class<?> type : structure_interface) 
		    if (type.isInstance(stereoApplicationObj)) {
		    	System.out.println("Selected structure_interface: " + type.getSimpleName() + " for validation.");
		        return true;
		    }
		for (Class<?> type : structure_impl) 
		    if (type.isInstance(stereoApplicationObj)) {
		    	System.out.println("Selected structure_impl: " + type.getSimpleName() + " for validation.");
		         return true;
		    }
		for (Class<?> type : uml_element) 
		    if (type.isInstance(stereoApplicationObj)) {
		    	System.out.println("Selected uml_element: " + type.getSimpleName() + " for validation.");
		         return true;
		    }
    	System.out.println("Skipping : " + stereoApplicationObj.toString());
		return false;
	}
}
