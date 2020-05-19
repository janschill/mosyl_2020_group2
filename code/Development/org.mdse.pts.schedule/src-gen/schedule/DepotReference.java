/**
 */
package schedule;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.depot.Depot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depot Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schedule.DepotReference#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @see schedule.SchedulePackage#getDepotReference()
 * @model
 * @generated
 */
public interface DepotReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Depot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depot</em>' reference.
	 * @see #setDepot(Depot)
	 * @see schedule.SchedulePackage#getDepotReference_Depot()
	 * @model
	 * @generated
	 */
	Depot getDepot();

	/**
	 * Sets the value of the '{@link schedule.DepotReference#getDepot <em>Depot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depot</em>' reference.
	 * @see #getDepot()
	 * @generated
	 */
	void setDepot(Depot value);

} // DepotReference
