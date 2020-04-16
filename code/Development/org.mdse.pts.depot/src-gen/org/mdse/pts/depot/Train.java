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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LocomotiveInEitherEnd UniqueInnerCoachNumbersInTrain TrainCanHaveAtMostOneDiningCoach InnerCoachesInSequence DiningCoachBetweenFirstAndSecondClassPassengerCoaches'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LocomotiveInEitherEnd='self.coaches-&gt;size() &gt; 0 implies self.coaches-&gt;first().oclIsTypeOf(Locomotive) or self.coaches-&gt;last().oclIsTypeOf(Locomotive)' UniqueInnerCoachNumbersInTrain='\n\t\t\tself.coaches-&gt;select(oclIsKindOf(InnerCoach))-&gt;isUnique(oclAsType(InnerCoach).number)' TrainCanHaveAtMostOneDiningCoach='\n\t\t\tself.coaches-&gt;select(oclIsKindOf(DiningCoach))-&gt;size() &lt;= 1' InnerCoachesInSequence='\n\t\t\tlet innerCoaches: OrderedSet(Coach) = self.coaches-&gt;select(oclIsKindOf(InnerCoach)),\n\t\t\t\tfirstClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches-&gt;size()}-&gt;iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches-&gt;at(idx).oclIsKindOf(FirstClassPassengerCoach)) then res-&gt;append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tfirstClassPCInSequence : Boolean = Sequence{1..firstClassPCIndexes-&gt;size()}-&gt;forAll(idx: Integer |\n\t\t\t\t\tidx = 1 or (firstClassPCIndexes-&gt;at(idx) = firstClassPCIndexes-&gt;at(idx - 1) + 1)\n\t\t\t\t),\n\t\t\t\tsecondClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches-&gt;size()}-&gt;iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches-&gt;at(idx).oclIsKindOf(SecondClassPassengerCoach)) then res-&gt;append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tsecondClassPCInSequence : Boolean = Sequence{1..secondClassPCIndexes-&gt;size()}-&gt;forAll(idx: Integer |\n\t\t\t\t\tidx = 1 or (secondClassPCIndexes-&gt;at(idx) = secondClassPCIndexes-&gt;at(idx - 1) + 1)\n\t\t\t\t)\n\t\t\tin\n\t\t\tfirstClassPCInSequence and secondClassPCInSequence' DiningCoachBetweenFirstAndSecondClassPassengerCoaches='\n\t\t\tlet innerCoaches: OrderedSet(Coach) = self.coaches-&gt;select(oclIsKindOf(InnerCoach)),\n\t\t\t\tfirstClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches-&gt;size()}-&gt;iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches-&gt;at(idx).oclIsKindOf(FirstClassPassengerCoach)) then res-&gt;append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tsecondClassPCIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches-&gt;size()}-&gt;iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches-&gt;at(idx).oclIsKindOf(SecondClassPassengerCoach)) then res-&gt;append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t),\n\t\t\t\tdiningCoachIndexes: OrderedSet(Integer) = \n\t\t\t\t\tSequence{1..innerCoaches-&gt;size()}-&gt;iterate(idx: Integer; res: OrderedSet(Integer) = OrderedSet{} |\n\t\t\t\t\t\tif(innerCoaches-&gt;at(idx).oclIsKindOf(DiningCoach)) then res-&gt;append(idx)\t\n\t\t\t\t\t\telse res\n\t\t\t\t\t\tendif\n\t\t\t\t\t)\n\t\t\tin\n\t\t\t(firstClassPCIndexes-&gt;size() &gt; 0 and secondClassPCIndexes-&gt;size() &gt; 0 and diningCoachIndexes-&gt;size() &gt; 0)\n\t\t\timplies (\n\t\t\t\t(firstClassPCIndexes-&gt;last() + 1 = diningCoachIndexes-&gt;first() and secondClassPCIndexes-&gt;first() - 1 = diningCoachIndexes-&gt;first())\n\t\t\t\tor\n\t\t\t\t(secondClassPCIndexes-&gt;last() + 1 = diningCoachIndexes-&gt;first() and firstClassPCIndexes-&gt;first() - 1 = diningCoachIndexes-&gt;first())\n\t\t\t)'"
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
