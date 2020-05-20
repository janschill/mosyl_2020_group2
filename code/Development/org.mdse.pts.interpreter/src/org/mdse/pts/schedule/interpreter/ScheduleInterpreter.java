package org.mdse.pts.schedule.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.mdse.pts.depot.*;
import org.mdse.pts.network.*;
import org.mdse.pts.schedule.*;
import org.mdse.pts.timetable.*;
import org.mdse.pts.time.*;
import org.mdse.pts.time.Day;
import org.mdse.pts.timetable.impl.TimetableFactoryImpl;
import org.mdse.pts.timetable.impl.TimetableImpl;
import org.mdse.pts.time.impl.TimeFactoryImpl;

public class ScheduleInterpreter {
	public List<Timetable> interpret(Schedule schedule) {
		HashMap<String, Timetable> simulatedTrains = simulateTrains(schedule);
		List<Timetable> timetables = generateTimetables(schedule, simulatedTrains);
		return timetables;
	}

//	TODO: I am not sure about this
	private static List<Timetable> generateTimetables(Schedule schedule,
			HashMap<String, Timetable> simulatedTrains) {
		Network network = (Network) schedule.getNetworkReference().getNetwork();
		List<Timetable> timetables = new ArrayList<Timetable>();
		EList<Station> stations = network.getStations();

		for (Station station : stations) {
			Timetable timetable = new TimetableFactoryImpl().createTimetable();
			timetable.setStationName(station.getName());
//			Timetable stationTimetable = simulatedTrains.get(station.getName());
//			addArrivalsToTimetableFromStationTimetable(station, timetable, stationTimetable.arrivals);
//			addDepartureToTimetableFromStationTimetable(station, timetable, stationTimetable.departures);
			timetables.add(timetable);
		}

		return timetables;
	}

//	TODO: This is getting somewhere, but I am unsure about this approach
//	on generating all the correct timetables
	private static HashMap<String, Timetable> simulateTrains(Schedule schedule) {
		HashMap<String, Timetable> trips = new HashMap<String, Timetable>();
		EList<Route> routes = schedule.getRouteReference(); // It is how it is.

		for (Route route : routes) {
			Train train = route.getTrain();
			Station startStation = route.getTransits().get(0).getStation();
			int currentTravelTime = 0;
			Transit previousTransit = null;
			int index = 1;
			for (Transit transit : route.getTransits()) {
				Station currentStation = transit.getStation();
				Transit nextTransit = null;
				if (index < route.getTransits().size()) {
					nextTransit = route.getTransits().get(index);
				}
				Leg leg = transit.getLeg();
				if (previousTransit != null) {
					int travelTime;
					if (leg == null) {
						travelTime = getTravelTimeInMinutes(previousTransit.getStation(), currentStation, train);
					} else {
						travelTime = getTravelTimeInMinutes(leg, train);
					}
					Arrival arrival = new TimetableFactoryImpl().createArrival();
					arrival.setTrain(train.getName());
					arrival.setFromStation(currentStation.getName());
					arrival.setPlatform(transit.getPlatform().getName());
//					arrival.setTime(setArrivalTime);
				}
				if (nextTransit != null) {
					Departure departure = new TimetableFactoryImpl().createDeparture();
					departure.setTrain(train.getName());
					departure.setToStation(nextTransit.getStation().getName());
					departure.setPlatform(nextTransit.getPlatform().getName());
//					departure.setTime(setDepartureTime());
				}
				previousTransit = transit;
				index++;
			}

		}
		return null;
	}

	private static Leg getLegBetweenStations(Station previousStation, Station station) {
		if (previousStation != null) {
			for (Leg leg : previousStation.getLegs()) {
				if (leg.getSourceStation().equals(previousStation) && leg.getTargetStation().equals(station)) {
					return leg;
				}
			}
		}
		return null;
	}

//	private static void castTime(Entry entry, time.Day day, Integer hour) {
//		Time time = new TimeFactoryImpl().createTime();
//		org.mdse.pts.time.Day day_ = (org.mdse.pts.time.Day) day;
//		time.setDay(day);
//		time.setHour(hour);
//		time.setMinute(minute);
//	}

	private static int getTravelTimeInMinutes(Leg leg, Train train) {
		float travelTimeMinutes = (float) (leg.getDistance() / getAverageSpeed(train));
		return (int) (travelTimeMinutes * 60);
	}

	private static int getTravelTimeInMinutes(Station previousStation, Station station, Train train) {
		Leg leg = getLegBetweenStations(previousStation, station);
		return getTravelTimeInMinutes(leg, train);
	}

//	private static time.Time calculateTravelTime() {
//		time.Time travelTime = (time.Time) new TimeFactoryImpl().createTime();
//
//		return travelTime;
//	}

	private static int getAverageSpeed(Train train) {
		if (train instanceof RegionalTrain) {
			return 80;
		} else {
			if (train.getCoaches().size() > 7) {
				return 130;
			} else {
				return 150;
			}
		}
	}

	private static void addArrivalsToTimetableFromStationTimetable(Station station, Timetable timetable,
			List<Arrival> arrivals) {
		for (Arrival arrival : arrivals) {
			Arrival entry = new TimetableFactoryImpl().createArrival();
			entry.setTrain(arrival.getTrain());
			entry.setTime(arrival.getTime());
			entry.setFromStation(station.getName());
			timetable.getEntries().add(entry);
		}
	}

	private static void addDepartureToTimetableFromStationTimetable(Station station, Timetable timetable,
			List<Departure> departures) {
		for (Departure departure : departures) {
			Departure entry = new TimetableFactoryImpl().createDeparture();
			entry.setTrain(departure.getTrain());
			entry.setTime(departure.getTime());
			entry.setToStation(station.getName());
			timetable.getEntries().add(entry);
		}
	}
}
