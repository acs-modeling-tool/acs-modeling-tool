/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.CONState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CON State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.CONStateImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.CONStateImpl#isLockable <em>Lockable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CONStateImpl extends MinimalEObjectImpl.Container implements CONState {
	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tokens;

	/**
	 * The default value of the '{@link #isLockable() <em>Lockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLockable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLockable() <em>Lockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLockable()
	 * @generated
	 * @ordered
	 */
	protected boolean lockable = LOCKABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.CON_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTokens() {
		if (tokens == null) {
			tokens = new EDataTypeUniqueEList<String>(String.class, this, AcsProfilePackage.CON_STATE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLockable() {
		return lockable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockable(boolean newLockable) {
		boolean oldLockable = lockable;
		lockable = newLockable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.CON_STATE__LOCKABLE, oldLockable, lockable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.CON_STATE__TOKENS:
				return getTokens();
			case AcsProfilePackage.CON_STATE__LOCKABLE:
				return isLockable();
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
			case AcsProfilePackage.CON_STATE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends String>)newValue);
				return;
			case AcsProfilePackage.CON_STATE__LOCKABLE:
				setLockable((Boolean)newValue);
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
			case AcsProfilePackage.CON_STATE__TOKENS:
				getTokens().clear();
				return;
			case AcsProfilePackage.CON_STATE__LOCKABLE:
				setLockable(LOCKABLE_EDEFAULT);
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
			case AcsProfilePackage.CON_STATE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case AcsProfilePackage.CON_STATE__LOCKABLE:
				return lockable != LOCKABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Tokens: ");
		result.append(tokens);
		result.append(", Lockable: ");
		result.append(lockable);
		result.append(')');
		return result.toString();
	}

} //CONStateImpl
