/**
 */
package org.eclipse.papyrus.acs.profile.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfileFactory
 * @model kind="package"
 * @generated
 */
public interface AcsProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://Papyrus/AcsProfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AcsProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcsProfilePackage eINSTANCE = org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.LinkHolderImpl <em>Link Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.LinkHolderImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getLinkHolder()
	 * @generated
	 */
	int LINK_HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HOLDER__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Link Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ActionTransitionImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getActionTransition()
	 * @generated
	 */
	int ACTION_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION__BASE_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Action Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.InvocationTransitionImpl <em>Invocation Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.InvocationTransitionImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getInvocationTransition()
	 * @generated
	 */
	int INVOCATION_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TRANSITION__BASE_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Invocation Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Noncycliclocal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TRANSITION___NONCYCLICLOCAL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Invocation Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_TRANSITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.SystemImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.SubsystemImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BASE_COMPONENT = SYSTEM__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__CARDINALITY = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.CompositeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 3;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__BASE_COMPONENT = SUBSYSTEM__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CARDINALITY = SUBSYSTEM__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ContainerImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 6;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.AtomicSystemImpl <em>Atomic System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AtomicSystemImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getAtomicSystem()
	 * @generated
	 */
	int ATOMIC_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SYSTEM__BASE_COMPONENT = SUBSYSTEM__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SYSTEM__CARDINALITY = SUBSYSTEM__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Atomic System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SYSTEM_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SYSTEM_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.LinkConnectionImpl <em>Link Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.LinkConnectionImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getLinkConnection()
	 * @generated
	 */
	int LINK_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Directionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONNECTION__DIRECTIONALITY = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONNECTION__CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONNECTION__BASE_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONNECTION__BASE_ASSOCIATION = 3;

	/**
	 * The number of structural features of the '<em>Link Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Link Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SoIImpl <em>So I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.SoIImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSoI()
	 * @generated
	 */
	int SO_I = 9;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_I__BASE_COMPONENT = SYSTEM__BASE_COMPONENT;

	/**
	 * The number of structural features of the '<em>So I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_I_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>So I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_I_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ReferenceImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__BASE_COMPONENT = SUBSYSTEM__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CARDINALITY = SUBSYSTEM__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Referenced soi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCED_SOI = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.InterfaceConnectionImpl <em>Interface Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.InterfaceConnectionImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getInterfaceConnection()
	 * @generated
	 */
	int INTERFACE_CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION__BASE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION__BASE_ASSOCIATION = 1;

	/**
	 * The number of structural features of the '<em>Interface Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.EventDeclarationImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getEventDeclaration()
	 * @generated
	 */
	int EVENT_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION__BASE_STATE_MACHINE = 0;

	/**
	 * The number of structural features of the '<em>Event Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ControllerImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 13;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__BASE_STATE_MACHINE = 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.MachineImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 16;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__BASE_REGION = 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ExplicitMachineImpl <em>Explicit Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ExplicitMachineImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getExplicitMachine()
	 * @generated
	 */
	int EXPLICIT_MACHINE = 15;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_MACHINE__BASE_REGION = MACHINE__BASE_REGION;

	/**
	 * The feature id for the '<em><b>Func decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_MACHINE__FUNC_DECLS = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_MACHINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Explicit Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_MACHINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl <em>Main Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getMainMachine()
	 * @generated
	 */
	int MAIN_MACHINE = 14;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE__BASE_REGION = EXPLICIT_MACHINE__BASE_REGION;

	/**
	 * The feature id for the '<em><b>Func decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE__FUNC_DECLS = EXPLICIT_MACHINE__FUNC_DECLS;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE__OUT_TYPS = EXPLICIT_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out toks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE__OUT_TOKS = EXPLICIT_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In toks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE__IN_TOKS = EXPLICIT_MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE__LINK_HUB = EXPLICIT_MACHINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Main Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE_FEATURE_COUNT = EXPLICIT_MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Main Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MACHINE_OPERATION_COUNT = EXPLICIT_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TypInOutImpl <em>Typ In Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.TypInOutImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getTypInOut()
	 * @generated
	 */
	int TYP_IN_OUT = 18;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYP_IN_OUT__OUT_TYPS = 0;

	/**
	 * The feature id for the '<em><b>In typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYP_IN_OUT__IN_TYPS = 1;

	/**
	 * The number of structural features of the '<em>Typ In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYP_IN_OUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Typ In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYP_IN_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.FuncDeclImpl <em>Func Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.FuncDeclImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFuncDecl()
	 * @generated
	 */
	int FUNC_DECL = 17;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DECL__OUT_TYPS = TYP_IN_OUT__OUT_TYPS;

	/**
	 * The feature id for the '<em><b>In typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DECL__IN_TYPS = TYP_IN_OUT__IN_TYPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DECL__NAME = TYP_IN_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Func Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DECL_FEATURE_COUNT = TYP_IN_OUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Func Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNC_DECL_OPERATION_COUNT = TYP_IN_OUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.Full_TypeImpl <em>Full Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.Full_TypeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFull_Type()
	 * @generated
	 */
	int FULL_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Full Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Full Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TokenTypeImpl <em>Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.TokenTypeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getTokenType()
	 * @generated
	 */
	int TOKEN_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Is Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__IS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Subsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__SUBSYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.PortImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 21;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.LinkHubImpl <em>Link Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.LinkHubImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getLinkHub()
	 * @generated
	 */
	int LINK_HUB = 22;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HUB__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Link Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HUB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HUB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.InitiatorImpl <em>Initiator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.InitiatorImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getInitiator()
	 * @generated
	 */
	int INITIATOR = 23;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__OUT_TYPS = TYP_IN_OUT__OUT_TYPS;

	/**
	 * The feature id for the '<em><b>In typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__IN_TYPS = TYP_IN_OUT__IN_TYPS;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__BASE_STATE_MACHINE = TYP_IN_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR_FEATURE_COUNT = TYP_IN_OUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR_OPERATION_COUNT = TYP_IN_OUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.HandlerImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 24;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__OUT_TYPS = TYP_IN_OUT__OUT_TYPS;

	/**
	 * The feature id for the '<em><b>In typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__IN_TYPS = TYP_IN_OUT__IN_TYPS;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__BASE_STATE_MACHINE = TYP_IN_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = TYP_IN_OUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_OPERATION_COUNT = TYP_IN_OUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.SubscriberImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 25;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__BASE_STATE_MACHINE = EVENT_DECLARATION__BASE_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__OUT_TYPS = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.PublisherImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 26;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__BASE_STATE_MACHINE = EVENT_DECLARATION__BASE_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>In typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__IN_TYPS = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SubMachineImpl <em>Sub Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.SubMachineImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSubMachine()
	 * @generated
	 */
	int SUB_MACHINE = 27;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MACHINE__BASE_REGION = EXPLICIT_MACHINE__BASE_REGION;

	/**
	 * The feature id for the '<em><b>Func decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MACHINE__FUNC_DECLS = EXPLICIT_MACHINE__FUNC_DECLS;

	/**
	 * The feature id for the '<em><b>Out typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MACHINE__OUT_TYPS = EXPLICIT_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In typs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MACHINE__IN_TYPS = EXPLICIT_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MACHINE_FEATURE_COUNT = EXPLICIT_MACHINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MACHINE_OPERATION_COUNT = EXPLICIT_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ControllerBodyImpl <em>Controller Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ControllerBodyImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getControllerBody()
	 * @generated
	 */
	int CONTROLLER_BODY = 28;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_BODY__BASE_REGION = 0;

	/**
	 * The number of structural features of the '<em>Controller Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_BODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMStateImpl <em>COM State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.COMStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMState()
	 * @generated
	 */
	int COM_STATE = 29;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STATE__BASE_STATE = 0;

	/**
	 * The number of structural features of the '<em>COM State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>COM State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CONStateImpl <em>CON State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.CONStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCONState()
	 * @generated
	 */
	int CON_STATE = 30;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_STATE__TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Lockable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_STATE__LOCKABLE = 1;

	/**
	 * The number of structural features of the '<em>CON State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CON State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ImplicitMachineImpl <em>Implicit Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ImplicitMachineImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getImplicitMachine()
	 * @generated
	 */
	int IMPLICIT_MACHINE = 31;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_MACHINE__BASE_REGION = MACHINE__BASE_REGION;

	/**
	 * The number of structural features of the '<em>Implicit Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_MACHINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implicit Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_MACHINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CONIntermediateStateImpl <em>CON Intermediate State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.CONIntermediateStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCONIntermediateState()
	 * @generated
	 */
	int CON_INTERMEDIATE_STATE = 32;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_INTERMEDIATE_STATE__TOKENS = CON_STATE__TOKENS;

	/**
	 * The feature id for the '<em><b>Lockable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_INTERMEDIATE_STATE__LOCKABLE = CON_STATE__LOCKABLE;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_INTERMEDIATE_STATE__BASE_STATE = CON_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CON Intermediate State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_INTERMEDIATE_STATE_FEATURE_COUNT = CON_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CON Intermediate State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_INTERMEDIATE_STATE_OPERATION_COUNT = CON_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMIntermediateStateImpl <em>COM Intermediate State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.COMIntermediateStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMIntermediateState()
	 * @generated
	 */
	int COM_INTERMEDIATE_STATE = 33;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERMEDIATE_STATE__BASE_STATE = COM_STATE__BASE_STATE;

	/**
	 * The number of structural features of the '<em>COM Intermediate State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERMEDIATE_STATE_FEATURE_COUNT = COM_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>COM Intermediate State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERMEDIATE_STATE_OPERATION_COUNT = COM_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CONStartStateImpl <em>CON Start State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.CONStartStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCONStartState()
	 * @generated
	 */
	int CON_START_STATE = 34;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_START_STATE__TOKENS = CON_STATE__TOKENS;

	/**
	 * The feature id for the '<em><b>Lockable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_START_STATE__LOCKABLE = CON_STATE__LOCKABLE;

	/**
	 * The feature id for the '<em><b>Base Pseudostate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_START_STATE__BASE_PSEUDOSTATE = CON_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CON Start State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_START_STATE_FEATURE_COUNT = CON_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CON Start State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CON_START_STATE_OPERATION_COUNT = CON_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl <em>COM Start State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMStartState()
	 * @generated
	 */
	int COM_START_STATE = 35;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_START_STATE__BASE_STATE = COM_STATE__BASE_STATE;

	/**
	 * The feature id for the '<em><b>In Vars</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_START_STATE__IN_VARS = COM_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Toks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_START_STATE__IN_TOKS = COM_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Pseudostate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_START_STATE__BASE_PSEUDOSTATE = COM_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>COM Start State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_START_STATE_FEATURE_COUNT = COM_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>COM Start State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_START_STATE_OPERATION_COUNT = COM_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl <em>COM End State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMEndState()
	 * @generated
	 */
	int COM_END_STATE = 36;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_END_STATE__BASE_STATE = COM_STATE__BASE_STATE;

	/**
	 * The feature id for the '<em><b>Out Vars</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_END_STATE__OUT_VARS = COM_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_END_STATE__BASE_FINAL_STATE = COM_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out toks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_END_STATE__OUT_TOKS = COM_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>COM End State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_END_STATE_FEATURE_COUNT = COM_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>COM End State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_END_STATE_OPERATION_COUNT = COM_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl <em>Token Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getTokenSelector()
	 * @generated
	 */
	int TOKEN_SELECTOR = 37;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Select All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTOR__SELECT_ALL = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTOR__PORT = 2;

	/**
	 * The number of structural features of the '<em>Token Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.Declared_TypeImpl <em>Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.Declared_TypeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getDeclared_Type()
	 * @generated
	 */
	int DECLARED_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ACS_TypeImpl <em>ACS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ACS_TypeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getACS_Type()
	 * @generated
	 */
	int ACS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_TYPE__STRUCTURE = FULL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_TYPE__CONSTRAINT = FULL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ACS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_TYPE_FEATURE_COUNT = FULL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ACS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_TYPE_OPERATION_COUNT = FULL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.TypeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 40;

	/**
	 * The feature id for the '<em><b>Type reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Fundamental type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FUNDAMENTAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SYMBOL = 3;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TABLE = 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Onlyonestructure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ONLYONESTRUCTURE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.Type_ReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.Type_ReferenceImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getType_Reference()
	 * @generated
	 */
	int TYPE_REFERENCE = 41;

	/**
	 * The feature id for the '<em><b>Referenced type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__REFERENCED_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.NullableImpl <em>Nullable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.NullableImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getNullable()
	 * @generated
	 */
	int NULLABLE = 42;

	/**
	 * The feature id for the '<em><b>Nullable base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLABLE__NULLABLE_BASE = 0;

	/**
	 * The number of structural features of the '<em>Nullable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nullable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULLABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.EnumerationImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 43;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Noduplicatenames</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___NODUPLICATENAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ArrayImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 44;

	/**
	 * The feature id for the '<em><b>Dimension base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DIMENSION_BASE = 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.RecordImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 45;

	/**
	 * The feature id for the '<em><b>Table base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TABLE_BASE = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Basetypeis Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD___BASETYPEIS_RECORD__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Noduplicatefields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD___NODUPLICATEFIELDS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.FieldImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 46;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Field type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ConstraintImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 47;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.PathImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 48;

	/**
	 * The feature id for the '<em><b>Fieldpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FIELDPATH = 0;

	/**
	 * The feature id for the '<em><b>Basepath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__BASEPATH = 1;

	/**
	 * The feature id for the '<em><b>Elementpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ELEMENTPATH = 2;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Onlyonepath</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___ONLYONEPATH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.FieldPathImpl <em>Field Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.FieldPathImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFieldPath()
	 * @generated
	 */
	int FIELD_PATH = 49;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PATH__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Field Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.BasePathImpl <em>Base Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.BasePathImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getBasePath()
	 * @generated
	 */
	int BASE_PATH = 50;

	/**
	 * The number of structural features of the '<em>Base Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PATH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ElementPathImpl <em>Element Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ElementPathImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getElementPath()
	 * @generated
	 */
	int ELEMENT_PATH = 51;

	/**
	 * The number of structural features of the '<em>Element Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PATH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 52;

	/**
	 * The feature id for the '<em><b>Symbol range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SYMBOL_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PRECISION = 1;

	/**
	 * The feature id for the '<em><b>Num range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NUM_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Char range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHAR_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Array size range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ARRAY_SIZE_RANGE = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Onlyoneproperty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ONLYONEPROPERTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SymbolRangeImpl <em>Symbol Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.SymbolRangeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSymbolRange()
	 * @generated
	 */
	int SYMBOL_RANGE = 53;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_RANGE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Symbol Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_RANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbol Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PrecisionImpl <em>Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.PrecisionImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPrecision()
	 * @generated
	 */
	int PRECISION = 54;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECISION__PRECISION = 0;

	/**
	 * The number of structural features of the '<em>Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECISION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Nonnegative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECISION___NONNEGATIVE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECISION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.NumRangeImpl <em>Num Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.NumRangeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getNumRange()
	 * @generated
	 */
	int NUM_RANGE = 55;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_RANGE__MAX = 1;

	/**
	 * The number of structural features of the '<em>Num Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_RANGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Propernumrange</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_RANGE___PROPERNUMRANGE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Num Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_RANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CharRangeImpl <em>Char Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.CharRangeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCharRange()
	 * @generated
	 */
	int CHAR_RANGE = 56;

	/**
	 * The feature id for the '<em><b>Char Group Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_RANGE__CHAR_GROUP_REGEX = 0;

	/**
	 * The number of structural features of the '<em>Char Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_RANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Char Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ArraySizeRangeImpl <em>Array Size Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ArraySizeRangeImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getArraySizeRange()
	 * @generated
	 */
	int ARRAY_SIZE_RANGE = 57;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SIZE_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SIZE_RANGE__MAX = 1;

	/**
	 * The number of structural features of the '<em>Array Size Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SIZE_RANGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Propersizerange</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SIZE_RANGE___PROPERSIZERANGE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Array Size Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SIZE_RANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.VoidImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 58;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = FULL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = FULL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ACS_ModelImpl <em>ACS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.impl.ACS_ModelImpl
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getACS_Model()
	 * @generated
	 */
	int ACS_MODEL = 59;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_MODEL__BASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_MODEL__DEPENDENCIES = 1;

	/**
	 * The number of structural features of the '<em>ACS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ACS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.ConnectionTypes <em>Connection Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.ConnectionTypes
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getConnectionTypes()
	 * @generated
	 */
	int CONNECTION_TYPES = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.acs.profile.model.Fundamental_Types <em>Fundamental Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.acs.profile.model.Fundamental_Types
	 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFundamental_Types()
	 * @generated
	 */
	int FUNDAMENTAL_TYPES = 61;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.LinkHolder <em>Link Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Holder</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkHolder
	 * @generated
	 */
	EClass getLinkHolder();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.LinkHolder#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkHolder#getBase_Component()
	 * @see #getLinkHolder()
	 * @generated
	 */
	EReference getLinkHolder_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ActionTransition <em>Action Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Transition</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ActionTransition
	 * @generated
	 */
	EClass getActionTransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.ActionTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ActionTransition#getBase_Transition()
	 * @see #getActionTransition()
	 * @generated
	 */
	EReference getActionTransition_Base_Transition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.InvocationTransition <em>Invocation Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Transition</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.InvocationTransition
	 * @generated
	 */
	EClass getInvocationTransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.InvocationTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.InvocationTransition#getBase_Transition()
	 * @see #getInvocationTransition()
	 * @generated
	 */
	EReference getInvocationTransition_Base_Transition();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.InvocationTransition#Noncycliclocal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Noncycliclocal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Noncycliclocal</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.InvocationTransition#Noncycliclocal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInvocationTransition__Noncycliclocal__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.Subsystem#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Subsystem#getCardinality()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.System#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.System#getBase_Component()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.AtomicSystem <em>Atomic System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic System</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.AtomicSystem
	 * @generated
	 */
	EClass getAtomicSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection <em>Link Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Connection</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkConnection
	 * @generated
	 */
	EClass getLinkConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getDirectionality <em>Directionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directionality</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkConnection#getDirectionality()
	 * @see #getLinkConnection()
	 * @generated
	 */
	EAttribute getLinkConnection_Directionality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkConnection#getCardinality()
	 * @see #getLinkConnection()
	 * @generated
	 */
	EAttribute getLinkConnection_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Connector()
	 * @see #getLinkConnection()
	 * @generated
	 */
	EReference getLinkConnection_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkConnection#getBase_Association()
	 * @see #getLinkConnection()
	 * @generated
	 */
	EReference getLinkConnection_Base_Association();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.SoI <em>So I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So I</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.SoI
	 * @generated
	 */
	EClass getSoI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.Reference#getReferenced_soi <em>Referenced soi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced soi</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Reference#getReferenced_soi()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Referenced_soi();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.InterfaceConnection <em>Interface Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connection</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.InterfaceConnection
	 * @generated
	 */
	EClass getInterfaceConnection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.InterfaceConnection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.InterfaceConnection#getBase_Connector()
	 * @see #getInterfaceConnection()
	 * @generated
	 */
	EReference getInterfaceConnection_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.InterfaceConnection#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.InterfaceConnection#getBase_Association()
	 * @see #getInterfaceConnection()
	 * @generated
	 */
	EReference getInterfaceConnection_Base_Association();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.EventDeclaration <em>Event Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Declaration</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.EventDeclaration
	 * @generated
	 */
	EClass getEventDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.EventDeclaration#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.EventDeclaration#getBase_StateMachine()
	 * @see #getEventDeclaration()
	 * @generated
	 */
	EReference getEventDeclaration_Base_StateMachine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.Controller#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Controller#getBase_StateMachine()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Base_StateMachine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.MainMachine <em>Main Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.MainMachine
	 * @generated
	 */
	EClass getMainMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getOut_typs <em>Out typs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out typs</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.MainMachine#getOut_typs()
	 * @see #getMainMachine()
	 * @generated
	 */
	EReference getMainMachine_Out_typs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getOut_toks <em>Out toks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out toks</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.MainMachine#getOut_toks()
	 * @see #getMainMachine()
	 * @generated
	 */
	EReference getMainMachine_Out_toks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getIn_toks <em>In toks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In toks</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.MainMachine#getIn_toks()
	 * @see #getMainMachine()
	 * @generated
	 */
	EReference getMainMachine_In_toks();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.MainMachine#getLink_hub <em>Link hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link hub</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.MainMachine#getLink_hub()
	 * @see #getMainMachine()
	 * @generated
	 */
	EReference getMainMachine_Link_hub();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ExplicitMachine <em>Explicit Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ExplicitMachine
	 * @generated
	 */
	EClass getExplicitMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.ExplicitMachine#getFunc_decls <em>Func decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Func decls</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ExplicitMachine#getFunc_decls()
	 * @see #getExplicitMachine()
	 * @generated
	 */
	EReference getExplicitMachine_Func_decls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.Machine#getBase_Region <em>Base Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Region</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Machine#getBase_Region()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Base_Region();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.FuncDecl <em>Func Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Func Decl</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.FuncDecl
	 * @generated
	 */
	EClass getFuncDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.FuncDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.FuncDecl#getName()
	 * @see #getFuncDecl()
	 * @generated
	 */
	EAttribute getFuncDecl_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.TypInOut <em>Typ In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typ In Out</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TypInOut
	 * @generated
	 */
	EClass getTypInOut();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.TypInOut#getOut_typs <em>Out typs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out typs</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TypInOut#getOut_typs()
	 * @see #getTypInOut()
	 * @generated
	 */
	EReference getTypInOut_Out_typs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.TypInOut#getIn_typs <em>In typs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In typs</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TypInOut#getIn_typs()
	 * @see #getTypInOut()
	 * @generated
	 */
	EReference getTypInOut_In_typs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Full_Type <em>Full Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Full_Type
	 * @generated
	 */
	EClass getFull_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.TokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenType
	 * @generated
	 */
	EClass getTokenType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.TokenType#isIsGroup <em>Is Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Group</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenType#isIsGroup()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_IsGroup();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.TokenType#getSubsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsystem</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenType#getSubsystem()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Subsystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.Port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Port#getBase_Port()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.LinkHub <em>Link Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Hub</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkHub
	 * @generated
	 */
	EClass getLinkHub();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.LinkHub#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.LinkHub#getBase_Port()
	 * @see #getLinkHub()
	 * @generated
	 */
	EReference getLinkHub_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Initiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiator</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Initiator
	 * @generated
	 */
	EClass getInitiator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.Subscriber#getOut_typs <em>Out typs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out typs</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Subscriber#getOut_typs()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Out_typs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.Publisher#getIn_typs <em>In typs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In typs</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Publisher#getIn_typs()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_In_typs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.SubMachine <em>Sub Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.SubMachine
	 * @generated
	 */
	EClass getSubMachine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ControllerBody <em>Controller Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Body</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ControllerBody
	 * @generated
	 */
	EClass getControllerBody();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.ControllerBody#getBase_Region <em>Base Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Region</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ControllerBody#getBase_Region()
	 * @see #getControllerBody()
	 * @generated
	 */
	EReference getControllerBody_Base_Region();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.COMState <em>COM State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COM State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMState
	 * @generated
	 */
	EClass getCOMState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.COMState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMState#getBase_State()
	 * @see #getCOMState()
	 * @generated
	 */
	EReference getCOMState_Base_State();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.CONState <em>CON State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CON State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONState
	 * @generated
	 */
	EClass getCONState();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.acs.profile.model.CONState#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tokens</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONState#getTokens()
	 * @see #getCONState()
	 * @generated
	 */
	EAttribute getCONState_Tokens();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.CONState#isLockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lockable</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONState#isLockable()
	 * @see #getCONState()
	 * @generated
	 */
	EAttribute getCONState_Lockable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ImplicitMachine <em>Implicit Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Machine</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ImplicitMachine
	 * @generated
	 */
	EClass getImplicitMachine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.CONIntermediateState <em>CON Intermediate State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CON Intermediate State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONIntermediateState
	 * @generated
	 */
	EClass getCONIntermediateState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.CONIntermediateState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONIntermediateState#getBase_State()
	 * @see #getCONIntermediateState()
	 * @generated
	 */
	EReference getCONIntermediateState_Base_State();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.COMIntermediateState <em>COM Intermediate State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COM Intermediate State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMIntermediateState
	 * @generated
	 */
	EClass getCOMIntermediateState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.CONStartState <em>CON Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CON Start State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONStartState
	 * @generated
	 */
	EClass getCONStartState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.CONStartState#getBase_Pseudostate <em>Base Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Pseudostate</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CONStartState#getBase_Pseudostate()
	 * @see #getCONStartState()
	 * @generated
	 */
	EReference getCONStartState_Base_Pseudostate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.COMStartState <em>COM Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COM Start State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMStartState
	 * @generated
	 */
	EClass getCOMStartState();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getInVars <em>In Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Vars</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMStartState#getInVars()
	 * @see #getCOMStartState()
	 * @generated
	 */
	EAttribute getCOMStartState_InVars();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getInToks <em>In Toks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Toks</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMStartState#getInToks()
	 * @see #getCOMStartState()
	 * @generated
	 */
	EAttribute getCOMStartState_InToks();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.COMStartState#getBase_Pseudostate <em>Base Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Pseudostate</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMStartState#getBase_Pseudostate()
	 * @see #getCOMStartState()
	 * @generated
	 */
	EReference getCOMStartState_Base_Pseudostate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.COMEndState <em>COM End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COM End State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMEndState
	 * @generated
	 */
	EClass getCOMEndState();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getOutVars <em>Out Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Out Vars</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMEndState#getOutVars()
	 * @see #getCOMEndState()
	 * @generated
	 */
	EAttribute getCOMEndState_OutVars();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getBase_FinalState <em>Base Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Final State</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMEndState#getBase_FinalState()
	 * @see #getCOMEndState()
	 * @generated
	 */
	EReference getCOMEndState_Base_FinalState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.COMEndState#getOut_toks <em>Out toks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out toks</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.COMEndState#getOut_toks()
	 * @see #getCOMEndState()
	 * @generated
	 */
	EReference getCOMEndState_Out_toks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.TokenSelector <em>Token Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Selector</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenSelector
	 * @generated
	 */
	EClass getTokenSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.TokenSelector#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenSelector#getID()
	 * @see #getTokenSelector()
	 * @generated
	 */
	EAttribute getTokenSelector_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.TokenSelector#isSelectAll <em>Select All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select All</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenSelector#isSelectAll()
	 * @see #getTokenSelector()
	 * @generated
	 */
	EAttribute getTokenSelector_SelectAll();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.TokenSelector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.TokenSelector#getPort()
	 * @see #getTokenSelector()
	 * @generated
	 */
	EReference getTokenSelector_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Declared_Type <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Declared_Type
	 * @generated
	 */
	EClass getDeclared_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.Declared_Type#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Declared_Type#getBase_Class()
	 * @see #getDeclared_Type()
	 * @generated
	 */
	EReference getDeclared_Type_Base_Class();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Declared_Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Declared_Type#getType()
	 * @see #getDeclared_Type()
	 * @generated
	 */
	EReference getDeclared_Type_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ACS_Type <em>ACS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACS Type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ACS_Type
	 * @generated
	 */
	EClass getACS_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.ACS_Type#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ACS_Type#getStructure()
	 * @see #getACS_Type()
	 * @generated
	 */
	EReference getACS_Type_Structure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.ACS_Type#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ACS_Type#getConstraint()
	 * @see #getACS_Type()
	 * @generated
	 */
	EReference getACS_Type_Constraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Type#getType_reference <em>Type reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type reference</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#getType_reference()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Type_reference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.Type#getFundamental_type <em>Fundamental type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fundamental type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#getFundamental_type()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Fundamental_type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Type#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nullable</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#getNullable()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Nullable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Type#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbol</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#getSymbol()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Symbol();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Type#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#getDimension()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Type#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#getTable()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Table();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Type#Onlyonestructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Onlyonestructure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Onlyonestructure</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Type#Onlyonestructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getType__Onlyonestructure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Type_Reference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type_Reference
	 * @generated
	 */
	EClass getType_Reference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.Type_Reference#getReferenced_type <em>Referenced type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Type_Reference#getReferenced_type()
	 * @see #getType_Reference()
	 * @generated
	 */
	EReference getType_Reference_Referenced_type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Nullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nullable</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Nullable
	 * @generated
	 */
	EClass getNullable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Nullable#getNullable_base <em>Nullable base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nullable base</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Nullable#getNullable_base()
	 * @see #getNullable()
	 * @generated
	 */
	EReference getNullable_Nullable_base();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.acs.profile.model.Enumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Enumeration#getElements()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Elements();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Enumeration#Noduplicatenames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Noduplicatenames</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Noduplicatenames</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Enumeration#Noduplicatenames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEnumeration__Noduplicatenames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Array#getDimension_base <em>Dimension base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension base</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Array#getDimension_base()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Dimension_base();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Record#getTable_base <em>Table base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table base</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Record#getTable_base()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Table_base();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.Record#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Record#getFields()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Fields();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Record#BasetypeisRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Basetypeis Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Basetypeis Record</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Record#BasetypeisRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRecord__BasetypeisRecord__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Record#Noduplicatefields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Noduplicatefields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Noduplicatefields</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Record#Noduplicatefields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRecord__Noduplicatefields__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.Field#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Field#getFieldName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_FieldName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Field#getField_type <em>Field type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field type</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Field#getField_type()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Field_type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.acs.profile.model.Constraint#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Constraint#getPath()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Path();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Constraint#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Constraint#getProperty()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Path#getFieldpath <em>Fieldpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fieldpath</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Path#getFieldpath()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Fieldpath();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Path#getBasepath <em>Basepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basepath</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Path#getBasepath()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Basepath();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Path#getElementpath <em>Elementpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elementpath</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Path#getElementpath()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Elementpath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Path#Onlyonepath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Onlyonepath</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Onlyonepath</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Path#Onlyonepath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPath__Onlyonepath__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.FieldPath <em>Field Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Path</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.FieldPath
	 * @generated
	 */
	EClass getFieldPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.FieldPath#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.FieldPath#getField()
	 * @see #getFieldPath()
	 * @generated
	 */
	EAttribute getFieldPath_Field();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.BasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Path</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.BasePath
	 * @generated
	 */
	EClass getBasePath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ElementPath <em>Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Path</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ElementPath
	 * @generated
	 */
	EClass getElementPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Property#getSymbol_range <em>Symbol range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbol range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Property#getSymbol_range()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Symbol_range();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Property#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precision</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Property#getPrecision()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Precision();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Property#getNum_range <em>Num range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Property#getNum_range()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Num_range();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Property#getChar_range <em>Char range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Property#getChar_range()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Char_range();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.acs.profile.model.Property#getArray_size_range <em>Array size range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array size range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Property#getArray_size_range()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Array_size_range();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Property#Onlyoneproperty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Onlyoneproperty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Onlyoneproperty</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Property#Onlyoneproperty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProperty__Onlyoneproperty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.SymbolRange <em>Symbol Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.SymbolRange
	 * @generated
	 */
	EClass getSymbolRange();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.acs.profile.model.SymbolRange#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.SymbolRange#getElements()
	 * @see #getSymbolRange()
	 * @generated
	 */
	EAttribute getSymbolRange_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Precision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precision</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Precision
	 * @generated
	 */
	EClass getPrecision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.Precision#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Precision#getPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	EAttribute getPrecision_Precision();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.Precision#Nonnegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nonnegative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nonnegative</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.Precision#Nonnegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrecision__Nonnegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.NumRange <em>Num Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.NumRange
	 * @generated
	 */
	EClass getNumRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.NumRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.NumRange#getMin()
	 * @see #getNumRange()
	 * @generated
	 */
	EAttribute getNumRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.NumRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.NumRange#getMax()
	 * @see #getNumRange()
	 * @generated
	 */
	EAttribute getNumRange_Max();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.NumRange#Propernumrange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Propernumrange</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propernumrange</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.NumRange#Propernumrange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNumRange__Propernumrange__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.CharRange <em>Char Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CharRange
	 * @generated
	 */
	EClass getCharRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.CharRange#getCharGroupRegex <em>Char Group Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Group Regex</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.CharRange#getCharGroupRegex()
	 * @see #getCharRange()
	 * @generated
	 */
	EAttribute getCharRange_CharGroupRegex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ArraySizeRange <em>Array Size Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Size Range</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ArraySizeRange
	 * @generated
	 */
	EClass getArraySizeRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.ArraySizeRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ArraySizeRange#getMin()
	 * @see #getArraySizeRange()
	 * @generated
	 */
	EAttribute getArraySizeRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.acs.profile.model.ArraySizeRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ArraySizeRange#getMax()
	 * @see #getArraySizeRange()
	 * @generated
	 */
	EAttribute getArraySizeRange_Max();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.acs.profile.model.ArraySizeRange#Propersizerange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Propersizerange</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propersizerange</em>' operation.
	 * @see org.eclipse.papyrus.acs.profile.model.ArraySizeRange#Propersizerange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArraySizeRange__Propersizerange__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.acs.profile.model.ACS_Model <em>ACS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACS Model</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ACS_Model
	 * @generated
	 */
	EClass getACS_Model();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.acs.profile.model.ACS_Model#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ACS_Model#getBase_Model()
	 * @see #getACS_Model()
	 * @generated
	 */
	EReference getACS_Model_Base_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.acs.profile.model.ACS_Model#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ACS_Model#getDependencies()
	 * @see #getACS_Model()
	 * @generated
	 */
	EReference getACS_Model_Dependencies();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.acs.profile.model.ConnectionTypes <em>Connection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Types</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.ConnectionTypes
	 * @generated
	 */
	EEnum getConnectionTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.acs.profile.model.Fundamental_Types <em>Fundamental Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fundamental Types</em>'.
	 * @see org.eclipse.papyrus.acs.profile.model.Fundamental_Types
	 * @generated
	 */
	EEnum getFundamental_Types();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AcsProfileFactory getAcsProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.LinkHolderImpl <em>Link Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.LinkHolderImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getLinkHolder()
		 * @generated
		 */
		EClass LINK_HOLDER = eINSTANCE.getLinkHolder();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HOLDER__BASE_COMPONENT = eINSTANCE.getLinkHolder_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ActionTransitionImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getActionTransition()
		 * @generated
		 */
		EClass ACTION_TRANSITION = eINSTANCE.getActionTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TRANSITION__BASE_TRANSITION = eINSTANCE.getActionTransition_Base_Transition();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.InvocationTransitionImpl <em>Invocation Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.InvocationTransitionImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getInvocationTransition()
		 * @generated
		 */
		EClass INVOCATION_TRANSITION = eINSTANCE.getInvocationTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_TRANSITION__BASE_TRANSITION = eINSTANCE.getInvocationTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>Noncycliclocal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVOCATION_TRANSITION___NONCYCLICLOCAL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInvocationTransition__Noncycliclocal__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.CompositeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.SubsystemImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSYSTEM__CARDINALITY = eINSTANCE.getSubsystem_Cardinality();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.SystemImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BASE_COMPONENT = eINSTANCE.getSystem_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ContainerImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.AtomicSystemImpl <em>Atomic System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AtomicSystemImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getAtomicSystem()
		 * @generated
		 */
		EClass ATOMIC_SYSTEM = eINSTANCE.getAtomicSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.LinkConnectionImpl <em>Link Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.LinkConnectionImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getLinkConnection()
		 * @generated
		 */
		EClass LINK_CONNECTION = eINSTANCE.getLinkConnection();

		/**
		 * The meta object literal for the '<em><b>Directionality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONNECTION__DIRECTIONALITY = eINSTANCE.getLinkConnection_Directionality();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CONNECTION__CARDINALITY = eINSTANCE.getLinkConnection_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONNECTION__BASE_CONNECTOR = eINSTANCE.getLinkConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_CONNECTION__BASE_ASSOCIATION = eINSTANCE.getLinkConnection_Base_Association();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SoIImpl <em>So I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.SoIImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSoI()
		 * @generated
		 */
		EClass SO_I = eINSTANCE.getSoI();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ReferenceImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Referenced soi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCED_SOI = eINSTANCE.getReference_Referenced_soi();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.InterfaceConnectionImpl <em>Interface Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.InterfaceConnectionImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getInterfaceConnection()
		 * @generated
		 */
		EClass INTERFACE_CONNECTION = eINSTANCE.getInterfaceConnection();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION__BASE_CONNECTOR = eINSTANCE.getInterfaceConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION__BASE_ASSOCIATION = eINSTANCE.getInterfaceConnection_Base_Association();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.EventDeclarationImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getEventDeclaration()
		 * @generated
		 */
		EClass EVENT_DECLARATION = eINSTANCE.getEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DECLARATION__BASE_STATE_MACHINE = eINSTANCE.getEventDeclaration_Base_StateMachine();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ControllerImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__BASE_STATE_MACHINE = eINSTANCE.getController_Base_StateMachine();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl <em>Main Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.MainMachineImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getMainMachine()
		 * @generated
		 */
		EClass MAIN_MACHINE = eINSTANCE.getMainMachine();

		/**
		 * The meta object literal for the '<em><b>Out typs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_MACHINE__OUT_TYPS = eINSTANCE.getMainMachine_Out_typs();

		/**
		 * The meta object literal for the '<em><b>Out toks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_MACHINE__OUT_TOKS = eINSTANCE.getMainMachine_Out_toks();

		/**
		 * The meta object literal for the '<em><b>In toks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_MACHINE__IN_TOKS = eINSTANCE.getMainMachine_In_toks();

		/**
		 * The meta object literal for the '<em><b>Link hub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_MACHINE__LINK_HUB = eINSTANCE.getMainMachine_Link_hub();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ExplicitMachineImpl <em>Explicit Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ExplicitMachineImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getExplicitMachine()
		 * @generated
		 */
		EClass EXPLICIT_MACHINE = eINSTANCE.getExplicitMachine();

		/**
		 * The meta object literal for the '<em><b>Func decls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_MACHINE__FUNC_DECLS = eINSTANCE.getExplicitMachine_Func_decls();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.MachineImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Base Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__BASE_REGION = eINSTANCE.getMachine_Base_Region();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.FuncDeclImpl <em>Func Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.FuncDeclImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFuncDecl()
		 * @generated
		 */
		EClass FUNC_DECL = eINSTANCE.getFuncDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNC_DECL__NAME = eINSTANCE.getFuncDecl_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TypInOutImpl <em>Typ In Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.TypInOutImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getTypInOut()
		 * @generated
		 */
		EClass TYP_IN_OUT = eINSTANCE.getTypInOut();

		/**
		 * The meta object literal for the '<em><b>Out typs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYP_IN_OUT__OUT_TYPS = eINSTANCE.getTypInOut_Out_typs();

		/**
		 * The meta object literal for the '<em><b>In typs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYP_IN_OUT__IN_TYPS = eINSTANCE.getTypInOut_In_typs();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.Full_TypeImpl <em>Full Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.Full_TypeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFull_Type()
		 * @generated
		 */
		EClass FULL_TYPE = eINSTANCE.getFull_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TokenTypeImpl <em>Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.TokenTypeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getTokenType()
		 * @generated
		 */
		EClass TOKEN_TYPE = eINSTANCE.getTokenType();

		/**
		 * The meta object literal for the '<em><b>Is Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__IS_GROUP = eINSTANCE.getTokenType_IsGroup();

		/**
		 * The meta object literal for the '<em><b>Subsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__SUBSYSTEM = eINSTANCE.getTokenType_Subsystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.PortImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BASE_PORT = eINSTANCE.getPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.LinkHubImpl <em>Link Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.LinkHubImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getLinkHub()
		 * @generated
		 */
		EClass LINK_HUB = eINSTANCE.getLinkHub();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HUB__BASE_PORT = eINSTANCE.getLinkHub_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.InitiatorImpl <em>Initiator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.InitiatorImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getInitiator()
		 * @generated
		 */
		EClass INITIATOR = eINSTANCE.getInitiator();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.HandlerImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.SubscriberImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Out typs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__OUT_TYPS = eINSTANCE.getSubscriber_Out_typs();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.PublisherImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>In typs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__IN_TYPS = eINSTANCE.getPublisher_In_typs();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SubMachineImpl <em>Sub Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.SubMachineImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSubMachine()
		 * @generated
		 */
		EClass SUB_MACHINE = eINSTANCE.getSubMachine();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ControllerBodyImpl <em>Controller Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ControllerBodyImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getControllerBody()
		 * @generated
		 */
		EClass CONTROLLER_BODY = eINSTANCE.getControllerBody();

		/**
		 * The meta object literal for the '<em><b>Base Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_BODY__BASE_REGION = eINSTANCE.getControllerBody_Base_Region();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMStateImpl <em>COM State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.COMStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMState()
		 * @generated
		 */
		EClass COM_STATE = eINSTANCE.getCOMState();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_STATE__BASE_STATE = eINSTANCE.getCOMState_Base_State();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CONStateImpl <em>CON State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.CONStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCONState()
		 * @generated
		 */
		EClass CON_STATE = eINSTANCE.getCONState();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CON_STATE__TOKENS = eINSTANCE.getCONState_Tokens();

		/**
		 * The meta object literal for the '<em><b>Lockable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CON_STATE__LOCKABLE = eINSTANCE.getCONState_Lockable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ImplicitMachineImpl <em>Implicit Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ImplicitMachineImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getImplicitMachine()
		 * @generated
		 */
		EClass IMPLICIT_MACHINE = eINSTANCE.getImplicitMachine();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CONIntermediateStateImpl <em>CON Intermediate State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.CONIntermediateStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCONIntermediateState()
		 * @generated
		 */
		EClass CON_INTERMEDIATE_STATE = eINSTANCE.getCONIntermediateState();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CON_INTERMEDIATE_STATE__BASE_STATE = eINSTANCE.getCONIntermediateState_Base_State();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMIntermediateStateImpl <em>COM Intermediate State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.COMIntermediateStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMIntermediateState()
		 * @generated
		 */
		EClass COM_INTERMEDIATE_STATE = eINSTANCE.getCOMIntermediateState();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CONStartStateImpl <em>CON Start State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.CONStartStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCONStartState()
		 * @generated
		 */
		EClass CON_START_STATE = eINSTANCE.getCONStartState();

		/**
		 * The meta object literal for the '<em><b>Base Pseudostate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CON_START_STATE__BASE_PSEUDOSTATE = eINSTANCE.getCONStartState_Base_Pseudostate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl <em>COM Start State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.COMStartStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMStartState()
		 * @generated
		 */
		EClass COM_START_STATE = eINSTANCE.getCOMStartState();

		/**
		 * The meta object literal for the '<em><b>In Vars</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_START_STATE__IN_VARS = eINSTANCE.getCOMStartState_InVars();

		/**
		 * The meta object literal for the '<em><b>In Toks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_START_STATE__IN_TOKS = eINSTANCE.getCOMStartState_InToks();

		/**
		 * The meta object literal for the '<em><b>Base Pseudostate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_START_STATE__BASE_PSEUDOSTATE = eINSTANCE.getCOMStartState_Base_Pseudostate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl <em>COM End State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.COMEndStateImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCOMEndState()
		 * @generated
		 */
		EClass COM_END_STATE = eINSTANCE.getCOMEndState();

		/**
		 * The meta object literal for the '<em><b>Out Vars</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_END_STATE__OUT_VARS = eINSTANCE.getCOMEndState_OutVars();

		/**
		 * The meta object literal for the '<em><b>Base Final State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_END_STATE__BASE_FINAL_STATE = eINSTANCE.getCOMEndState_Base_FinalState();

		/**
		 * The meta object literal for the '<em><b>Out toks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_END_STATE__OUT_TOKS = eINSTANCE.getCOMEndState_Out_toks();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl <em>Token Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.TokenSelectorImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getTokenSelector()
		 * @generated
		 */
		EClass TOKEN_SELECTOR = eINSTANCE.getTokenSelector();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_SELECTOR__ID = eINSTANCE.getTokenSelector_ID();

		/**
		 * The meta object literal for the '<em><b>Select All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_SELECTOR__SELECT_ALL = eINSTANCE.getTokenSelector_SelectAll();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_SELECTOR__PORT = eINSTANCE.getTokenSelector_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.Declared_TypeImpl <em>Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.Declared_TypeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getDeclared_Type()
		 * @generated
		 */
		EClass DECLARED_TYPE = eINSTANCE.getDeclared_Type();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__BASE_CLASS = eINSTANCE.getDeclared_Type_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__TYPE = eINSTANCE.getDeclared_Type_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ACS_TypeImpl <em>ACS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ACS_TypeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getACS_Type()
		 * @generated
		 */
		EClass ACS_TYPE = eINSTANCE.getACS_Type();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACS_TYPE__STRUCTURE = eINSTANCE.getACS_Type_Structure();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACS_TYPE__CONSTRAINT = eINSTANCE.getACS_Type_Constraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.TypeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TYPE_REFERENCE = eINSTANCE.getType_Type_reference();

		/**
		 * The meta object literal for the '<em><b>Fundamental type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__FUNDAMENTAL_TYPE = eINSTANCE.getType_Fundamental_type();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__NULLABLE = eINSTANCE.getType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SYMBOL = eINSTANCE.getType_Symbol();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DIMENSION = eINSTANCE.getType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TABLE = eINSTANCE.getType_Table();

		/**
		 * The meta object literal for the '<em><b>Onlyonestructure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___ONLYONESTRUCTURE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getType__Onlyonestructure__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.Type_ReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.Type_ReferenceImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getType_Reference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getType_Reference();

		/**
		 * The meta object literal for the '<em><b>Referenced type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__REFERENCED_TYPE = eINSTANCE.getType_Reference_Referenced_type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.NullableImpl <em>Nullable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.NullableImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getNullable()
		 * @generated
		 */
		EClass NULLABLE = eINSTANCE.getNullable();

		/**
		 * The meta object literal for the '<em><b>Nullable base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULLABLE__NULLABLE_BASE = eINSTANCE.getNullable_Nullable_base();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.EnumerationImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__ELEMENTS = eINSTANCE.getEnumeration_Elements();

		/**
		 * The meta object literal for the '<em><b>Noduplicatenames</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___NODUPLICATENAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEnumeration__Noduplicatenames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ArrayImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Dimension base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__DIMENSION_BASE = eINSTANCE.getArray_Dimension_base();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.RecordImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Table base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__TABLE_BASE = eINSTANCE.getRecord_Table_base();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__FIELDS = eINSTANCE.getRecord_Fields();

		/**
		 * The meta object literal for the '<em><b>Basetypeis Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORD___BASETYPEIS_RECORD__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRecord__BasetypeisRecord__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Noduplicatefields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORD___NODUPLICATEFIELDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRecord__Noduplicatefields__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.FieldImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIELD_NAME = eINSTANCE.getField_FieldName();

		/**
		 * The meta object literal for the '<em><b>Field type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FIELD_TYPE = eINSTANCE.getField_Field_type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ConstraintImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PATH = eINSTANCE.getConstraint_Path();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__PROPERTY = eINSTANCE.getConstraint_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.PathImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Fieldpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__FIELDPATH = eINSTANCE.getPath_Fieldpath();

		/**
		 * The meta object literal for the '<em><b>Basepath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__BASEPATH = eINSTANCE.getPath_Basepath();

		/**
		 * The meta object literal for the '<em><b>Elementpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__ELEMENTPATH = eINSTANCE.getPath_Elementpath();

		/**
		 * The meta object literal for the '<em><b>Onlyonepath</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___ONLYONEPATH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPath__Onlyonepath__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.FieldPathImpl <em>Field Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.FieldPathImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFieldPath()
		 * @generated
		 */
		EClass FIELD_PATH = eINSTANCE.getFieldPath();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_PATH__FIELD = eINSTANCE.getFieldPath_Field();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.BasePathImpl <em>Base Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.BasePathImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getBasePath()
		 * @generated
		 */
		EClass BASE_PATH = eINSTANCE.getBasePath();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ElementPathImpl <em>Element Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ElementPathImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getElementPath()
		 * @generated
		 */
		EClass ELEMENT_PATH = eINSTANCE.getElementPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.PropertyImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Symbol range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SYMBOL_RANGE = eINSTANCE.getProperty_Symbol_range();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PRECISION = eINSTANCE.getProperty_Precision();

		/**
		 * The meta object literal for the '<em><b>Num range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__NUM_RANGE = eINSTANCE.getProperty_Num_range();

		/**
		 * The meta object literal for the '<em><b>Char range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CHAR_RANGE = eINSTANCE.getProperty_Char_range();

		/**
		 * The meta object literal for the '<em><b>Array size range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ARRAY_SIZE_RANGE = eINSTANCE.getProperty_Array_size_range();

		/**
		 * The meta object literal for the '<em><b>Onlyoneproperty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___ONLYONEPROPERTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProperty__Onlyoneproperty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.SymbolRangeImpl <em>Symbol Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.SymbolRangeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getSymbolRange()
		 * @generated
		 */
		EClass SYMBOL_RANGE = eINSTANCE.getSymbolRange();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_RANGE__ELEMENTS = eINSTANCE.getSymbolRange_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.PrecisionImpl <em>Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.PrecisionImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getPrecision()
		 * @generated
		 */
		EClass PRECISION = eINSTANCE.getPrecision();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECISION__PRECISION = eINSTANCE.getPrecision_Precision();

		/**
		 * The meta object literal for the '<em><b>Nonnegative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRECISION___NONNEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPrecision__Nonnegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.NumRangeImpl <em>Num Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.NumRangeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getNumRange()
		 * @generated
		 */
		EClass NUM_RANGE = eINSTANCE.getNumRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_RANGE__MIN = eINSTANCE.getNumRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_RANGE__MAX = eINSTANCE.getNumRange_Max();

		/**
		 * The meta object literal for the '<em><b>Propernumrange</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUM_RANGE___PROPERNUMRANGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNumRange__Propernumrange__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.CharRangeImpl <em>Char Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.CharRangeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getCharRange()
		 * @generated
		 */
		EClass CHAR_RANGE = eINSTANCE.getCharRange();

		/**
		 * The meta object literal for the '<em><b>Char Group Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_RANGE__CHAR_GROUP_REGEX = eINSTANCE.getCharRange_CharGroupRegex();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ArraySizeRangeImpl <em>Array Size Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ArraySizeRangeImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getArraySizeRange()
		 * @generated
		 */
		EClass ARRAY_SIZE_RANGE = eINSTANCE.getArraySizeRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SIZE_RANGE__MIN = eINSTANCE.getArraySizeRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SIZE_RANGE__MAX = eINSTANCE.getArraySizeRange_Max();

		/**
		 * The meta object literal for the '<em><b>Propersizerange</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRAY_SIZE_RANGE___PROPERSIZERANGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArraySizeRange__Propersizerange__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.VoidImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.impl.ACS_ModelImpl <em>ACS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.impl.ACS_ModelImpl
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getACS_Model()
		 * @generated
		 */
		EClass ACS_MODEL = eINSTANCE.getACS_Model();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACS_MODEL__BASE_MODEL = eINSTANCE.getACS_Model_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACS_MODEL__DEPENDENCIES = eINSTANCE.getACS_Model_Dependencies();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.ConnectionTypes <em>Connection Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.ConnectionTypes
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getConnectionTypes()
		 * @generated
		 */
		EEnum CONNECTION_TYPES = eINSTANCE.getConnectionTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.acs.profile.model.Fundamental_Types <em>Fundamental Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.acs.profile.model.Fundamental_Types
		 * @see org.eclipse.papyrus.acs.profile.model.impl.AcsProfilePackageImpl#getFundamental_Types()
		 * @generated
		 */
		EEnum FUNDAMENTAL_TYPES = eINSTANCE.getFundamental_Types();

	}

} //AcsProfilePackage
