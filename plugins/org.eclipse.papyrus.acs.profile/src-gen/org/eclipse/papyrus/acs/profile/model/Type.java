/**
 */
package org.eclipse.papyrus.acs.profile.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type#getType_reference <em>Type reference</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type#getFundamental_type <em>Fundamental type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Type#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Type reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type reference</em>' containment reference.
	 * @see #setType_reference(Type_Reference)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Type_reference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Type_Reference getType_reference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type#getType_reference <em>Type reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type reference</em>' containment reference.
	 * @see #getType_reference()
	 * @generated
	 */
	void setType_reference(Type_Reference value);

	/**
	 * Returns the value of the '<em><b>Fundamental type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.acs.profile.model.Fundamental_Types}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundamental type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundamental type</em>' attribute.
	 * @see org.eclipse.papyrus.acs.profile.model.Fundamental_Types
	 * @see #setFundamental_type(Fundamental_Types)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Fundamental_type()
	 * @model ordered="false"
	 * @generated
	 */
	Fundamental_Types getFundamental_type();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type#getFundamental_type <em>Fundamental type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fundamental type</em>' attribute.
	 * @see org.eclipse.papyrus.acs.profile.model.Fundamental_Types
	 * @see #getFundamental_type()
	 * @generated
	 */
	void setFundamental_type(Fundamental_Types value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' containment reference.
	 * @see #setNullable(Nullable)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Nullable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Nullable getNullable();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type#getNullable <em>Nullable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' containment reference.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(Nullable value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference.
	 * @see #setSymbol(Enumeration)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Symbol()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Enumeration getSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type#getSymbol <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' containment reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Array)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Dimension()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Array getDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Array value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(org.eclipse.papyrus.acs.profile.model.Record)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getType_Table()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	org.eclipse.papyrus.acs.profile.model.Record getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Type#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(org.eclipse.papyrus.acs.profile.model.Record value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let seq = Sequence { self.symbol->notEmpty(), self.table->notEmpty(), self.dimension->notEmpty(), self.nullable->notEmpty(), not (self.primitive_type = NONE), self.type_reference->notEmpty() } in
	 * 	seq->count(true)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Only one structure'"
	 * @generated
	 */
	boolean Onlyonestructure(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Type
