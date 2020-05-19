package org.mdse.pts.timetable.acceleo.TT2HTML.services;

import org.mdse.pts.time.Time;

public class TimeFormattingService {
	
	public String getTimeFormatted(Time time) {
		String hourAsString = time.getHour() + "";
		hourAsString = hourAsString.length() == 1 ? "0" + hourAsString : hourAsString;
		String minuteAsString = time.getMinute() + "";	
		minuteAsString = minuteAsString.length() == 1 ? "0" + minuteAsString : minuteAsString;
		
		return hourAsString + ":" + minuteAsString;
	}
	
}
