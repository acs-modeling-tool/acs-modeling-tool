/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.ExplicitMachine#getFunc_decls <em>Func decls</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getExplicitMachine()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Explicit Machine'"
 * @generated
 */
public interface ExplicitMachine extends Machine {
	/**
	 * Returns the value of the '<em><b>Func decls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.FuncDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func decls</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getExplicitMachine_Func_decls()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FuncDecl> getFunc_decls();

} // ExplicitMachine
