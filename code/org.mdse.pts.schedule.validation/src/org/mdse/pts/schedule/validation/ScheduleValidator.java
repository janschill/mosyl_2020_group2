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
		modelIsValid &= mandatoryPlatform(schedule);
		modelIsValid &= validateLocomotiveWhenTurnReq(schedule);
		
		return modelIsValid;
	}
	
	//If there is only one leg connecting two stations, it's not mandatory to be specified explicitly
	protected boolean validateOnlyOneLeg(Schedule schedule) {
		boolean constraintViolated = false;

		List<Route> routes = new ArrayList<Route>();
		routes.addAll(schedule.getRouteReference());
		
		for(Route r : routes) {
		
		List<Transit> transits = new ArrayList<Transit>();
		transits.addAll(r.getTransits());
		List<Station> stations = new ArrayList<Station>();
		List<Leg> driveVias = new ArrayList<Leg>();
		for(Transit t : transits)
			if(t.getStation() != null)
				stations.add(t.getStation());
			else
				driveVias.add(t.getLeg());


		for(int i=0;i<stations.size()-1;i++) {
		boolean driveViaExists = false;
		
		Station first =	stations.get(i);
		Station second = stations.get(i+1);
		
		List<Leg> firstLegs = new ArrayList<Leg>();
		firstLegs.addAll(first.getLegs());
		
		List<Leg> secondLegs = new ArrayList<Leg>();
		secondLegs.addAll(second.getLegs());
		
		
		for(Leg l : driveVias)
			if(firstLegs.contains(l) && secondLegs.contains(l))
				driveViaExists = true;
		
		int counter = 0;
		for(Leg l1 : firstLegs)
			for(Leg l2 : secondLegs)
				if(l1.getName() == l2.getName())
					counter++;


		if(counter>1 && !driveViaExists)
			constraintViolated = true;
		
		
		if(constraintViolated)
return constraintViolated(r, "Please specify appropriate leg between: " + first.getName().toString() + " and " + second.getName().toString() + " using DRIVE VIA keyword.");
		 }
		}
		
		return true;
	}
	
	//If transit object has station, it needs platform as well
		protected boolean mandatoryPlatform(Schedule schedule) {
			boolean constraintViolated = false;

			List<Route> routes = new ArrayList<Route>();
			routes.addAll(schedule.getRouteReference());
			
			for(Route r : routes) {
			
			List<Transit> transits = new ArrayList<Transit>();
			transits.addAll(r.getTransits());
			
			for(Transit t : transits) {
				if(t.getStation() != null)
					if(t.getPlatform() == null)
						constraintViolated = true;
			
			
			if(constraintViolated)
				return constraintViolated(r, "Please specify platform name for station " + t.getStation().getName());
				}
			 }
			
			return true;
		}
	
	
	//When route contains a turn, it must be ensured that the train driving the route has a locomotive as
	//leading and trailing coach
	protected boolean validateLocomotiveWhenTurnReq(Schedule schedule) {
		boolean constraintViolated = false;
		boolean routeHasTurn = false;
		
		List<Route> routes = new ArrayList<Route>();
		routes.addAll(schedule.getRouteReference());
		
		for(Route r : routes) {
		Train train = r.getTrain();
		List<Coach> coaches = train.getCoaches();
		List<Locomotive> locomotives = new ArrayList<Locomotive>();
		
		for(Coach c : coaches)
			if(c instanceof Locomotive)
				locomotives.add((Locomotive)c);
		
		List<Transit> transits = new ArrayList<Transit>();
		transits.addAll(r.getTransits());
		List<Station> stations = new ArrayList<Station>();
		
		for(Transit t : transits)
			if(t.getStation() != null) {
				stations.add(t.getStation());
			}
		
		Object[] stationsArr = stations.toArray();
		
		//Check if previous and next station are the same. If they are, that means there is a turn.
		//I.e. Central - North - Central means that North station requires a turn.
			for(int i=0; i<stations.size();i++)
				for(int j=i+2; j<stations.size();j++)
					if(stationsArr[i] == stationsArr[j])
						routeHasTurn = true;
		
		if(locomotives.size()<2 && routeHasTurn)
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