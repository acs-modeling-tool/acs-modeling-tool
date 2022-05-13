/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.TokenType#isIsGroup <em>Is Group</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.TokenType#getSubsystem <em>Subsystem</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getTokenType()
 * @model
 * @generated
 */
public interface TokenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Group</em>' attribute.
	 * @see #setIsGroup(boolean)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getTokenType_IsGroup()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.TokenType#isIsGroup <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Group</em>' attribute.
	 * @see #isIsGroup()
	 * @generated
	 */
	void setIsGroup(boolean value);

	/**
	 * Returns the value of the '<em><b>Subsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem</em>' reference.
	 * @see #setSubsystem(Port)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getTokenType_Subsystem()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getSubsystem();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.TokenType#getSubsystem <em>Subsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem</em>' reference.
	 * @see #getSubsystem()
	 * @generated
	 */
	void setSubsystem(Port value);

} // TokenType
