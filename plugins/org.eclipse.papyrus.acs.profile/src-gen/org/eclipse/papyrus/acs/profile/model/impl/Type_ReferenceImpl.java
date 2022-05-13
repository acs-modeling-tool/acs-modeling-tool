/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Declared_Type;
import org.eclipse.papyrus.acs.profile.model.Type_Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.Type_ReferenceImpl#getReferenced_type <em>Referenced type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Type_ReferenceImpl extends MinimalEObjectImpl.Container implements Type_Reference {
	/**
	 * The cached value of the '{@link #getReferenced_type() <em>Referenced type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenced_type()
	 * @generated
	 * @ordered
	 */
	protected Declared_Type referenced_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Type_ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declared_Type getReferenced_type() {
		if (referenced_type != null && referenced_type.eIsProxy()) {
			InternalEObject oldReferenced_type = (InternalEObject)referenced_type;
			referenced_type = (Declared_Type)eResolveProxy(oldReferenced_type);
			if (referenced_type != oldReferenced_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.TYPE_REFERENCE__REFERENCED_TYPE, oldReferenced_type, referenced_type));
			}
		}
		return referenced_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declared_Type basicGetReferenced_type() {
		return referenced_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenced_type(Declared_Type newReferenced_type) {
		Declared_Type oldReferenced_type = referenced_type;
		referenced_type = newReferenced_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TYPE_REFERENCE__REFERENCED_TYPE, oldReferenced_type, referenced_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.TYPE_REFERENCE__REFERENCED_TYPE:
				if (resolve) return getReferenced_type();
				return basicGetReferenced_type();
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
			case AcsProfilePackage.TYPE_REFERENCE__REFERENCED_TYPE:
				setReferenced_type((Declared_Type)newValue);
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
			case AcsProfilePackage.TYPE_REFERENCE__REFERENCED_TYPE:
				setReferenced_type((Declared_Type)null);
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
			case AcsProfilePackage.TYPE_REFERENCE__REFERENCED_TYPE:
				return referenced_type != null;
		}
		return super.eIsSet(featureID);
	}

} //Type_ReferenceImpl
