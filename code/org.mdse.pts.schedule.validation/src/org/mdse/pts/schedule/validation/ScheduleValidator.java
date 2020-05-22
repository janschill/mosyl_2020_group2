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
import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.Train;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;
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
		
		modelIsValid &= validateOnlyOneLeg(schedule);
		modelIsValid &= mandatoryStopTime(schedule);
		modelIsValid &= validateLocomotiveWhenTurnReq(schedule);
		
		return modelIsValid;
	}
	
	//If there is only one leg connecting two stations, it's not mandatory to be specified explicitly.
	//Specified leg has to belong to both outbound and inbound stations.
	protected boolean validateOnlyOneLeg(Schedule schedule) {
		boolean constraintViolated = false;

		List<Route> routes = new ArrayList<Route>();
		routes.addAll(schedule.getRouteReference());
		
		for(Route r : routes) {
		
		List<Transit> transits = new ArrayList<Transit>();
		transits.addAll(r.getTransits());
		
		for(int i=0; i<transits.size()-1;i++) {
			int counter = 0;
			Transit first = transits.get(i);
			Transit second = transits.get(i+1);
			
			for(Leg l : first.getStation().getLegs()) {
				if(second.getStation().getLegs().contains(l))
					counter++;
			}
		
		if(counter>1 && (first.getLeg() == null || !second.getStation().getLegs().contains(first.getLeg()) || !first.getStation().getLegs().contains(first.getLeg())))
			constraintViolated = true;
		
		if(counter == 1 && first.getLeg() != null)
				if(!second.getStation().getLegs().contains(first.getLeg()) || !first.getStation().getLegs().contains(first.getLeg()))
			constraintViolated = true;
		
		if(counter < 1)
			constraintViolated = true;
		
		
		if(constraintViolated)
return constraintViolated(r, "Please specify appropriate leg between: " + first.getStation().getName() + " and " + second.getStation().getName() + " using DRIVE VIA keyword.");
		 }
		}
		
		return true;
	}
	
		//Standing duration at stop is mandatory for all the stations (stops) along the route
		//except the first and last (start and terminate stations).
		protected boolean mandatoryStopTime(Schedule schedule) {
			boolean constraintViolated = false;

			List<Route> routes = new ArrayList<Route>();
			routes.addAll(schedule.getRouteReference());
			
			for(Route r : routes) {
			
			List<Transit> transits = new ArrayList<Transit>();
			transits.addAll(r.getTransits());
			
			//skip first and last
			for(int i=1;i<transits.size()-1;i++) {
					if(transits.get(i).getStandingDuration() < 1)
						constraintViolated = true;
			
			
			if(constraintViolated)
				return constraintViolated(r, "Please specify standing duration time for stop: " + transits.get(i).getStation().getName());
				}
			 }
			
			return true;
		}
	
	
	//When route contains a turn, it must be ensured that the train driving along that route
	//has a locomotive as a leading and trailing coach.
	protected boolean validateLocomotiveWhenTurnReq(Schedule schedule) {
		boolean constraintViolated = false;
		boolean routeHasTurn = false;
		boolean locomotiveAtBothEnd = true;
		
		List<Route> routes = new ArrayList<Route>();
		routes.addAll(schedule.getRouteReference());
		
		for(Route r : routes) {
		Train train = r.getTrain();
		List<Coach> coaches = train.getCoaches();
		List<Coach> locomotives = new ArrayList<Coach>();
		locomotives.add(coaches.get(0));
		locomotives.add(coaches.get(coaches.size()-1));
		
		for(Coach l : locomotives)
			if(l instanceof Locomotive)
				locomotiveAtBothEnd &= true;
			else
				locomotiveAtBothEnd &= false;
		
		List<Transit> transits = new ArrayList<Transit>();
		transits.addAll(r.getTransits());
		List<Station> stations = new ArrayList<Station>();
		
		for(Transit t : transits)
				stations.add(t.getStation());
		
		Object[] stationsArr = stations.toArray();
		
		//Check if previous and next station are the same. If they are, that means there is a turn.
		//I.e. Central - North - Central means that North station requires a turn.
			for(int i=0; i<stations.size()-2;i++)
					if(stationsArr[i] == stationsArr[i+2])
						routeHasTurn = true;
		
		if(!locomotiveAtBothEnd && routeHasTurn)
			constraintViolated = true;
		
		
		if(constraintViolated) {
			return constraintViolated(r, "Train must have locomotive on both ends because specified route has turn.");
		}
		
	 }
		
		
		return true;
	}
	
	
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		
		diagnostics.add(diagnostic);
		return false;
	}
}