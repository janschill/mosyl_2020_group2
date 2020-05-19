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
import org.mdse.pts.timetable.impl.TimetableFactoryImpl;
import org.mdse.pts.timetable.impl.TimetableImpl;
import org.mdse.pts.time.Time;
import org.mdse.pts.time.impl.TimeFactoryImpl;

class StationTimetable {
	List<Arrival> arrivals;
	List<Departure> departures;
}

public class ScheduleInterpreter {
	public List<Timetable> interpret(Schedule schedule) {
		HashMap<String, StationTimetable> simulatedTrains = simulateTrains(schedule);
		List<Timetable> timetables = generateTimetables(schedule, simulatedTrains);
		return timetables;
	}

	private static List<Timetable> generateTimetables(Schedule schedule,
			HashMap<String, StationTimetable> simulatedTrains) {
		Network network = (Network) schedule.getNetworkReference().getNetwork();
		List<Timetable> timetables = new ArrayList<Timetable>();
		EList<Station> stations = network.getStations();

		for (Station station : stations) {
			Timetable timetable = new TimetableFactoryImpl().createTimetable();
			timetable.setStationName(station.getName());
			StationTimetable stationTimetable = simulatedTrains.get(station.getName());
			for (Arrival arrival : stationTimetable.arrivals) {
				Arrival entry = new TimetableFactoryImpl().createArrival();
				entry.setTrain(arrival.getTrain());
				entry.setTime(arrival.getTime());
				timetable.getEntries().add(entry);
			}
			for (Departure departure : stationTimetable.departures) {
				Departure entry = new TimetableFactoryImpl().createDeparture();
				entry.setTrain(departure.train.getName());
				entry.setTime(departure.time);
				timetable.getEntries().add(entry);
			}
			timetables.add(timetable);
		}

		return timetables;
	}

	private static HashMap<String, StationTimetable> simulateTrains(Schedule schedule) {
		EList<Route> routes = schedule.getRouteReference(); // It is how it is.

		for (Route route : routes) {
			Station startStation = route.getStops().get(0);
			int currentTravelTime = 0;
			for (time.Time time : route.getTime()) {
				Arrival arrival = new TimetableFactoryImpl().createArrival();
				arrival.setTrain(route.getTrain().getName());
				arrival.setTime(time);
				Departure departure = new TimetableFactoryImpl().createDeparture();
				departure.setTrain(route.getTrain().getName());
				time.Time departureTime = calculateTravelTime();
//				departure.setTime(departureTime);
//				departure.setPlatform(route.getP); // TODO: connect Platform and Station in Route
			}
//			departure.setPlatform();
//			departure.

		}
		return null;
	}

	private static time.Time calculateTravelTime() {
		time.Time travelTime = (time.Time) new TimeFactoryImpl().createTime();

		return travelTime;
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
