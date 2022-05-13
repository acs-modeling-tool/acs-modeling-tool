/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.COMEndState;
import org.eclipse.papyrus.acs.profile.model.TokenSelector;

import org.eclipse.uml2.uml.FinalState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COM End State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl#getOutVars <em>Out Vars</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl#getBase_FinalState <em>Base Final State</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl#getOut_toks <em>Out toks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COMEndStateImpl extends COMStateImpl implements COMEndState {
	/**
	 * The cached value of the '{@link #getOutVars() <em>Out Vars</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutVars()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outVars;

	/**
	 * The cached value of the '{@link #getBase_FinalState() <em>Base Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_FinalState()
	 * @generated
	 * @ordered
	 */
	protected FinalState base_FinalState;

	/**
	 * The cached value of the '{@link #getOut_toks() <em>Out toks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_toks()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenSelector> out_toks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COMEndStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.COM_END_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutVars() {
		if (outVars == null) {
			outVars = new EDataTypeUniqueEList<String>(String.class, this, AcsProfilePackage.COM_END_STATE__OUT_VARS);
		}
		return outVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState getBase_FinalState() {
		if (base_FinalState != null && base_FinalState.eIsProxy()) {
			InternalEObject oldBase_FinalState = (InternalEObject)base_FinalState;
			base_FinalState = (FinalState)eResolveProxy(oldBase_FinalState);
			if (base_FinalState != oldBase_FinalState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.COM_END_STATE__BASE_FINAL_STATE, oldBase_FinalState, base_FinalState));
			}
		}
		return base_FinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState basicGetBase_FinalState() {
		return base_FinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_FinalState(FinalState newBase_FinalState) {
		FinalState oldBase_FinalState = base_FinalState;
		base_FinalState = newBase_FinalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.COM_END_STATE__BASE_FINAL_STATE, oldBase_FinalState, base_FinalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenSelector> getOut_toks() {
		if (out_toks == null) {
			out_toks = new EObjectContainmentEList<TokenSelector>(TokenSelector.class, this, AcsProfilePackage.COM_END_STATE__OUT_TOKS);
		}
		return out_toks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.COM_END_STATE__OUT_TOKS:
				return ((InternalEList<?>)getOut_toks()).basicRemove(otherEnd, msgs);
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
			case AcsProfilePackage.COM_END_STATE__OUT_VARS:
				return getOutVars();
			case AcsProfilePackage.COM_END_STATE__BASE_FINAL_STATE:
				if (resolve) return getBase_FinalState();
				return basicGetBase_FinalState();
			case AcsProfilePackage.COM_END_STATE__OUT_TOKS:
				return getOut_toks();
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
			case AcsProfilePackage.COM_END_STATE__OUT_VARS:
				getOutVars().clear();
				getOutVars().addAll((Collection<? extends String>)newValue);
				return;
			case AcsProfilePackage.COM_END_STATE__BASE_FINAL_STATE:
				setBase_FinalState((FinalState)newValue);
				return;
			case AcsProfilePackage.COM_END_STATE__OUT_TOKS:
				getOut_toks().clear();
				getOut_toks().addAll((Collection<? extends TokenSelector>)newValue);
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
			case AcsProfilePackage.COM_END_STATE__OUT_VARS:
				getOutVars().clear();
				return;
			case AcsProfilePackage.COM_END_STATE__BASE_FINAL_STATE:
				setBase_FinalState((FinalState)null);
				return;
			case AcsProfilePackage.COM_END_STATE__OUT_TOKS:
				getOut_toks().clear();
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
			case AcsProfilePackage.COM_END_STATE__OUT_VARS:
				return outVars != null && !outVars.isEmpty();
			case AcsProfilePackage.COM_END_STATE__BASE_FINAL_STATE:
				return base_FinalState != null;
			case AcsProfilePackage.COM_END_STATE__OUT_TOKS:
				return out_toks != null && !out_toks.isEmpty();
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
		result.append(" (OutVars: ");
		result.append(outVars);
		result.append(')');
		return result.toString();
	}

} //COMEndStateImpl
