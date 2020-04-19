/**
 */
package org.mdse.pts.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.network.Network#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.network.Network#getStations <em>Stations</em>}</li>
 *   <li>{@link org.mdse.pts.network.Network#getLegs <em>Legs</em>}</li>
 *   <li>{@link org.mdse.pts.network.Network#getCountry <em>Country</em>}</li>
 *   <li>{@link org.mdse.pts.network.Network#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.network.NetworkPackage#getNetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NetworkNameUnique LegMustCarryNameWhenAnotherLegExistsBtwnSameStations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NetworkNameUnique='\n\t\t\tNetwork.allInstances()-&gt;isUnique(name)' LegMustCarryNameWhenAnotherLegExistsBtwnSameStations='\n\t\t\tlegs-&gt;forAll(l |\n\t\t\t\tnot l.name.oclIsUndefined())'"
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.network.NetworkPackage#getNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.network.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see org.mdse.pts.network.NetworkPackage#getNetwork_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Legs</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.network.Leg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legs</em>' containment reference list.
	 * @see org.mdse.pts.network.NetworkPackage#getNetwork_Legs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Leg> getLegs();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(Country)
	 * @see org.mdse.pts.network.NetworkPackage#getNetwork_Country()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Network#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(Region)
	 * @see org.mdse.pts.network.NetworkPackage#getNetwork_Region()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Network#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

} // Network
