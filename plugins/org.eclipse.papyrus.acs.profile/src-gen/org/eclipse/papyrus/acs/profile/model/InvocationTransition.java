/**
 */
package org.eclipse.papyrus.acs.profile.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Transition</b></em>'.
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
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.InvocationTransition#getBase_Transition <em>Base Transition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getInvocationTransition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Invocation Transition'"
 * @generated
 */
public interface InvocationTransition extends EObject {
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
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getInvocationTransition_Base_Transition()
	 * @model ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.InvocationTransition#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not (self.end_state = self.start_state)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Non-cyclic (local)'"
	 * @generated
	 */
	boolean Noncycliclocal(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InvocationTransition
