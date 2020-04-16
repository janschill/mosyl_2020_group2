/**
 */
package org.mdse.pts.depot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercity Train</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.mdse.pts.depot.DepotPackage#getIntercityTrain()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IntercityTrainMustHaveDiningCoach'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IntercityTrainMustHaveDiningCoach='\n\t\tself.coaches-&gt;size() &gt; 0 implies self.coaches-&gt;exists(oclIsKindOf(DiningCoach))'"
 * @generated
 */
public interface IntercityTrain extends Train {
} // IntercityTrain
