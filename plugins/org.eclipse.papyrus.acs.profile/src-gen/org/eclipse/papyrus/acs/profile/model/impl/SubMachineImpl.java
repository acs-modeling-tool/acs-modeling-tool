/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Full_Type;
import org.eclipse.papyrus.acs.profile.model.SubMachine;
import org.eclipse.papyrus.acs.profile.model.TypInOut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.SubMachineImpl#getOut_typs <em>Out typs</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.SubMachineImpl#getIn_typs <em>In typs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubMachineImpl extends ExplicitMachineImpl implements SubMachine {
	/**
	 * The cached value of the '{@link #getOut_typs() <em>Out typs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_typs()
	 * @generated
	 * @ordered
	 */
	protected EList<Full_Type> out_typs;

	/**
	 * The cached value of the '{@link #getIn_typs() <em>In typs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn_typs()
	 * @generated
	 * @ordered
	 */
	protected EList<Full_Type> in_typs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.SUB_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Full_Type> getOut_typs() {
		if (out_typs == null) {
			out_typs = new EObjectContainmentEList<Full_Type>(Full_Type.class, this, AcsProfilePackage.SUB_MACHINE__OUT_TYPS);
		}
		return out_typs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Full_Type> getIn_typs() {
		if (in_typs == null) {
			in_typs = new EObjectContainmentEList<Full_Type>(Full_Type.class, this, AcsProfilePackage.SUB_MACHINE__IN_TYPS);
		}
		return in_typs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.SUB_MACHINE__OUT_TYPS:
				return ((InternalEList<?>)getOut_typs()).basicRemove(otherEnd, msgs);
			case AcsProfilePackage.SUB_MACHINE__IN_TYPS:
				return ((InternalEList<?>)getIn_typs()).basicRemove(otherEnd, msgs);
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
			case AcsProfilePackage.SUB_MACHINE__OUT_TYPS:
				return getOut_typs();
			case AcsProfilePackage.SUB_MACHINE__IN_TYPS:
				return getIn_typs();
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
			case AcsProfilePackage.SUB_MACHINE__OUT_TYPS:
				getOut_typs().clear();
				getOut_typs().addAll((Collection<? extends Full_Type>)newValue);
				return;
			case AcsProfilePackage.SUB_MACHINE__IN_TYPS:
				getIn_typs().clear();
				getIn_typs().addAll((Collection<? extends Full_Type>)newValue);
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
			case AcsProfilePackage.SUB_MACHINE__OUT_TYPS:
				getOut_typs().clear();
				return;
			case AcsProfilePackage.SUB_MACHINE__IN_TYPS:
				getIn_typs().clear();
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
			case AcsProfilePackage.SUB_MACHINE__OUT_TYPS:
				return out_typs != null && !out_typs.isEmpty();
			case AcsProfilePackage.SUB_MACHINE__IN_TYPS:
				return in_typs != null && !in_typs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypInOut.class) {
			switch (derivedFeatureID) {
				case AcsProfilePackage.SUB_MACHINE__OUT_TYPS: return AcsProfilePackage.TYP_IN_OUT__OUT_TYPS;
				case AcsProfilePackage.SUB_MACHINE__IN_TYPS: return AcsProfilePackage.TYP_IN_OUT__IN_TYPS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypInOut.class) {
			switch (baseFeatureID) {
				case AcsProfilePackage.TYP_IN_OUT__OUT_TYPS: return AcsProfilePackage.SUB_MACHINE__OUT_TYPS;
				case AcsProfilePackage.TYP_IN_OUT__IN_TYPS: return AcsProfilePackage.SUB_MACHINE__IN_TYPS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubMachineImpl
