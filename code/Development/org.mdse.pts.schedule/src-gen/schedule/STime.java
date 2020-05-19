/**
 */
package schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.time.Day;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schedule.STime#getDay <em>Day</em>}</li>
 *   <li>{@link schedule.STime#getHour <em>Hour</em>}</li>
 *   <li>{@link schedule.STime#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see schedule.SchedulePackage#getSTime()
 * @model
 * @generated
 */
public interface STime extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute list.
	 * The list contents are of type {@link org.mdse.pts.time.Day}.
	 * The literals are from the enumeration {@link org.mdse.pts.time.Day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute list.
	 * @see org.mdse.pts.time.Day
	 * @see schedule.SchedulePackage#getSTime_Day()
	 * @model
	 * @generated
	 */
	EList<Day> getDay();

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute list.
	 * @see schedule.SchedulePackage#getSTime_Hour()
	 * @model
	 * @generated
	 */
	EList<Integer> getHour();

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute list.
	 * @see schedule.SchedulePackage#getSTime_Minute()
	 * @model
	 * @generated
	 */
	EList<Integer> getMinute();

} // STime
