/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Field;
import org.eclipse.papyrus.acs.profile.model.Type_Reference;

import org.eclipse.papyrus.acs.profile.model.util.AcsProfileValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.RecordImpl#getTable_base <em>Table base</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.RecordImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordImpl extends MinimalEObjectImpl.Container implements org.eclipse.papyrus.acs.profile.model.Record {
	/**
	 * The cached value of the '{@link #getTable_base() <em>Table base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable_base()
	 * @generated
	 * @ordered
	 */
	protected Type_Reference table_base;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_Reference getTable_base() {
		return table_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable_base(Type_Reference newTable_base, NotificationChain msgs) {
		Type_Reference oldTable_base = table_base;
		table_base = newTable_base;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.RECORD__TABLE_BASE, oldTable_base, newTable_base);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable_base(Type_Reference newTable_base) {
		if (newTable_base != table_base) {
			NotificationChain msgs = null;
			if (table_base != null)
				msgs = ((InternalEObject)table_base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.RECORD__TABLE_BASE, null, msgs);
			if (newTable_base != null)
				msgs = ((InternalEObject)newTable_base).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.RECORD__TABLE_BASE, null, msgs);
			msgs = basicSetTable_base(newTable_base, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.RECORD__TABLE_BASE, newTable_base, newTable_base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, AcsProfilePackage.RECORD__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BasetypeisRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 AcsProfileValidator.RECORD__BASETYPEIS_RECORD,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BasetypeisRecord", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean Noduplicatefields(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 AcsProfileValidator.RECORD__NODUPLICATEFIELDS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Noduplicatefields", EObjectValidator.getObjectLabel(this, context) }),
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
			case AcsProfilePackage.RECORD__TABLE_BASE:
				return basicSetTable_base(null, msgs);
			case AcsProfilePackage.RECORD__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case AcsProfilePackage.RECORD__TABLE_BASE:
				return getTable_base();
			case AcsProfilePackage.RECORD__FIELDS:
				return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcsProfilePackage.RECORD__TABLE_BASE:
				setTable_base((Type_Reference)newValue);
				return;
			case AcsProfilePackage.RECORD__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
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
			case AcsProfilePackage.RECORD__TABLE_BASE:
				setTable_base((Type_Reference)null);
				return;
			case AcsProfilePackage.RECORD__FIELDS:
				getFields().clear();
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
			case AcsProfilePackage.RECORD__TABLE_BASE:
				return table_base != null;
			case AcsProfilePackage.RECORD__FIELDS:
				return fields != null && !fields.isEmpty();
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
			case AcsProfilePackage.RECORD___BASETYPEIS_RECORD__DIAGNOSTICCHAIN_MAP:
				return BasetypeisRecord((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AcsProfilePackage.RECORD___NODUPLICATEFIELDS__DIAGNOSTICCHAIN_MAP:
				return Noduplicatefields((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RecordImpl
