/**
 */
package schedule;

import org.eclipse.emf.ecore.EObject;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schedule.Transit#getPlatform <em>Platform</em>}</li>
 *   <li>{@link schedule.Transit#getStation <em>Station</em>}</li>
 *   <li>{@link schedule.Transit#getLeg <em>Leg</em>}</li>
 *   <li>{@link schedule.Transit#getStandingDuration <em>Standing Duration</em>}</li>
 *   <li>{@link schedule.Transit#isIsTerminateStop <em>Is Terminate Stop</em>}</li>
 * </ul>
 *
 * @see schedule.SchedulePackage#getTransit()
 * @model
 * @generated
 */
public interface Transit extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(Platform)
	 * @see schedule.SchedulePackage#getTransit_Platform()
	 * @model containment="true"
	 * @generated
	 */
	Platform getPlatform();

	/**
	 * Sets the value of the '{@link schedule.Transit#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(Platform value);

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(Station)
	 * @see schedule.SchedulePackage#getTransit_Station()
	 * @model
	 * @generated
	 */
	Station getStation();

	/**
	 * Sets the value of the '{@link schedule.Transit#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(Station value);

	/**
	 * Returns the value of the '<em><b>Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leg</em>' reference.
	 * @see #setLeg(Leg)
	 * @see schedule.SchedulePackage#getTransit_Leg()
	 * @model
	 * @generated
	 */
	Leg getLeg();

	/**
	 * Sets the value of the '{@link schedule.Transit#getLeg <em>Leg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg</em>' reference.
	 * @see #getLeg()
	 * @generated
	 */
	void setLeg(Leg value);

	/**
	 * Returns the value of the '<em><b>Standing Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standing Duration</em>' attribute.
	 * @see #setStandingDuration(int)
	 * @see schedule.SchedulePackage#getTransit_StandingDuration()
	 * @model
	 * @generated
	 */
	int getStandingDuration();

	/**
	 * Sets the value of the '{@link schedule.Transit#getStandingDuration <em>Standing Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standing Duration</em>' attribute.
	 * @see #getStandingDuration()
	 * @generated
	 */
	void setStandingDuration(int value);

	/**
	 * Returns the value of the '<em><b>Is Terminate Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminate Stop</em>' attribute.
	 * @see #setIsTerminateStop(boolean)
	 * @see schedule.SchedulePackage#getTransit_IsTerminateStop()
	 * @model
	 * @generated
	 */
	boolean isIsTerminateStop();

	/**
	 * Sets the value of the '{@link schedule.Transit#isIsTerminateStop <em>Is Terminate Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminate Stop</em>' attribute.
	 * @see #isIsTerminateStop()
	 * @generated
	 */
	void setIsTerminateStop(boolean value);

} // Transit
