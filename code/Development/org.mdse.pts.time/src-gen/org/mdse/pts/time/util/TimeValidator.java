/**
 */
package org.mdse.pts.time.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.mdse.pts.time.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.mdse.pts.time.TimePackage
 * @generated
 */
public class TimeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TimeValidator INSTANCE = new TimeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.mdse.pts.time";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TimePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TimePackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case TimePackage.DAY:
				return validateDay((Day)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(time, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateTime_ValidHourValue(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateTime_ValidMinuteValue(time, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidHourValue constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME__VALID_HOUR_VALUE__EEXPRESSION = "\n" +
		"\t\t\t0 <= hour and hour <= 23";

	/**
	 * Validates the ValidHourValue constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_ValidHourValue(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimePackage.Literals.TIME,
				 time,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidHourValue",
				 TIME__VALID_HOUR_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidMinuteValue constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME__VALID_MINUTE_VALUE__EEXPRESSION = "\n" +
		"\t\t\t 0 <= minute and minute <= 59";

	/**
	 * Validates the ValidMinuteValue constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_ValidMinuteValue(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimePackage.Literals.TIME,
				 time,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidMinuteValue",
				 TIME__VALID_MINUTE_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDay(Day day, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TimeValidator
