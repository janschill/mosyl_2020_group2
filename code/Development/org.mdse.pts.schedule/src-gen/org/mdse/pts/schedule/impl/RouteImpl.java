/**
 */
package org.mdse.pts.schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mdse.pts.depot.Train;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.Platform;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.time.Day;
import org.mdse.pts.time.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getTerminate <em>Terminate</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getDrive <em>Drive</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.RouteImpl#getTrain <em>Train</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> time;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Station start;

	/**
	 * The cached value of the '{@link #getTerminate() <em>Terminate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminate()
	 * @generated
	 * @ordered
	 */
	protected Station terminate;

	/**
	 * The cached value of the '{@link #getDrive() <em>Drive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrive()
	 * @generated
	 * @ordered
	 */
	protected EList<Leg> drive;

	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stop;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected EList<Day> day;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platform;

	/**
	 * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> stopTime;

	/**
	 * The cached value of the '{@link #getTrain() <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected Train train;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Time> getTime() {
		if (time == null) {
			time = new EObjectContainmentEList<Time>(Time.class, this, SchedulePackage.ROUTE__TIME);
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Station)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.ROUTE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Station newStart) {
		Station oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.ROUTE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getTerminate() {
		if (terminate != null && terminate.eIsProxy()) {
			InternalEObject oldTerminate = (InternalEObject)terminate;
			terminate = (Station)eResolveProxy(oldTerminate);
			if (terminate != oldTerminate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.ROUTE__TERMINATE, oldTerminate, terminate));
			}
		}
		return terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetTerminate() {
		return terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminate(Station newTerminate) {
		Station oldTerminate = terminate;
		terminate = newTerminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.ROUTE__TERMINATE, oldTerminate, terminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Leg> getDrive() {
		if (drive == null) {
			drive = new EObjectResolvingEList<Leg>(Leg.class, this, SchedulePackage.ROUTE__DRIVE);
		}
		return drive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Station> getStop() {
		if (stop == null) {
			stop = new EObjectResolvingEList<Station>(Station.class, this, SchedulePackage.ROUTE__STOP);
		}
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Day> getDay() {
		if (day == null) {
			day = new EDataTypeUniqueEList<Day>(Day.class, this, SchedulePackage.ROUTE__DAY);
		}
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Platform> getPlatform() {
		if (platform == null) {
			platform = new EObjectContainmentEList<Platform>(Platform.class, this, SchedulePackage.ROUTE__PLATFORM);
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getStopTime() {
		if (stopTime == null) {
			stopTime = new EDataTypeUniqueEList<Integer>(Integer.class, this, SchedulePackage.ROUTE__STOP_TIME);
		}
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Train getTrain() {
		if (train != null && train.eIsProxy()) {
			InternalEObject oldTrain = (InternalEObject)train;
			train = (Train)eResolveProxy(oldTrain);
			if (train != oldTrain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.ROUTE__TRAIN, oldTrain, train));
			}
		}
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetTrain() {
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrain(Train newTrain) {
		Train oldTrain = train;
		train = newTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.ROUTE__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.ROUTE__TIME:
				return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
			case SchedulePackage.ROUTE__PLATFORM:
				return ((InternalEList<?>)getPlatform()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.ROUTE__TIME:
				return getTime();
			case SchedulePackage.ROUTE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case SchedulePackage.ROUTE__TERMINATE:
				if (resolve) return getTerminate();
				return basicGetTerminate();
			case SchedulePackage.ROUTE__DRIVE:
				return getDrive();
			case SchedulePackage.ROUTE__STOP:
				return getStop();
			case SchedulePackage.ROUTE__DAY:
				return getDay();
			case SchedulePackage.ROUTE__PLATFORM:
				return getPlatform();
			case SchedulePackage.ROUTE__STOP_TIME:
				return getStopTime();
			case SchedulePackage.ROUTE__TRAIN:
				if (resolve) return getTrain();
				return basicGetTrain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.ROUTE__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends Time>)newValue);
				return;
			case SchedulePackage.ROUTE__START:
				setStart((Station)newValue);
				return;
			case SchedulePackage.ROUTE__TERMINATE:
				setTerminate((Station)newValue);
				return;
			case SchedulePackage.ROUTE__DRIVE:
				getDrive().clear();
				getDrive().addAll((Collection<? extends Leg>)newValue);
				return;
			case SchedulePackage.ROUTE__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends Station>)newValue);
				return;
			case SchedulePackage.ROUTE__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends Day>)newValue);
				return;
			case SchedulePackage.ROUTE__PLATFORM:
				getPlatform().clear();
				getPlatform().addAll((Collection<? extends Platform>)newValue);
				return;
			case SchedulePackage.ROUTE__STOP_TIME:
				getStopTime().clear();
				getStopTime().addAll((Collection<? extends Integer>)newValue);
				return;
			case SchedulePackage.ROUTE__TRAIN:
				setTrain((Train)newValue);
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
			case SchedulePackage.ROUTE__TIME:
				getTime().clear();
				return;
			case SchedulePackage.ROUTE__START:
				setStart((Station)null);
				return;
			case SchedulePackage.ROUTE__TERMINATE:
				setTerminate((Station)null);
				return;
			case SchedulePackage.ROUTE__DRIVE:
				getDrive().clear();
				return;
			case SchedulePackage.ROUTE__STOP:
				getStop().clear();
				return;
			case SchedulePackage.ROUTE__DAY:
				getDay().clear();
				return;
			case SchedulePackage.ROUTE__PLATFORM:
				getPlatform().clear();
				return;
			case SchedulePackage.ROUTE__STOP_TIME:
				getStopTime().clear();
				return;
			case SchedulePackage.ROUTE__TRAIN:
				setTrain((Train)null);
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
			case SchedulePackage.ROUTE__TIME:
				return time != null && !time.isEmpty();
			case SchedulePackage.ROUTE__START:
				return start != null;
			case SchedulePackage.ROUTE__TERMINATE:
				return terminate != null;
			case SchedulePackage.ROUTE__DRIVE:
				return drive != null && !drive.isEmpty();
			case SchedulePackage.ROUTE__STOP:
				return stop != null && !stop.isEmpty();
			case SchedulePackage.ROUTE__DAY:
				return day != null && !day.isEmpty();
			case SchedulePackage.ROUTE__PLATFORM:
				return platform != null && !platform.isEmpty();
			case SchedulePackage.ROUTE__STOP_TIME:
				return stopTime != null && !stopTime.isEmpty();
			case SchedulePackage.ROUTE__TRAIN:
				return train != null;
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
		result.append(" (day: ");
		result.append(day);
		result.append(", stopTime: ");
		result.append(stopTime);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
