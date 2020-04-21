/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.mdse.pts.depot.DepotFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DepotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "depot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/depot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "depot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DepotPackage eINSTANCE = org.mdse.pts.depot.impl.DepotPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.DepotImpl <em>Depot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.DepotImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDepot()
	 * @generated
	 */
	int DEPOT = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT__TRAINS = 0;

	/**
	 * The number of structural features of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.TrainImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__COACHES = 1;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.CoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 2;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.RegionalTrainImpl <em>Regional Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.RegionalTrainImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getRegionalTrain()
	 * @generated
	 */
	int REGIONAL_TRAIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN__NAME = TRAIN__NAME;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN__COACHES = TRAIN__COACHES;

	/**
	 * The number of structural features of the '<em>Regional Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN_FEATURE_COUNT = TRAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regional Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN_OPERATION_COUNT = TRAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.IntercityTrainImpl <em>Intercity Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.IntercityTrainImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getIntercityTrain()
	 * @generated
	 */
	int INTERCITY_TRAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN__NAME = TRAIN__NAME;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN__COACHES = TRAIN__COACHES;

	/**
	 * The number of structural features of the '<em>Intercity Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN_FEATURE_COUNT = TRAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intercity Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN_OPERATION_COUNT = TRAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.OuterCoachImpl <em>Outer Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.OuterCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getOuterCoach()
	 * @generated
	 */
	int OUTER_COACH = 9;

	/**
	 * The number of structural features of the '<em>Outer Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTER_COACH_FEATURE_COUNT = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outer Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTER_COACH_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.LocomotiveImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getLocomotive()
	 * @generated
	 */
	int LOCOMOTIVE = 5;

	/**
	 * The number of structural features of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_FEATURE_COUNT = OUTER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_OPERATION_COUNT = OUTER_COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.InnerCoachImpl <em>Inner Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.InnerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getInnerCoach()
	 * @generated
	 */
	int INNER_COACH = 8;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_COACH__NUMBER = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inner Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_COACH_FEATURE_COUNT = COACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inner Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_COACH_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.PassengerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerCoach()
	 * @generated
	 */
	int PASSENGER_COACH = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__NUMBER = INNER_COACH__NUMBER;

	/**
	 * The number of structural features of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_FEATURE_COUNT = INNER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_OPERATION_COUNT = INNER_COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.DiningCoachImpl <em>Dining Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.DiningCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDiningCoach()
	 * @generated
	 */
	int DINING_COACH = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH__NUMBER = INNER_COACH__NUMBER;

	/**
	 * The number of structural features of the '<em>Dining Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH_FEATURE_COUNT = INNER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dining Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH_OPERATION_COUNT = INNER_COACH_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.FirstClassPassengerCoachImpl <em>First Class Passenger Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.FirstClassPassengerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getFirstClassPassengerCoach()
	 * @generated
	 */
	int FIRST_CLASS_PASSENGER_COACH = 10;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_PASSENGER_COACH__NUMBER = PASSENGER_COACH__NUMBER;

	/**
	 * The number of structural features of the '<em>First Class Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_PASSENGER_COACH_FEATURE_COUNT = PASSENGER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>First Class Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_PASSENGER_COACH_OPERATION_COUNT = PASSENGER_COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.depot.impl.SecondClassPassengerCoachImpl <em>Second Class Passenger Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.depot.impl.SecondClassPassengerCoachImpl
	 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getSecondClassPassengerCoach()
	 * @generated
	 */
	int SECOND_CLASS_PASSENGER_COACH = 11;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_CLASS_PASSENGER_COACH__NUMBER = PASSENGER_COACH__NUMBER;

	/**
	 * The number of structural features of the '<em>Second Class Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_CLASS_PASSENGER_COACH_FEATURE_COUNT = PASSENGER_COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Second Class Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_CLASS_PASSENGER_COACH_OPERATION_COUNT = PASSENGER_COACH_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Depot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depot</em>'.
	 * @see org.mdse.pts.depot.Depot
	 * @generated
	 */
	EClass getDepot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.depot.Depot#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see org.mdse.pts.depot.Depot#getTrains()
	 * @see #getDepot()
	 * @generated
	 */
	EReference getDepot_Trains();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see org.mdse.pts.depot.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.Train#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.depot.Train#getName()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.depot.Train#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coaches</em>'.
	 * @see org.mdse.pts.depot.Train#getCoaches()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Coaches();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see org.mdse.pts.depot.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.RegionalTrain <em>Regional Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Train</em>'.
	 * @see org.mdse.pts.depot.RegionalTrain
	 * @generated
	 */
	EClass getRegionalTrain();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.IntercityTrain <em>Intercity Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intercity Train</em>'.
	 * @see org.mdse.pts.depot.IntercityTrain
	 * @generated
	 */
	EClass getIntercityTrain();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.Locomotive <em>Locomotive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locomotive</em>'.
	 * @see org.mdse.pts.depot.Locomotive
	 * @generated
	 */
	EClass getLocomotive();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.PassengerCoach <em>Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Coach</em>'.
	 * @see org.mdse.pts.depot.PassengerCoach
	 * @generated
	 */
	EClass getPassengerCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.DiningCoach <em>Dining Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dining Coach</em>'.
	 * @see org.mdse.pts.depot.DiningCoach
	 * @generated
	 */
	EClass getDiningCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.InnerCoach <em>Inner Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Coach</em>'.
	 * @see org.mdse.pts.depot.InnerCoach
	 * @generated
	 */
	EClass getInnerCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.depot.InnerCoach#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.mdse.pts.depot.InnerCoach#getNumber()
	 * @see #getInnerCoach()
	 * @generated
	 */
	EAttribute getInnerCoach_Number();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.OuterCoach <em>Outer Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outer Coach</em>'.
	 * @see org.mdse.pts.depot.OuterCoach
	 * @generated
	 */
	EClass getOuterCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.FirstClassPassengerCoach <em>First Class Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Class Passenger Coach</em>'.
	 * @see org.mdse.pts.depot.FirstClassPassengerCoach
	 * @generated
	 */
	EClass getFirstClassPassengerCoach();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.depot.SecondClassPassengerCoach <em>Second Class Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Second Class Passenger Coach</em>'.
	 * @see org.mdse.pts.depot.SecondClassPassengerCoach
	 * @generated
	 */
	EClass getSecondClassPassengerCoach();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DepotFactory getDepotFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.DepotImpl <em>Depot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.DepotImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDepot()
		 * @generated
		 */
		EClass DEPOT = eINSTANCE.getDepot();
		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOT__TRAINS = eINSTANCE.getDepot_Trains();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.TrainImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__NAME = eINSTANCE.getTrain_Name();
		/**
		 * The meta object literal for the '<em><b>Coaches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__COACHES = eINSTANCE.getTrain_Coaches();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.CoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.RegionalTrainImpl <em>Regional Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.RegionalTrainImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getRegionalTrain()
		 * @generated
		 */
		EClass REGIONAL_TRAIN = eINSTANCE.getRegionalTrain();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.IntercityTrainImpl <em>Intercity Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.IntercityTrainImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getIntercityTrain()
		 * @generated
		 */
		EClass INTERCITY_TRAIN = eINSTANCE.getIntercityTrain();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.LocomotiveImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getLocomotive()
		 * @generated
		 */
		EClass LOCOMOTIVE = eINSTANCE.getLocomotive();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.PassengerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getPassengerCoach()
		 * @generated
		 */
		EClass PASSENGER_COACH = eINSTANCE.getPassengerCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.DiningCoachImpl <em>Dining Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.DiningCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getDiningCoach()
		 * @generated
		 */
		EClass DINING_COACH = eINSTANCE.getDiningCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.InnerCoachImpl <em>Inner Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.InnerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getInnerCoach()
		 * @generated
		 */
		EClass INNER_COACH = eINSTANCE.getInnerCoach();
		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_COACH__NUMBER = eINSTANCE.getInnerCoach_Number();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.OuterCoachImpl <em>Outer Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.OuterCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getOuterCoach()
		 * @generated
		 */
		EClass OUTER_COACH = eINSTANCE.getOuterCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.FirstClassPassengerCoachImpl <em>First Class Passenger Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.FirstClassPassengerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getFirstClassPassengerCoach()
		 * @generated
		 */
		EClass FIRST_CLASS_PASSENGER_COACH = eINSTANCE.getFirstClassPassengerCoach();
		/**
		 * The meta object literal for the '{@link org.mdse.pts.depot.impl.SecondClassPassengerCoachImpl <em>Second Class Passenger Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.depot.impl.SecondClassPassengerCoachImpl
		 * @see org.mdse.pts.depot.impl.DepotPackageImpl#getSecondClassPassengerCoach()
		 * @generated
		 */
		EClass SECOND_CLASS_PASSENGER_COACH = eINSTANCE.getSecondClassPassengerCoach();

	}

} //DepotPackage
