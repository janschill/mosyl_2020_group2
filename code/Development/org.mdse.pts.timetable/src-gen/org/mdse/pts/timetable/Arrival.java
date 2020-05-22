/**
 */
package org.mdse.pts.timetable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrival</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.timetable.Arrival#getFromStation <em>From Station</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.timetable.TimetablePackage#getArrival()
 * @model
 * @generated
 */
public interface Arrival extends Entry {
	/**
	 * Returns the value of the '<em><b>From Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Station</em>' attribute.
	 * @see #setFromStation(String)
	 * @see org.mdse.pts.timetable.TimetablePackage#getArrival_FromStation()
	 * @model
	 * @generated
	 */
	String getFromStation();

	/**
	 * Sets the value of the '{@link org.mdse.pts.timetable.Arrival#getFromStation <em>From Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Station</em>' attribute.
	 * @see #getFromStation()
	 * @generated
	 */
	void setFromStation(String value);

} // Arrival
