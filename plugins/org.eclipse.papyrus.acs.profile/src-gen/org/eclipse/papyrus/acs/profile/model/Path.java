/**
 */
package org.eclipse.papyrus.acs.profile.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Path#getFieldpath <em>Fieldpath</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Path#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Path#getElementpath <em>Elementpath</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Fieldpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fieldpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldpath</em>' containment reference.
	 * @see #setFieldpath(FieldPath)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getPath_Fieldpath()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	FieldPath getFieldpath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Path#getFieldpath <em>Fieldpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldpath</em>' containment reference.
	 * @see #getFieldpath()
	 * @generated
	 */
	void setFieldpath(FieldPath value);

	/**
	 * Returns the value of the '<em><b>Basepath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basepath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basepath</em>' containment reference.
	 * @see #setBasepath(BasePath)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getPath_Basepath()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BasePath getBasepath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Path#getBasepath <em>Basepath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basepath</em>' containment reference.
	 * @see #getBasepath()
	 * @generated
	 */
	void setBasepath(BasePath value);

	/**
	 * Returns the value of the '<em><b>Elementpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementpath</em>' containment reference.
	 * @see #setElementpath(ElementPath)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getPath_Elementpath()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ElementPath getElementpath();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Path#getElementpath <em>Elementpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementpath</em>' containment reference.
	 * @see #getElementpath()
	 * @generated
	 */
	void setElementpath(ElementPath value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let seq = Sequence { self.fieldpath->notEmpty(), self.basepath->notEmpty(), self.elementpath->notEmpty() } in
	 * 	seq->count(true)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Only one path'"
	 * @generated
	 */
	boolean Onlyonepath(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Path
