/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.ACS_Type;
import org.eclipse.papyrus.acs.profile.model.AcsProfileFactory;
import org.eclipse.papyrus.acs.profile.model.AcsProfilePackage;
import org.eclipse.papyrus.acs.profile.model.ActionTransition;
import org.eclipse.papyrus.acs.profile.model.Array;
import org.eclipse.papyrus.acs.profile.model.ArraySizeRange;
import org.eclipse.papyrus.acs.profile.model.AtomicSystem;
import org.eclipse.papyrus.acs.profile.model.BasePath;
import org.eclipse.papyrus.acs.profile.model.COMEndState;
import org.eclipse.papyrus.acs.profile.model.COMIntermediateState;
import org.eclipse.papyrus.acs.profile.model.COMStartState;
import org.eclipse.papyrus.acs.profile.model.COMState;
import org.eclipse.papyrus.acs.profile.model.CONIntermediateState;
import org.eclipse.papyrus.acs.profile.model.CONStartState;
import org.eclipse.papyrus.acs.profile.model.CONState;
import org.eclipse.papyrus.acs.profile.model.CharRange;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.Constraint;
import org.eclipse.papyrus.acs.profile.model.Controller;
import org.eclipse.papyrus.acs.profile.model.ControllerBody;
import org.eclipse.papyrus.acs.profile.model.Declared_Type;
import org.eclipse.papyrus.acs.profile.model.ElementPath;
import org.eclipse.papyrus.acs.profile.model.Enumeration;
import org.eclipse.papyrus.acs.profile.model.EventDeclaration;
import org.eclipse.papyrus.acs.profile.model.ExplicitMachine;
import org.eclipse.papyrus.acs.profile.model.Field;
import org.eclipse.papyrus.acs.profile.model.FieldPath;
import org.eclipse.papyrus.acs.profile.model.Full_Type;
import org.eclipse.papyrus.acs.profile.model.FuncDecl;
import org.eclipse.papyrus.acs.profile.model.Fundamental_Types;
import org.eclipse.papyrus.acs.profile.model.Handler;
import org.eclipse.papyrus.acs.profile.model.ImplicitMachine;
import org.eclipse.papyrus.acs.profile.model.Initiator;
import org.eclipse.papyrus.acs.profile.model.InterfaceConnection;
import org.eclipse.papyrus.acs.profile.model.InvocationTransition;
import org.eclipse.papyrus.acs.profile.model.LinkConnection;
import org.eclipse.papyrus.acs.profile.model.LinkHolder;
import org.eclipse.papyrus.acs.profile.model.LinkHub;
import org.eclipse.papyrus.acs.profile.model.Machine;
import org.eclipse.papyrus.acs.profile.model.MainMachine;
import org.eclipse.papyrus.acs.profile.model.Nullable;
import org.eclipse.papyrus.acs.profile.model.NumRange;
import org.eclipse.papyrus.acs.profile.model.Path;
import org.eclipse.papyrus.acs.profile.model.Port;
import org.eclipse.papyrus.acs.profile.model.Precision;
import org.eclipse.papyrus.acs.profile.model.Property;
import org.eclipse.papyrus.acs.profile.model.Publisher;
import org.eclipse.papyrus.acs.profile.model.Reference;
import org.eclipse.papyrus.acs.profile.model.SoI;
import org.eclipse.papyrus.acs.profile.model.SubMachine;
import org.eclipse.papyrus.acs.profile.model.Subscriber;
import org.eclipse.papyrus.acs.profile.model.Subsystem;
import org.eclipse.papyrus.acs.profile.model.SymbolRange;
import org.eclipse.papyrus.acs.profile.model.TokenSelector;
import org.eclipse.papyrus.acs.profile.model.TokenType;
import org.eclipse.papyrus.acs.profile.model.TypInOut;
import org.eclipse.papyrus.acs.profile.model.Type;
import org.eclipse.papyrus.acs.profile.model.Type_Reference;

import org.eclipse.papyrus.acs.profile.model.util.AcsProfileValidator;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcsProfilePackageImpl extends EPackageImpl implements AcsProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typInOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass full_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkHubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conIntermediateStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comIntermediateStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conStartStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comStartStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comEndStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declared_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acS_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass type_ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySizeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acS_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fundamental_TypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AcsProfilePackageImpl() {
		super(eNS_URI, AcsProfileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AcsProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AcsProfilePackage init() {
		if (isInited) return (AcsProfilePackage)EPackage.Registry.INSTANCE.getEPackage(AcsProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAcsProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AcsProfilePackageImpl theAcsProfilePackage = registeredAcsProfilePackage instanceof AcsProfilePackageImpl ? (AcsProfilePackageImpl)registeredAcsProfilePackage : new AcsProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAcsProfilePackage.createPackageContents();

		// Initialize created meta-data
		theAcsProfilePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAcsProfilePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AcsProfileValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAcsProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AcsProfilePackage.eNS_URI, theAcsProfilePackage);
		return theAcsProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkHolder() {
		return linkHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkHolder_Base_Component() {
		return (EReference)linkHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionTransition() {
		return actionTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionTransition_Base_Transition() {
		return (EReference)actionTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationTransition() {
		return invocationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationTransition_Base_Transition() {
		return (EReference)invocationTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvocationTransition__Noncycliclocal__DiagnosticChain_Map() {
		return invocationTransitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsystem() {
		return subsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_Cardinality() {
		return (EAttribute)subsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Base_Component() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicSystem() {
		return atomicSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkConnection() {
		return linkConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkConnection_Directionality() {
		return (EAttribute)linkConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkConnection_Cardinality() {
		return (EAttribute)linkConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConnection_Base_Connector() {
		return (EReference)linkConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConnection_Base_Association() {
		return (EReference)linkConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoI() {
		return soIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Referenced_soi() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnection() {
		return interfaceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnection_Base_Connector() {
		return (EReference)interfaceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnection_Base_Association() {
		return (EReference)interfaceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDeclaration() {
		return eventDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDeclaration_Base_StateMachine() {
		return (EReference)eventDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Base_StateMachine() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainMachine() {
		return mainMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainMachine_Out_typs() {
		return (EReference)mainMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainMachine_Out_toks() {
		return (EReference)mainMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainMachine_In_toks() {
		return (EReference)mainMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainMachine_Link_hub() {
		return (EReference)mainMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitMachine() {
		return explicitMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplicitMachine_Func_decls() {
		return (EReference)explicitMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Base_Region() {
		return (EReference)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncDecl() {
		return funcDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncDecl_Name() {
		return (EAttribute)funcDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypInOut() {
		return typInOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypInOut_Out_typs() {
		return (EReference)typInOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypInOut_In_typs() {
		return (EReference)typInOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFull_Type() {
		return full_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenType() {
		return tokenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenType_IsGroup() {
		return (EAttribute)tokenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenType_Subsystem() {
		return (EReference)tokenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Base_Port() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkHub() {
		return linkHubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkHub_Base_Port() {
		return (EReference)linkHubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiator() {
		return initiatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandler() {
		return handlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriber() {
		return subscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriber_Out_typs() {
		return (EReference)subscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisher_In_typs() {
		return (EReference)publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubMachine() {
		return subMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerBody() {
		return controllerBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerBody_Base_Region() {
		return (EReference)controllerBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOMState() {
		return comStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMState_Base_State() {
		return (EReference)comStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONState() {
		return conStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONState_Tokens() {
		return (EAttribute)conStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONState_Lockable() {
		return (EAttribute)conStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitMachine() {
		return implicitMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONIntermediateState() {
		return conIntermediateStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONIntermediateState_Base_State() {
		return (EReference)conIntermediateStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOMIntermediateState() {
		return comIntermediateStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONStartState() {
		return conStartStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONStartState_Base_Pseudostate() {
		return (EReference)conStartStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOMStartState() {
		return comStartStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOMStartState_InVars() {
		return (EAttribute)comStartStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOMStartState_InToks() {
		return (EAttribute)comStartStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMStartState_Base_Pseudostate() {
		return (EReference)comStartStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOMEndState() {
		return comEndStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCOMEndState_OutVars() {
		return (EAttribute)comEndStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMEndState_Base_FinalState() {
		return (EReference)comEndStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMEndState_Out_toks() {
		return (EReference)comEndStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenSelector() {
		return tokenSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenSelector_ID() {
		return (EAttribute)tokenSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenSelector_SelectAll() {
		return (EAttribute)tokenSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenSelector_Port() {
		return (EReference)tokenSelectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclared_Type() {
		return declared_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclared_Type_Base_Class() {
		return (EReference)declared_TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclared_Type_Type() {
		return (EReference)declared_TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACS_Type() {
		return acS_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACS_Type_Structure() {
		return (EReference)acS_TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACS_Type_Constraint() {
		return (EReference)acS_TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Type_reference() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Fundamental_type() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Nullable() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Symbol() {
		return (EReference)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Dimension() {
		return (EReference)typeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Table() {
		return (EReference)typeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__Onlyonestructure__DiagnosticChain_Map() {
		return typeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType_Reference() {
		return type_ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Reference_Referenced_type() {
		return (EReference)type_ReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullable() {
		return nullableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullable_Nullable_base() {
		return (EReference)nullableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeration_Elements() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__Noduplicatenames__DiagnosticChain_Map() {
		return enumerationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Dimension_base() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Table_base() {
		return (EReference)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Fields() {
		return (EReference)recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecord__BasetypeisRecord__DiagnosticChain_Map() {
		return recordEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecord__Noduplicatefields__DiagnosticChain_Map() {
		return recordEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_FieldName() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Field_type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Path() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Property() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Fieldpath() {
		return (EReference)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Basepath() {
		return (EReference)pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Elementpath() {
		return (EReference)pathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPath__Onlyonepath__DiagnosticChain_Map() {
		return pathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldPath() {
		return fieldPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldPath_Field() {
		return (EAttribute)fieldPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasePath() {
		return basePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementPath() {
		return elementPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Symbol_range() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Precision() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Num_range() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Char_range() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Array_size_range() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__Onlyoneproperty__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolRange() {
		return symbolRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolRange_Elements() {
		return (EAttribute)symbolRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecision() {
		return precisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecision_Precision() {
		return (EAttribute)precisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrecision__Nonnegative__DiagnosticChain_Map() {
		return precisionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumRange() {
		return numRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumRange_Min() {
		return (EAttribute)numRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumRange_Max() {
		return (EAttribute)numRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumRange__Propernumrange__DiagnosticChain_Map() {
		return numRangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharRange() {
		return charRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharRange_CharGroupRegex() {
		return (EAttribute)charRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySizeRange() {
		return arraySizeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArraySizeRange_Min() {
		return (EAttribute)arraySizeRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArraySizeRange_Max() {
		return (EAttribute)arraySizeRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArraySizeRange__Propersizerange__DiagnosticChain_Map() {
		return arraySizeRangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACS_Model() {
		return acS_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACS_Model_Base_Model() {
		return (EReference)acS_ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACS_Model_Dependencies() {
		return (EReference)acS_ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionTypes() {
		return connectionTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFundamental_Types() {
		return fundamental_TypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcsProfileFactory getAcsProfileFactory() {
		return (AcsProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		linkHolderEClass = createEClass(LINK_HOLDER);
		createEReference(linkHolderEClass, LINK_HOLDER__BASE_COMPONENT);

		actionTransitionEClass = createEClass(ACTION_TRANSITION);
		createEReference(actionTransitionEClass, ACTION_TRANSITION__BASE_TRANSITION);

		invocationTransitionEClass = createEClass(INVOCATION_TRANSITION);
		createEReference(invocationTransitionEClass, INVOCATION_TRANSITION__BASE_TRANSITION);
		createEOperation(invocationTransitionEClass, INVOCATION_TRANSITION___NONCYCLICLOCAL__DIAGNOSTICCHAIN_MAP);

		compositeEClass = createEClass(COMPOSITE);

		subsystemEClass = createEClass(SUBSYSTEM);
		createEAttribute(subsystemEClass, SUBSYSTEM__CARDINALITY);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__BASE_COMPONENT);

		containerEClass = createEClass(CONTAINER);

		atomicSystemEClass = createEClass(ATOMIC_SYSTEM);

		linkConnectionEClass = createEClass(LINK_CONNECTION);
		createEAttribute(linkConnectionEClass, LINK_CONNECTION__DIRECTIONALITY);
		createEAttribute(linkConnectionEClass, LINK_CONNECTION__CARDINALITY);
		createEReference(linkConnectionEClass, LINK_CONNECTION__BASE_CONNECTOR);
		createEReference(linkConnectionEClass, LINK_CONNECTION__BASE_ASSOCIATION);

		soIEClass = createEClass(SO_I);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REFERENCED_SOI);

		interfaceConnectionEClass = createEClass(INTERFACE_CONNECTION);
		createEReference(interfaceConnectionEClass, INTERFACE_CONNECTION__BASE_CONNECTOR);
		createEReference(interfaceConnectionEClass, INTERFACE_CONNECTION__BASE_ASSOCIATION);

		eventDeclarationEClass = createEClass(EVENT_DECLARATION);
		createEReference(eventDeclarationEClass, EVENT_DECLARATION__BASE_STATE_MACHINE);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__BASE_STATE_MACHINE);

		mainMachineEClass = createEClass(MAIN_MACHINE);
		createEReference(mainMachineEClass, MAIN_MACHINE__OUT_TYPS);
		createEReference(mainMachineEClass, MAIN_MACHINE__OUT_TOKS);
		createEReference(mainMachineEClass, MAIN_MACHINE__IN_TOKS);
		createEReference(mainMachineEClass, MAIN_MACHINE__LINK_HUB);

		explicitMachineEClass = createEClass(EXPLICIT_MACHINE);
		createEReference(explicitMachineEClass, EXPLICIT_MACHINE__FUNC_DECLS);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__BASE_REGION);

		funcDeclEClass = createEClass(FUNC_DECL);
		createEAttribute(funcDeclEClass, FUNC_DECL__NAME);

		typInOutEClass = createEClass(TYP_IN_OUT);
		createEReference(typInOutEClass, TYP_IN_OUT__OUT_TYPS);
		createEReference(typInOutEClass, TYP_IN_OUT__IN_TYPS);

		full_TypeEClass = createEClass(FULL_TYPE);

		tokenTypeEClass = createEClass(TOKEN_TYPE);
		createEAttribute(tokenTypeEClass, TOKEN_TYPE__IS_GROUP);
		createEReference(tokenTypeEClass, TOKEN_TYPE__SUBSYSTEM);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__BASE_PORT);

		linkHubEClass = createEClass(LINK_HUB);
		createEReference(linkHubEClass, LINK_HUB__BASE_PORT);

		initiatorEClass = createEClass(INITIATOR);

		handlerEClass = createEClass(HANDLER);

		subscriberEClass = createEClass(SUBSCRIBER);
		createEReference(subscriberEClass, SUBSCRIBER__OUT_TYPS);

		publisherEClass = createEClass(PUBLISHER);
		createEReference(publisherEClass, PUBLISHER__IN_TYPS);

		subMachineEClass = createEClass(SUB_MACHINE);

		controllerBodyEClass = createEClass(CONTROLLER_BODY);
		createEReference(controllerBodyEClass, CONTROLLER_BODY__BASE_REGION);

		comStateEClass = createEClass(COM_STATE);
		createEReference(comStateEClass, COM_STATE__BASE_STATE);

		conStateEClass = createEClass(CON_STATE);
		createEAttribute(conStateEClass, CON_STATE__TOKENS);
		createEAttribute(conStateEClass, CON_STATE__LOCKABLE);

		implicitMachineEClass = createEClass(IMPLICIT_MACHINE);

		conIntermediateStateEClass = createEClass(CON_INTERMEDIATE_STATE);
		createEReference(conIntermediateStateEClass, CON_INTERMEDIATE_STATE__BASE_STATE);

		comIntermediateStateEClass = createEClass(COM_INTERMEDIATE_STATE);

		conStartStateEClass = createEClass(CON_START_STATE);
		createEReference(conStartStateEClass, CON_START_STATE__BASE_PSEUDOSTATE);

		comStartStateEClass = createEClass(COM_START_STATE);
		createEAttribute(comStartStateEClass, COM_START_STATE__IN_VARS);
		createEAttribute(comStartStateEClass, COM_START_STATE__IN_TOKS);
		createEReference(comStartStateEClass, COM_START_STATE__BASE_PSEUDOSTATE);

		comEndStateEClass = createEClass(COM_END_STATE);
		createEAttribute(comEndStateEClass, COM_END_STATE__OUT_VARS);
		createEReference(comEndStateEClass, COM_END_STATE__BASE_FINAL_STATE);
		createEReference(comEndStateEClass, COM_END_STATE__OUT_TOKS);

		tokenSelectorEClass = createEClass(TOKEN_SELECTOR);
		createEAttribute(tokenSelectorEClass, TOKEN_SELECTOR__ID);
		createEAttribute(tokenSelectorEClass, TOKEN_SELECTOR__SELECT_ALL);
		createEReference(tokenSelectorEClass, TOKEN_SELECTOR__PORT);

		declared_TypeEClass = createEClass(DECLARED_TYPE);
		createEReference(declared_TypeEClass, DECLARED_TYPE__BASE_CLASS);
		createEReference(declared_TypeEClass, DECLARED_TYPE__TYPE);

		acS_TypeEClass = createEClass(ACS_TYPE);
		createEReference(acS_TypeEClass, ACS_TYPE__STRUCTURE);
		createEReference(acS_TypeEClass, ACS_TYPE__CONSTRAINT);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__TYPE_REFERENCE);
		createEAttribute(typeEClass, TYPE__FUNDAMENTAL_TYPE);
		createEReference(typeEClass, TYPE__NULLABLE);
		createEReference(typeEClass, TYPE__SYMBOL);
		createEReference(typeEClass, TYPE__DIMENSION);
		createEReference(typeEClass, TYPE__TABLE);
		createEOperation(typeEClass, TYPE___ONLYONESTRUCTURE__DIAGNOSTICCHAIN_MAP);

		type_ReferenceEClass = createEClass(TYPE_REFERENCE);
		createEReference(type_ReferenceEClass, TYPE_REFERENCE__REFERENCED_TYPE);

		nullableEClass = createEClass(NULLABLE);
		createEReference(nullableEClass, NULLABLE__NULLABLE_BASE);

		enumerationEClass = createEClass(ENUMERATION);
		createEAttribute(enumerationEClass, ENUMERATION__ELEMENTS);
		createEOperation(enumerationEClass, ENUMERATION___NODUPLICATENAMES__DIAGNOSTICCHAIN_MAP);

		arrayEClass = createEClass(ARRAY);
		createEReference(arrayEClass, ARRAY__DIMENSION_BASE);

		recordEClass = createEClass(RECORD);
		createEReference(recordEClass, RECORD__TABLE_BASE);
		createEReference(recordEClass, RECORD__FIELDS);
		createEOperation(recordEClass, RECORD___BASETYPEIS_RECORD__DIAGNOSTICCHAIN_MAP);
		createEOperation(recordEClass, RECORD___NODUPLICATEFIELDS__DIAGNOSTICCHAIN_MAP);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__FIELD_NAME);
		createEReference(fieldEClass, FIELD__FIELD_TYPE);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__PATH);
		createEReference(constraintEClass, CONSTRAINT__PROPERTY);

		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__FIELDPATH);
		createEReference(pathEClass, PATH__BASEPATH);
		createEReference(pathEClass, PATH__ELEMENTPATH);
		createEOperation(pathEClass, PATH___ONLYONEPATH__DIAGNOSTICCHAIN_MAP);

		fieldPathEClass = createEClass(FIELD_PATH);
		createEAttribute(fieldPathEClass, FIELD_PATH__FIELD);

		basePathEClass = createEClass(BASE_PATH);

		elementPathEClass = createEClass(ELEMENT_PATH);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__SYMBOL_RANGE);
		createEReference(propertyEClass, PROPERTY__PRECISION);
		createEReference(propertyEClass, PROPERTY__NUM_RANGE);
		createEReference(propertyEClass, PROPERTY__CHAR_RANGE);
		createEReference(propertyEClass, PROPERTY__ARRAY_SIZE_RANGE);
		createEOperation(propertyEClass, PROPERTY___ONLYONEPROPERTY__DIAGNOSTICCHAIN_MAP);

		symbolRangeEClass = createEClass(SYMBOL_RANGE);
		createEAttribute(symbolRangeEClass, SYMBOL_RANGE__ELEMENTS);

		precisionEClass = createEClass(PRECISION);
		createEAttribute(precisionEClass, PRECISION__PRECISION);
		createEOperation(precisionEClass, PRECISION___NONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		numRangeEClass = createEClass(NUM_RANGE);
		createEAttribute(numRangeEClass, NUM_RANGE__MIN);
		createEAttribute(numRangeEClass, NUM_RANGE__MAX);
		createEOperation(numRangeEClass, NUM_RANGE___PROPERNUMRANGE__DIAGNOSTICCHAIN_MAP);

		charRangeEClass = createEClass(CHAR_RANGE);
		createEAttribute(charRangeEClass, CHAR_RANGE__CHAR_GROUP_REGEX);

		arraySizeRangeEClass = createEClass(ARRAY_SIZE_RANGE);
		createEAttribute(arraySizeRangeEClass, ARRAY_SIZE_RANGE__MIN);
		createEAttribute(arraySizeRangeEClass, ARRAY_SIZE_RANGE__MAX);
		createEOperation(arraySizeRangeEClass, ARRAY_SIZE_RANGE___PROPERSIZERANGE__DIAGNOSTICCHAIN_MAP);

		voidEClass = createEClass(VOID);

		acS_ModelEClass = createEClass(ACS_MODEL);
		createEReference(acS_ModelEClass, ACS_MODEL__BASE_MODEL);
		createEReference(acS_ModelEClass, ACS_MODEL__DEPENDENCIES);

		// Create enums
		connectionTypesEEnum = createEEnum(CONNECTION_TYPES);
		fundamental_TypesEEnum = createEEnum(FUNDAMENTAL_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeEClass.getESuperTypes().add(this.getSubsystem());
		compositeEClass.getESuperTypes().add(this.getContainer());
		subsystemEClass.getESuperTypes().add(this.getSystem());
		atomicSystemEClass.getESuperTypes().add(this.getSubsystem());
		soIEClass.getESuperTypes().add(this.getSystem());
		soIEClass.getESuperTypes().add(this.getContainer());
		referenceEClass.getESuperTypes().add(this.getSubsystem());
		mainMachineEClass.getESuperTypes().add(this.getExplicitMachine());
		explicitMachineEClass.getESuperTypes().add(this.getMachine());
		funcDeclEClass.getESuperTypes().add(this.getTypInOut());
		initiatorEClass.getESuperTypes().add(this.getTypInOut());
		initiatorEClass.getESuperTypes().add(this.getEventDeclaration());
		handlerEClass.getESuperTypes().add(this.getTypInOut());
		handlerEClass.getESuperTypes().add(this.getEventDeclaration());
		subscriberEClass.getESuperTypes().add(this.getEventDeclaration());
		publisherEClass.getESuperTypes().add(this.getEventDeclaration());
		subMachineEClass.getESuperTypes().add(this.getExplicitMachine());
		subMachineEClass.getESuperTypes().add(this.getTypInOut());
		implicitMachineEClass.getESuperTypes().add(this.getMachine());
		conIntermediateStateEClass.getESuperTypes().add(this.getCONState());
		comIntermediateStateEClass.getESuperTypes().add(this.getCOMState());
		conStartStateEClass.getESuperTypes().add(this.getCONState());
		comStartStateEClass.getESuperTypes().add(this.getCOMState());
		comEndStateEClass.getESuperTypes().add(this.getCOMState());
		acS_TypeEClass.getESuperTypes().add(this.getFull_Type());
		voidEClass.getESuperTypes().add(this.getFull_Type());

		// Initialize classes, features, and operations; add parameters
		initEClass(linkHolderEClass, LinkHolder.class, "LinkHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkHolder_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, LinkHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionTransitionEClass, ActionTransition.class, "ActionTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 0, 1, ActionTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(invocationTransitionEClass, InvocationTransition.class, "InvocationTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 0, 1, InvocationTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getInvocationTransition__Noncycliclocal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Noncycliclocal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsystemEClass, Subsystem.class, "Subsystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubsystem_Cardinality(), theTypesPackage.getString(), "Cardinality", null, 1, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemEClass, org.eclipse.papyrus.acs.profile.model.System.class, "System", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, org.eclipse.papyrus.acs.profile.model.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(containerEClass, org.eclipse.papyrus.acs.profile.model.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicSystemEClass, AtomicSystem.class, "AtomicSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkConnectionEClass, LinkConnection.class, "LinkConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkConnection_Directionality(), this.getConnectionTypes(), "Directionality", "reactive", 1, 1, LinkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkConnection_Cardinality(), theTypesPackage.getString(), "Cardinality", null, 1, 1, LinkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, LinkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkConnection_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, LinkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(soIEClass, SoI.class, "SoI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Referenced_soi(), this.getSoI(), null, "referenced_soi", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceConnectionEClass, InterfaceConnection.class, "InterfaceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, InterfaceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfaceConnection_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, InterfaceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventDeclarationEClass, EventDeclaration.class, "EventDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDeclaration_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 0, 1, EventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mainMachineEClass, MainMachine.class, "MainMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainMachine_Out_typs(), this.getFull_Type(), null, "out_typs", null, 1, -1, MainMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainMachine_Out_toks(), this.getTokenType(), null, "out_toks", null, 0, -1, MainMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainMachine_In_toks(), this.getTokenType(), null, "in_toks", null, 0, -1, MainMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainMachine_Link_hub(), this.getLinkHub(), null, "link_hub", null, 1, 1, MainMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(explicitMachineEClass, ExplicitMachine.class, "ExplicitMachine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExplicitMachine_Func_decls(), this.getFuncDecl(), null, "func_decls", null, 0, -1, ExplicitMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_Base_Region(), theUMLPackage.getRegion(), null, "base_Region", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(funcDeclEClass, FuncDecl.class, "FuncDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncDecl_Name(), theTypesPackage.getString(), "Name", null, 1, 1, FuncDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typInOutEClass, TypInOut.class, "TypInOut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypInOut_Out_typs(), this.getFull_Type(), null, "out_typs", null, 1, -1, TypInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypInOut_In_typs(), this.getFull_Type(), null, "in_typs", null, 1, -1, TypInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(full_TypeEClass, Full_Type.class, "Full_Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tokenTypeEClass, TokenType.class, "TokenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenType_IsGroup(), theTypesPackage.getBoolean(), "IsGroup", null, 1, 1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTokenType_Subsystem(), this.getPort(), null, "subsystem", null, 1, 1, TokenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkHubEClass, LinkHub.class, "LinkHub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkHub_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, LinkHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(initiatorEClass, Initiator.class, "Initiator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(handlerEClass, Handler.class, "Handler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subscriberEClass, Subscriber.class, "Subscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscriber_Out_typs(), this.getFull_Type(), null, "out_typs", null, 1, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublisher_In_typs(), this.getFull_Type(), null, "in_typs", null, 1, -1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subMachineEClass, SubMachine.class, "SubMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerBodyEClass, ControllerBody.class, "ControllerBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerBody_Base_Region(), theUMLPackage.getRegion(), null, "base_Region", null, 0, 1, ControllerBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(comStateEClass, COMState.class, "COMState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOMState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 0, 1, COMState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conStateEClass, CONState.class, "CONState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCONState_Tokens(), theTypesPackage.getString(), "Tokens", null, 0, -1, CONState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCONState_Lockable(), theTypesPackage.getBoolean(), "Lockable", "false", 1, 1, CONState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(implicitMachineEClass, ImplicitMachine.class, "ImplicitMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conIntermediateStateEClass, CONIntermediateState.class, "CONIntermediateState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCONIntermediateState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 0, 1, CONIntermediateState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(comIntermediateStateEClass, COMIntermediateState.class, "COMIntermediateState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conStartStateEClass, CONStartState.class, "CONStartState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCONStartState_Base_Pseudostate(), theUMLPackage.getPseudostate(), null, "base_Pseudostate", null, 0, 1, CONStartState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(comStartStateEClass, COMStartState.class, "COMStartState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOMStartState_InVars(), theTypesPackage.getString(), "InVars", null, 0, -1, COMStartState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCOMStartState_InToks(), theTypesPackage.getString(), "InToks", null, 0, -1, COMStartState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCOMStartState_Base_Pseudostate(), theUMLPackage.getPseudostate(), null, "base_Pseudostate", null, 0, 1, COMStartState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(comEndStateEClass, COMEndState.class, "COMEndState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCOMEndState_OutVars(), theTypesPackage.getString(), "OutVars", null, 0, -1, COMEndState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCOMEndState_Base_FinalState(), theUMLPackage.getFinalState(), null, "base_FinalState", null, 0, 1, COMEndState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCOMEndState_Out_toks(), this.getTokenSelector(), null, "out_toks", null, 0, -1, COMEndState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tokenSelectorEClass, TokenSelector.class, "TokenSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenSelector_ID(), theTypesPackage.getInteger(), "ID", "1", 1, 1, TokenSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTokenSelector_SelectAll(), theTypesPackage.getBoolean(), "SelectAll", "false", 1, 1, TokenSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTokenSelector_Port(), this.getPort(), null, "port", null, 1, 1, TokenSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(declared_TypeEClass, Declared_Type.class, "Declared_Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclared_Type_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Declared_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeclared_Type_Type(), this.getACS_Type(), null, "type", null, 1, 1, Declared_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(acS_TypeEClass, ACS_Type.class, "ACS_Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getACS_Type_Structure(), this.getType(), null, "structure", null, 1, 1, ACS_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getACS_Type_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, ACS_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Type_reference(), this.getType_Reference(), null, "type_reference", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_Fundamental_type(), this.getFundamental_Types(), "fundamental_type", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Nullable(), this.getNullable(), null, "nullable", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Symbol(), this.getEnumeration(), null, "symbol", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Dimension(), this.getArray(), null, "dimension", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Table(), this.getRecord(), null, "table", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getType__Onlyonestructure__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Onlyonestructure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(type_ReferenceEClass, Type_Reference.class, "Type_Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Reference_Referenced_type(), this.getDeclared_Type(), null, "referenced_type", null, 1, 1, Type_Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nullableEClass, Nullable.class, "Nullable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNullable_Nullable_base(), this.getType(), null, "nullable_base", null, 1, 1, Nullable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeration_Elements(), theTypesPackage.getString(), "Elements", null, 1, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEnumeration__Noduplicatenames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Noduplicatenames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArray_Dimension_base(), this.getType(), null, "dimension_base", null, 1, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(recordEClass, org.eclipse.papyrus.acs.profile.model.Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecord_Table_base(), this.getType_Reference(), null, "table_base", null, 0, 1, org.eclipse.papyrus.acs.profile.model.Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRecord_Fields(), this.getField(), null, "fields", null, 1, -1, org.eclipse.papyrus.acs.profile.model.Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRecord__BasetypeisRecord__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "BasetypeisRecord", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRecord__Noduplicatefields__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Noduplicatefields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_FieldName(), theTypesPackage.getString(), "FieldName", "field", 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getField_Field_type(), this.getType(), null, "field_type", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Path(), this.getPath(), null, "path", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Property(), this.getProperty(), null, "property", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_Fieldpath(), this.getFieldPath(), null, "fieldpath", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPath_Basepath(), this.getBasePath(), null, "basepath", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPath_Elementpath(), this.getElementPath(), null, "elementpath", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPath__Onlyonepath__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Onlyonepath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fieldPathEClass, FieldPath.class, "FieldPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldPath_Field(), theTypesPackage.getString(), "Field", "", 1, 1, FieldPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(basePathEClass, BasePath.class, "BasePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementPathEClass, ElementPath.class, "ElementPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Symbol_range(), this.getSymbolRange(), null, "symbol_range", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Precision(), this.getPrecision(), null, "precision", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Num_range(), this.getNumRange(), null, "num_range", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Char_range(), this.getCharRange(), null, "char_range", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Array_size_range(), this.getArraySizeRange(), null, "array_size_range", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProperty__Onlyoneproperty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Onlyoneproperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symbolRangeEClass, SymbolRange.class, "SymbolRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolRange_Elements(), theTypesPackage.getString(), "Elements", null, 1, -1, SymbolRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(precisionEClass, Precision.class, "Precision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecision_Precision(), theTypesPackage.getInteger(), "Precision", "0", 1, 1, Precision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPrecision__Nonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Nonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numRangeEClass, NumRange.class, "NumRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumRange_Min(), theTypesPackage.getReal(), "Min", "0.0", 1, 1, NumRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumRange_Max(), theTypesPackage.getReal(), "Max", "1.0", 1, 1, NumRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNumRange__Propernumrange__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Propernumrange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(charRangeEClass, CharRange.class, "CharRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharRange_CharGroupRegex(), theTypesPackage.getString(), "CharGroupRegex", null, 1, 1, CharRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arraySizeRangeEClass, ArraySizeRange.class, "ArraySizeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArraySizeRange_Min(), theTypesPackage.getUnlimitedNatural(), "Min", null, 1, 1, ArraySizeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArraySizeRange_Max(), theTypesPackage.getUnlimitedNatural(), "Max", null, 1, 1, ArraySizeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArraySizeRange__Propersizerange__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Propersizerange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(voidEClass, org.eclipse.papyrus.acs.profile.model.Void.class, "Void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acS_ModelEClass, ACS_Model.class, "ACS_Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getACS_Model_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, ACS_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getACS_Model_Dependencies(), this.getSoI(), null, "dependencies", null, 0, -1, ACS_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectionTypesEEnum, ConnectionTypes.class, "ConnectionTypes");
		addEEnumLiteral(connectionTypesEEnum, ConnectionTypes.REACTIVE);
		addEEnumLiteral(connectionTypesEEnum, ConnectionTypes.ACTIVE);
		addEEnumLiteral(connectionTypesEEnum, ConnectionTypes.SELF_REFERENTIAL);

		initEEnum(fundamental_TypesEEnum, Fundamental_Types.class, "Fundamental_Types");
		addEEnumLiteral(fundamental_TypesEEnum, Fundamental_Types.CHAR);
		addEEnumLiteral(fundamental_TypesEEnum, Fundamental_Types.NUM);
		addEEnumLiteral(fundamental_TypesEEnum, Fundamental_Types.BOOL);
		addEEnumLiteral(fundamental_TypesEEnum, Fundamental_Types.NONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (linkHolderEClass,
		   source,
		   new String[] {
			   "originalName", "Link Holder"
		   });
		addAnnotation
		  (actionTransitionEClass,
		   source,
		   new String[] {
			   "originalName", "Action Transition"
		   });
		addAnnotation
		  (invocationTransitionEClass,
		   source,
		   new String[] {
			   "originalName", "Invocation Transition"
		   });
		addAnnotation
		  (getInvocationTransition__Noncycliclocal__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Non-cyclic (local)"
		   });
		addAnnotation
		  (atomicSystemEClass,
		   source,
		   new String[] {
			   "originalName", "Atomic System"
		   });
		addAnnotation
		  (linkConnectionEClass,
		   source,
		   new String[] {
			   "originalName", "Link Connection"
		   });
		addAnnotation
		  (interfaceConnectionEClass,
		   source,
		   new String[] {
			   "originalName", "Interface Connection"
		   });
		addAnnotation
		  (mainMachineEClass,
		   source,
		   new String[] {
			   "originalName", "Main Machine"
		   });
		addAnnotation
		  (explicitMachineEClass,
		   source,
		   new String[] {
			   "originalName", "Explicit Machine"
		   });
		addAnnotation
		  (funcDeclEClass,
		   source,
		   new String[] {
			   "originalName", "Func Decl"
		   });
		addAnnotation
		  (linkHubEClass,
		   source,
		   new String[] {
			   "originalName", "Link Hub"
		   });
		addAnnotation
		  (subMachineEClass,
		   source,
		   new String[] {
			   "originalName", "Sub Machine"
		   });
		addAnnotation
		  (controllerBodyEClass,
		   source,
		   new String[] {
			   "originalName", "Controller Body"
		   });
		addAnnotation
		  (comStateEClass,
		   source,
		   new String[] {
			   "originalName", "COM State"
		   });
		addAnnotation
		  (conStateEClass,
		   source,
		   new String[] {
			   "originalName", "CON State"
		   });
		addAnnotation
		  (implicitMachineEClass,
		   source,
		   new String[] {
			   "originalName", "Implicit Machine"
		   });
		addAnnotation
		  (conIntermediateStateEClass,
		   source,
		   new String[] {
			   "originalName", "CON Intermediate State"
		   });
		addAnnotation
		  (comIntermediateStateEClass,
		   source,
		   new String[] {
			   "originalName", "COM Intermediate State"
		   });
		addAnnotation
		  (conStartStateEClass,
		   source,
		   new String[] {
			   "originalName", "CON Start State"
		   });
		addAnnotation
		  (comStartStateEClass,
		   source,
		   new String[] {
			   "originalName", "COM Start State"
		   });
		addAnnotation
		  (comEndStateEClass,
		   source,
		   new String[] {
			   "originalName", "COM End State"
		   });
		addAnnotation
		  (getType__Onlyonestructure__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Only one structure"
		   });
		addAnnotation
		  (getEnumeration__Noduplicatenames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "No duplicate names"
		   });
		addAnnotation
		  (getRecord__BasetypeisRecord__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Base type is Record"
		   });
		addAnnotation
		  (getRecord__Noduplicatefields__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "No duplicate fields"
		   });
		addAnnotation
		  (getPath__Onlyonepath__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Only one path"
		   });
		addAnnotation
		  (getProperty__Onlyoneproperty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Only one property"
		   });
		addAnnotation
		  (symbolRangeEClass,
		   source,
		   new String[] {
			   "originalName", "Symbol Range"
		   });
		addAnnotation
		  (getPrecision__Nonnegative__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Non-negative"
		   });
		addAnnotation
		  (numRangeEClass,
		   source,
		   new String[] {
			   "originalName", "Num Range"
		   });
		addAnnotation
		  (getNumRange__Propernumrange__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Proper num range"
		   });
		addAnnotation
		  (charRangeEClass,
		   source,
		   new String[] {
			   "originalName", "Char Range"
		   });
		addAnnotation
		  (getArraySizeRange__Propersizerange__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Proper size range"
		   });
	}

} //AcsProfilePackageImpl
