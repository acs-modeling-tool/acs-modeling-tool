/**
 */
package org.eclipse.papyrus.acs.profile.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Property#getSymbol_range <em>Symbol range</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Property#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Property#getNum_range <em>Num range</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Property#getChar_range <em>Char range</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.Property#getArray_size_range <em>Array size range</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol range</em>' containment reference.
	 * @see #setSymbol_range(SymbolRange)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getProperty_Symbol_range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SymbolRange getSymbol_range();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Property#getSymbol_range <em>Symbol range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol range</em>' containment reference.
	 * @see #getSymbol_range()
	 * @generated
	 */
	void setSymbol_range(SymbolRange value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' containment reference.
	 * @see #setPrecision(Precision)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getProperty_Precision()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Precision getPrecision();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Property#getPrecision <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' containment reference.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Precision value);

	/**
	 * Returns the value of the '<em><b>Num range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num range</em>' containment reference.
	 * @see #setNum_range(NumRange)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getProperty_Num_range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NumRange getNum_range();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Property#getNum_range <em>Num range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num range</em>' containment reference.
	 * @see #getNum_range()
	 * @generated
	 */
	void setNum_range(NumRange value);

	/**
	 * Returns the value of the '<em><b>Char range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char range</em>' containment reference.
	 * @see #setChar_range(CharRange)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getProperty_Char_range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CharRange getChar_range();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Property#getChar_range <em>Char range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char range</em>' containment reference.
	 * @see #getChar_range()
	 * @generated
	 */
	void setChar_range(CharRange value);

	/**
	 * Returns the value of the '<em><b>Array size range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array size range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array size range</em>' containment reference.
	 * @see #setArray_size_range(ArraySizeRange)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getProperty_Array_size_range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArraySizeRange getArray_size_range();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.Property#getArray_size_range <em>Array size range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array size range</em>' containment reference.
	 * @see #getArray_size_range()
	 * @generated
	 */
	void setArray_size_range(ArraySizeRange value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let seq = Sequence { self.precision->notEmpty(), self.num_range->notEmpty(), self.char_range->notEmpty(), self.symbol_range->notEmpty(), self.array_size_range->notEmpty() } in
	 * 	seq->count(true)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Only one property'"
	 * @generated
	 */
	boolean Onlyoneproperty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Property
