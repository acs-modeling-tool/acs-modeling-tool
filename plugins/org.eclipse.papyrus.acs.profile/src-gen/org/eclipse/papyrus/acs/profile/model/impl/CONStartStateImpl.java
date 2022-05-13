/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.CONStartState;

import org.eclipse.uml2.uml.Pseudostate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CON Start State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.CONStartStateImpl#getBase_Pseudostate <em>Base Pseudostate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONStartStateImpl extends CONStateImpl implements CONStartState {
	/**
	 * The cached value of the '{@link #getBase_Pseudostate() <em>Base Pseudostate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Pseudostate()
	 * @generated
	 * @ordered
	 */
	protected Pseudostate base_Pseudostate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONStartStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.CON_START_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate getBase_Pseudostate() {
		if (base_Pseudostate != null && base_Pseudostate.eIsProxy()) {
			InternalEObject oldBase_Pseudostate = (InternalEObject)base_Pseudostate;
			base_Pseudostate = (Pseudostate)eResolveProxy(oldBase_Pseudostate);
			if (base_Pseudostate != oldBase_Pseudostate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.CON_START_STATE__BASE_PSEUDOSTATE, oldBase_Pseudostate, base_Pseudostate));
			}
		}
		return base_Pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate basicGetBase_Pseudostate() {
		return base_Pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Pseudostate(Pseudostate newBase_Pseudostate) {
		Pseudostate oldBase_Pseudostate = base_Pseudostate;
		base_Pseudostate = newBase_Pseudostate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.CON_START_STATE__BASE_PSEUDOSTATE, oldBase_Pseudostate, base_Pseudostate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.CON_START_STATE__BASE_PSEUDOSTATE:
				if (resolve) return getBase_Pseudostate();
				return basicGetBase_Pseudostate();
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
			case AcsProfilePackage.CON_START_STATE__BASE_PSEUDOSTATE:
				setBase_Pseudostate((Pseudostate)newValue);
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
			case AcsProfilePackage.CON_START_STATE__BASE_PSEUDOSTATE:
				setBase_Pseudostate((Pseudostate)null);
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
			case AcsProfilePackage.CON_START_STATE__BASE_PSEUDOSTATE:
				return base_Pseudostate != null;
		}
		return super.eIsSet(featureID);
	}

} //CONStartStateImpl
