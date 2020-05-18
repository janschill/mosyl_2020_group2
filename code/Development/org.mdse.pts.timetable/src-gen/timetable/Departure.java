/**
 */
package timetable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link timetable.Departure#getToStation <em>To Station</em>}</li>
 * </ul>
 *
 * @see timetable.TimetablePackage#getDeparture()
 * @model
 * @generated
 */
public interface Departure extends Entry {
	/**
	 * Returns the value of the '<em><b>To Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Station</em>' attribute.
	 * @see #setToStation(String)
	 * @see timetable.TimetablePackage#getDeparture_ToStation()
	 * @model
	 * @generated
	 */
	String getToStation();

	/**
	 * Sets the value of the '{@link timetable.Departure#getToStation <em>To Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Station</em>' attribute.
	 * @see #getToStation()
	 * @generated
	 */
	void setToStation(String value);

} // Departure
