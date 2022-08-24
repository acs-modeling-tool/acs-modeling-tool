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

package org.eclipse.papyrus.acs.properties.internal;


import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;

public final class ContextConfigurator {

	public static final String[] DEFAULT_CONTEXTS = new String[] { Context.UML, Context.ADVANCE_STYLE, Context.CSS, Context.CUSTOMIZATION};

	public static final String[] ACS_CONTEXTS = new String[] { Context.ACS, Context.UML };

	/** Configuration manager instance */
	public static final ConfigurationManager configurationManager = ConfigurationManager.getInstance();

	private static boolean showDefault = true;
	
	private static boolean showACS = false;

	private ContextConfigurator() {
	}

	public static void showDefault() {
		System.out.println("Show default tab");
		if (!showDefault) {
			setVisibility(DEFAULT_CONTEXTS, true);
			showDefault = true;
		}
	}

	public static void hideDefault() {
		System.out.println("Hide default tab");
		if (showDefault) {
			setVisibility(DEFAULT_CONTEXTS, false);
			showDefault = false;
		}
	}

	public static void showACS() {
		System.out.println("Show ACS tab");
		if (!showACS) {
			setVisibility(ACS_CONTEXTS, true);
			showACS = true;
		}
	}

	public static void hideACS() {
		System.out.println("Hide ACS tab");
		if (showACS) {
			setVisibility(ACS_CONTEXTS, false);
			showACS = false;
		}
	}

	public static void setVisibility(String[] contextNames, boolean visibility) {
		for (String contextName : contextNames) {
			org.eclipse.papyrus.infra.properties.contexts.Context context = configurationManager
					.getContext(contextName);
			if (context != null) {
				try {
					if (visibility) {
						configurationManager.enableContext(context, true);
					} else {
						configurationManager.disableContext(context, true);
					}

				} catch (IllegalStateException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public interface Context {
		/** AdvanceStyle */
		String ADVANCE_STYLE = "AdvanceStyle";

		/** CSS in Diagrams */
		String CSS = "CSS";

		/** Customization Models */
		String CUSTOMIZATION = "Customization";

		/** Diagram Notation */
		String NOTATION = "notation";

		/** Diagram Styles */
		String STYLE = "style";

		/** Diagram Synchronization */
		String SYNCHRONIZATION = "synchronization";

		/** UML Diagram Symbols */
		String SYMBOLS = "Symbols";

		/** UML Graphical Notation */
		String UML_NOTATION = "UMLNotation";

		/** UML Metamodel */
		String UML = "UML";

		/** ACS Metamodel */
		String ACS = "model";

		/** UML Profile Externalization */
		String UML_STEREOTYPE_APPLICATION_EXTERNAL_RESOURCE = "UMLStereotypeApplicationExternalResource";

		/** UML Sequence Diagram Notation */
		String SEQUENCE_NOTATION = "SequenceNotation";
	}
}
