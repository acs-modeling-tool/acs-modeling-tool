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
import org.eclipse.papyrus.acs.profile.model.Array;
import org.eclipse.papyrus.acs.profile.model.Enumeration;
import org.eclipse.papyrus.acs.profile.model.Fundamental_Types;
import org.eclipse.papyrus.acs.profile.model.Nullable;
import org.eclipse.papyrus.acs.profile.model.Type;
import org.eclipse.papyrus.acs.profile.model.Type_Reference;

import org.eclipse.papyrus.acs.profile.model.util.AcsProfileValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl#getType_reference <em>Type reference</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl#getFundamental_type <em>Fundamental type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type {
	/**
	 * The cached value of the '{@link #getType_reference() <em>Type reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_reference()
	 * @generated
	 * @ordered
	 */
	protected Type_Reference type_reference;

	/**
	 * The default value of the '{@link #getFundamental_type() <em>Fundamental type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamental_type()
	 * @generated
	 * @ordered
	 */
	protected static final Fundamental_Types FUNDAMENTAL_TYPE_EDEFAULT = Fundamental_Types.CHAR;

	/**
	 * The cached value of the '{@link #getFundamental_type() <em>Fundamental type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamental_type()
	 * @generated
	 * @ordered
	 */
	protected Fundamental_Types fundamental_type = FUNDAMENTAL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNullable() <em>Nullable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected Nullable nullable;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected Enumeration symbol;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Array dimension;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.papyrus.acs.profile.model.Record table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_Reference getType_reference() {
		return type_reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType_reference(Type_Reference newType_reference, NotificationChain msgs) {
		Type_Reference oldType_reference = type_reference;
		type_reference = newType_reference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__TYPE_REFERENCE, oldType_reference, newType_reference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_reference(Type_Reference newType_reference) {
		if (newType_reference != type_reference) {
			NotificationChain msgs = null;
			if (type_reference != null)
				msgs = ((InternalEObject)type_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__TYPE_REFERENCE, null, msgs);
			if (newType_reference != null)
				msgs = ((InternalEObject)newType_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__TYPE_REFERENCE, null, msgs);
			msgs = basicSetType_reference(newType_reference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__TYPE_REFERENCE, newType_reference, newType_reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fundamental_Types getFundamental_type() {
		return fundamental_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundamental_type(Fundamental_Types newFundamental_type) {
		Fundamental_Types oldFundamental_type = fundamental_type;
		fundamental_type = newFundamental_type == null ? FUNDAMENTAL_TYPE_EDEFAULT : newFundamental_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__FUNDAMENTAL_TYPE, oldFundamental_type, fundamental_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nullable getNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullable(Nullable newNullable, NotificationChain msgs) {
		Nullable oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__NULLABLE, oldNullable, newNullable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(Nullable newNullable) {
		if (newNullable != nullable) {
			NotificationChain msgs = null;
			if (nullable != null)
				msgs = ((InternalEObject)nullable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__NULLABLE, null, msgs);
			if (newNullable != null)
				msgs = ((InternalEObject)newNullable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__NULLABLE, null, msgs);
			msgs = basicSetNullable(newNullable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__NULLABLE, newNullable, newNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbol(Enumeration newSymbol, NotificationChain msgs) {
		Enumeration oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__SYMBOL, oldSymbol, newSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(Enumeration newSymbol) {
		if (newSymbol != symbol) {
			NotificationChain msgs = null;
			if (symbol != null)
				msgs = ((InternalEObject)symbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__SYMBOL, null, msgs);
			if (newSymbol != null)
				msgs = ((InternalEObject)newSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__SYMBOL, null, msgs);
			msgs = basicSetSymbol(newSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__SYMBOL, newSymbol, newSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Array newDimension, NotificationChain msgs) {
		Array oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__DIMENSION, oldDimension, newDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Array newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject)dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.papyrus.acs.profile.model.Record getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(org.eclipse.papyrus.acs.profile.model.Record newTable, NotificationChain msgs) {
		org.eclipse.papyrus.acs.profile.model.Record oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(org.eclipse.papyrus.acs.profile.model.Record newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.TYPE__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Onlyonestructure(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 AcsProfileValidator.TYPE__ONLYONESTRUCTURE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Onlyonestructure", EObjectValidator.getObjectLabel(this, context) }),
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
			case AcsProfilePackage.TYPE__TYPE_REFERENCE:
				return basicSetType_reference(null, msgs);
			case AcsProfilePackage.TYPE__NULLABLE:
				return basicSetNullable(null, msgs);
			case AcsProfilePackage.TYPE__SYMBOL:
				return basicSetSymbol(null, msgs);
			case AcsProfilePackage.TYPE__DIMENSION:
				return basicSetDimension(null, msgs);
			case AcsProfilePackage.TYPE__TABLE:
				return basicSetTable(null, msgs);
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
			case AcsProfilePackage.TYPE__TYPE_REFERENCE:
				return getType_reference();
			case AcsProfilePackage.TYPE__FUNDAMENTAL_TYPE:
				return getFundamental_type();
			case AcsProfilePackage.TYPE__NULLABLE:
				return getNullable();
			case AcsProfilePackage.TYPE__SYMBOL:
				return getSymbol();
			case AcsProfilePackage.TYPE__DIMENSION:
				return getDimension();
			case AcsProfilePackage.TYPE__TABLE:
				return getTable();
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
			case AcsProfilePackage.TYPE__TYPE_REFERENCE:
				setType_reference((Type_Reference)newValue);
				return;
			case AcsProfilePackage.TYPE__FUNDAMENTAL_TYPE:
				setFundamental_type((Fundamental_Types)newValue);
				return;
			case AcsProfilePackage.TYPE__NULLABLE:
				setNullable((Nullable)newValue);
				return;
			case AcsProfilePackage.TYPE__SYMBOL:
				setSymbol((Enumeration)newValue);
				return;
			case AcsProfilePackage.TYPE__DIMENSION:
				setDimension((Array)newValue);
				return;
			case AcsProfilePackage.TYPE__TABLE:
				setTable((org.eclipse.papyrus.acs.profile.model.Record)newValue);
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
			case AcsProfilePackage.TYPE__TYPE_REFERENCE:
				setType_reference((Type_Reference)null);
				return;
			case AcsProfilePackage.TYPE__FUNDAMENTAL_TYPE:
				setFundamental_type(FUNDAMENTAL_TYPE_EDEFAULT);
				return;
			case AcsProfilePackage.TYPE__NULLABLE:
				setNullable((Nullable)null);
				return;
			case AcsProfilePackage.TYPE__SYMBOL:
				setSymbol((Enumeration)null);
				return;
			case AcsProfilePackage.TYPE__DIMENSION:
				setDimension((Array)null);
				return;
			case AcsProfilePackage.TYPE__TABLE:
				setTable((org.eclipse.papyrus.acs.profile.model.Record)null);
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
			case AcsProfilePackage.TYPE__TYPE_REFERENCE:
				return type_reference != null;
			case AcsProfilePackage.TYPE__FUNDAMENTAL_TYPE:
				return fundamental_type != FUNDAMENTAL_TYPE_EDEFAULT;
			case AcsProfilePackage.TYPE__NULLABLE:
				return nullable != null;
			case AcsProfilePackage.TYPE__SYMBOL:
				return symbol != null;
			case AcsProfilePackage.TYPE__DIMENSION:
				return dimension != null;
			case AcsProfilePackage.TYPE__TABLE:
				return table != null;
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
			case AcsProfilePackage.TYPE___ONLYONESTRUCTURE__DIAGNOSTICCHAIN_MAP:
				return Onlyonestructure((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fundamental_type: ");
		result.append(fundamental_type);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
