package org.mdse.pts.schedule.interpreter;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
			List<Departure> previousTransitDepartures = new LinkedList<>();

			Transit previousTransit = null, currentTransit, nextTransit;
			for (int idx = 0; idx < route.getTransits().size(); idx++) {
				currentTransit = route.getTransits().get(idx);
				Station currentStation = currentTransit.getStation();
				Timetable timetable = trips.get(currentStation.getName());
				if (timetable == null) {
					timetable = new TimetableFactoryImpl().createTimetable();
					timetable.setStationName(currentStation.getName());
				}

				nextTransit = null;
				if (idx + 1 < route.getTransits().size()) {
					nextTransit = route.getTransits().get(idx + 1);
				}

				Leg leg = currentTransit.getLeg();
				if (previousTransit != null) {
					int travelTimeInMinutes = getTravelTimeInMinutes(leg, previousTransit, currentStation,
							currentTrain);
					List<Departure> tmp = new LinkedList<Departure>();
					for (Departure previousDeparture : previousTransitDepartures) {
						Time arrivalTime = addTime(previousDeparture.getTime(), travelTimeInMinutes);
						Arrival arrival = createArrival(currentTrain, previousTransit, currentTransit, arrivalTime);
						timetable.getEntries().add(arrival);

						if (nextTransit != null) {
							Time departureTime = addTime(arrivalTime, currentTransit.getStandingDuration());
							Departure departure = createDepature(currentTrain, nextTransit, departureTime);
							timetable.getEntries().add(departure);
							tmp.add(departure);
						}
					}
					previousTransitDepartures = tmp;
				} else {
					if (nextTransit != null) {
						for (Time time : translateSTimes(startingTimes)) {
							Departure departure = createDepature(currentTrain, nextTransit, time);
							timetable.getEntries().add(departure);
							previousTransitDepartures.add(departure);
						}
					}
				}
				trips.put(currentStation.getName(), timetable);
				previousTransit = currentTransit;
			}
		}
		return trips;
	}

	private static List<Time> translateSTimes(List<STime> stimes) {
		List<Time> times = new LinkedList<Time>();
		Time time;
		for (STime stime : stimes) {
			for (Day day : stime.getDay()) {
				for (HrMin hrMin : stime.getHrmin()) {
					time = new TimeFactoryImpl().createTime();
					time.setDay(day);
					time.setHour(hrMin.getHour());
					time.setMinute(hrMin.getMinute());
					times.add(time);
				}
			}
		}
		return times;
	}

	private static Arrival createArrival(Train train, Transit previousTransit, Transit currentTransit,
			Time arrivalTime) {
		Arrival arrival = new TimetableFactoryImpl().createArrival();
		arrival.setTrain(train.getName());
		arrival.setFromStation(previousTransit.getStation().getName());
		arrival.setPlatform(currentTransit.getPlatform().getName());
		arrival.setTime(arrivalTime);
		return arrival;
	}

	private static Departure createDepature(Train train, Transit nextTransit, Time departureTime) {
		Departure departure = new TimetableFactoryImpl().createDeparture();
		departure.setTrain(train.getName());
		departure.setToStation(nextTransit.getStation().getName());
		departure.setPlatform(nextTransit.getPlatform().getName());
		departure.setTime(departureTime);
		return departure;
	}

	private static int getTravelTimeInMinutes(Leg leg, Transit previousTransit, Station currentStation,
			Train currentTrain) {
		if (leg == null) {
			return getTravelTimeInMinutes(previousTransit.getStation(), currentStation, currentTrain);
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
		float travelTimeMinutes = (float) (leg.getDistance() / (getAverageSpeed(train) / 60));
		return (int) travelTimeMinutes;
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
