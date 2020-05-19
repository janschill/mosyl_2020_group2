/**
 */
package org.mdse.pts.time;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.time.Time#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.time.Time#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.time.TimePackage#getTime()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidHourValue ValidMinuteValue'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidHourValue='\n\t\t\t0 &lt;= hour and hour &lt;= 23' ValidMinuteValue='\n\t\t\t 0 &lt;= minute and minute &lt;= 59'"
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see org.mdse.pts.time.TimePackage#getTime_Hour()
	 * @model required="true"
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link org.mdse.pts.time.Time#getHour <em>Hour</em>}' attribute.
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
	 * @see org.mdse.pts.time.TimePackage#getTime_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link org.mdse.pts.time.Time#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

} // Time
