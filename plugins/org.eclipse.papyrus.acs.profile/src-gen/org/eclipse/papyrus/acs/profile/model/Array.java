/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Array#getDimension_base <em>Dimension base</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension base</em>' containment reference.
	 * @see #setDimension_base(Type)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getArray_Dimension_base()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Type getDimension_base();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Array#getDimension_base <em>Dimension base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension base</em>' containment reference.
	 * @see #getDimension_base()
	 * @generated
	 */
	void setDimension_base(Type value);

} // Array
