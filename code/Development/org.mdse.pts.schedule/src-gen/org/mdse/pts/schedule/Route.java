/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.depot.Train;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;
import org.mdse.pts.time.Day;
import org.mdse.pts.time.Time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Route#getTime <em>Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getStart <em>Start</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getTerminate <em>Terminate</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getDrive <em>Drive</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getStop <em>Stop</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Route#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.time.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Time()
	 * @model containment="true"
	 * @generated
	 */
	EList<Time> getTime();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Station)
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Start()
	 * @model
	 * @generated
	 */
	Station getStart();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Route#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Station value);

	/**
	 * Returns the value of the '<em><b>Terminate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminate</em>' reference.
	 * @see #setTerminate(Station)
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Terminate()
	 * @model
	 * @generated
	 */
	Station getTerminate();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Route#getTerminate <em>Terminate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminate</em>' reference.
	 * @see #getTerminate()
	 * @generated
	 */
	void setTerminate(Station value);

	/**
	 * Returns the value of the '<em><b>Drive</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.pts.network.Leg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive</em>' reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Drive()
	 * @model
	 * @generated
	 */
	EList<Leg> getDrive();

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.pts.network.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Stop()
	 * @model
	 * @generated
	 */
	EList<Station> getStop();

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute list.
	 * The list contents are of type {@link org.mdse.pts.time.Day}.
	 * The literals are from the enumeration {@link org.mdse.pts.time.Day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute list.
	 * @see org.mdse.pts.time.Day
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Day()
	 * @model default="Friday" required="true"
	 * @generated
	 */
	EList<Day> getDay();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.Platform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Platform()
	 * @model containment="true"
	 * @generated
	 */
	EList<Platform> getPlatform();

	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' attribute list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_StopTime()
	 * @model
	 * @generated
	 */
	EList<Integer> getStopTime();

	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see org.mdse.pts.schedule.SchedulePackage#getRoute_Train()
	 * @model required="true"
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Route#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

} // Route
