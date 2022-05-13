/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getDirectionality <em>Directionality</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Association <em>Base Association</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkConnection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Link Connection'"
 * @generated
 */
public interface LinkConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Directionality</b></em>' attribute.
	 * The default value is <code>"reactive"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.acs.profile.model.ConnectionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directionality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directionality</em>' attribute.
	 * @see org.eclipse.papyrus.acs.profile.model.ConnectionTypes
	 * @see #setDirectionality(ConnectionTypes)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkConnection_Directionality()
	 * @model default="reactive" required="true" ordered="false"
	 * @generated
	 */
	ConnectionTypes getDirectionality();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getDirectionality <em>Directionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directionality</em>' attribute.
	 * @see org.eclipse.papyrus.acs.profile.model.ConnectionTypes
	 * @see #getDirectionality()
	 * @generated
	 */
	void setDirectionality(ConnectionTypes value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkConnection_Cardinality()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkConnection_Base_Connector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#getLinkConnection_Base_Association()
	 * @model ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

} // LinkConnection
