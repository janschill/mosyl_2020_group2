package org.mdse.pts.schedule.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.mdse.pts.depot.*;
import org.mdse.pts.network.*;
import org.mdse.pts.schedule.*;
import org.mdse.pts.timetable.*;
import org.mdse.pts.time.Time;
import org.mdse.pts.time.Day;
import org.mdse.pts.timetable.impl.TimetableFactoryImpl;
import org.mdse.pts.time.impl.TimeFactoryImpl;

public class ScheduleInterpreter {
	public Collection<Timetable> interpret(Schedule schedule) {
		HashMap<String, Timetable> simulatedTrains = simulateTrains(schedule);
		return simulatedTrains.values();
	}

	private static HashMap<String, Timetable> simulateTrains(Schedule schedule) {
		HashMap<String, Timetable> trips = new HashMap<String, Timetable>();
		EList<Route> routes = schedule.getRouteReference(); // It is how it is.

		for (Route route : routes) {
			Train currentTrain = route.getTrain();
			List<STime> startingTimes = route.getTime();
			Transit previousTransit = null;
			int index = 1;
			for (Transit transit : route.getTransits()) {
				Station currentStation = transit.getStation();
				Timetable timetable = trips.get(currentStation.getName());
				if (timetable == null) {
					timetable = new TimetableFactoryImpl().createTimetable();
					timetable.setStationName(currentStation.getName());
				}
				Transit nextTransit = null;
				if (index < route.getTransits().size()) {
					nextTransit = route.getTransits().get(index);
				}
				Leg leg = transit.getLeg();
				if (previousTransit != null) {
					int travelTimeInMinutes = getTravelTimeInMinutes(leg, previousTransit, currentStation, currentTrain);

					List<Departure> previousTransitDepartures = trips.get(previousTransit.getStation().getName())
							.getEntries().stream().filter(Departure.class::isInstance).map(Departure.class::cast)
							.filter(d -> d.getToStation().equals(currentStation.getName()))
							.filter(t -> t.getTrain().equals(currentTrain.getName())).collect(Collectors.toList());
					for (Departure previousDeparture : previousTransitDepartures) {
						Arrival arrival = new TimetableFactoryImpl().createArrival();
						arrival.setTrain(currentTrain.getName());
						arrival.setFromStation(previousTransit.getStation().getName());
						arrival.setPlatform(transit.getPlatform().getName());
						Time arrivalTime = addTime(previousDeparture.getTime(), travelTimeInMinutes);
						arrival.setTime(arrivalTime);
						timetable.getEntries().add(arrival);

						if (nextTransit != null) {
							Departure departure = new TimetableFactoryImpl().createDeparture();
							departure.setTrain(currentTrain.getName());
							departure.setToStation(nextTransit.getStation().getName());
							departure.setPlatform(transit.getPlatform().getName());
//							TODO: could be null, probably not
							departure.setTime(addTime(arrivalTime, transit.getStandingDuration()));
							timetable.getEntries().add(departure);
						}
					}
				} else {
					if (nextTransit != null) {
						for (STime time : startingTimes) {
							for (Day day : time.getDay()) {
								for (HrMin hrMin : time.getHrmin()) {
									Departure departure = new TimetableFactoryImpl().createDeparture();
									departure.setTrain(currentTrain.getName());
									departure.setToStation(nextTransit.getStation().getName());
									departure.setPlatform(nextTransit.getPlatform().getName());
									Time departureTime = new TimeFactoryImpl().createTime();
									departureTime.setDay(day);
									departureTime.setHour(hrMin.getHour());
									departureTime.setMinute(hrMin.getMinute());
									departure.setTime(departureTime);
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

	private static int getTravelTimeInMinutes(Leg leg, Transit previousTransit, Station currentStation, Train currentTrain) {
		if (leg == null) {
			return getTravelTimeInMinutes(previousTransit.getStation(), currentStation,
					currentTrain);
		} else {
			return getTravelTimeInMinutes(leg, currentTrain);
		}
	}
	
	private static Time addTime(Time previousTime, int travelTimeInMinutes) {
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
		travelTime.setHour(cal.get(Calendar.HOUR_OF_DAY));
		travelTime.setMinute(cal.get(Calendar.MINUTE));

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

	private static int getTravelTimeInMinutes(Leg leg, Train train) {
		float travelTimeMinutes = (float) (leg.getDistance() / getAverageSpeed(train));
		return (int) (travelTimeMinutes * 60);
	}

	private static int getTravelTimeInMinutes(Station previousStation, Station station, Train train) {
		Leg leg = getLegBetweenStations(previousStation, station);
		return getTravelTimeInMinutes(leg, train);
	}

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
}
