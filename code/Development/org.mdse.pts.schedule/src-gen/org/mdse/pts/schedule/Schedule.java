/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.mdse.pts.depot.Depot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getNetworkReference <em>Network Reference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.Schedule#getWithDepot <em>With Depot</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {

	/**
	 * Returns the value of the '<em><b>Network Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Reference</em>' containment reference.
	 * @see #setNetworkReference(NetworkReference)
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_NetworkReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NetworkReference getNetworkReference();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.Schedule#getNetworkReference <em>Network Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Reference</em>' containment reference.
	 * @see #getNetworkReference()
	 * @generated
	 */
	void setNetworkReference(NetworkReference value);

	/**
	 * Returns the value of the '<em><b>With Depot</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.pts.depot.Depot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Depot</em>' reference list.
	 * @see org.mdse.pts.schedule.SchedulePackage#getSchedule_WithDepot()
	 * @model required="true"
	 * @generated
	 */
	EList<Depot> getWithDepot();
} // Schedule
