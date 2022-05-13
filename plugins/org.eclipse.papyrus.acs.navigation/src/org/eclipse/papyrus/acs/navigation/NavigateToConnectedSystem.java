package org.eclipse.papyrus.acs.navigation;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationContributor;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.Element;

public class NavigateToConnectedSystem implements NavigationContributor {
	 
	public List<NavigableElement> getNavigableElements(Object fromElement) {
		List<NavigableElement> result = new LinkedList<NavigableElement>();
		Element element = org.eclipse.papyrus.uml.tools.utils.UMLUtil.resolveUMLElement(fromElement);
		if (fromElement instanceof Component) {
			final AtomicSystem atomic = UMLUtil.getStereotypeApplication(element, AtomicSystem.class);
			String myName = atomic.getBase_Component().getName();
			System.out.println("My name: " + myName);
		}
		return result;
	}
}