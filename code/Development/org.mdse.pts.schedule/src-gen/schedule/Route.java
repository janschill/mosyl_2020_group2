/**
 */
package schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.depot.Train;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schedule.Route#getTime <em>Time</em>}</li>
 *   <li>{@link schedule.Route#getTransits <em>Transits</em>}</li>
 *   <li>{@link schedule.Route#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @see schedule.SchedulePackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference list.
	 * The list contents are of type {@link schedule.STime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference list.
	 * @see schedule.SchedulePackage#getRoute_Time()
	 * @model containment="true"
	 * @generated
	 */
	EList<STime> getTime();

	/**
	 * Returns the value of the '<em><b>Transits</b></em>' containment reference list.
	 * The list contents are of type {@link schedule.Transit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transits</em>' containment reference list.
	 * @see schedule.SchedulePackage#getRoute_Transits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transit> getTransits();

	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see schedule.SchedulePackage#getRoute_Train()
	 * @model required="true"
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link schedule.Route#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

} // Route
