/**
 */
package org.mdse.pts.network.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.mdse.pts.network.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.mdse.pts.network.NetworkPackage
 * @generated
 */
public class NetworkValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NetworkValidator INSTANCE = new NetworkValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.mdse.pts.network";

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
	public NetworkValidator() {
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
	  return NetworkPackage.eINSTANCE;
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
			case NetworkPackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case NetworkPackage.STATION:
				return validateStation((Station)value, diagnostics, context);
			case NetworkPackage.LEG:
				return validateLeg((Leg)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_NetworkNameUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_LegMustCarryNameWhenAnotherLegExistsBtwnSameStations(network, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NetworkNameUnique constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NETWORK__NETWORK_NAME_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tNetwork.allInstances()->isUnique(name)";

	/**
	 * Validates the NetworkNameUnique constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_NetworkNameUnique(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NetworkPackage.Literals.NETWORK,
				 network,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NetworkNameUnique",
				 NETWORK__NETWORK_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LegMustCarryNameWhenAnotherLegExistsBtwnSameStations constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NETWORK__LEG_MUST_CARRY_NAME_WHEN_ANOTHER_LEG_EXISTS_BTWN_SAME_STATIONS__EEXPRESSION = "\n" +
		"\t\t\tself.legs->forAll(leg1 |\n" +
		"\t\t\t\tself.legs->forAll(leg2 |\t\n" +
		"\t\t\t\t\tleg1 <> leg2 implies (\n" +
		"\t\t\t\t\t\t(leg1.sourceStation <> leg2.sourceStation) and (leg1.targetStation <> leg2.targetStation) implies (\n" +
		"\t\t\t\t\t\t(leg1.name <> null) and (leg2.name <> null) and (leg1.name <> leg2.name)\n" +
		"\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)";

	/**
	 * Validates the LegMustCarryNameWhenAnotherLegExistsBtwnSameStations constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_LegMustCarryNameWhenAnotherLegExistsBtwnSameStations(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NetworkPackage.Literals.NETWORK,
				 network,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LegMustCarryNameWhenAnotherLegExistsBtwnSameStations",
				 NETWORK__LEG_MUST_CARRY_NAME_WHEN_ANOTHER_LEG_EXISTS_BTWN_SAME_STATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(station, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeg(Leg leg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(leg, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(leg, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeg_DistanceMustBePositiveInteger(leg, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DistanceMustBePositiveInteger constraint of '<em>Leg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LEG__DISTANCE_MUST_BE_POSITIVE_INTEGER__EEXPRESSION = "\n" +
		"\t\t\tdistance > 0";

	/**
	 * Validates the DistanceMustBePositiveInteger constraint of '<em>Leg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeg_DistanceMustBePositiveInteger(Leg leg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NetworkPackage.Literals.LEG,
				 leg,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DistanceMustBePositiveInteger",
				 LEG__DISTANCE_MUST_BE_POSITIVE_INTEGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //NetworkValidator
