/**
 */
package org.mdse.pts.depot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mdse.pts.depot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotFactoryImpl extends EFactoryImpl implements DepotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DepotFactory init() {
		try {
			DepotFactory theDepotFactory = (DepotFactory)EPackage.Registry.INSTANCE.getEFactory(DepotPackage.eNS_URI);
			if (theDepotFactory != null) {
				return theDepotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DepotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DepotPackage.DEPOT: return createDepot();
			case DepotPackage.REGIONAL_TRAIN: return createRegionalTrain();
			case DepotPackage.INTERCITY_TRAIN: return createIntercityTrain();
			case DepotPackage.LOCOMOTIVE: return createLocomotive();
			case DepotPackage.DINING_COACH: return createDiningCoach();
			case DepotPackage.FIRST_CLASS_PASSENGER_COACH: return createFirstClassPassengerCoach();
			case DepotPackage.SECOND_CLASS_PASSENGER_COACH: return createSecondClassPassengerCoach();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Depot createDepot() {
		DepotImpl depot = new DepotImpl();
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionalTrain createRegionalTrain() {
		RegionalTrainImpl regionalTrain = new RegionalTrainImpl();
		return regionalTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercityTrain createIntercityTrain() {
		IntercityTrainImpl intercityTrain = new IntercityTrainImpl();
		return intercityTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Locomotive createLocomotive() {
		LocomotiveImpl locomotive = new LocomotiveImpl();
		return locomotive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiningCoach createDiningCoach() {
		DiningCoachImpl diningCoach = new DiningCoachImpl();
		return diningCoach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstClassPassengerCoach createFirstClassPassengerCoach() {
		FirstClassPassengerCoachImpl firstClassPassengerCoach = new FirstClassPassengerCoachImpl();
		return firstClassPassengerCoach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondClassPassengerCoach createSecondClassPassengerCoach() {
		SecondClassPassengerCoachImpl secondClassPassengerCoach = new SecondClassPassengerCoachImpl();
		return secondClassPassengerCoach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepotPackage getDepotPackage() {
		return (DepotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DepotPackage getPackage() {
		return DepotPackage.eINSTANCE;
	}

} //DepotFactoryImpl