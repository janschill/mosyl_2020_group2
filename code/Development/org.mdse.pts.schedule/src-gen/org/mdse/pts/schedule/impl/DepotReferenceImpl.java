/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.pts.depot.Depot;

import org.mdse.pts.schedule.DepotReference;
import org.mdse.pts.schedule.SchedulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depot Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.DepotReferenceImpl#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepotReferenceImpl extends MinimalEObjectImpl.Container implements DepotReference {
	/**
	 * The cached value of the '{@link #getDepot() <em>Depot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepot()
	 * @generated
	 * @ordered
	 */
	protected Depot depot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepotReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.DEPOT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Depot getDepot() {
		if (depot != null && depot.eIsProxy()) {
			InternalEObject oldDepot = (InternalEObject)depot;
			depot = (Depot)eResolveProxy(oldDepot);
			if (depot != oldDepot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulePackage.DEPOT_REFERENCE__DEPOT, oldDepot, depot));
			}
		}
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depot basicGetDepot() {
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepot(Depot newDepot) {
		Depot oldDepot = depot;
		depot = newDepot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.DEPOT_REFERENCE__DEPOT, oldDepot, depot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.DEPOT_REFERENCE__DEPOT:
				if (resolve) return getDepot();
				return basicGetDepot();
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
			case SchedulePackage.DEPOT_REFERENCE__DEPOT:
				setDepot((Depot)newValue);
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
			case SchedulePackage.DEPOT_REFERENCE__DEPOT:
				setDepot((Depot)null);
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
			case SchedulePackage.DEPOT_REFERENCE__DEPOT:
				return depot != null;
		}
		return super.eIsSet(featureID);
	}

} //DepotReferenceImpl
