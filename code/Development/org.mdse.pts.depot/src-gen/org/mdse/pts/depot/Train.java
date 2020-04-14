/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.Train#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.depot.Train#getCoaches <em>Coaches</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.depot.DepotPackage#getTrain()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LocomotiveInEitherEnd'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LocomotiveInEitherEnd='self.coaches-&gt;first().oclIsTypeOf(Locomotive) or self.coaches-&gt;last().oclIsTypeOf(Locomotive)'"
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.Train#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coaches</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.depot.Coach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coaches</em>' containment reference list.
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Coaches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coach> getCoaches();

} // Train
