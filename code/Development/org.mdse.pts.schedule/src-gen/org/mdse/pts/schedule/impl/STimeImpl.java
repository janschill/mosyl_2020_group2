/**
 */
package org.mdse.pts.schedule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mdse.pts.schedule.HrMin;
import org.mdse.pts.schedule.STime;
import org.mdse.pts.schedule.SchedulePackage;

import org.mdse.pts.time.Day;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.schedule.impl.STimeImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.mdse.pts.schedule.impl.STimeImpl#getHrmin <em>Hrmin</em>}</li>
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
	 * The cached value of the '{@link #getHrmin() <em>Hrmin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHrmin()
	 * @generated
	 * @ordered
	 */
	protected EList<HrMin> hrmin;

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
	public EList<HrMin> getHrmin() {
		if (hrmin == null) {
			hrmin = new EObjectContainmentEList<HrMin>(HrMin.class, this, SchedulePackage.STIME__HRMIN);
		}
		return hrmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulePackage.STIME__HRMIN:
				return ((InternalEList<?>)getHrmin()).basicRemove(otherEnd, msgs);
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
			case SchedulePackage.STIME__DAY:
				return getDay();
			case SchedulePackage.STIME__HRMIN:
				return getHrmin();
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
			case SchedulePackage.STIME__HRMIN:
				getHrmin().clear();
				getHrmin().addAll((Collection<? extends HrMin>)newValue);
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
			case SchedulePackage.STIME__HRMIN:
				getHrmin().clear();
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
			case SchedulePackage.STIME__HRMIN:
				return hrmin != null && !hrmin.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //STimeImpl
