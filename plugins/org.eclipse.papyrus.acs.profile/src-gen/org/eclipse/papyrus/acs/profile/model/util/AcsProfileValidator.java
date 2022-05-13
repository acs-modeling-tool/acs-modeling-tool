/**
 */
package org.eclipse.papyrus.acs.profile.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.acs.profile.model.ACS_Model;
import org.eclipse.papyrus.acs.profile.model.ACS_Type;
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
import org.eclipse.papyrus.acs.profile.model.Container;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage
 * @generated
 */
public class AcsProfileValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AcsProfileValidator INSTANCE = new AcsProfileValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.acs.profile.model";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Noncycliclocal' of 'Invocation Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INVOCATION_TRANSITION__NONCYCLICLOCAL = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Onlyonestructure' of 'Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TYPE__ONLYONESTRUCTURE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Noduplicatenames' of 'Enumeration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUMERATION__NODUPLICATENAMES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Basetypeis Record' of 'Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD__BASETYPEIS_RECORD = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Noduplicatefields' of 'Record'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD__NODUPLICATEFIELDS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Onlyonepath' of 'Path'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATH__ONLYONEPATH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Onlyoneproperty' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__ONLYONEPROPERTY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nonnegative' of 'Precision'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRECISION__NONNEGATIVE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Propernumrange' of 'Num Range'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUM_RANGE__PROPERNUMRANGE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Propersizerange' of 'Array Size Range'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARRAY_SIZE_RANGE__PROPERSIZERANGE = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcsProfileValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AcsProfilePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AcsProfilePackage.LINK_HOLDER:
				return validateLinkHolder((LinkHolder)value, diagnostics, context);
			case AcsProfilePackage.ACTION_TRANSITION:
				return validateActionTransition((ActionTransition)value, diagnostics, context);
			case AcsProfilePackage.INVOCATION_TRANSITION:
				return validateInvocationTransition((InvocationTransition)value, diagnostics, context);
			case AcsProfilePackage.COMPOSITE:
				return validateComposite((Composite)value, diagnostics, context);
			case AcsProfilePackage.SUBSYSTEM:
				return validateSubsystem((Subsystem)value, diagnostics, context);
			case AcsProfilePackage.SYSTEM:
				return validateSystem((org.eclipse.papyrus.acs.profile.model.System)value, diagnostics, context);
			case AcsProfilePackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case AcsProfilePackage.ATOMIC_SYSTEM:
				return validateAtomicSystem((AtomicSystem)value, diagnostics, context);
			case AcsProfilePackage.LINK_CONNECTION:
				return validateLinkConnection((LinkConnection)value, diagnostics, context);
			case AcsProfilePackage.SO_I:
				return validateSoI((SoI)value, diagnostics, context);
			case AcsProfilePackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case AcsProfilePackage.INTERFACE_CONNECTION:
				return validateInterfaceConnection((InterfaceConnection)value, diagnostics, context);
			case AcsProfilePackage.EVENT_DECLARATION:
				return validateEventDeclaration((EventDeclaration)value, diagnostics, context);
			case AcsProfilePackage.CONTROLLER:
				return validateController((Controller)value, diagnostics, context);
			case AcsProfilePackage.MAIN_MACHINE:
				return validateMainMachine((MainMachine)value, diagnostics, context);
			case AcsProfilePackage.EXPLICIT_MACHINE:
				return validateExplicitMachine((ExplicitMachine)value, diagnostics, context);
			case AcsProfilePackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case AcsProfilePackage.FUNC_DECL:
				return validateFuncDecl((FuncDecl)value, diagnostics, context);
			case AcsProfilePackage.TYP_IN_OUT:
				return validateTypInOut((TypInOut)value, diagnostics, context);
			case AcsProfilePackage.FULL_TYPE:
				return validateFull_Type((Full_Type)value, diagnostics, context);
			case AcsProfilePackage.TOKEN_TYPE:
				return validateTokenType((TokenType)value, diagnostics, context);
			case AcsProfilePackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case AcsProfilePackage.LINK_HUB:
				return validateLinkHub((LinkHub)value, diagnostics, context);
			case AcsProfilePackage.INITIATOR:
				return validateInitiator((Initiator)value, diagnostics, context);
			case AcsProfilePackage.HANDLER:
				return validateHandler((Handler)value, diagnostics, context);
			case AcsProfilePackage.SUBSCRIBER:
				return validateSubscriber((Subscriber)value, diagnostics, context);
			case AcsProfilePackage.PUBLISHER:
				return validatePublisher((Publisher)value, diagnostics, context);
			case AcsProfilePackage.SUB_MACHINE:
				return validateSubMachine((SubMachine)value, diagnostics, context);
			case AcsProfilePackage.CONTROLLER_BODY:
				return validateControllerBody((ControllerBody)value, diagnostics, context);
			case AcsProfilePackage.COM_STATE:
				return validateCOMState((COMState)value, diagnostics, context);
			case AcsProfilePackage.CON_STATE:
				return validateCONState((CONState)value, diagnostics, context);
			case AcsProfilePackage.IMPLICIT_MACHINE:
				return validateImplicitMachine((ImplicitMachine)value, diagnostics, context);
			case AcsProfilePackage.CON_INTERMEDIATE_STATE:
				return validateCONIntermediateState((CONIntermediateState)value, diagnostics, context);
			case AcsProfilePackage.COM_INTERMEDIATE_STATE:
				return validateCOMIntermediateState((COMIntermediateState)value, diagnostics, context);
			case AcsProfilePackage.CON_START_STATE:
				return validateCONStartState((CONStartState)value, diagnostics, context);
			case AcsProfilePackage.COM_START_STATE:
				return validateCOMStartState((COMStartState)value, diagnostics, context);
			case AcsProfilePackage.COM_END_STATE:
				return validateCOMEndState((COMEndState)value, diagnostics, context);
			case AcsProfilePackage.TOKEN_SELECTOR:
				return validateTokenSelector((TokenSelector)value, diagnostics, context);
			case AcsProfilePackage.DECLARED_TYPE:
				return validateDeclared_Type((Declared_Type)value, diagnostics, context);
			case AcsProfilePackage.ACS_TYPE:
				return validateACS_Type((ACS_Type)value, diagnostics, context);
			case AcsProfilePackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case AcsProfilePackage.TYPE_REFERENCE:
				return validateType_Reference((Type_Reference)value, diagnostics, context);
			case AcsProfilePackage.NULLABLE:
				return validateNullable((Nullable)value, diagnostics, context);
			case AcsProfilePackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case AcsProfilePackage.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case AcsProfilePackage.RECORD:
				return validateRecord((org.eclipse.papyrus.acs.profile.model.Record)value, diagnostics, context);
			case AcsProfilePackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case AcsProfilePackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case AcsProfilePackage.PATH:
				return validatePath((Path)value, diagnostics, context);
			case AcsProfilePackage.FIELD_PATH:
				return validateFieldPath((FieldPath)value, diagnostics, context);
			case AcsProfilePackage.BASE_PATH:
				return validateBasePath((BasePath)value, diagnostics, context);
			case AcsProfilePackage.ELEMENT_PATH:
				return validateElementPath((ElementPath)value, diagnostics, context);
			case AcsProfilePackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case AcsProfilePackage.SYMBOL_RANGE:
				return validateSymbolRange((SymbolRange)value, diagnostics, context);
			case AcsProfilePackage.PRECISION:
				return validatePrecision((Precision)value, diagnostics, context);
			case AcsProfilePackage.NUM_RANGE:
				return validateNumRange((NumRange)value, diagnostics, context);
			case AcsProfilePackage.CHAR_RANGE:
				return validateCharRange((CharRange)value, diagnostics, context);
			case AcsProfilePackage.ARRAY_SIZE_RANGE:
				return validateArraySizeRange((ArraySizeRange)value, diagnostics, context);
			case AcsProfilePackage.VOID:
				return validateVoid((org.eclipse.papyrus.acs.profile.model.Void)value, diagnostics, context);
			case AcsProfilePackage.ACS_MODEL:
				return validateACS_Model((ACS_Model)value, diagnostics, context);
			case AcsProfilePackage.CONNECTION_TYPES:
				return validateConnectionTypes((ConnectionTypes)value, diagnostics, context);
			case AcsProfilePackage.FUNDAMENTAL_TYPES:
				return validateFundamental_Types((Fundamental_Types)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkHolder(LinkHolder linkHolder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkHolder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionTransition(ActionTransition actionTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationTransition(InvocationTransition invocationTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invocationTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invocationTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationTransition_Noncycliclocal(invocationTransition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Noncycliclocal constraint of '<em>Invocation Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationTransition_Noncycliclocal(InvocationTransition invocationTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return invocationTransition.Noncycliclocal(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsystem(Subsystem subsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(org.eclipse.papyrus.acs.profile.model.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicSystem(AtomicSystem atomicSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atomicSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkConnection(LinkConnection linkConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoI(SoI soI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soI, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceConnection(InterfaceConnection interfaceConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventDeclaration(EventDeclaration eventDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainMachine(MainMachine mainMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplicitMachine(ExplicitMachine explicitMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explicitMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuncDecl(FuncDecl funcDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(funcDecl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypInOut(TypInOut typInOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typInOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFull_Type(Full_Type full_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(full_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenType(TokenType tokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkHub(LinkHub linkHub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkHub, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiator(Initiator initiator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initiator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandler(Handler handler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(handler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisher(Publisher publisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publisher, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubMachine(SubMachine subMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerBody(ControllerBody controllerBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controllerBody, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOMState(COMState comState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONState(CONState conState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplicitMachine(ImplicitMachine implicitMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implicitMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONIntermediateState(CONIntermediateState conIntermediateState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conIntermediateState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOMIntermediateState(COMIntermediateState comIntermediateState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comIntermediateState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONStartState(CONStartState conStartState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conStartState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOMStartState(COMStartState comStartState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comStartState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOMEndState(COMEndState comEndState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comEndState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenSelector(TokenSelector tokenSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenSelector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclared_Type(Declared_Type declared_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declared_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateACS_Type(ACS_Type acS_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acS_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_Onlyonestructure(type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Onlyonestructure constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_Onlyonestructure(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return type.Onlyonestructure(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_Reference(Type_Reference type_Reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type_Reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullable(Nullable nullable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeration_Noduplicatenames(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Noduplicatenames constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration_Noduplicatenames(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumeration.Noduplicatenames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecord(org.eclipse.papyrus.acs.profile.model.Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(record, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(record, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecord_BasetypeisRecord(record, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecord_Noduplicatefields(record, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BasetypeisRecord constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecord_BasetypeisRecord(org.eclipse.papyrus.acs.profile.model.Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return record.BasetypeisRecord(diagnostics, context);
	}

	/**
	 * Validates the Noduplicatefields constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecord_Noduplicatefields(org.eclipse.papyrus.acs.profile.model.Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return record.Noduplicatefields(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(path, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(path, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(path, diagnostics, context);
		if (result || diagnostics != null) result &= validatePath_Onlyonepath(path, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Onlyonepath constraint of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePath_Onlyonepath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return path.Onlyonepath(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldPath(FieldPath fieldPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePath(BasePath basePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basePath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementPath(ElementPath elementPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_Onlyoneproperty(property, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Onlyoneproperty constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_Onlyoneproperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.Onlyoneproperty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolRange(SymbolRange symbolRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecision(Precision precision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(precision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(precision, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrecision_Nonnegative(precision, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Nonnegative constraint of '<em>Precision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecision_Nonnegative(Precision precision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return precision.Nonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumRange(NumRange numRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumRange_Propernumrange(numRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Propernumrange constraint of '<em>Num Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumRange_Propernumrange(NumRange numRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return numRange.Propernumrange(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharRange(CharRange charRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArraySizeRange(ArraySizeRange arraySizeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arraySizeRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arraySizeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateArraySizeRange_Propersizerange(arraySizeRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Propersizerange constraint of '<em>Array Size Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArraySizeRange_Propersizerange(ArraySizeRange arraySizeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return arraySizeRange.Propersizerange(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoid(org.eclipse.papyrus.acs.profile.model.Void void_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(void_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateACS_Model(ACS_Model acS_Model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acS_Model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionTypes(ConnectionTypes connectionTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFundamental_Types(Fundamental_Types fundamental_Types, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AcsProfileValidator
