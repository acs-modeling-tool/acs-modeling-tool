/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.ControllerBody;

import org.eclipse.uml2.uml.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.ControllerBodyImpl#getBase_Region <em>Base Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerBodyImpl extends MinimalEObjectImpl.Container implements ControllerBody {
	/**
	 * The cached value of the '{@link #getBase_Region() <em>Base Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Region()
	 * @generated
	 * @ordered
	 */
	protected Region base_Region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.CONTROLLER_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getBase_Region() {
		if (base_Region != null && base_Region.eIsProxy()) {
			InternalEObject oldBase_Region = (InternalEObject)base_Region;
			base_Region = (Region)eResolveProxy(oldBase_Region);
			if (base_Region != oldBase_Region) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.CONTROLLER_BODY__BASE_REGION, oldBase_Region, base_Region));
			}
		}
		return base_Region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetBase_Region() {
		return base_Region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Region(Region newBase_Region) {
		Region oldBase_Region = base_Region;
		base_Region = newBase_Region;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.CONTROLLER_BODY__BASE_REGION, oldBase_Region, base_Region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.CONTROLLER_BODY__BASE_REGION:
				if (resolve) return getBase_Region();
				return basicGetBase_Region();
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
			case AcsProfilePackage.CONTROLLER_BODY__BASE_REGION:
				setBase_Region((Region)newValue);
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
			case AcsProfilePackage.CONTROLLER_BODY__BASE_REGION:
				setBase_Region((Region)null);
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
			case AcsProfilePackage.CONTROLLER_BODY__BASE_REGION:
				return base_Region != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerBodyImpl
