/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type_Reference#getReferenced_type <em>Referenced type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Reference()
 * @model
 * @generated
 */
public interface Type_Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced type</em>' reference.
	 * @see #setReferenced_type(Declared_Type)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Reference_Referenced_type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Declared_Type getReferenced_type();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type_Reference#getReferenced_type <em>Referenced type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced type</em>' reference.
	 * @see #getReferenced_type()
	 * @generated
	 */
	void setReferenced_type(Declared_Type value);

} // Type_Reference
