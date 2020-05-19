/**
 */
package org.mdse.pts.schedule;

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
 * @see org.mdse.pts.schedule.ScheduleFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/schedule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schedule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulePackage eINSTANCE = org.mdse.pts.schedule.impl.SchedulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.ScheduleImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Network Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NETWORK_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Depot Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DEPOT_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Train Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TRAIN_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Route Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ROUTE_REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.DepotReferenceImpl <em>Depot Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.DepotReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getDepotReference()
	 * @generated
	 */
	int DEPOT_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Depot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_REFERENCE__DEPOT = 0;

	/**
	 * The number of structural features of the '<em>Depot Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Depot Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.RouteImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__START = 1;

	/**
	 * The feature id for the '<em><b>Terminate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TERMINATE = 2;

	/**
	 * The feature id for the '<em><b>Drive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DRIVE = 3;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STOP = 4;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DAY = 5;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__PLATFORM = 6;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STOP_TIME = 7;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TRAIN = 8;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.StopTimeImpl <em>Stop Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.StopTimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStopTime()
	 * @generated
	 */
	int STOP_TIME = 3;

	/**
	 * The number of structural features of the '<em>Stop Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stop Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.PlatformImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.NetworkReferenceImpl <em>Network Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.NetworkReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getNetworkReference()
	 * @generated
	 */
	int NETWORK_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REFERENCE__NETWORK = 0;

	/**
	 * The number of structural features of the '<em>Network Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TrainReferenceImpl <em>Train Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TrainReferenceImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainReference()
	 * @generated
	 */
	int TRAIN_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_REFERENCE__TRAIN = 0;

	/**
	 * The number of structural features of the '<em>Train Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Train Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see org.mdse.pts.schedule.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.Schedule#getNetworkReference <em>Network Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Reference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getNetworkReference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_NetworkReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getDepotReference <em>Depot Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Depot Reference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getDepotReference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_DepotReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getTrainReference <em>Train Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Reference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getTrainReference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_TrainReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Schedule#getRouteReference <em>Route Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Reference</em>'.
	 * @see org.mdse.pts.schedule.Schedule#getRouteReference()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_RouteReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.DepotReference <em>Depot Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depot Reference</em>'.
	 * @see org.mdse.pts.schedule.DepotReference
	 * @generated
	 */
	EClass getDepotReference();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.DepotReference#getDepot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depot</em>'.
	 * @see org.mdse.pts.schedule.DepotReference#getDepot()
	 * @see #getDepotReference()
	 * @generated
	 */
	EReference getDepotReference_Depot();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see org.mdse.pts.schedule.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Route#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time</em>'.
	 * @see org.mdse.pts.schedule.Route#getTime()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Time();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Route#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.mdse.pts.schedule.Route#getStart()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Start();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Route#getTerminate <em>Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminate</em>'.
	 * @see org.mdse.pts.schedule.Route#getTerminate()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Terminate();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.schedule.Route#getDrive <em>Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Drive</em>'.
	 * @see org.mdse.pts.schedule.Route#getDrive()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Drive();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.pts.schedule.Route#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop</em>'.
	 * @see org.mdse.pts.schedule.Route#getStop()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Stop();

	/**
	 * Returns the meta object for the attribute list '{@link org.mdse.pts.schedule.Route#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Day</em>'.
	 * @see org.mdse.pts.schedule.Route#getDay()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Day();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Route#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform</em>'.
	 * @see org.mdse.pts.schedule.Route#getPlatform()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Platform();

	/**
	 * Returns the meta object for the attribute list '{@link org.mdse.pts.schedule.Route#getStopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stop Time</em>'.
	 * @see org.mdse.pts.schedule.Route#getStopTime()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_StopTime();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Route#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see org.mdse.pts.schedule.Route#getTrain()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Train();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.StopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Time</em>'.
	 * @see org.mdse.pts.schedule.StopTime
	 * @generated
	 */
	EClass getStopTime();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.mdse.pts.schedule.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Platform#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.pts.schedule.Platform#getName()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Name();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.NetworkReference <em>Network Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Reference</em>'.
	 * @see org.mdse.pts.schedule.NetworkReference
	 * @generated
	 */
	EClass getNetworkReference();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.NetworkReference#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see org.mdse.pts.schedule.NetworkReference#getNetwork()
	 * @see #getNetworkReference()
	 * @generated
	 */
	EReference getNetworkReference_Network();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.TrainReference <em>Train Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Reference</em>'.
	 * @see org.mdse.pts.schedule.TrainReference
	 * @generated
	 */
	EClass getTrainReference();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.TrainReference#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see org.mdse.pts.schedule.TrainReference#getTrain()
	 * @see #getTrainReference()
	 * @generated
	 */
	EReference getTrainReference_Train();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScheduleFactory getScheduleFactory();

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
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.ScheduleImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Network Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__NETWORK_REFERENCE = eINSTANCE.getSchedule_NetworkReference();

		/**
		 * The meta object literal for the '<em><b>Depot Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__DEPOT_REFERENCE = eINSTANCE.getSchedule_DepotReference();

		/**
		 * The meta object literal for the '<em><b>Train Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__TRAIN_REFERENCE = eINSTANCE.getSchedule_TrainReference();

		/**
		 * The meta object literal for the '<em><b>Route Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__ROUTE_REFERENCE = eINSTANCE.getSchedule_RouteReference();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.DepotReferenceImpl <em>Depot Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.DepotReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getDepotReference()
		 * @generated
		 */
		EClass DEPOT_REFERENCE = eINSTANCE.getDepotReference();

		/**
		 * The meta object literal for the '<em><b>Depot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOT_REFERENCE__DEPOT = eINSTANCE.getDepotReference_Depot();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.RouteImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TIME = eINSTANCE.getRoute_Time();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__START = eINSTANCE.getRoute_Start();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TERMINATE = eINSTANCE.getRoute_Terminate();

		/**
		 * The meta object literal for the '<em><b>Drive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__DRIVE = eINSTANCE.getRoute_Drive();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STOP = eINSTANCE.getRoute_Stop();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DAY = eINSTANCE.getRoute_Day();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__PLATFORM = eINSTANCE.getRoute_Platform();

		/**
		 * The meta object literal for the '<em><b>Stop Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__STOP_TIME = eINSTANCE.getRoute_StopTime();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TRAIN = eINSTANCE.getRoute_Train();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.StopTimeImpl <em>Stop Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.StopTimeImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getStopTime()
		 * @generated
		 */
		EClass STOP_TIME = eINSTANCE.getStopTime();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.PlatformImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__NAME = eINSTANCE.getPlatform_Name();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.NetworkReferenceImpl <em>Network Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.NetworkReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getNetworkReference()
		 * @generated
		 */
		EClass NETWORK_REFERENCE = eINSTANCE.getNetworkReference();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_REFERENCE__NETWORK = eINSTANCE.getNetworkReference_Network();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TrainReferenceImpl <em>Train Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TrainReferenceImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTrainReference()
		 * @generated
		 */
		EClass TRAIN_REFERENCE = eINSTANCE.getTrainReference();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_REFERENCE__TRAIN = eINSTANCE.getTrainReference_Train();

	}

} //SchedulePackage
