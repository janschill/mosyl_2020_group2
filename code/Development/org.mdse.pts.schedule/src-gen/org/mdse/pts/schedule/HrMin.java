/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hr Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.HrMin#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.HrMin#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getHrMin()
 * @model
 * @generated
 */
public interface HrMin extends EObject {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see org.mdse.pts.schedule.SchedulePackage#getHrMin_Hour()
	 * @model required="true"
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.HrMin#getHour <em>Hour</em>}' attribute.
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
	 * @see org.mdse.pts.schedule.SchedulePackage#getHrMin_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.HrMin#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

} // HrMin
