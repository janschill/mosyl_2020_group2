/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;

import org.mdse.pts.schedule.Platform;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Transit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.TransitImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TransitImpl#getStation <em>Station</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TransitImpl#getLeg <em>Leg</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.TransitImpl#getStandingDuration <em>Standing Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitImpl extends MinimalEObjectImpl.Container implements Transit {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected Platform platform;

	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected Station station;

	/**
	 * The cached value of the '{@link #getLeg() <em>Leg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeg()
	 * @generated
	 * @ordered
	 */
	protected Leg leg;

	/**
	 * The default value of the '{@link #getStandingDuration() <em>Standing Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandingDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int STANDING_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStandingDuration() <em>Standing Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandingDuration()
	 * @generated
	 * @ordered
	 */
	protected int standingDuration = STANDING_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TRANSIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(Platform newPlatform, NotificationChain msgs) {
		Platform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulePackage.TRANSIT__PLATFORM, oldPlatform, newPlatform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatform(Platform newPlatform) {
		if (newPlatform != platform) {
			NotificationChain msgs = null;
			if (platform != null)
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.TRANSIT__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.TRANSIT__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRANSIT__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStation() {
		if (station != null && station.eIsProxy()) {
			InternalEObject oldStation = (InternalEObject)station;
			station = (Station)eResolveProxy(oldStation);
			if (station != oldStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.TRANSIT__STATION, oldStation, station));
			}
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStation(Station newStation) {
		Station oldStation = station;
		station = newStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRANSIT__STATION, oldStation, station));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leg getLeg() {
		if (leg != null && leg.eIsProxy()) {
			InternalEObject oldLeg = (InternalEObject)leg;
			leg = (Leg)eResolveProxy(oldLeg);
			if (leg != oldLeg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.TRANSIT__LEG, oldLeg, leg));
			}
		}
		return leg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leg basicGetLeg() {
		return leg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeg(Leg newLeg) {
		Leg oldLeg = leg;
		leg = newLeg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRANSIT__LEG, oldLeg, leg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStandingDuration() {
		return standingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandingDuration(int newStandingDuration) {
		int oldStandingDuration = standingDuration;
		standingDuration = newStandingDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TRANSIT__STANDING_DURATION, oldStandingDuration, standingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.TRANSIT__PLATFORM:
				return basicSetPlatform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.TRANSIT__PLATFORM:
				return getPlatform();
			case SchedulePackage.TRANSIT__STATION:
				if (resolve) return getStation();
				return basicGetStation();
			case SchedulePackage.TRANSIT__LEG:
				if (resolve) return getLeg();
				return basicGetLeg();
			case SchedulePackage.TRANSIT__STANDING_DURATION:
				return getStandingDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.TRANSIT__PLATFORM:
				setPlatform((Platform)newValue);
				return;
			case SchedulePackage.TRANSIT__STATION:
				setStation((Station)newValue);
				return;
			case SchedulePackage.TRANSIT__LEG:
				setLeg((Leg)newValue);
				return;
			case SchedulePackage.TRANSIT__STANDING_DURATION:
				setStandingDuration((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulePackage.TRANSIT__PLATFORM:
				setPlatform((Platform)null);
				return;
			case SchedulePackage.TRANSIT__STATION:
				setStation((Station)null);
				return;
			case SchedulePackage.TRANSIT__LEG:
				setLeg((Leg)null);
				return;
			case SchedulePackage.TRANSIT__STANDING_DURATION:
				setStandingDuration(STANDING_DURATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulePackage.TRANSIT__PLATFORM:
				return platform != null;
			case SchedulePackage.TRANSIT__STATION:
				return station != null;
			case SchedulePackage.TRANSIT__LEG:
				return leg != null;
			case SchedulePackage.TRANSIT__STANDING_DURATION:
				return standingDuration != STANDING_DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (standingDuration: ");
		result.append(standingDuration);
		result.append(')');
		return result.toString();
	}

} //TransitImpl
