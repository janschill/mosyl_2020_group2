/**
 */
package timetable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import timetable.Departure;
import timetable.TimetablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link timetable.impl.DepartureImpl#getToStation <em>To Station</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartureImpl extends EntryImpl implements Departure {
	/**
	 * The default value of the '{@link #getToStation() <em>To Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStation()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_STATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToStation() <em>To Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStation()
	 * @generated
	 * @ordered
	 */
	protected String toStation = TO_STATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.DEPARTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToStation() {
		return toStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStation(String newToStation) {
		String oldToStation = toStation;
		toStation = newToStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.DEPARTURE__TO_STATION, oldToStation, toStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetablePackage.DEPARTURE__TO_STATION:
				return getToStation();
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
			case TimetablePackage.DEPARTURE__TO_STATION:
				setToStation((String)newValue);
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
			case TimetablePackage.DEPARTURE__TO_STATION:
				setToStation(TO_STATION_EDEFAULT);
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
			case TimetablePackage.DEPARTURE__TO_STATION:
				return TO_STATION_EDEFAULT == null ? toStation != null : !TO_STATION_EDEFAULT.equals(toStation);
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
		result.append(" (toStation: ");
		result.append(toStation);
		result.append(')');
		return result.toString();
	}

} //DepartureImpl
