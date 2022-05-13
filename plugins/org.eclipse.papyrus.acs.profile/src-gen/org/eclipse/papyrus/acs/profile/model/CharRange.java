/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.CharRange#getCharGroupRegex <em>Char Group Regex</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCharRange()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Char Range'"
 * @generated
 */
public interface CharRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Char Group Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Group Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Group Regex</em>' attribute.
	 * @see #setCharGroupRegex(String)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getCharRange_CharGroupRegex()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCharGroupRegex();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.CharRange#getCharGroupRegex <em>Char Group Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Group Regex</em>' attribute.
	 * @see #getCharGroupRegex()
	 * @generated
	 */
	void setCharGroupRegex(String value);

} // CharRange
