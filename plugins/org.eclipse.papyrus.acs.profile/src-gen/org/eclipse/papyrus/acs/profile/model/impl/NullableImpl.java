/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Nullable;
import org.eclipse.papyrus.acs.profile.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nullable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.NullableImpl#getNullable_base <em>Nullable base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullableImpl extends MinimalEObjectImpl.Container implements Nullable {
	/**
	 * The cached value of the '{@link #getNullable_base() <em>Nullable base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable_base()
	 * @generated
	 * @ordered
	 */
	protected Type nullable_base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.NULLABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getNullable_base() {
		return nullable_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullable_base(Type newNullable_base, NotificationChain msgs) {
		Type oldNullable_base = nullable_base;
		nullable_base = newNullable_base;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.NULLABLE__NULLABLE_BASE, oldNullable_base, newNullable_base);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable_base(Type newNullable_base) {
		if (newNullable_base != nullable_base) {
			NotificationChain msgs = null;
			if (nullable_base != null)
				msgs = ((InternalEObject)nullable_base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.NULLABLE__NULLABLE_BASE, null, msgs);
			if (newNullable_base != null)
				msgs = ((InternalEObject)newNullable_base).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.NULLABLE__NULLABLE_BASE, null, msgs);
			msgs = basicSetNullable_base(newNullable_base, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.NULLABLE__NULLABLE_BASE, newNullable_base, newNullable_base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.NULLABLE__NULLABLE_BASE:
				return basicSetNullable_base(null, msgs);
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
			case AcsProfilePackage.NULLABLE__NULLABLE_BASE:
				return getNullable_base();
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
			case AcsProfilePackage.NULLABLE__NULLABLE_BASE:
				setNullable_base((Type)newValue);
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
			case AcsProfilePackage.NULLABLE__NULLABLE_BASE:
				setNullable_base((Type)null);
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
			case AcsProfilePackage.NULLABLE__NULLABLE_BASE:
				return nullable_base != null;
		}
		return super.eIsSet(featureID);
	}

} //NullableImpl
