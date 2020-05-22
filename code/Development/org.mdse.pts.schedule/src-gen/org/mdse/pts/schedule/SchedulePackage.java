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
	 * The feature id for the '<em><b>Route Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ROUTE_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Transits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TRANSITS = 1;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TRAIN = 2;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.STimeImpl <em>STime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.STimeImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSTime()
	 * @generated
	 */
	int STIME = 3;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIME__DAY = 0;

	/**
	 * The feature id for the '<em><b>Hrmin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIME__HRMIN = 1;

	/**
	 * The number of structural features of the '<em>STime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>STime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.HrMinImpl <em>Hr Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.HrMinImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getHrMin()
	 * @generated
	 */
	int HR_MIN = 4;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_MIN__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_MIN__MINUTE = 1;

	/**
	 * The number of structural features of the '<em>Hr Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_MIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hr Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_MIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.PlatformImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 5;

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
	int NETWORK_REFERENCE = 6;

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
	 * The meta object id for the '{@link org.mdse.pts.schedule.impl.TransitImpl <em>Transit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.pts.schedule.impl.TransitImpl
	 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTransit()
	 * @generated
	 */
	int TRANSIT = 7;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__STATION = 1;

	/**
	 * The feature id for the '<em><b>Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__LEG = 2;

	/**
	 * The feature id for the '<em><b>Standing Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__STANDING_DURATION = 3;

	/**
	 * The number of structural features of the '<em>Transit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.Route#getTransits <em>Transits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transits</em>'.
	 * @see org.mdse.pts.schedule.Route#getTransits()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Transits();

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
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.STime <em>STime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STime</em>'.
	 * @see org.mdse.pts.schedule.STime
	 * @generated
	 */
	EClass getSTime();

	/**
	 * Returns the meta object for the attribute list '{@link org.mdse.pts.schedule.STime#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Day</em>'.
	 * @see org.mdse.pts.schedule.STime#getDay()
	 * @see #getSTime()
	 * @generated
	 */
	EAttribute getSTime_Day();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.pts.schedule.STime#getHrmin <em>Hrmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hrmin</em>'.
	 * @see org.mdse.pts.schedule.STime#getHrmin()
	 * @see #getSTime()
	 * @generated
	 */
	EReference getSTime_Hrmin();

	/**
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.HrMin <em>Hr Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hr Min</em>'.
	 * @see org.mdse.pts.schedule.HrMin
	 * @generated
	 */
	EClass getHrMin();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.HrMin#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.mdse.pts.schedule.HrMin#getHour()
	 * @see #getHrMin()
	 * @generated
	 */
	EAttribute getHrMin_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.HrMin#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see org.mdse.pts.schedule.HrMin#getMinute()
	 * @see #getHrMin()
	 * @generated
	 */
	EAttribute getHrMin_Minute();

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
	 * Returns the meta object for class '{@link org.mdse.pts.schedule.Transit <em>Transit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transit</em>'.
	 * @see org.mdse.pts.schedule.Transit
	 * @generated
	 */
	EClass getTransit();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.pts.schedule.Transit#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see org.mdse.pts.schedule.Transit#getPlatform()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Platform();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Transit#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see org.mdse.pts.schedule.Transit#getStation()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Station();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.pts.schedule.Transit#getLeg <em>Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leg</em>'.
	 * @see org.mdse.pts.schedule.Transit#getLeg()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Leg();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.pts.schedule.Transit#getStandingDuration <em>Standing Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standing Duration</em>'.
	 * @see org.mdse.pts.schedule.Transit#getStandingDuration()
	 * @see #getTransit()
	 * @generated
	 */
	EAttribute getTransit_StandingDuration();

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
		 * The meta object literal for the '<em><b>Transits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TRANSITS = eINSTANCE.getRoute_Transits();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TRAIN = eINSTANCE.getRoute_Train();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.STimeImpl <em>STime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.STimeImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getSTime()
		 * @generated
		 */
		EClass STIME = eINSTANCE.getSTime();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIME__DAY = eINSTANCE.getSTime_Day();

		/**
		 * The meta object literal for the '<em><b>Hrmin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIME__HRMIN = eINSTANCE.getSTime_Hrmin();

		/**
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.HrMinImpl <em>Hr Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.HrMinImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getHrMin()
		 * @generated
		 */
		EClass HR_MIN = eINSTANCE.getHrMin();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_MIN__HOUR = eINSTANCE.getHrMin_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_MIN__MINUTE = eINSTANCE.getHrMin_Minute();

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
		 * The meta object literal for the '{@link org.mdse.pts.schedule.impl.TransitImpl <em>Transit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.pts.schedule.impl.TransitImpl
		 * @see org.mdse.pts.schedule.impl.SchedulePackageImpl#getTransit()
		 * @generated
		 */
		EClass TRANSIT = eINSTANCE.getTransit();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__PLATFORM = eINSTANCE.getTransit_Platform();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__STATION = eINSTANCE.getTransit_Station();

		/**
		 * The meta object literal for the '<em><b>Leg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__LEG = eINSTANCE.getTransit_Leg();

		/**
		 * The meta object literal for the '<em><b>Standing Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIT__STANDING_DURATION = eINSTANCE.getTransit_StandingDuration();

	}

} //SchedulePackage
