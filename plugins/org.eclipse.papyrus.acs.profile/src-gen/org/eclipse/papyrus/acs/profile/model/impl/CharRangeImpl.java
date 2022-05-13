/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.CharRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.CharRangeImpl#getCharGroupRegex <em>Char Group Regex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharRangeImpl extends MinimalEObjectImpl.Container implements CharRange {
	/**
	 * The default value of the '{@link #getCharGroupRegex() <em>Char Group Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharGroupRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_GROUP_REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharGroupRegex() <em>Char Group Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharGroupRegex()
	 * @generated
	 * @ordered
	 */
	protected String charGroupRegex = CHAR_GROUP_REGEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.CHAR_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharGroupRegex() {
		return charGroupRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharGroupRegex(String newCharGroupRegex) {
		String oldCharGroupRegex = charGroupRegex;
		charGroupRegex = newCharGroupRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.CHAR_RANGE__CHAR_GROUP_REGEX, oldCharGroupRegex, charGroupRegex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.CHAR_RANGE__CHAR_GROUP_REGEX:
				return getCharGroupRegex();
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
			case AcsProfilePackage.CHAR_RANGE__CHAR_GROUP_REGEX:
				setCharGroupRegex((String)newValue);
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
			case AcsProfilePackage.CHAR_RANGE__CHAR_GROUP_REGEX:
				setCharGroupRegex(CHAR_GROUP_REGEX_EDEFAULT);
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
			case AcsProfilePackage.CHAR_RANGE__CHAR_GROUP_REGEX:
				return CHAR_GROUP_REGEX_EDEFAULT == null ? charGroupRegex != null : !CHAR_GROUP_REGEX_EDEFAULT.equals(charGroupRegex);
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
		result.append(" (CharGroupRegex: ");
		result.append(charGroupRegex);
		result.append(')');
		return result.toString();
	}

} //CharRangeImpl
