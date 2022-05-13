/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CON State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.CONState#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.CONState#isLockable <em>Lockable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCONState()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CON State'"
 * @generated
 */
public interface CONState extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCONState_Tokens()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getTokens();

	/**
	 * Returns the value of the '<em><b>Lockable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lockable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lockable</em>' attribute.
	 * @see #setLockable(boolean)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCONState_Lockable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLockable();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.CONState#isLockable <em>Lockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockable</em>' attribute.
	 * @see #isLockable()
	 * @generated
	 */
	void setLockable(boolean value);

} // CONState
