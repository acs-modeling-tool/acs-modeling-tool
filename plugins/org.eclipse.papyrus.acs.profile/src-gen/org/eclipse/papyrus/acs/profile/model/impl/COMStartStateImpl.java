/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.COMStartState;

import org.eclipse.uml2.uml.Pseudostate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COM Start State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl#getInVars <em>In Vars</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl#getInToks <em>In Toks</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl#getBase_Pseudostate <em>Base Pseudostate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COMStartStateImpl extends COMStateImpl implements COMStartState {
	/**
	 * The cached value of the '{@link #getInVars() <em>In Vars</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInVars()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inVars;

	/**
	 * The cached value of the '{@link #getInToks() <em>In Toks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInToks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inToks;

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
	protected COMStartStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.COM_START_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInVars() {
		if (inVars == null) {
			inVars = new EDataTypeUniqueEList<String>(String.class, this, AcsProfilePackage.COM_START_STATE__IN_VARS);
		}
		return inVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInToks() {
		if (inToks == null) {
			inToks = new EDataTypeUniqueEList<String>(String.class, this, AcsProfilePackage.COM_START_STATE__IN_TOKS);
		}
		return inToks;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.COM_START_STATE__BASE_PSEUDOSTATE, oldBase_Pseudostate, base_Pseudostate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.COM_START_STATE__BASE_PSEUDOSTATE, oldBase_Pseudostate, base_Pseudostate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcsProfilePackage.COM_START_STATE__IN_VARS:
				return getInVars();
			case AcsProfilePackage.COM_START_STATE__IN_TOKS:
				return getInToks();
			case AcsProfilePackage.COM_START_STATE__BASE_PSEUDOSTATE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcsProfilePackage.COM_START_STATE__IN_VARS:
				getInVars().clear();
				getInVars().addAll((Collection<? extends String>)newValue);
				return;
			case AcsProfilePackage.COM_START_STATE__IN_TOKS:
				getInToks().clear();
				getInToks().addAll((Collection<? extends String>)newValue);
				return;
			case AcsProfilePackage.COM_START_STATE__BASE_PSEUDOSTATE:
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
			case AcsProfilePackage.COM_START_STATE__IN_VARS:
				getInVars().clear();
				return;
			case AcsProfilePackage.COM_START_STATE__IN_TOKS:
				getInToks().clear();
				return;
			case AcsProfilePackage.COM_START_STATE__BASE_PSEUDOSTATE:
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
			case AcsProfilePackage.COM_START_STATE__IN_VARS:
				return inVars != null && !inVars.isEmpty();
			case AcsProfilePackage.COM_START_STATE__IN_TOKS:
				return inToks != null && !inToks.isEmpty();
			case AcsProfilePackage.COM_START_STATE__BASE_PSEUDOSTATE:
				return base_Pseudostate != null;
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
		result.append(" (InVars: ");
		result.append(inVars);
		result.append(", InToks: ");
		result.append(inToks);
		result.append(')');
		return result.toString();
	}

} //COMStartStateImpl
