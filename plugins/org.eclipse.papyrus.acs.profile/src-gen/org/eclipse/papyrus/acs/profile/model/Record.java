/**
 */
package org.eclipse.papyrus.acs.profile.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Record#getTable_base <em>Table base</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Record#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends EObject {
	/**
	 * Returns the value of the '<em><b>Table base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table base</em>' containment reference.
	 * @see #setTable_base(Type_Reference)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getRecord_Table_base()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Type_Reference getTable_base();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Record#getTable_base <em>Table base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table base</em>' containment reference.
	 * @see #getTable_base()
	 * @generated
	 */
	void setTable_base(Type_Reference value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getRecord_Fields()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.table_base->notEmpty()then
	 * 	self.table_base.referenced_type.type.structure->oclIsTypeOf(Record)
	 * else
	 * 	true
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Base type is Record'"
	 * @generated
	 */
	boolean BasetypeisRecord(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let names = self.fields->collect(f : Field | f.FieldName) in
	 * 	names->size() = names->asSet()->size()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='No duplicate fields'"
	 * @generated
	 */
	boolean Noduplicatefields(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Record
