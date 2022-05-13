/**
 */
package org.eclipse.papyrus.acs.profile.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.acs.profile.model.AcsProfilePackage
 * @generated
 */
public class AcsProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AcsProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcsProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = AcsProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AcsProfilePackage.LINK_HOLDER: {
				LinkHolder linkHolder = (LinkHolder)theEObject;
				T result = caseLinkHolder(linkHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ACTION_TRANSITION: {
				ActionTransition actionTransition = (ActionTransition)theEObject;
				T result = caseActionTransition(actionTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.INVOCATION_TRANSITION: {
				InvocationTransition invocationTransition = (InvocationTransition)theEObject;
				T result = caseInvocationTransition(invocationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseSubsystem(composite);
				if (result == null) result = caseContainer(composite);
				if (result == null) result = caseSystem(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = caseSystem(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.SYSTEM: {
				org.eclipse.papyrus.acs.profile.model.System system = (org.eclipse.papyrus.acs.profile.model.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ATOMIC_SYSTEM: {
				AtomicSystem atomicSystem = (AtomicSystem)theEObject;
				T result = caseAtomicSystem(atomicSystem);
				if (result == null) result = caseSubsystem(atomicSystem);
				if (result == null) result = caseSystem(atomicSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.LINK_CONNECTION: {
				LinkConnection linkConnection = (LinkConnection)theEObject;
				T result = caseLinkConnection(linkConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.SO_I: {
				SoI soI = (SoI)theEObject;
				T result = caseSoI(soI);
				if (result == null) result = caseSystem(soI);
				if (result == null) result = caseContainer(soI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseSubsystem(reference);
				if (result == null) result = caseSystem(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.INTERFACE_CONNECTION: {
				InterfaceConnection interfaceConnection = (InterfaceConnection)theEObject;
				T result = caseInterfaceConnection(interfaceConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.EVENT_DECLARATION: {
				EventDeclaration eventDeclaration = (EventDeclaration)theEObject;
				T result = caseEventDeclaration(eventDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.MAIN_MACHINE: {
				MainMachine mainMachine = (MainMachine)theEObject;
				T result = caseMainMachine(mainMachine);
				if (result == null) result = caseExplicitMachine(mainMachine);
				if (result == null) result = caseMachine(mainMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.EXPLICIT_MACHINE: {
				ExplicitMachine explicitMachine = (ExplicitMachine)theEObject;
				T result = caseExplicitMachine(explicitMachine);
				if (result == null) result = caseMachine(explicitMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.FUNC_DECL: {
				FuncDecl funcDecl = (FuncDecl)theEObject;
				T result = caseFuncDecl(funcDecl);
				if (result == null) result = caseTypInOut(funcDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.TYP_IN_OUT: {
				TypInOut typInOut = (TypInOut)theEObject;
				T result = caseTypInOut(typInOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.FULL_TYPE: {
				Full_Type full_Type = (Full_Type)theEObject;
				T result = caseFull_Type(full_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.TOKEN_TYPE: {
				TokenType tokenType = (TokenType)theEObject;
				T result = caseTokenType(tokenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.LINK_HUB: {
				LinkHub linkHub = (LinkHub)theEObject;
				T result = caseLinkHub(linkHub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.INITIATOR: {
				Initiator initiator = (Initiator)theEObject;
				T result = caseInitiator(initiator);
				if (result == null) result = caseTypInOut(initiator);
				if (result == null) result = caseEventDeclaration(initiator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.HANDLER: {
				Handler handler = (Handler)theEObject;
				T result = caseHandler(handler);
				if (result == null) result = caseTypInOut(handler);
				if (result == null) result = caseEventDeclaration(handler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.SUBSCRIBER: {
				Subscriber subscriber = (Subscriber)theEObject;
				T result = caseSubscriber(subscriber);
				if (result == null) result = caseEventDeclaration(subscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.PUBLISHER: {
				Publisher publisher = (Publisher)theEObject;
				T result = casePublisher(publisher);
				if (result == null) result = caseEventDeclaration(publisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.SUB_MACHINE: {
				SubMachine subMachine = (SubMachine)theEObject;
				T result = caseSubMachine(subMachine);
				if (result == null) result = caseExplicitMachine(subMachine);
				if (result == null) result = caseTypInOut(subMachine);
				if (result == null) result = caseMachine(subMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CONTROLLER_BODY: {
				ControllerBody controllerBody = (ControllerBody)theEObject;
				T result = caseControllerBody(controllerBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.COM_STATE: {
				COMState comState = (COMState)theEObject;
				T result = caseCOMState(comState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CON_STATE: {
				CONState conState = (CONState)theEObject;
				T result = caseCONState(conState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.IMPLICIT_MACHINE: {
				ImplicitMachine implicitMachine = (ImplicitMachine)theEObject;
				T result = caseImplicitMachine(implicitMachine);
				if (result == null) result = caseMachine(implicitMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CON_INTERMEDIATE_STATE: {
				CONIntermediateState conIntermediateState = (CONIntermediateState)theEObject;
				T result = caseCONIntermediateState(conIntermediateState);
				if (result == null) result = caseCONState(conIntermediateState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.COM_INTERMEDIATE_STATE: {
				COMIntermediateState comIntermediateState = (COMIntermediateState)theEObject;
				T result = caseCOMIntermediateState(comIntermediateState);
				if (result == null) result = caseCOMState(comIntermediateState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CON_START_STATE: {
				CONStartState conStartState = (CONStartState)theEObject;
				T result = caseCONStartState(conStartState);
				if (result == null) result = caseCONState(conStartState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.COM_START_STATE: {
				COMStartState comStartState = (COMStartState)theEObject;
				T result = caseCOMStartState(comStartState);
				if (result == null) result = caseCOMState(comStartState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.COM_END_STATE: {
				COMEndState comEndState = (COMEndState)theEObject;
				T result = caseCOMEndState(comEndState);
				if (result == null) result = caseCOMState(comEndState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.TOKEN_SELECTOR: {
				TokenSelector tokenSelector = (TokenSelector)theEObject;
				T result = caseTokenSelector(tokenSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.DECLARED_TYPE: {
				Declared_Type declared_Type = (Declared_Type)theEObject;
				T result = caseDeclared_Type(declared_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ACS_TYPE: {
				ACS_Type acS_Type = (ACS_Type)theEObject;
				T result = caseACS_Type(acS_Type);
				if (result == null) result = caseFull_Type(acS_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.TYPE_REFERENCE: {
				Type_Reference type_Reference = (Type_Reference)theEObject;
				T result = caseType_Reference(type_Reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.NULLABLE: {
				Nullable nullable = (Nullable)theEObject;
				T result = caseNullable(nullable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.RECORD: {
				org.eclipse.papyrus.acs.profile.model.Record record = (org.eclipse.papyrus.acs.profile.model.Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.FIELD_PATH: {
				FieldPath fieldPath = (FieldPath)theEObject;
				T result = caseFieldPath(fieldPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.BASE_PATH: {
				BasePath basePath = (BasePath)theEObject;
				T result = caseBasePath(basePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ELEMENT_PATH: {
				ElementPath elementPath = (ElementPath)theEObject;
				T result = caseElementPath(elementPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.SYMBOL_RANGE: {
				SymbolRange symbolRange = (SymbolRange)theEObject;
				T result = caseSymbolRange(symbolRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.PRECISION: {
				Precision precision = (Precision)theEObject;
				T result = casePrecision(precision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.NUM_RANGE: {
				NumRange numRange = (NumRange)theEObject;
				T result = caseNumRange(numRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.CHAR_RANGE: {
				CharRange charRange = (CharRange)theEObject;
				T result = caseCharRange(charRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ARRAY_SIZE_RANGE: {
				ArraySizeRange arraySizeRange = (ArraySizeRange)theEObject;
				T result = caseArraySizeRange(arraySizeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.VOID: {
				org.eclipse.papyrus.acs.profile.model.Void void_ = (org.eclipse.papyrus.acs.profile.model.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = caseFull_Type(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcsProfilePackage.ACS_MODEL: {
				ACS_Model acS_Model = (ACS_Model)theEObject;
				T result = caseACS_Model(acS_Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkHolder(LinkHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionTransition(ActionTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationTransition(InvocationTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.eclipse.papyrus.acs.profile.model.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicSystem(AtomicSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkConnection(LinkConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoI(SoI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnection(InterfaceConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDeclaration(EventDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainMachine(MainMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitMachine(ExplicitMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Func Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Func Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncDecl(FuncDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typ In Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typ In Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypInOut(TypInOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFull_Type(Full_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenType(TokenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Hub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Hub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkHub(LinkHub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiator(Initiator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandler(Handler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriber(Subscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubMachine(SubMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerBody(ControllerBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COM State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COM State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOMState(COMState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CON State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CON State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONState(CONState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitMachine(ImplicitMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CON Intermediate State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CON Intermediate State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONIntermediateState(CONIntermediateState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COM Intermediate State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COM Intermediate State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOMIntermediateState(COMIntermediateState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CON Start State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CON Start State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONStartState(CONStartState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COM Start State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COM Start State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOMStartState(COMStartState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COM End State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COM End State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOMEndState(COMEndState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenSelector(TokenSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclared_Type(Declared_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACS_Type(ACS_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType_Reference(Type_Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nullable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nullable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullable(Nullable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(org.eclipse.papyrus.acs.profile.model.Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldPath(FieldPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePath(BasePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPath(ElementPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolRange(SymbolRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecision(Precision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumRange(NumRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharRange(CharRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Size Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Size Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySizeRange(ArraySizeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(org.eclipse.papyrus.acs.profile.model.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACS Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACS Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACS_Model(ACS_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AcsProfileSwitch
