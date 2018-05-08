package edu.mum.es.cs401.attendance;

import java.time.LocalDate;
import java.util.HashMap;

public class Session {
	private String ID;
	private LocalDate date;
	private HashMap<String, AcademicBlock> academicBlock;
	private HashMap<String, TimeSlot> timeSlot;

	public Session(String iD, LocalDate date) {
		academicBlock = new HashMap<String, AcademicBlock>();
		timeSlot = new HashMap<String, TimeSlot>();
		ID = iD;
		this.date = date;
	}

	public String getSessionNo() {

		return ID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void displayAcademicBlock() {
		// Iterate through the HashMap and display all entries.

		for (AcademicBlock block : academicBlock.values()) {
			block.toString();
			System.out.println();
		}
	}

	public void addAcademicBlock(AcademicBlock block) {
		// We use the acamedicblock no. as the key.

		String key = block.getID();
		academicBlock.put(key, block);
	}

	public void addTimeSlot(TimeSlot time) {
		// We use the courseOffering no. as the key.

		String key = time.getID();
		timeSlot.put(key, time);
	}

	public static void main(String[] args) {

	}

}
