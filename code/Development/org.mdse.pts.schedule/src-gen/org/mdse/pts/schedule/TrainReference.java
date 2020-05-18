/**
 */
package org.mdse.pts.schedule;

import org.eclipse.emf.ecore.EObject;
import org.mdse.pts.depot.Train;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.TrainReference#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.schedule.SchedulePackage#getTrainReference()
 * @model
 * @generated
 */
public interface TrainReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see org.mdse.pts.schedule.SchedulePackage#getTrainReference_Train()
	 * @model
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link org.mdse.pts.schedule.TrainReference#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

} // TrainReference
