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

package org.eclipse.papyrus.acs.hyperlink;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkObject;
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkSpecificObject;
import org.eclipse.papyrus.infra.hyperlink.service.HyperlinkContributor;
import org.eclipse.papyrus.uml.diagram.common.util.CrossReferencerUtil;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;

public class AtomicToController implements HyperlinkContributor {
	/**
	 * @see org.eclipse.papyrus.infra.hyperlink.service.HyperlinkContributor#getHyperlinks(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public List<HyperLinkObject> getHyperlinks(Object object) {
		List<HyperLinkObject> hyperlinks = new ArrayList<>();
		if (object instanceof Component) {
			Component component = (Component) object;
			if (true) {
				EList<DirectedRelationship> targetDirectedRelationships = component.getTargetDirectedRelationships();
				for (DirectedRelationship dependency : targetDirectedRelationships) {
					if (true) {
						EList<Element> targets = dependency.getSources();
						for (Element element : targets) {
							Set<View> crossReferencingViews = CrossReferencerUtil.getCrossReferencingViews(element,null);
							// we take the first available view
							Object firstView = crossReferencingViews.toArray()[0];
							hyperlinks.add(new HyperLinkSpecificObject((EObject) firstView));
						}
					}
				}
			}
		}
		return hyperlinks;
	}
}
