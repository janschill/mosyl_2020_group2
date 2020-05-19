/**
 */
package schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.mdse.pts.time.Day;

import schedule.STime;
import schedule.SchedulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schedule.impl.STimeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link schedule.impl.STimeImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link schedule.impl.STimeImpl#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STimeImpl extends MinimalEObjectImpl.Container implements STime {
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
	protected STimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.STIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Day> getDay() {
		if (day == null) {
			day = new EDataTypeUniqueEList<Day>(Day.class, this, SchedulePackage.STIME__DAY);
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
			hour = new EDataTypeUniqueEList<Integer>(Integer.class, this, SchedulePackage.STIME__HOUR);
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
			minute = new EDataTypeUniqueEList<Integer>(Integer.class, this, SchedulePackage.STIME__MINUTE);
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
			case SchedulePackage.STIME__DAY:
				return getDay();
			case SchedulePackage.STIME__HOUR:
				return getHour();
			case SchedulePackage.STIME__MINUTE:
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
			case SchedulePackage.STIME__DAY:
				getDay().clear();
				getDay().addAll((Collection<? extends Day>)newValue);
				return;
			case SchedulePackage.STIME__HOUR:
				getHour().clear();
				getHour().addAll((Collection<? extends Integer>)newValue);
				return;
			case SchedulePackage.STIME__MINUTE:
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
			case SchedulePackage.STIME__DAY:
				getDay().clear();
				return;
			case SchedulePackage.STIME__HOUR:
				getHour().clear();
				return;
			case SchedulePackage.STIME__MINUTE:
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
			case SchedulePackage.STIME__DAY:
				return day != null && !day.isEmpty();
			case SchedulePackage.STIME__HOUR:
				return hour != null && !hour.isEmpty();
			case SchedulePackage.STIME__MINUTE:
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

} //STimeImpl
