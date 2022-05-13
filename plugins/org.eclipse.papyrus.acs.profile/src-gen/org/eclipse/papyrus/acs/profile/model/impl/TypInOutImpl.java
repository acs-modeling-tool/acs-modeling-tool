/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Full_Type;
import org.eclipse.papyrus.acs.profile.model.TypInOut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typ In Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypInOutImpl#getOut_typs <em>Out typs</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.TypInOutImpl#getIn_typs <em>In typs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypInOutImpl extends MinimalEObjectImpl.Container implements TypInOut {
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
	protected TypInOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.TYP_IN_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Full_Type> getOut_typs() {
		if (out_typs == null) {
			out_typs = new EObjectContainmentEList<Full_Type>(Full_Type.class, this, AcsProfilePackage.TYP_IN_OUT__OUT_TYPS);
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
			in_typs = new EObjectContainmentEList<Full_Type>(Full_Type.class, this, AcsProfilePackage.TYP_IN_OUT__IN_TYPS);
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
			case AcsProfilePackage.TYP_IN_OUT__OUT_TYPS:
				return ((InternalEList<?>)getOut_typs()).basicRemove(otherEnd, msgs);
			case AcsProfilePackage.TYP_IN_OUT__IN_TYPS:
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
			case AcsProfilePackage.TYP_IN_OUT__OUT_TYPS:
				return getOut_typs();
			case AcsProfilePackage.TYP_IN_OUT__IN_TYPS:
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
			case AcsProfilePackage.TYP_IN_OUT__OUT_TYPS:
				getOut_typs().clear();
				getOut_typs().addAll((Collection<? extends Full_Type>)newValue);
				return;
			case AcsProfilePackage.TYP_IN_OUT__IN_TYPS:
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
			case AcsProfilePackage.TYP_IN_OUT__OUT_TYPS:
				getOut_typs().clear();
				return;
			case AcsProfilePackage.TYP_IN_OUT__IN_TYPS:
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
			case AcsProfilePackage.TYP_IN_OUT__OUT_TYPS:
				return out_typs != null && !out_typs.isEmpty();
			case AcsProfilePackage.TYP_IN_OUT__IN_TYPS:
				return in_typs != null && !in_typs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypInOutImpl
