package edu.mum.es.cs401.attendance;

import java.util.HashMap;

public class Session {
	private String ID;
	private HashMap<String,AcademicBlock> academicBlock;
	private HashMap<String,TimeSlot> timeSlot;
	

	public Session(String iD) {
		academicBlock = new HashMap<String,AcademicBlock>();
		timeSlot = new HashMap<String,TimeSlot>();
		
		ID = iD;
	}

	public String getSessionNo() {
		
		return ID;
	}
	
	
	public void displayAcademicBlock() {
		// Iterate through the HashMap and display all entries.

		for (AcademicBlock block : academicBlock.values()) {
			block.toString();
			System.out.println();
		}
	}
	
	
	public void addAcademicBlock(AcademicBlock block) {
		// We use the courseOffering no. as the key.

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

