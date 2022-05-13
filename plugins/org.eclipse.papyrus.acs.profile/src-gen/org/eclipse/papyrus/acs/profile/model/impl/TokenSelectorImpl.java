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
import org.eclipse.papyrus.acs.profile.model.TokenSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl#isSelectAll <em>Select All</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenSelectorImpl extends MinimalEObjectImpl.Container implements TokenSelector {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelectAll() <em>Select All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECT_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelectAll() <em>Select All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectAll()
	 * @generated
	 * @ordered
	 */
	protected boolean selectAll = SELECT_ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.TOKEN_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TOKEN_SELECTOR__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectAll() {
		return selectAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectAll(boolean newSelectAll) {
		boolean oldSelectAll = selectAll;
		selectAll = newSelectAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TOKEN_SELECTOR__SELECT_ALL, oldSelectAll, selectAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.TOKEN_SELECTOR__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.TOKEN_SELECTOR__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.TOKEN_SELECTOR__ID:
				return getID();
			case AcsProfilePackage.TOKEN_SELECTOR__SELECT_ALL:
				return isSelectAll();
			case AcsProfilePackage.TOKEN_SELECTOR__PORT:
				if (resolve) return getPort();
				return basicGetPort();
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
			case AcsProfilePackage.TOKEN_SELECTOR__ID:
				setID((Integer)newValue);
				return;
			case AcsProfilePackage.TOKEN_SELECTOR__SELECT_ALL:
				setSelectAll((Boolean)newValue);
				return;
			case AcsProfilePackage.TOKEN_SELECTOR__PORT:
				setPort((Port)newValue);
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
			case AcsProfilePackage.TOKEN_SELECTOR__ID:
				setID(ID_EDEFAULT);
				return;
			case AcsProfilePackage.TOKEN_SELECTOR__SELECT_ALL:
				setSelectAll(SELECT_ALL_EDEFAULT);
				return;
			case AcsProfilePackage.TOKEN_SELECTOR__PORT:
				setPort((Port)null);
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
			case AcsProfilePackage.TOKEN_SELECTOR__ID:
				return id != ID_EDEFAULT;
			case AcsProfilePackage.TOKEN_SELECTOR__SELECT_ALL:
				return selectAll != SELECT_ALL_EDEFAULT;
			case AcsProfilePackage.TOKEN_SELECTOR__PORT:
				return port != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", SelectAll: ");
		result.append(selectAll);
		result.append(')');
		return result.toString();
	}

} //TokenSelectorImpl
