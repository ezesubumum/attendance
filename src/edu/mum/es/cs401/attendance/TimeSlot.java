package edu.mum.es.cs401.attendance;

import java.sql.Time;
import java.time.LocalTime;

public class TimeSlot {
	private String ID;
	private String Description;
	private LocalTime beginTime;
	private LocalTime endTime;

	public TimeSlot(String iD, String description, LocalTime beginTime,LocalTime endTime) {
		ID = iD;
		Description = description;
		this.beginTime=beginTime;
		this.endTime=endTime;
		//LocalTime.parse(beginTime.getHour(),beginTime.getHour());
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalTime getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(LocalTime beginTime) {
		this.beginTime = beginTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

}
