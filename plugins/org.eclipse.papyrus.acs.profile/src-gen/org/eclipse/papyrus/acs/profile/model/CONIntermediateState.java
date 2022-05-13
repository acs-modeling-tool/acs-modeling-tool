/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.uml2.uml.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CON Intermediate State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.CONIntermediateState#getBase_State <em>Base State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCONIntermediateState()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CON Intermediate State'"
 * @generated
 */
public interface CONIntermediateState extends CONState {
	/**
	 * Returns the value of the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State</em>' reference.
	 * @see #setBase_State(State)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCONIntermediateState_Base_State()
	 * @model ordered="false"
	 * @generated
	 */
	State getBase_State();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.CONIntermediateState#getBase_State <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State</em>' reference.
	 * @see #getBase_State()
	 * @generated
	 */
	void setBase_State(State value);

} // CONIntermediateState
