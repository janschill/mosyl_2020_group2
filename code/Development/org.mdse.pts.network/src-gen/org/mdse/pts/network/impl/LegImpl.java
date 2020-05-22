/**
 */
package org.mdse.pts.network.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.NetworkPackage;
import org.mdse.pts.network.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.network.impl.LegImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.network.impl.LegImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.mdse.pts.network.impl.LegImpl#getSourceStation <em>Source Station</em>}</li>
 *   <li>{@link org.mdse.pts.network.impl.LegImpl#getTargetStation <em>Target Station</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegImpl extends MinimalEObjectImpl.Container implements Leg {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceStation() <em>Source Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStation()
	 * @generated
	 * @ordered
	 */
	protected Station sourceStation;

	/**
	 * The cached value of the '{@link #getTargetStation() <em>Target Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStation()
	 * @generated
	 * @ordered
	 */
	protected Station targetStation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.LEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getSourceStation() {
		if (sourceStation != null && sourceStation.eIsProxy()) {
			InternalEObject oldSourceStation = (InternalEObject)sourceStation;
			sourceStation = (Station)eResolveProxy(oldSourceStation);
			if (sourceStation != oldSourceStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LEG__SOURCE_STATION, oldSourceStation, sourceStation));
			}
		}
		return sourceStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetSourceStation() {
		return sourceStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceStation(Station newSourceStation) {
		Station oldSourceStation = sourceStation;
		sourceStation = newSourceStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__SOURCE_STATION, oldSourceStation, sourceStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getTargetStation() {
		if (targetStation != null && targetStation.eIsProxy()) {
			InternalEObject oldTargetStation = (InternalEObject)targetStation;
			targetStation = (Station)eResolveProxy(oldTargetStation);
			if (targetStation != oldTargetStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LEG__TARGET_STATION, oldTargetStation, targetStation));
			}
		}
		return targetStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetTargetStation() {
		return targetStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetStation(Station newTargetStation) {
		Station oldTargetStation = targetStation;
		targetStation = newTargetStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__TARGET_STATION, oldTargetStation, targetStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.LEG__NAME:
				return getName();
			case NetworkPackage.LEG__DISTANCE:
				return getDistance();
			case NetworkPackage.LEG__SOURCE_STATION:
				if (resolve) return getSourceStation();
				return basicGetSourceStation();
			case NetworkPackage.LEG__TARGET_STATION:
				if (resolve) return getTargetStation();
				return basicGetTargetStation();
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
			case NetworkPackage.LEG__NAME:
				setName((String)newValue);
				return;
			case NetworkPackage.LEG__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case NetworkPackage.LEG__SOURCE_STATION:
				setSourceStation((Station)newValue);
				return;
			case NetworkPackage.LEG__TARGET_STATION:
				setTargetStation((Station)newValue);
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
			case NetworkPackage.LEG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkPackage.LEG__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case NetworkPackage.LEG__SOURCE_STATION:
				setSourceStation((Station)null);
				return;
			case NetworkPackage.LEG__TARGET_STATION:
				setTargetStation((Station)null);
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
			case NetworkPackage.LEG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkPackage.LEG__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case NetworkPackage.LEG__SOURCE_STATION:
				return sourceStation != null;
			case NetworkPackage.LEG__TARGET_STATION:
				return targetStation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //LegImpl
