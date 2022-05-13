/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nullable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Nullable#getNullable_base <em>Nullable base</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getNullable()
 * @model
 * @generated
 */
public interface Nullable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nullable base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable base</em>' containment reference.
	 * @see #setNullable_base(Type)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getNullable_Nullable_base()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Type getNullable_base();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Nullable#getNullable_base <em>Nullable base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable base</em>' containment reference.
	 * @see #getNullable_base()
	 * @generated
	 */
	void setNullable_base(Type value);

} // Nullable
