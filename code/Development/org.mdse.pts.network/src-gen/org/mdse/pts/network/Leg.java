/**
 */
package org.mdse.pts.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.network.Leg#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.network.Leg#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.mdse.pts.network.Leg#getSourceStation <em>Source Station</em>}</li>
 *   <li>{@link org.mdse.pts.network.Leg#getTargetStation <em>Target Station</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.network.NetworkPackage#getLeg()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DistanceMustBePositiveInteger'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DistanceMustBePositiveInteger='\n\t\t\tdistance &gt; 0'"
 * @generated
 */
public interface Leg extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Distance()
	 * @model required="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Source Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Station</em>' reference.
	 * @see #setSourceStation(Station)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_SourceStation()
	 * @model required="true"
	 * @generated
	 */
	Station getSourceStation();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getSourceStation <em>Source Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Station</em>' reference.
	 * @see #getSourceStation()
	 * @generated
	 */
	void setSourceStation(Station value);

	/**
	 * Returns the value of the '<em><b>Target Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Station</em>' reference.
	 * @see #setTargetStation(Station)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_TargetStation()
	 * @model required="true"
	 * @generated
	 */
	Station getTargetStation();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getTargetStation <em>Target Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Station</em>' reference.
	 * @see #getTargetStation()
	 * @generated
	 */
	void setTargetStation(Station value);

} // Leg
