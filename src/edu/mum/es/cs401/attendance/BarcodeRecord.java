package edu.mum.es.cs401.attendance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BarcodeRecord {
	private Student student;
	private LocalDate date;
	private List <TimeSlot> timeSlot;
	private Location location;
	
	public BarcodeRecord(Student student, LocalDate date, Location location) {
		this.student = student;
		this.date = date;
		timeSlot = new ArrayList<TimeSlot>();
		this.location = location;
	}
	
	public void addTimeSlot(TimeSlot timeSlot) {
		this.timeSlot.add(timeSlot);	
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<TimeSlot> getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(List<TimeSlot> timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}	
	
	
	
	
	
}
