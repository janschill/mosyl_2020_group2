/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.network.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.NetworkReference#getFor <em>For</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getNetworkReference()
 * @model
 * @generated
 */
public interface NetworkReference extends EObject {
	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(Network)
	 * @see org.mdse.pts.schedule.SchedulePackage#getNetworkReference_For()
	 * @model required="true"
	 * @generated
	 */
	Network getFor();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.NetworkReference#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Network value);

} // NetworkReference
