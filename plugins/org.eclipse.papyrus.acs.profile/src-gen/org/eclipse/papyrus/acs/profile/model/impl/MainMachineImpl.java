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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.Full_Type;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.MainMachine;
import org.eclipse.papyrus.acs.profile.model.TokenType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl#getOut_typs <em>Out typs</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl#getOut_toks <em>Out toks</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl#getIn_toks <em>In toks</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl#getLink_hub <em>Link hub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainMachineImpl extends ExplicitMachineImpl implements MainMachine {
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
	 * The cached value of the '{@link #getOut_toks() <em>Out toks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_toks()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenType> out_toks;

	/**
	 * The cached value of the '{@link #getIn_toks() <em>In toks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn_toks()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenType> in_toks;

	/**
	 * The cached value of the '{@link #getLink_hub() <em>Link hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_hub()
	 * @generated
	 * @ordered
	 */
	protected LinkHub link_hub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.MAIN_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Full_Type> getOut_typs() {
		if (out_typs == null) {
			out_typs = new EObjectContainmentEList<Full_Type>(Full_Type.class, this, AcsProfilePackage.MAIN_MACHINE__OUT_TYPS);
		}
		return out_typs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenType> getOut_toks() {
		if (out_toks == null) {
			out_toks = new EObjectContainmentEList<TokenType>(TokenType.class, this, AcsProfilePackage.MAIN_MACHINE__OUT_TOKS);
		}
		return out_toks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenType> getIn_toks() {
		if (in_toks == null) {
			in_toks = new EObjectContainmentEList<TokenType>(TokenType.class, this, AcsProfilePackage.MAIN_MACHINE__IN_TOKS);
		}
		return in_toks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHub getLink_hub() {
		if (link_hub != null && link_hub.eIsProxy()) {
			InternalEObject oldLink_hub = (InternalEObject)link_hub;
			link_hub = (LinkHub)eResolveProxy(oldLink_hub);
			if (link_hub != oldLink_hub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcsProfilePackage.MAIN_MACHINE__LINK_HUB, oldLink_hub, link_hub));
			}
		}
		return link_hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHub basicGetLink_hub() {
		return link_hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_hub(LinkHub newLink_hub) {
		LinkHub oldLink_hub = link_hub;
		link_hub = newLink_hub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.MAIN_MACHINE__LINK_HUB, oldLink_hub, link_hub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.MAIN_MACHINE__OUT_TYPS:
				return ((InternalEList<?>)getOut_typs()).basicRemove(otherEnd, msgs);
			case AcsProfilePackage.MAIN_MACHINE__OUT_TOKS:
				return ((InternalEList<?>)getOut_toks()).basicRemove(otherEnd, msgs);
			case AcsProfilePackage.MAIN_MACHINE__IN_TOKS:
				return ((InternalEList<?>)getIn_toks()).basicRemove(otherEnd, msgs);
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
			case AcsProfilePackage.MAIN_MACHINE__OUT_TYPS:
				return getOut_typs();
			case AcsProfilePackage.MAIN_MACHINE__OUT_TOKS:
				return getOut_toks();
			case AcsProfilePackage.MAIN_MACHINE__IN_TOKS:
				return getIn_toks();
			case AcsProfilePackage.MAIN_MACHINE__LINK_HUB:
				if (resolve) return getLink_hub();
				return basicGetLink_hub();
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
			case AcsProfilePackage.MAIN_MACHINE__OUT_TYPS:
				getOut_typs().clear();
				getOut_typs().addAll((Collection<? extends Full_Type>)newValue);
				return;
			case AcsProfilePackage.MAIN_MACHINE__OUT_TOKS:
				getOut_toks().clear();
				getOut_toks().addAll((Collection<? extends TokenType>)newValue);
				return;
			case AcsProfilePackage.MAIN_MACHINE__IN_TOKS:
				getIn_toks().clear();
				getIn_toks().addAll((Collection<? extends TokenType>)newValue);
				return;
			case AcsProfilePackage.MAIN_MACHINE__LINK_HUB:
				setLink_hub((LinkHub)newValue);
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
			case AcsProfilePackage.MAIN_MACHINE__OUT_TYPS:
				getOut_typs().clear();
				return;
			case AcsProfilePackage.MAIN_MACHINE__OUT_TOKS:
				getOut_toks().clear();
				return;
			case AcsProfilePackage.MAIN_MACHINE__IN_TOKS:
				getIn_toks().clear();
				return;
			case AcsProfilePackage.MAIN_MACHINE__LINK_HUB:
				setLink_hub((LinkHub)null);
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
			case AcsProfilePackage.MAIN_MACHINE__OUT_TYPS:
				return out_typs != null && !out_typs.isEmpty();
			case AcsProfilePackage.MAIN_MACHINE__OUT_TOKS:
				return out_toks != null && !out_toks.isEmpty();
			case AcsProfilePackage.MAIN_MACHINE__IN_TOKS:
				return in_toks != null && !in_toks.isEmpty();
			case AcsProfilePackage.MAIN_MACHINE__LINK_HUB:
				return link_hub != null;
		}
		return super.eIsSet(featureID);
	}

} //MainMachineImpl
