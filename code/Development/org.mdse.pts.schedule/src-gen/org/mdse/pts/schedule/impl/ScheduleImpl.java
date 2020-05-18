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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.schedule.DepotReference;
import org.mdse.pts.schedule.NetworkReference;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.TrainReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getNetworkReference <em>Network Reference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getDepotReference <em>Depot Reference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getTrainReference <em>Train Reference</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.ScheduleImpl#getRouteReference <em>Route Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The cached value of the '{@link #getNetworkReference() <em>Network Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkReference()
	 * @generated
	 * @ordered
	 */
	protected NetworkReference networkReference;

	/**
	 * The cached value of the '{@link #getDepotReference() <em>Depot Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepotReference()
	 * @generated
	 * @ordered
	 */
	protected EList<DepotReference> depotReference;

	/**
	 * The cached value of the '{@link #getTrainReference() <em>Train Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainReference()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainReference> trainReference;

	/**
	 * The cached value of the '{@link #getRouteReference() <em>Route Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routeReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkReference getNetworkReference() {
		return networkReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkReference(NetworkReference newNetworkReference, NotificationChain msgs) {
		NetworkReference oldNetworkReference = networkReference;
		networkReference = newNetworkReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORK_REFERENCE, oldNetworkReference, newNetworkReference);
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
	public void setNetworkReference(NetworkReference newNetworkReference) {
		if (newNetworkReference != networkReference) {
			NotificationChain msgs = null;
			if (networkReference != null)
				msgs = ((InternalEObject)networkReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.SCHEDULE__NETWORK_REFERENCE, null, msgs);
			if (newNetworkReference != null)
				msgs = ((InternalEObject)newNetworkReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchedulePackage.SCHEDULE__NETWORK_REFERENCE, null, msgs);
			msgs = basicSetNetworkReference(newNetworkReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.SCHEDULE__NETWORK_REFERENCE, newNetworkReference, newNetworkReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DepotReference> getDepotReference() {
		if (depotReference == null) {
			depotReference = new EObjectContainmentEList<DepotReference>(DepotReference.class, this, SchedulePackage.SCHEDULE__DEPOT_REFERENCE);
		}
		return depotReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrainReference> getTrainReference() {
		if (trainReference == null) {
			trainReference = new EObjectContainmentEList<TrainReference>(TrainReference.class, this, SchedulePackage.SCHEDULE__TRAIN_REFERENCE);
		}
		return trainReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getRouteReference() {
		if (routeReference == null) {
			routeReference = new EObjectContainmentEList<Route>(Route.class, this, SchedulePackage.SCHEDULE__ROUTE_REFERENCE);
		}
		return routeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.SCHEDULE__NETWORK_REFERENCE:
				return basicSetNetworkReference(null, msgs);
			case SchedulePackage.SCHEDULE__DEPOT_REFERENCE:
				return ((InternalEList<?>)getDepotReference()).basicRemove(otherEnd, msgs);
			case SchedulePackage.SCHEDULE__TRAIN_REFERENCE:
				return ((InternalEList<?>)getTrainReference()).basicRemove(otherEnd, msgs);
			case SchedulePackage.SCHEDULE__ROUTE_REFERENCE:
				return ((InternalEList<?>)getRouteReference()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.SCHEDULE__NETWORK_REFERENCE:
				return getNetworkReference();
			case SchedulePackage.SCHEDULE__DEPOT_REFERENCE:
				return getDepotReference();
			case SchedulePackage.SCHEDULE__TRAIN_REFERENCE:
				return getTrainReference();
			case SchedulePackage.SCHEDULE__ROUTE_REFERENCE:
				return getRouteReference();
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
			case SchedulePackage.SCHEDULE__NETWORK_REFERENCE:
				setNetworkReference((NetworkReference)newValue);
				return;
			case SchedulePackage.SCHEDULE__DEPOT_REFERENCE:
				getDepotReference().clear();
				getDepotReference().addAll((Collection<? extends DepotReference>)newValue);
				return;
			case SchedulePackage.SCHEDULE__TRAIN_REFERENCE:
				getTrainReference().clear();
				getTrainReference().addAll((Collection<? extends TrainReference>)newValue);
				return;
			case SchedulePackage.SCHEDULE__ROUTE_REFERENCE:
				getRouteReference().clear();
				getRouteReference().addAll((Collection<? extends Route>)newValue);
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
			case SchedulePackage.SCHEDULE__NETWORK_REFERENCE:
				setNetworkReference((NetworkReference)null);
				return;
			case SchedulePackage.SCHEDULE__DEPOT_REFERENCE:
				getDepotReference().clear();
				return;
			case SchedulePackage.SCHEDULE__TRAIN_REFERENCE:
				getTrainReference().clear();
				return;
			case SchedulePackage.SCHEDULE__ROUTE_REFERENCE:
				getRouteReference().clear();
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
			case SchedulePackage.SCHEDULE__NETWORK_REFERENCE:
				return networkReference != null;
			case SchedulePackage.SCHEDULE__DEPOT_REFERENCE:
				return depotReference != null && !depotReference.isEmpty();
			case SchedulePackage.SCHEDULE__TRAIN_REFERENCE:
				return trainReference != null && !trainReference.isEmpty();
			case SchedulePackage.SCHEDULE__ROUTE_REFERENCE:
				return routeReference != null && !routeReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
