/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.SoI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.ReferenceImpl#getReferenced_soi <em>Referenced soi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends SubsystemImpl implements Reference {
	/**
	 * The cached value of the '{@link #getReferenced_soi() <em>Referenced soi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenced_soi()
	 * @generated
	 * @ordered
	 */
	protected SoI referenced_soi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoI getReferenced_soi() {
		if (referenced_soi != null && referenced_soi.eIsProxy()) {
			InternalEObject oldReferenced_soi = (InternalEObject)referenced_soi;
			referenced_soi = (SoI)eResolveProxy(oldReferenced_soi);
			if (referenced_soi != oldReferenced_soi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.REFERENCE__REFERENCED_SOI, oldReferenced_soi, referenced_soi));
			}
		}
		return referenced_soi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoI basicGetReferenced_soi() {
		return referenced_soi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenced_soi(SoI newReferenced_soi) {
		SoI oldReferenced_soi = referenced_soi;
		referenced_soi = newReferenced_soi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.REFERENCE__REFERENCED_SOI, oldReferenced_soi, referenced_soi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.REFERENCE__REFERENCED_SOI:
				if (resolve) return getReferenced_soi();
				return basicGetReferenced_soi();
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
			case AcsProfilePackage.REFERENCE__REFERENCED_SOI:
				setReferenced_soi((SoI)newValue);
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
			case AcsProfilePackage.REFERENCE__REFERENCED_SOI:
				setReferenced_soi((SoI)null);
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
			case AcsProfilePackage.REFERENCE__REFERENCED_SOI:
				return referenced_soi != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
