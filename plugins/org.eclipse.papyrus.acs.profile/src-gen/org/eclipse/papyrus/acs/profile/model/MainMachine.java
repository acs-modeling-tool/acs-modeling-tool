/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getOut_typs <em>Out typs</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getOut_toks <em>Out toks</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getIn_toks <em>In toks</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getLink_hub <em>Link hub</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getMainMachine()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Main Machine'"
 * @generated
 */
public interface MainMachine extends ExplicitMachine {
	/**
	 * Returns the value of the '<em><b>Out typs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.Full_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out typs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out typs</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getMainMachine_Out_typs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Full_Type> getOut_typs();

	/**
	 * Returns the value of the '<em><b>Out toks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.TokenType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out toks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out toks</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getMainMachine_Out_toks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TokenType> getOut_toks();

	/**
	 * Returns the value of the '<em><b>In toks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.acs.profile.model.TokenType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In toks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In toks</em>' containment reference list.
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getMainMachine_In_toks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TokenType> getIn_toks();

	/**
	 * Returns the value of the '<em><b>Link hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link hub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link hub</em>' reference.
	 * @see #setLink_hub(LinkHub)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getMainMachine_Link_hub()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LinkHub getLink_hub();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getLink_hub <em>Link hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link hub</em>' reference.
	 * @see #getLink_hub()
	 * @generated
	 */
	void setLink_hub(LinkHub value);

} // MainMachine
