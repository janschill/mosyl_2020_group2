package org.mdse.pts.schedule.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.NetworkReference;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Transit;

public class ScheduleValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(SchedulePackage.eINSTANCE, new ScheduleValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		if(SchedulePackage.eINSTANCE.getSchedule().equals(eClass)) {
			Schedule schedule = (Schedule) eObject;
			modelIsValid &= validateSchedule(schedule);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateSchedule(Schedule schedule) {
		boolean modelIsValid = true;
		
		//modelIsValid &= validateScheduleHasNetwork(schedule);
		modelIsValid &= validateOnlyOneLeg(schedule);
		//modelIsValid &= validateSameRouteDiffLeg(schedule);
		//modelIsValid &= validateLocomotiveWhenTurnReq(schedule);
		
		return modelIsValid;
	}
	
//	protected boolean validateScheduleHasNetwork(Schedule schedule) {
//		boolean constraintViolated = false;
//		
//		if(schedule.getDepotReference().size() > 1) { 
//		constraintViolated = true;
//		}
//		
//		if(constraintViolated) {
//			return constraintViolated(schedule, "Too many depots.");
//		}
//	
//		return true;
//	}
	
	//If there is only one leg connecting two stations, it's not mandatory to be specified explicitly
	protected boolean validateOnlyOneLeg(Schedule schedule) {
		boolean constraintViolated = false;

		List<Route> routes = new ArrayList<Route>();
		routes.addAll(schedule.getRouteReference());
		
		for(Route r : routes) {
		boolean driveViaExists = false;
		
		List<Transit> transits = new ArrayList<Transit>();
		transits.addAll(r.getTransits());
		
		Transit start =	transits.get(0);
		Transit end = transits.get(transits.size()-1);

		List<Leg> startLegs = new ArrayList<Leg>();
		startLegs.addAll(start.getStation().getLegs());
		
		List<Leg> endLegs = new ArrayList<Leg>();
		endLegs.addAll(end.getStation().getLegs());

		for(Transit t : transits)
			if(t.getLeg() != null && startLegs.contains(t.getLeg()) && endLegs.contains(t.getLeg()))
				driveViaExists = true;
		
		int counter = 0;
		for(Leg l1 : startLegs)
			for(Leg l2 : endLegs)
				if(l1.getName() == l2.getName())
					counter++;
		
		if(counter>1 && !driveViaExists)
			constraintViolated = true;
		
		if(constraintViolated)
			return constraintViolated(r, "Please specify appropriate leg for route: " + start.getStation().getName().toString() + " - " + end.getStation().getName().toString() + " using DRIVE VIA keyword.");
		}
		
		
		return true;
	}
	
	//If there are 2 routes with same endpoints, they must use different leg
	//?? What if they have different stops or different duration for pause ??
	//Unnecessary constraint but a lot of effort
//	protected boolean validateSameRouteDiffLeg(Schedule schedule) {
//		boolean constraintViolated = false;
//
//		List<Route> routes = new ArrayList<Route>();
//		routes.addAll(schedule.getRouteReference());
//		
//		for(Route r1 : routes) {
//			for(Route r2 : routes) {
//		List<Transit> transits1 = new ArrayList<Transit>();
//		transits1.addAll(r1.getTransits());
//		Transit start1 =	transits1.get(0);
//		Transit end1 = transits1.get(transits1.size()-1);
//		List<Leg> startLegs1 = new ArrayList<Leg>();
//		startLegs1.addAll(start1.getStation().getLegs());
//		String driveViaLeg1 = "1";
//		
//		List<Leg> endLegs1 = new ArrayList<Leg>();
//		endLegs1.addAll(end1.getStation().getLegs());
//
//		for(Transit t1 : transits1)
//			if(t1.getLeg() != null && startLegs1.contains(t1.getLeg()) && endLegs1.contains(t1.getLeg()))
//				driveViaLeg1 = t1.getLeg().getName();
//		
//		
//		
//		List<Transit> transits2 = new ArrayList<Transit>();
//		transits2.addAll(r2.getTransits());
//		Transit start2 =	transits2.get(0);
//		Transit end2 = transits2.get(transits2.size()-1);
//		List<Leg> startLegs2 = new ArrayList<Leg>();
//		startLegs2.addAll(start2.getStation().getLegs());
//		String driveViaLeg2 = "2";
//		
//		List<Leg> endLegs2 = new ArrayList<Leg>();
//		endLegs2.addAll(end2.getStation().getLegs());
//
//		for(Transit t2 : transits2)
//			if(t2.getLeg() != null && startLegs2.contains(t2.getLeg()) && endLegs2.contains(t2.getLeg()))
//				driveViaLeg2 = t2.getLeg().getName();
//
//		if(start1.getStation().getName() == start2.getStation().getName() && end1.getStation().getName() == end2.getStation().getName() && driveViaLeg1 == driveViaLeg2)
//			constraintViolated = true;
//		
//		if(constraintViolated)
//			return constraintViolated(r1, "Routes with same endpoints and same direction must use different legs in order to avoid duplicates.");
//		 }
//		}
//		
//		
//		return true;
//	}
	
	
	//When route contains a turn, it must be ensured that the train driving the route has a locomotive as
	//leading and trailing coach
	protected boolean validateLocomotiveWhenTurnReq(Schedule schedule) {
		
		return true;
	}
	
	
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		
		diagnostics.add(diagnostic);
		return false;
	}
}