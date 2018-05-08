package edu.mum.es.cs401.attendance;

import java.sql.Time;

public class TimeSlot {
	String ID;
	String Description;
	Time beginTime;
	Time endTime;
	public TimeSlot(String iD, String description, Time beginTime, Time endTime) {
		ID = iD;
		Description = description;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}
	public String getID() {
		return ID;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public Time getBeginTime() {
		return beginTime;
	}
	
	public Time getEndTime() {
		return endTime;
	}
	
	
	
}
