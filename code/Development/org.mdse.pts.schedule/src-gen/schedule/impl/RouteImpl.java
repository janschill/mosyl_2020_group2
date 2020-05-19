/**
 */
package schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.depot.Train;

import schedule.Route;
import schedule.STime;
import schedule.SchedulePackage;
import schedule.Transit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schedule.impl.RouteImpl#getTime <em>Time</em>}</li>
 *   <li>{@link schedule.impl.RouteImpl#getTransits <em>Transits</em>}</li>
 *   <li>{@link schedule.impl.RouteImpl#getTrain <em>Train</em>}</li>
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
	protected EList<STime> time;

	/**
	 * The cached value of the '{@link #getTransits() <em>Transits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransits()
	 * @generated
	 * @ordered
	 */
	protected EList<Transit> transits;

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
	public EList<STime> getTime() {
		if (time == null) {
			time = new EObjectContainmentEList<STime>(STime.class, this, SchedulePackage.ROUTE__TIME);
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transit> getTransits() {
		if (transits == null) {
			transits = new EObjectContainmentEList<Transit>(Transit.class, this, SchedulePackage.ROUTE__TRANSITS);
		}
		return transits;
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
			case SchedulePackage.ROUTE__TRANSITS:
				return ((InternalEList<?>)getTransits()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.ROUTE__TRANSITS:
				return getTransits();
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
				getTime().addAll((Collection<? extends STime>)newValue);
				return;
			case SchedulePackage.ROUTE__TRANSITS:
				getTransits().clear();
				getTransits().addAll((Collection<? extends Transit>)newValue);
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
			case SchedulePackage.ROUTE__TRANSITS:
				getTransits().clear();
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
			case SchedulePackage.ROUTE__TRANSITS:
				return transits != null && !transits.isEmpty();
			case SchedulePackage.ROUTE__TRAIN:
				return train != null;
		}
		return super.eIsSet(featureID);
	}

} //RouteImpl
