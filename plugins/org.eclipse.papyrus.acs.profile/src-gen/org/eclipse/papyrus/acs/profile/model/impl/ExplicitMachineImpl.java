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
import org.eclipse.papyrus.acs.profile.model.ExplicitMachine;
import org.eclipse.papyrus.acs.profile.model.FuncDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.ExplicitMachineImpl#getFunc_decls <em>Func decls</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExplicitMachineImpl extends MachineImpl implements ExplicitMachine {
	/**
	 * The cached value of the '{@link #getFunc_decls() <em>Func decls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunc_decls()
	 * @generated
	 * @ordered
	 */
	protected EList<FuncDecl> func_decls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplicitMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.EXPLICIT_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuncDecl> getFunc_decls() {
		if (func_decls == null) {
			func_decls = new EObjectContainmentEList<FuncDecl>(FuncDecl.class, this, AcsProfilePackage.EXPLICIT_MACHINE__FUNC_DECLS);
		}
		return func_decls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.EXPLICIT_MACHINE__FUNC_DECLS:
				return ((InternalEList<?>)getFunc_decls()).basicRemove(otherEnd, msgs);
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
			case AcsProfilePackage.EXPLICIT_MACHINE__FUNC_DECLS:
				return getFunc_decls();
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
			case AcsProfilePackage.EXPLICIT_MACHINE__FUNC_DECLS:
				getFunc_decls().clear();
				getFunc_decls().addAll((Collection<? extends FuncDecl>)newValue);
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
			case AcsProfilePackage.EXPLICIT_MACHINE__FUNC_DECLS:
				getFunc_decls().clear();
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
			case AcsProfilePackage.EXPLICIT_MACHINE__FUNC_DECLS:
				return func_decls != null && !func_decls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplicitMachineImpl
