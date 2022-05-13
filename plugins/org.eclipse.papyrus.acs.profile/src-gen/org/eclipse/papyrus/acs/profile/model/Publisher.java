/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Publisher#getIn_typs <em>In typs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends EventDeclaration {
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
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getPublisher_In_typs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Full_Type> getIn_typs();

} // Publisher
