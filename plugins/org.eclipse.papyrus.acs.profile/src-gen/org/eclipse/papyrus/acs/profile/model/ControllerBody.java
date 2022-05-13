/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Region;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.ControllerBody#getBase_Region <em>Base Region</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getControllerBody()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Controller Body'"
 * @generated
 */
public interface ControllerBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Region</em>' reference.
	 * @see #setBase_Region(Region)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getControllerBody_Base_Region()
	 * @model ordered="false"
	 * @generated
	 */
	Region getBase_Region();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.ControllerBody#getBase_Region <em>Base Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Region</em>' reference.
	 * @see #getBase_Region()
	 * @generated
	 */
	void setBase_Region(Region value);

} // ControllerBody
