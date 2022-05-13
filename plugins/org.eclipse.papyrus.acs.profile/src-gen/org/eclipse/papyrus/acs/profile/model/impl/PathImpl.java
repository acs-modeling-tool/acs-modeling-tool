/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.BasePath;
import org.eclipse.papyrus.acs.profile.model.ElementPath;
import org.eclipse.papyrus.acs.profile.model.FieldPath;
import org.eclipse.papyrus.acs.profile.model.Path;

import org.eclipse.papyrus.acs.profile.model.util.AcsProfileValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PathImpl#getFieldpath <em>Fieldpath</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PathImpl#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.impl.PathImpl#getElementpath <em>Elementpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends MinimalEObjectImpl.Container implements Path {
	/**
	 * The cached value of the '{@link #getFieldpath() <em>Fieldpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldpath()
	 * @generated
	 * @ordered
	 */
	protected FieldPath fieldpath;

	/**
	 * The cached value of the '{@link #getBasepath() <em>Basepath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasepath()
	 * @generated
	 * @ordered
	 */
	protected BasePath basepath;

	/**
	 * The cached value of the '{@link #getElementpath() <em>Elementpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementpath()
	 * @generated
	 * @ordered
	 */
	protected ElementPath elementpath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcsProfilePackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldPath getFieldpath() {
		return fieldpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldpath(FieldPath newFieldpath, NotificationChain msgs) {
		FieldPath oldFieldpath = fieldpath;
		fieldpath = newFieldpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PATH__FIELDPATH, oldFieldpath, newFieldpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldpath(FieldPath newFieldpath) {
		if (newFieldpath != fieldpath) {
			NotificationChain msgs = null;
			if (fieldpath != null)
				msgs = ((InternalEObject)fieldpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PATH__FIELDPATH, null, msgs);
			if (newFieldpath != null)
				msgs = ((InternalEObject)newFieldpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PATH__FIELDPATH, null, msgs);
			msgs = basicSetFieldpath(newFieldpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PATH__FIELDPATH, newFieldpath, newFieldpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePath getBasepath() {
		return basepath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasepath(BasePath newBasepath, NotificationChain msgs) {
		BasePath oldBasepath = basepath;
		basepath = newBasepath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PATH__BASEPATH, oldBasepath, newBasepath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasepath(BasePath newBasepath) {
		if (newBasepath != basepath) {
			NotificationChain msgs = null;
			if (basepath != null)
				msgs = ((InternalEObject)basepath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PATH__BASEPATH, null, msgs);
			if (newBasepath != null)
				msgs = ((InternalEObject)newBasepath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PATH__BASEPATH, null, msgs);
			msgs = basicSetBasepath(newBasepath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PATH__BASEPATH, newBasepath, newBasepath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementPath getElementpath() {
		return elementpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementpath(ElementPath newElementpath, NotificationChain msgs) {
		ElementPath oldElementpath = elementpath;
		elementpath = newElementpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PATH__ELEMENTPATH, oldElementpath, newElementpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementpath(ElementPath newElementpath) {
		if (newElementpath != elementpath) {
			NotificationChain msgs = null;
			if (elementpath != null)
				msgs = ((InternalEObject)elementpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PATH__ELEMENTPATH, null, msgs);
			if (newElementpath != null)
				msgs = ((InternalEObject)newElementpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AcsProfilePackage.PATH__ELEMENTPATH, null, msgs);
			msgs = basicSetElementpath(newElementpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcsProfilePackage.PATH__ELEMENTPATH, newElementpath, newElementpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Onlyonepath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AcsProfileValidator.DIAGNOSTIC_SOURCE,
						 AcsProfileValidator.PATH__ONLYONEPATH,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Onlyonepath", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcsProfilePackage.PATH__FIELDPATH:
				return basicSetFieldpath(null, msgs);
			case AcsProfilePackage.PATH__BASEPATH:
				return basicSetBasepath(null, msgs);
			case AcsProfilePackage.PATH__ELEMENTPATH:
				return basicSetElementpath(null, msgs);
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
			case AcsProfilePackage.PATH__FIELDPATH:
				return getFieldpath();
			case AcsProfilePackage.PATH__BASEPATH:
				return getBasepath();
			case AcsProfilePackage.PATH__ELEMENTPATH:
				return getElementpath();
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
			case AcsProfilePackage.PATH__FIELDPATH:
				setFieldpath((FieldPath)newValue);
				return;
			case AcsProfilePackage.PATH__BASEPATH:
				setBasepath((BasePath)newValue);
				return;
			case AcsProfilePackage.PATH__ELEMENTPATH:
				setElementpath((ElementPath)newValue);
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
			case AcsProfilePackage.PATH__FIELDPATH:
				setFieldpath((FieldPath)null);
				return;
			case AcsProfilePackage.PATH__BASEPATH:
				setBasepath((BasePath)null);
				return;
			case AcsProfilePackage.PATH__ELEMENTPATH:
				setElementpath((ElementPath)null);
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
			case AcsProfilePackage.PATH__FIELDPATH:
				return fieldpath != null;
			case AcsProfilePackage.PATH__BASEPATH:
				return basepath != null;
			case AcsProfilePackage.PATH__ELEMENTPATH:
				return elementpath != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AcsProfilePackage.PATH___ONLYONEPATH__DIAGNOSTICCHAIN_MAP:
				return Onlyonepath((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PathImpl
