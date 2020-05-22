/**
 */
package org.mdse.pts.timetable;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.time.Time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Entry#getTrain <em>Train</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Entry#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.timetable.Entry#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' attribute.
	 * @see #setTrain(String)
	 * @see org.mdse.pts.timetable.TimetablePackage#getEntry_Train()
	 * @model
	 * @generated
	 */
	String getTrain();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Entry#getTrain <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' attribute.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(String value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see org.mdse.pts.timetable.TimetablePackage#getEntry_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Entry#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see org.mdse.pts.timetable.TimetablePackage#getEntry_Time()
	 * @model containment="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Entry#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // Entry
