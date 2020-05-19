/**
 */
package org.mdse.pts.time;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.mdse.pts.time.Time#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.time.Time#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.time.Time#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.time.TimePackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute list.
	 * The list contents are of type {@link org.mdse.pts.time.Day}.
	 * The literals are from the enumeration {@link org.mdse.pts.time.Day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute list.
	 * @see org.mdse.pts.time.Day
	 * @see org.mdse.pts.time.TimePackage#getTime_Day()
	 * @model required="true"
	 * @generated
	 */
	EList<Day> getDay();

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute list.
	 * @see org.mdse.pts.time.TimePackage#getTime_Hour()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getHour();

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute list.
	 * @see org.mdse.pts.time.TimePackage#getTime_Minute()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getMinute();

} // Time
