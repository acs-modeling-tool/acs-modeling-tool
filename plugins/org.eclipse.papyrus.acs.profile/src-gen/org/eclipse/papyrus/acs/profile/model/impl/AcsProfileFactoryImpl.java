/**
 */
package org.eclipse.papyrus.acs.profile.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.eclipse.papyrus.acs.profile.model.CONIntermediateState;
import org.eclipse.papyrus.acs.profile.model.CONStartState;
import org.eclipse.papyrus.acs.profile.model.CharRange;
import org.eclipse.papyrus.acs.profile.model.Composite;
import org.eclipse.papyrus.acs.profile.model.ConnectionTypes;
import org.eclipse.papyrus.acs.profile.model.Constraint;
import org.eclipse.papyrus.acs.profile.model.Controller;
import org.eclipse.papyrus.acs.profile.model.ControllerBody;
import org.eclipse.papyrus.acs.profile.model.Declared_Type;
import org.eclipse.papyrus.acs.profile.model.ElementPath;
import org.eclipse.papyrus.acs.profile.model.Enumeration;
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
import org.eclipse.papyrus.acs.profile.model.SymbolRange;
import org.eclipse.papyrus.acs.profile.model.TokenSelector;
import org.eclipse.papyrus.acs.profile.model.TokenType;
import org.eclipse.papyrus.acs.profile.model.Type;
import org.eclipse.papyrus.acs.profile.model.Type_Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcsProfileFactoryImpl extends EFactoryImpl implements AcsProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcsProfileFactory init() {
		try {
			AcsProfileFactory theAcsProfileFactory = (AcsProfileFactory)EPackage.Registry.INSTANCE.getEFactory(AcsProfilePackage.eNS_URI);
			if (theAcsProfileFactory != null) {
				return theAcsProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AcsProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcsProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AcsProfilePackage.LINK_HOLDER: return createLinkHolder();
			case AcsProfilePackage.ACTION_TRANSITION: return createActionTransition();
			case AcsProfilePackage.INVOCATION_TRANSITION: return createInvocationTransition();
			case AcsProfilePackage.COMPOSITE: return createComposite();
			case AcsProfilePackage.ATOMIC_SYSTEM: return createAtomicSystem();
			case AcsProfilePackage.LINK_CONNECTION: return createLinkConnection();
			case AcsProfilePackage.SO_I: return createSoI();
			case AcsProfilePackage.REFERENCE: return createReference();
			case AcsProfilePackage.INTERFACE_CONNECTION: return createInterfaceConnection();
			case AcsProfilePackage.CONTROLLER: return createController();
			case AcsProfilePackage.MAIN_MACHINE: return createMainMachine();
			case AcsProfilePackage.FUNC_DECL: return createFuncDecl();
			case AcsProfilePackage.FULL_TYPE: return createFull_Type();
			case AcsProfilePackage.TOKEN_TYPE: return createTokenType();
			case AcsProfilePackage.PORT: return createPort();
			case AcsProfilePackage.LINK_HUB: return createLinkHub();
			case AcsProfilePackage.INITIATOR: return createInitiator();
			case AcsProfilePackage.HANDLER: return createHandler();
			case AcsProfilePackage.SUBSCRIBER: return createSubscriber();
			case AcsProfilePackage.PUBLISHER: return createPublisher();
			case AcsProfilePackage.SUB_MACHINE: return createSubMachine();
			case AcsProfilePackage.CONTROLLER_BODY: return createControllerBody();
			case AcsProfilePackage.IMPLICIT_MACHINE: return createImplicitMachine();
			case AcsProfilePackage.CON_INTERMEDIATE_STATE: return createCONIntermediateState();
			case AcsProfilePackage.COM_INTERMEDIATE_STATE: return createCOMIntermediateState();
			case AcsProfilePackage.CON_START_STATE: return createCONStartState();
			case AcsProfilePackage.COM_START_STATE: return createCOMStartState();
			case AcsProfilePackage.COM_END_STATE: return createCOMEndState();
			case AcsProfilePackage.TOKEN_SELECTOR: return createTokenSelector();
			case AcsProfilePackage.DECLARED_TYPE: return createDeclared_Type();
			case AcsProfilePackage.ACS_TYPE: return createACS_Type();
			case AcsProfilePackage.TYPE: return createType();
			case AcsProfilePackage.TYPE_REFERENCE: return createType_Reference();
			case AcsProfilePackage.NULLABLE: return createNullable();
			case AcsProfilePackage.ENUMERATION: return createEnumeration();
			case AcsProfilePackage.ARRAY: return createArray();
			case AcsProfilePackage.RECORD: return createRecord();
			case AcsProfilePackage.FIELD: return createField();
			case AcsProfilePackage.CONSTRAINT: return createConstraint();
			case AcsProfilePackage.PATH: return createPath();
			case AcsProfilePackage.FIELD_PATH: return createFieldPath();
			case AcsProfilePackage.BASE_PATH: return createBasePath();
			case AcsProfilePackage.ELEMENT_PATH: return createElementPath();
			case AcsProfilePackage.PROPERTY: return createProperty();
			case AcsProfilePackage.SYMBOL_RANGE: return createSymbolRange();
			case AcsProfilePackage.PRECISION: return createPrecision();
			case AcsProfilePackage.NUM_RANGE: return createNumRange();
			case AcsProfilePackage.CHAR_RANGE: return createCharRange();
			case AcsProfilePackage.ARRAY_SIZE_RANGE: return createArraySizeRange();
			case AcsProfilePackage.VOID: return createVoid();
			case AcsProfilePackage.ACS_MODEL: return createACS_Model();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AcsProfilePackage.CONNECTION_TYPES:
				return createConnectionTypesFromString(eDataType, initialValue);
			case AcsProfilePackage.FUNDAMENTAL_TYPES:
				return createFundamental_TypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AcsProfilePackage.CONNECTION_TYPES:
				return convertConnectionTypesToString(eDataType, instanceValue);
			case AcsProfilePackage.FUNDAMENTAL_TYPES:
				return convertFundamental_TypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHolder createLinkHolder() {
		LinkHolderImpl linkHolder = new LinkHolderImpl();
		return linkHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTransition createActionTransition() {
		ActionTransitionImpl actionTransition = new ActionTransitionImpl();
		return actionTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationTransition createInvocationTransition() {
		InvocationTransitionImpl invocationTransition = new InvocationTransitionImpl();
		return invocationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSystem createAtomicSystem() {
		AtomicSystemImpl atomicSystem = new AtomicSystemImpl();
		return atomicSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkConnection createLinkConnection() {
		LinkConnectionImpl linkConnection = new LinkConnectionImpl();
		return linkConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoI createSoI() {
		SoIImpl soI = new SoIImpl();
		return soI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnection createInterfaceConnection() {
		InterfaceConnectionImpl interfaceConnection = new InterfaceConnectionImpl();
		return interfaceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainMachine createMainMachine() {
		MainMachineImpl mainMachine = new MainMachineImpl();
		return mainMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncDecl createFuncDecl() {
		FuncDeclImpl funcDecl = new FuncDeclImpl();
		return funcDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Full_Type createFull_Type() {
		Full_TypeImpl full_Type = new Full_TypeImpl();
		return full_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenType createTokenType() {
		TokenTypeImpl tokenType = new TokenTypeImpl();
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHub createLinkHub() {
		LinkHubImpl linkHub = new LinkHubImpl();
		return linkHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator createInitiator() {
		InitiatorImpl initiator = new InitiatorImpl();
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler createHandler() {
		HandlerImpl handler = new HandlerImpl();
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber createSubscriber() {
		SubscriberImpl subscriber = new SubscriberImpl();
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubMachine createSubMachine() {
		SubMachineImpl subMachine = new SubMachineImpl();
		return subMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerBody createControllerBody() {
		ControllerBodyImpl controllerBody = new ControllerBodyImpl();
		return controllerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitMachine createImplicitMachine() {
		ImplicitMachineImpl implicitMachine = new ImplicitMachineImpl();
		return implicitMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONIntermediateState createCONIntermediateState() {
		CONIntermediateStateImpl conIntermediateState = new CONIntermediateStateImpl();
		return conIntermediateState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMIntermediateState createCOMIntermediateState() {
		COMIntermediateStateImpl comIntermediateState = new COMIntermediateStateImpl();
		return comIntermediateState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONStartState createCONStartState() {
		CONStartStateImpl conStartState = new CONStartStateImpl();
		return conStartState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMStartState createCOMStartState() {
		COMStartStateImpl comStartState = new COMStartStateImpl();
		return comStartState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMEndState createCOMEndState() {
		COMEndStateImpl comEndState = new COMEndStateImpl();
		return comEndState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenSelector createTokenSelector() {
		TokenSelectorImpl tokenSelector = new TokenSelectorImpl();
		return tokenSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declared_Type createDeclared_Type() {
		Declared_TypeImpl declared_Type = new Declared_TypeImpl();
		return declared_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACS_Type createACS_Type() {
		ACS_TypeImpl acS_Type = new ACS_TypeImpl();
		return acS_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_Reference createType_Reference() {
		Type_ReferenceImpl type_Reference = new Type_ReferenceImpl();
		return type_Reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nullable createNullable() {
		NullableImpl nullable = new NullableImpl();
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.papyrus.acs.profile.model.Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldPath createFieldPath() {
		FieldPathImpl fieldPath = new FieldPathImpl();
		return fieldPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePath createBasePath() {
		BasePathImpl basePath = new BasePathImpl();
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementPath createElementPath() {
		ElementPathImpl elementPath = new ElementPathImpl();
		return elementPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRange createSymbolRange() {
		SymbolRangeImpl symbolRange = new SymbolRangeImpl();
		return symbolRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precision createPrecision() {
		PrecisionImpl precision = new PrecisionImpl();
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumRange createNumRange() {
		NumRangeImpl numRange = new NumRangeImpl();
		return numRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharRange createCharRange() {
		CharRangeImpl charRange = new CharRangeImpl();
		return charRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySizeRange createArraySizeRange() {
		ArraySizeRangeImpl arraySizeRange = new ArraySizeRangeImpl();
		return arraySizeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.papyrus.acs.profile.model.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACS_Model createACS_Model() {
		ACS_ModelImpl acS_Model = new ACS_ModelImpl();
		return acS_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTypes createConnectionTypesFromString(EDataType eDataType, String initialValue) {
		ConnectionTypes result = ConnectionTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fundamental_Types createFundamental_TypesFromString(EDataType eDataType, String initialValue) {
		Fundamental_Types result = Fundamental_Types.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFundamental_TypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcsProfilePackage getAcsProfilePackage() {
		return (AcsProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AcsProfilePackage getPackage() {
		return AcsProfilePackage.eINSTANCE;
	}

} //AcsProfileFactoryImpl
