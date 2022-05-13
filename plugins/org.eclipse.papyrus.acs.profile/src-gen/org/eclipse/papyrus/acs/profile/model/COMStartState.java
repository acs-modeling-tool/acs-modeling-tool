/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Pseudostate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COM Start State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getInVars <em>In Vars</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getInToks <em>In Toks</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getBase_Pseudostate <em>Base Pseudostate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMStartState()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COM Start State'"
 * @generated
 */
public interface COMStartState extends COMState {
	/**
	 * Returns the value of the '<em><b>In Vars</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Vars</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Vars</em>' attribute list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMStartState_InVars()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getInVars();

	/**
	 * Returns the value of the '<em><b>In Toks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Toks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Toks</em>' attribute list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMStartState_InToks()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getInToks();

	/**
	 * Returns the value of the '<em><b>Base Pseudostate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Pseudostate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Pseudostate</em>' reference.
	 * @see #setBase_Pseudostate(Pseudostate)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCOMStartState_Base_Pseudostate()
	 * @model ordered="false"
	 * @generated
	 */
	Pseudostate getBase_Pseudostate();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getBase_Pseudostate <em>Base Pseudostate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Pseudostate</em>' reference.
	 * @see #getBase_Pseudostate()
	 * @generated
	 */
	void setBase_Pseudostate(Pseudostate value);

} // COMStartState
