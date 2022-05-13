/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typ In Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.TypInOut#getOut_typs <em>Out typs</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.TypInOut#getIn_typs <em>In typs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getTypInOut()
 * @model abstract="true"
 * @generated
 */
public interface TypInOut extends EObject {
	/**
	 * Returns the value of the '<em><b>Out typs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.Full_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out typs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out typs</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getTypInOut_Out_typs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Full_Type> getOut_typs();

	/**
	 * Returns the value of the '<em><b>In typs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.Full_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In typs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In typs</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getTypInOut_In_typs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Full_Type> getIn_typs();

} // TypInOut
