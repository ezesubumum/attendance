package edu.mum.es.cs401.attendance;

import java.util.HashMap;

public class Session {
	private String ID;
	private HashMap<String,AcademicBlock> academicBlock;
	private TimeSlot timeSlot;
	

	public Session(String iD) {
		ID = iD;
	}


	public String getSessionNo() {
		
		return ID;
	}
	
}

