/**
 */
package org.mdse.pts.depot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.depot.DepotFactory;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.DiningCoach;
import org.mdse.pts.depot.FirstClassPassengerCoach;
import org.mdse.pts.depot.InnerCoach;
import org.mdse.pts.depot.IntercityTrain;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.OuterCoach;
import org.mdse.pts.depot.PassengerCoach;
import org.mdse.pts.depot.RegionalTrain;
import org.mdse.pts.depot.SecondClassPassengerCoach;
import org.mdse.pts.depot.Train;
import org.mdse.pts.depot.util.DepotValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotPackageImpl extends EPackageImpl implements DepotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalTrainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercityTrainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locomotiveEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCoachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diningCoachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerCoachEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outerCoachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstClassPassengerCoachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondClassPassengerCoachEClass = null;

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
	 * @see org.mdse.pts.depot.DepotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DepotPackageImpl() {
		super(eNS_URI, DepotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DepotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DepotPackage init() {
		if (isInited) return (DepotPackage)EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDepotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DepotPackageImpl theDepotPackage = registeredDepotPackage instanceof DepotPackageImpl ? (DepotPackageImpl)registeredDepotPackage : new DepotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDepotPackage.createPackageContents();

		// Initialize created meta-data
		theDepotPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDepotPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DepotValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDepotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DepotPackage.eNS_URI, theDepotPackage);
		return theDepotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepot() {
		return depotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepot_Trains() {
		return (EReference)depotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_Name() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrain_Coaches() {
		return (EReference)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoach() {
		return coachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionalTrain() {
		return regionalTrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntercityTrain() {
		return intercityTrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocomotive() {
		return locomotiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassengerCoach() {
		return passengerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiningCoach() {
		return diningCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerCoach() {
		return innerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInnerCoach_Number() {
		return (EAttribute)innerCoachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOuterCoach() {
		return outerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirstClassPassengerCoach() {
		return firstClassPassengerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecondClassPassengerCoach() {
		return secondClassPassengerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepotFactory getDepotFactory() {
		return (DepotFactory)getEFactoryInstance();
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
		depotEClass = createEClass(DEPOT);
		createEReference(depotEClass, DEPOT__TRAINS);

		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__NAME);
		createEReference(trainEClass, TRAIN__COACHES);

		coachEClass = createEClass(COACH);

		regionalTrainEClass = createEClass(REGIONAL_TRAIN);

		intercityTrainEClass = createEClass(INTERCITY_TRAIN);

		locomotiveEClass = createEClass(LOCOMOTIVE);

		passengerCoachEClass = createEClass(PASSENGER_COACH);

		diningCoachEClass = createEClass(DINING_COACH);

		innerCoachEClass = createEClass(INNER_COACH);
		createEAttribute(innerCoachEClass, INNER_COACH__NUMBER);

		outerCoachEClass = createEClass(OUTER_COACH);

		firstClassPassengerCoachEClass = createEClass(FIRST_CLASS_PASSENGER_COACH);

		secondClassPassengerCoachEClass = createEClass(SECOND_CLASS_PASSENGER_COACH);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		regionalTrainEClass.getESuperTypes().add(this.getTrain());
		intercityTrainEClass.getESuperTypes().add(this.getTrain());
		locomotiveEClass.getESuperTypes().add(this.getOuterCoach());
		passengerCoachEClass.getESuperTypes().add(this.getInnerCoach());
		passengerCoachEClass.getESuperTypes().add(this.getOuterCoach());
		diningCoachEClass.getESuperTypes().add(this.getInnerCoach());
		diningCoachEClass.getESuperTypes().add(this.getOuterCoach());
		innerCoachEClass.getESuperTypes().add(this.getCoach());
		outerCoachEClass.getESuperTypes().add(this.getCoach());
		firstClassPassengerCoachEClass.getESuperTypes().add(this.getPassengerCoach());
		secondClassPassengerCoachEClass.getESuperTypes().add(this.getPassengerCoach());

		// Initialize classes, features, and operations; add parameters
		initEClass(depotEClass, Depot.class, "Depot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepot_Trains(), this.getTrain(), null, "trains", null, 0, -1, Depot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrain_Coaches(), this.getCoach(), null, "coaches", null, 0, -1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coachEClass, Coach.class, "Coach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regionalTrainEClass, RegionalTrain.class, "RegionalTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intercityTrainEClass, IntercityTrain.class, "IntercityTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locomotiveEClass, Locomotive.class, "Locomotive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passengerCoachEClass, PassengerCoach.class, "PassengerCoach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diningCoachEClass, DiningCoach.class, "DiningCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(innerCoachEClass, InnerCoach.class, "InnerCoach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInnerCoach_Number(), ecorePackage.getEInt(), "number", null, 1, 1, InnerCoach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outerCoachEClass, OuterCoach.class, "OuterCoach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firstClassPassengerCoachEClass, FirstClassPassengerCoach.class, "FirstClassPassengerCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secondClassPassengerCoachEClass, SecondClassPassengerCoach.class, "SecondClassPassengerCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (trainEClass,
		   source,
		   new String[] {
			   "constraints", "LocomotiveInEitherEnd UniqueInnerCoachNumbersInTrain TrainCanHaveAtMostOneDiningCoach InnerCoachesInSequence DiningCoachBetweenFirstAndSecondClassPassengerCoaches"
		   });
		addAnnotation
		  (intercityTrainEClass,
		   source,
		   new String[] {
			   "constraints", "IntercityTrainMustHaveDiningCoach"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (trainEClass,
		   source,
		   new String[] {
			   "LocomotiveInEitherEnd", "self.coaches->size() > 0 implies self.coaches->first().oclIsTypeOf(Locomotive) or self.coaches->last().oclIsTypeOf(Locomotive)",
			   "UniqueInnerCoachNumbersInTrain", "\n\t\t\tself.coaches->select(oclIsKindOf(InnerCoach))->isUnique(oclAsType(InnerCoach).number)",
			   "TrainCanHaveAtMostOneDiningCoach", "\n\t\t\tself.coaches->select(oclIsKindOf(DiningCoach))->size() <= 1",
			   "InnerCoachesInSequence", "\n\t\t\tlet innerCoaches: OrderedSet(Coach) = self.coaches->select(oclIsKindOf(InnerCoach)),\n\t\t\t\tfirstClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches->size()}->iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches->at(idx).oclIsKindOf(FirstClassPassengerCoach)) then res->append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tfirstClassPCInSequence : Boolean = Sequence{1..firstClassPCIndexes->size()}->forAll(idx: Integer |\n\t\t\t\t\tidx = 1 or (firstClassPCIndexes->at(idx) = firstClassPCIndexes->at(idx - 1) + 1)\n\t\t\t\t),\n\t\t\t\tsecondClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches->size()}->iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches->at(idx).oclIsKindOf(SecondClassPassengerCoach)) then res->append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tsecondClassPCInSequence : Boolean = Sequence{1..secondClassPCIndexes->size()}->forAll(idx: Integer |\n\t\t\t\t\tidx = 1 or (secondClassPCIndexes->at(idx) = secondClassPCIndexes->at(idx - 1) + 1)\n\t\t\t\t)\n\t\t\tin\n\t\t\tfirstClassPCInSequence and secondClassPCInSequence",
			   "DiningCoachBetweenFirstAndSecondClassPassengerCoaches", "\n\t\t\tlet innerCoaches: OrderedSet(Coach) = self.coaches->select(oclIsKindOf(InnerCoach)),\n\t\t\t\tfirstClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches->size()}->iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches->at(idx).oclIsKindOf(FirstClassPassengerCoach)) then res->append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tsecondClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches->size()}->iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches->at(idx).oclIsKindOf(SecondClassPassengerCoach)) then res->append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tdiningCoachIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches->size()}->iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches->at(idx).oclIsKindOf(DiningCoach)) then res->append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t)\n\t\t\tin\n\t\t\t(firstClassPCIndexes->size() > 0 and secondClassPCIndexes->size() > 0 and diningCoachIndexes->size() > 0)\n\t\t\timplies (\n\t\t\t\t(firstClassPCIndexes->last() + 1 = diningCoachIndexes->first() and secondClassPCIndexes->first() - 1 = diningCoachIndexes->first())\n\t\t\t\tor\n\t\t\t\t(secondClassPCIndexes->last() + 1 = diningCoachIndexes->first() and firstClassPCIndexes->first() - 1 = diningCoachIndexes->first())\n\t\t\t)"
		   });
		addAnnotation
		  (intercityTrainEClass,
		   source,
		   new String[] {
			   "IntercityTrainMustHaveDiningCoach", "\n\t\tself.coaches->size() > 0 implies self.coaches->exists(oclIsKindOf(DiningCoach))"
		   });
	}

} //DepotPackageImpl
