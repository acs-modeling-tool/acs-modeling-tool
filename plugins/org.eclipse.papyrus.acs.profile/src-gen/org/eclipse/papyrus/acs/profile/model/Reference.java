/**
 */
package org.eclipse.papyrus.acs.profile.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Reference#getReferenced_soi <em>Referenced soi</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Subsystem {
	/**
	 * Returns the value of the '<em><b>Referenced soi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced soi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced soi</em>' reference.
	 * @see #setReferenced_soi(SoI)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getReference_Referenced_soi()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SoI getReferenced_soi();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Reference#getReferenced_soi <em>Referenced soi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced soi</em>' reference.
	 * @see #getReferenced_soi()
	 * @generated
	 */
	void setReferenced_soi(SoI value);

} // Reference
