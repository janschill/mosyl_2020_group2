/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Date#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Date#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Date#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mdse.pts.schedule.Day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see org.mdse.pts.schedule.Day
	 * @see #setDay(Day)
	 * @see org.mdse.pts.schedule.SchedulePackage#getDate_Day()
	 * @model
	 * @generated
	 */
	Day getDay();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Date#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see org.mdse.pts.schedule.Day
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Day value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see org.mdse.pts.schedule.SchedulePackage#getDate_Hour()
	 * @model
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Date#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(int value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see org.mdse.pts.schedule.SchedulePackage#getDate_Minute()
	 * @model
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Date#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

} // Date
