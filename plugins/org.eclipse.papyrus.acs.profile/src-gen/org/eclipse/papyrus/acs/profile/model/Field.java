/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Field#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Field#getField_type <em>Field type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * The default value is <code>"field"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getField_FieldName()
	 * @model default="field" unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Field#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Field type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field type</em>' containment reference.
	 * @see #setField_type(Type)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getField_Field_type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Type getField_type();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Field#getField_type <em>Field type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field type</em>' containment reference.
	 * @see #getField_type()
	 * @generated
	 */
	void setField_type(Type value);

} // Field
