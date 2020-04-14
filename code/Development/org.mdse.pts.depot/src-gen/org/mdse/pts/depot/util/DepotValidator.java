/**
 */
package org.mdse.pts.depot.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.mdse.pts.depot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.mdse.pts.depot.DepotPackage
 * @generated
 */
public class DepotValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DepotValidator INSTANCE = new DepotValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.mdse.pts.depot";

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
	public DepotValidator() {
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
	  return DepotPackage.eINSTANCE;
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
			case DepotPackage.DEPOT:
				return validateDepot((Depot)value, diagnostics, context);
			case DepotPackage.TRAIN:
				return validateTrain((Train)value, diagnostics, context);
			case DepotPackage.COACH:
				return validateCoach((Coach)value, diagnostics, context);
			case DepotPackage.REGIONAL_TRAIN:
				return validateRegionalTrain((RegionalTrain)value, diagnostics, context);
			case DepotPackage.INTERCITY_TRAIN:
				return validateIntercityTrain((IntercityTrain)value, diagnostics, context);
			case DepotPackage.LOCOMOTIVE:
				return validateLocomotive((Locomotive)value, diagnostics, context);
			case DepotPackage.PASSENGER_COACH:
				return validatePassengerCoach((PassengerCoach)value, diagnostics, context);
			case DepotPackage.DINING_COACH:
				return validateDiningCoach((DiningCoach)value, diagnostics, context);
			case DepotPackage.INNER_COACH:
				return validateInnerCoach((InnerCoach)value, diagnostics, context);
			case DepotPackage.OUTER_COACH:
				return validateOuterCoach((OuterCoach)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepot(Depot depot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(depot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrain(Train train, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(train, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(train, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrain_LocomotiveInEitherEnd(train, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LocomotiveInEitherEnd constraint of '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRAIN__LOCOMOTIVE_IN_EITHER_END__EEXPRESSION = "self.coaches->first().oclIsTypeOf(Locomotive) or self.coaches->last().oclIsTypeOf(Locomotive)";

	/**
	 * Validates the LocomotiveInEitherEnd constraint of '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrain_LocomotiveInEitherEnd(Train train, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DepotPackage.Literals.TRAIN,
				 train,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LocomotiveInEitherEnd",
				 TRAIN__LOCOMOTIVE_IN_EITHER_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoach(Coach coach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalTrain(RegionalTrain regionalTrain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalTrain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrain_LocomotiveInEitherEnd(regionalTrain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntercityTrain(IntercityTrain intercityTrain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intercityTrain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intercityTrain, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrain_LocomotiveInEitherEnd(intercityTrain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocomotive(Locomotive locomotive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locomotive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerCoach(PassengerCoach passengerCoach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerCoach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiningCoach(DiningCoach diningCoach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diningCoach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerCoach(InnerCoach innerCoach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerCoach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterCoach(OuterCoach outerCoach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outerCoach, diagnostics, context);
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

} //DepotValidator
