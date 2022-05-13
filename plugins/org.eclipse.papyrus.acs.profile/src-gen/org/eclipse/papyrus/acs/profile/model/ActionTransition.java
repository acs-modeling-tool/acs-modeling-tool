/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ==Use "name" as an invocation/action==
 * While Action Transitions and Invocation Transitions relate to Tokens, Ports, Events, Machines, Functions, Fields in table-based data types, and Declared types (and indirectly more), this has proven both non-user-friendly and overly complex to model explicitly. Thus, actions and invocations are simply represented as strings through the "name" property, since this is visible in a UML diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.ActionTransition#getBase_Transition <em>Base Transition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getActionTransition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Action Transition'"
 * @generated
 */
public interface ActionTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Transition</em>' reference.
	 * @see #setBase_Transition(Transition)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getActionTransition_Base_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.ActionTransition#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

} // ActionTransition
