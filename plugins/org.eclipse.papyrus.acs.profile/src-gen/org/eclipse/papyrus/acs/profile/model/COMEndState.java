/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.FinalState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COM End State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getOutVars <em>Out Vars</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getBase_FinalState <em>Base Final State</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getOut_toks <em>Out toks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMEndState()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COM End State'"
 * @generated
 */
public interface COMEndState extends COMState {
	/**
	 * Returns the value of the '<em><b>Out Vars</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Vars</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Vars</em>' attribute list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMEndState_OutVars()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOutVars();

	/**
	 * Returns the value of the '<em><b>Base Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Final State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Final State</em>' reference.
	 * @see #setBase_FinalState(FinalState)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMEndState_Base_FinalState()
	 * @model ordered="false"
	 * @generated
	 */
	FinalState getBase_FinalState();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getBase_FinalState <em>Base Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Final State</em>' reference.
	 * @see #getBase_FinalState()
	 * @generated
	 */
	void setBase_FinalState(FinalState value);

	/**
	 * Returns the value of the '<em><b>Out toks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.TokenSelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out toks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out toks</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMEndState_Out_toks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TokenSelector> getOut_toks();

} // COMEndState
