/**
 */
package timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link timetable.Timetable#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see timetable.TimetablePackage#getTimetable()
 * @model
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link timetable.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see timetable.TimetablePackage#getTimetable_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Timetable
