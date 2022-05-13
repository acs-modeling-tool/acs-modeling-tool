/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Only purpose is to allow "Link Hubs" to exist inside a Composite/SoI instead of only on the boundaries of containers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.LinkHolder#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkHolder()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Link Holder'"
 * @generated
 */
public interface LinkHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkHolder_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.LinkHolder#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // LinkHolder
