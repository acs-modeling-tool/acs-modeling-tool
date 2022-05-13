/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.TokenType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TokenTypeImpl#isIsGroup <em>Is Group</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TokenTypeImpl#getSubsystem <em>Subsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenTypeImpl extends MinimalEObjectImpl.Container implements TokenType {
	/**
	 * The default value of the '{@link #isIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGroup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GROUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGroup() <em>Is Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGroup()
	 * @generated
	 * @ordered
	 */
	protected boolean isGroup = IS_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubsystem() <em>Subsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystem()
	 * @generated
	 * @ordered
	 */
	protected Port subsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.TOKEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGroup() {
		return isGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGroup(boolean newIsGroup) {
		boolean oldIsGroup = isGroup;
		isGroup = newIsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TOKEN_TYPE__IS_GROUP, oldIsGroup, isGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSubsystem() {
		if (subsystem != null && subsystem.eIsProxy()) {
			InternalEObject oldSubsystem = (InternalEObject)subsystem;
			subsystem = (Port)eResolveProxy(oldSubsystem);
			if (subsystem != oldSubsystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.TOKEN_TYPE__SUBSYSTEM, oldSubsystem, subsystem));
			}
		}
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSubsystem() {
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsystem(Port newSubsystem) {
		Port oldSubsystem = subsystem;
		subsystem = newSubsystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TOKEN_TYPE__SUBSYSTEM, oldSubsystem, subsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.TOKEN_TYPE__IS_GROUP:
				return isIsGroup();
			case AcsProfilePackage.TOKEN_TYPE__SUBSYSTEM:
				if (resolve) return getSubsystem();
				return basicGetSubsystem();
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
			case AcsProfilePackage.TOKEN_TYPE__IS_GROUP:
				setIsGroup((Boolean)newValue);
				return;
			case AcsProfilePackage.TOKEN_TYPE__SUBSYSTEM:
				setSubsystem((Port)newValue);
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
			case AcsProfilePackage.TOKEN_TYPE__IS_GROUP:
				setIsGroup(IS_GROUP_EDEFAULT);
				return;
			case AcsProfilePackage.TOKEN_TYPE__SUBSYSTEM:
				setSubsystem((Port)null);
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
			case AcsProfilePackage.TOKEN_TYPE__IS_GROUP:
				return isGroup != IS_GROUP_EDEFAULT;
			case AcsProfilePackage.TOKEN_TYPE__SUBSYSTEM:
				return subsystem != null;
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
		result.append(" (IsGroup: ");
		result.append(isGroup);
		result.append(')');
		return result.toString();
	}

} //TokenTypeImpl
