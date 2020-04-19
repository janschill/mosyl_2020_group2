/**
 */
package org.mdse.pts.depot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.InnerCoach#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.depot.DepotPackage#getInnerCoach()
 * @model abstract="true"
 * @generated
 */
public interface InnerCoach extends Coach {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.mdse.pts.depot.DepotPackage#getInnerCoach_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.InnerCoach#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // InnerCoach
