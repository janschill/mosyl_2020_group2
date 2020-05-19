package org.mdse.pts.timetable.acceleo.TT2HTML.services;



import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.mdse.pts.time.Time;
import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Entry;

public class EntrySortingService {
	
	public Collection<Arrival> getArrivalsByDay_Sorted(Collection<Entry> entries, String day) {
		List<Arrival> arrivals = entries.stream()
										.filter(e -> e.getTime().getDay().getLiteral().equals(day))
                						.filter(Arrival.class::isInstance)
                						.map(Arrival.class::cast)
                						.collect(Collectors.toList());
		Collections.sort(arrivals, new EntityComparator());
		
		return arrivals;
	}
	
	public Collection<Departure> getDeparturesByDay_Sorted(Collection<Entry> entries, String day) {
		List<Departure> departures = entries.stream()
										.filter(e -> e.getTime().getDay().getLiteral().equals(day))
                						.filter(Departure.class::isInstance)
                						.map(Departure.class::cast)
                						.collect(Collectors.toList());
		Collections.sort(departures, new EntityComparator());
		
		return departures;
	}
	
	
	public class EntityComparator implements Comparator<Entry> {

		@Override
		public int compare(Entry e1, Entry e2) {
			Time time1 = e1.getTime();
			Time time2 = e2.getTime();
			int res = time1.getDay().compareTo(time2.getDay());
			if(res == 0) {
				res = time1.getHour() - time2.getHour();
				if(res == 0) {
					res = time1.getMinute() - time2.getMinute();
				}
			}
			return res;
		}		
	}
}
