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
 * </ul>
 *
 * @see org.mdse.pts.network.NetworkPackage#getNetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NetworkNameUnique LegMustCarryNameWhenAnotherLegExistsBtwnSameStations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NetworkNameUnique='\n\t\t\tNetwork.allInstances()-&gt;isUnique(name)' LegMustCarryNameWhenAnotherLegExistsBtwnSameStations='\n\t\t\tself.legs-&gt;forAll(leg1 |\n\t\t\t\tself.legs-&gt;forAll(leg2 |\t\n\t\t\t\t\tleg1 &lt;&gt; leg2 implies (\n\t\t\t\t\t\tnot (leg1.stations-&gt;isEmpty() or leg2.stations-&gt;isEmpty()) implies (\n\t\t\t\t\t\t\tleg1.stations-&gt;includesAll(leg2.stations) implies (\n\t\t\t\t\t\t\t(leg1.name &lt;&gt; null) and (leg2.name &lt;&gt; null) and (leg1.name &lt;&gt; leg2.name)\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t)\n\t\t\t\t\t)\n\t\t\t\t)\n\t\t\t)'"
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

} // Network
