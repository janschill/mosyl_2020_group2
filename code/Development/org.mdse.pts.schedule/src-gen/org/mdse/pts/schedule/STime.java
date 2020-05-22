/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.STime#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.STime#getHrmin <em>Hrmin</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSTime()
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
	 * @see org.mdse.pts.schedule.SchedulePackage#getSTime_Day()
	 * @model
	 * @generated
	 */
	EList<Day> getDay();

	/**
	 * Returns the value of the '<em><b>Hrmin</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.schedule.HrMin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hrmin</em>' containment reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSTime_Hrmin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HrMin> getHrmin();

} // STime
