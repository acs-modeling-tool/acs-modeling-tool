package org.eclipse.papyrus.acs.navigation;

import org.eclipse.papyrus.uml.navigation.navigableElement.GenericNavigableElement;
import org.eclipse.uml2.uml.Type;

public class SpecialTargetNavigableElement extends GenericNavigableElement {
	  
	public SpecialTargetNavigableElement(Type type) { // Write a constructor that will call "super(Element elt)" where "elt" is the semantic element that this navigable element wraps
	    super(type);
	  }

	  @Override
	  public String getLabel() {
	    return "Go to special target" + getElementLabel() + "..."; // The convention is to return a string like this
	  }

	  @Override
	  public String getDescription() {
	    return "Go to the special target:" + getElementLabel(); // The convention is to return a string like this
	  }
	}