/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.ArraySizeRange;
import org.eclipse.papyrus.acs.profile.model.CharRange;
import org.eclipse.papyrus.acs.profile.model.NumRange;
import org.eclipse.papyrus.acs.profile.model.Precision;
import org.eclipse.papyrus.acs.profile.model.Property;
import org.eclipse.papyrus.acs.profile.model.SymbolRange;

import org.eclipse.papyrus.acs.profile.model.util.AcsProfileValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl#getSymbol_range <em>Symbol range</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl#getNum_range <em>Num range</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl#getChar_range <em>Char range</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl#getArray_size_range <em>Array size range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The cached value of the '{@link #getSymbol_range() <em>Symbol range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol_range()
	 * @generated
	 * @ordered
	 */
	protected SymbolRange symbol_range;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Precision precision;

	/**
	 * The cached value of the '{@link #getNum_range() <em>Num range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_range()
	 * @generated
	 * @ordered
	 */
	protected NumRange num_range;

	/**
	 * The cached value of the '{@link #getChar_range() <em>Char range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar_range()
	 * @generated
	 * @ordered
	 */
	protected CharRange char_range;

	/**
	 * The cached value of the '{@link #getArray_size_range() <em>Array size range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray_size_range()
	 * @generated
	 * @ordered
	 */
	protected ArraySizeRange array_size_range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRange getSymbol_range() {
		return symbol_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbol_range(SymbolRange newSymbol_range, NotificationChain msgs) {
		SymbolRange oldSymbol_range = symbol_range;
		symbol_range = newSymbol_range;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__SYMBOL_RANGE, oldSymbol_range, newSymbol_range);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol_range(SymbolRange newSymbol_range) {
		if (newSymbol_range != symbol_range) {
			NotificationChain msgs = null;
			if (symbol_range != null)
				msgs = ((InternalEObject)symbol_range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__SYMBOL_RANGE, null, msgs);
			if (newSymbol_range != null)
				msgs = ((InternalEObject)newSymbol_range).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__SYMBOL_RANGE, null, msgs);
			msgs = basicSetSymbol_range(newSymbol_range, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__SYMBOL_RANGE, newSymbol_range, newSymbol_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precision getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecision(Precision newPrecision, NotificationChain msgs) {
		Precision oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__PRECISION, oldPrecision, newPrecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Precision newPrecision) {
		if (newPrecision != precision) {
			NotificationChain msgs = null;
			if (precision != null)
				msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__PRECISION, null, msgs);
			if (newPrecision != null)
				msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__PRECISION, null, msgs);
			msgs = basicSetPrecision(newPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__PRECISION, newPrecision, newPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumRange getNum_range() {
		return num_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNum_range(NumRange newNum_range, NotificationChain msgs) {
		NumRange oldNum_range = num_range;
		num_range = newNum_range;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__NUM_RANGE, oldNum_range, newNum_range);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_range(NumRange newNum_range) {
		if (newNum_range != num_range) {
			NotificationChain msgs = null;
			if (num_range != null)
				msgs = ((InternalEObject)num_range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__NUM_RANGE, null, msgs);
			if (newNum_range != null)
				msgs = ((InternalEObject)newNum_range).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__NUM_RANGE, null, msgs);
			msgs = basicSetNum_range(newNum_range, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__NUM_RANGE, newNum_range, newNum_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharRange getChar_range() {
		return char_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChar_range(CharRange newChar_range, NotificationChain msgs) {
		CharRange oldChar_range = char_range;
		char_range = newChar_range;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__CHAR_RANGE, oldChar_range, newChar_range);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar_range(CharRange newChar_range) {
		if (newChar_range != char_range) {
			NotificationChain msgs = null;
			if (char_range != null)
				msgs = ((InternalEObject)char_range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__CHAR_RANGE, null, msgs);
			if (newChar_range != null)
				msgs = ((InternalEObject)newChar_range).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__CHAR_RANGE, null, msgs);
			msgs = basicSetChar_range(newChar_range, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__CHAR_RANGE, newChar_range, newChar_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySizeRange getArray_size_range() {
		return array_size_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray_size_range(ArraySizeRange newArray_size_range, NotificationChain msgs) {
		ArraySizeRange oldArray_size_range = array_size_range;
		array_size_range = newArray_size_range;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE, oldArray_size_range, newArray_size_range);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray_size_range(ArraySizeRange newArray_size_range) {
		if (newArray_size_range != array_size_range) {
			NotificationChain msgs = null;
			if (array_size_range != null)
				msgs = ((InternalEObject)array_size_range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE, null, msgs);
			if (newArray_size_range != null)
				msgs = ((InternalEObject)newArray_size_range).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE, null, msgs);
			msgs = basicSetArray_size_range(newArray_size_range, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE, newArray_size_range, newArray_size_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Onlyoneproperty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AcsProfileValidator.DIAGNOSTIC_SOURCE,
						 AcsProfileValidator.PROPERTY__ONLYONEPROPERTY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Onlyoneproperty", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.PROPERTY__SYMBOL_RANGE:
				return basicSetSymbol_range(null, msgs);
			case AcsProfilePackage.PROPERTY__PRECISION:
				return basicSetPrecision(null, msgs);
			case AcsProfilePackage.PROPERTY__NUM_RANGE:
				return basicSetNum_range(null, msgs);
			case AcsProfilePackage.PROPERTY__CHAR_RANGE:
				return basicSetChar_range(null, msgs);
			case AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE:
				return basicSetArray_size_range(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.PROPERTY__SYMBOL_RANGE:
				return getSymbol_range();
			case AcsProfilePackage.PROPERTY__PRECISION:
				return getPrecision();
			case AcsProfilePackage.PROPERTY__NUM_RANGE:
				return getNum_range();
			case AcsProfilePackage.PROPERTY__CHAR_RANGE:
				return getChar_range();
			case AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE:
				return getArray_size_range();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcsProfilePackage.PROPERTY__SYMBOL_RANGE:
				setSymbol_range((SymbolRange)newValue);
				return;
			case AcsProfilePackage.PROPERTY__PRECISION:
				setPrecision((Precision)newValue);
				return;
			case AcsProfilePackage.PROPERTY__NUM_RANGE:
				setNum_range((NumRange)newValue);
				return;
			case AcsProfilePackage.PROPERTY__CHAR_RANGE:
				setChar_range((CharRange)newValue);
				return;
			case AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE:
				setArray_size_range((ArraySizeRange)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AcsProfilePackage.PROPERTY__SYMBOL_RANGE:
				setSymbol_range((SymbolRange)null);
				return;
			case AcsProfilePackage.PROPERTY__PRECISION:
				setPrecision((Precision)null);
				return;
			case AcsProfilePackage.PROPERTY__NUM_RANGE:
				setNum_range((NumRange)null);
				return;
			case AcsProfilePackage.PROPERTY__CHAR_RANGE:
				setChar_range((CharRange)null);
				return;
			case AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE:
				setArray_size_range((ArraySizeRange)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AcsProfilePackage.PROPERTY__SYMBOL_RANGE:
				return symbol_range != null;
			case AcsProfilePackage.PROPERTY__PRECISION:
				return precision != null;
			case AcsProfilePackage.PROPERTY__NUM_RANGE:
				return num_range != null;
			case AcsProfilePackage.PROPERTY__CHAR_RANGE:
				return char_range != null;
			case AcsProfilePackage.PROPERTY__ARRAY_SIZE_RANGE:
				return array_size_range != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AcsProfilePackage.PROPERTY___ONLYONEPROPERTY__DIAGNOSTICCHAIN_MAP:
				return Onlyoneproperty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PropertyImpl
