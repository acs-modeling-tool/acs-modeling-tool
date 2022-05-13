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
import org.eclipse.papyrus.acs.profile.model.Array;
import org.eclipse.papyrus.acs.profile.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.ArrayImpl#getDimension_base <em>Dimension base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayImpl extends MinimalEObjectImpl.Container implements Array {
	/**
	 * The cached value of the '{@link #getDimension_base() <em>Dimension base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension_base()
	 * @generated
	 * @ordered
	 */
	protected Type dimension_base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDimension_base() {
		return dimension_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension_base(Type newDimension_base, NotificationChain msgs) {
		Type oldDimension_base = dimension_base;
		dimension_base = newDimension_base;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.ARRAY__DIMENSION_BASE, oldDimension_base, newDimension_base);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension_base(Type newDimension_base) {
		if (newDimension_base != dimension_base) {
			NotificationChain msgs = null;
			if (dimension_base != null)
				msgs = ((InternalEObject)dimension_base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.ARRAY__DIMENSION_BASE, null, msgs);
			if (newDimension_base != null)
				msgs = ((InternalEObject)newDimension_base).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.ARRAY__DIMENSION_BASE, null, msgs);
			msgs = basicSetDimension_base(newDimension_base, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.ARRAY__DIMENSION_BASE, newDimension_base, newDimension_base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.ARRAY__DIMENSION_BASE:
				return basicSetDimension_base(null, msgs);
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
			case AcsProfilePackage.ARRAY__DIMENSION_BASE:
				return getDimension_base();
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
			case AcsProfilePackage.ARRAY__DIMENSION_BASE:
				setDimension_base((Type)newValue);
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
			case AcsProfilePackage.ARRAY__DIMENSION_BASE:
				setDimension_base((Type)null);
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
			case AcsProfilePackage.ARRAY__DIMENSION_BASE:
				return dimension_base != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayImpl
