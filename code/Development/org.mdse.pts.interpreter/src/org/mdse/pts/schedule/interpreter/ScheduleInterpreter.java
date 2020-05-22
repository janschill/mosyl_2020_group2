package org.mdse.pts.schedule.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.mdse.pts.depot.*;
import org.mdse.pts.network.*;
import org.mdse.pts.schedule.*;
import org.mdse.pts.timetable.*;
import org.mdse.pts.time.*;
import org.mdse.pts.time.Time;
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
	private static List<Timetable> generateTimetables(Schedule schedule, HashMap<String, Timetable> simulatedTrains) {
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
//	Station startStation = route.getTransits().get(0).getStation();
//	It communicates the idea.
	private static HashMap<String, Timetable> simulateTrains(Schedule schedule) {
		HashMap<String, Timetable> trips = new HashMap<String, Timetable>();
		EList<Route> routes = schedule.getRouteReference(); // It is how it is.

		for (Route route : routes) {
			Train currentTrain = route.getTrain();
			int currentTravelTime = 0;
			List<STime> startingTimes = route.getTime();
			Transit previousTransit = null;
			int index = 1;
			for (Transit transit : route.getTransits()) {
				Station currentStation = transit.getStation();
				Timetable timetable = trips.get(currentStation.getName());
				if (timetable == null) {
					timetable = new TimetableFactoryImpl().createTimetable();
				}
				Transit nextTransit = null;
				if (index < route.getTransits().size()) {
					nextTransit = route.getTransits().get(index);
				}
				Leg leg = transit.getLeg();
				if (previousTransit != null) {
					int travelTimeInMinutes;
					if (leg == null) {
						travelTimeInMinutes = getTravelTimeInMinutes(previousTransit.getStation(), currentStation, currentTrain);
					} else {
						travelTimeInMinutes = getTravelTimeInMinutes(leg, currentTrain);
					}
					
					List<Departure> previousTransitDepartures = trips.get(previousTransit.getStation().getName()).getEntries().stream()
							.filter(Departure.class::isInstance)
							.map(Departure.class::cast)
							.filter(d -> d.getToStation().equals(currentStation.getName()))
							.filter(t -> t.getTrain().equals(currentTrain.getName()))
							.collect(Collectors.toList());
					for (Departure previousDeparture : previousTransitDepartures) {
						Arrival arrival = new TimetableFactoryImpl().createArrival();
						arrival.setTrain(currentTrain.getName());
						arrival.setFromStation(previousTransit.getStation().getName());
						arrival.setPlatform(transit.getPlatform().getName());
						arrival.setTime(calculateTravelTime(previousDeparture.getTime(), travelTimeInMinutes));
						timetable.getEntries().add(arrival);

						if (nextTransit != null) {
							Departure departure = new TimetableFactoryImpl().createDeparture();
							departure.setTrain(currentTrain.getName());
							departure.setToStation(nextTransit.getStation().getName());
							departure.setPlatform(transit.getPlatform().getName());
//							TODO: if standingDuration null time is 0
//							departure.setTime(setDepartureTime, currentTravelTime, travelTime, transit.getStandingDuration());
							timetable.getEntries().add(departure);
						}
					}
				} else {
					if (nextTransit != null) {
						for (STime time : startingTimes) {
							for (time.Day day : time.getDay()) {
								for (HrMin hrMin : time.getHrmin()) {
									Departure departure = new TimetableFactoryImpl().createDeparture();
									departure.setTrain(currentTrain.getName());
									departure.setToStation(nextTransit.getStation().getName());
									departure.setPlatform(nextTransit.getPlatform().getName());
//									departure.setTime(setDepartureTime, currentTravelTime, travelTime, transit.getStandingDuration());
									timetable.getEntries().add(departure);
								}
							}
						}
					}
				}
				trips.put(currentStation.getName(), timetable);
				previousTransit = transit;
				index++;
			}

		}
		return null;
	}

	private static Time calculateTravelTime(Time previousTime, int travelTimeInMinutes) {
		Day day = previousTime.getDay();
		int hour = previousTime.getHour();
		int minute = previousTime.getMinute();
		
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, day.getValue());
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, minute);
		cal.add(Calendar.MINUTE, travelTimeInMinutes);
		
		Time travelTime = new TimeFactoryImpl().createTime();
		travelTime.setDay(Day.get(cal.get(Calendar.DAY_OF_WEEK)));

		return travelTime;
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

	private static void castTime(STime stime) {
		Time time = new TimeFactoryImpl().createTime();
		int dayValue = stime.getDay().get(0).getValue();
		time.setDay(Day.get(dayValue));
//		time.setHour(stime);
//		time.setMinute(minute);
	}

	private static int getTravelTimeInMinutes(Leg leg, Train train) {
		float travelTimeMinutes = (float) (leg.getDistance() / getAverageSpeed(train));
		return (int) (travelTimeMinutes * 60);
	}

	private static int getTravelTimeInMinutes(Station previousStation, Station station, Train train) {
		Leg leg = getLegBetweenStations(previousStation, station);
		return getTravelTimeInMinutes(leg, train);
	}

//
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
