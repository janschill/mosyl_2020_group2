/**
 */
package org.mdse.pts.time.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.mdse.pts.time.Day;
import org.mdse.pts.time.Time;
import org.mdse.pts.time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.time.impl.TimeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.time.impl.TimeImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.mdse.pts.time.impl.TimeImpl#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends MinimalEObjectImpl.Container implements Time {
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
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hour;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> minute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Day> getDay() {
		if (day == null) {
			day = new EDataTypeUniqueEList<Day>(Day.class, this, TimePackage.TIME__DAY);
		}
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHour() {
		if (hour == null) {
			hour = new EDataTypeUniqueEList<Integer>(Integer.class, this, TimePackage.TIME__HOUR);
		}
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMinute() {
		if (minute == null) {
			minute = new EDataTypeUniqueEList<Integer>(Integer.class, this, TimePackage.TIME__MINUTE);
		}
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimePackage.TIME__DAY:
				return getDay();
			case TimePackage.TIME__HOUR:
				return getHour();
			case TimePackage.TIME__MINUTE:
				return getMinute();
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
			case TimePackage.TIME__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends Day>)newValue);
				return;
			case TimePackage.TIME__HOUR:
				getHour().clear();
				getHour().addAll((Collection<? extends Integer>)newValue);
				return;
			case TimePackage.TIME__MINUTE:
				getMinute().clear();
				getMinute().addAll((Collection<? extends Integer>)newValue);
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
			case TimePackage.TIME__DAY:
				getDay().clear();
				return;
			case TimePackage.TIME__HOUR:
				getHour().clear();
				return;
			case TimePackage.TIME__MINUTE:
				getMinute().clear();
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
			case TimePackage.TIME__DAY:
				return day != null && !day.isEmpty();
			case TimePackage.TIME__HOUR:
				return hour != null && !hour.isEmpty();
			case TimePackage.TIME__MINUTE:
				return minute != null && !minute.isEmpty();
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
		result.append(", hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(')');
		return result.toString();
	}

} //TimeImpl
