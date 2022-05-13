/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.SymbolRange#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getSymbolRange()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Symbol Range'"
 * @generated
 */
public interface SymbolRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getSymbolRange_Elements()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getElements();

} // SymbolRange
