/**
 */
package schedule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schedule.Schedule#getNetworkReference <em>Network Reference</em>}</li>
 *   <li>{@link schedule.Schedule#getDepotReference <em>Depot Reference</em>}</li>
 *   <li>{@link schedule.Schedule#getTrainReference <em>Train Reference</em>}</li>
 *   <li>{@link schedule.Schedule#getRouteReference <em>Route Reference</em>}</li>
 * </ul>
 *
 * @see schedule.SchedulePackage#getSchedule()
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
	 * @see schedule.SchedulePackage#getSchedule_NetworkReference()
	 * @model containment="true"
	 * @generated
	 */
	NetworkReference getNetworkReference();

	/**
	 * Sets the value of the '{@link schedule.Schedule#getNetworkReference <em>Network Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Reference</em>' containment reference.
	 * @see #getNetworkReference()
	 * @generated
	 */
	void setNetworkReference(NetworkReference value);

	/**
	 * Returns the value of the '<em><b>Depot Reference</b></em>' containment reference list.
	 * The list contents are of type {@link schedule.DepotReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depot Reference</em>' containment reference list.
	 * @see schedule.SchedulePackage#getSchedule_DepotReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<DepotReference> getDepotReference();

	/**
	 * Returns the value of the '<em><b>Train Reference</b></em>' containment reference list.
	 * The list contents are of type {@link schedule.TrainReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Reference</em>' containment reference list.
	 * @see schedule.SchedulePackage#getSchedule_TrainReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainReference> getTrainReference();

	/**
	 * Returns the value of the '<em><b>Route Reference</b></em>' containment reference list.
	 * The list contents are of type {@link schedule.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Reference</em>' containment reference list.
	 * @see schedule.SchedulePackage#getSchedule_RouteReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRouteReference();

} // Schedule
