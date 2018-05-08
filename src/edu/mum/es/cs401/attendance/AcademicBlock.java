package edu.mum.es.cs401.attendance;

import java.util.Date;
import java.util.HashMap;

public class AcademicBlock {
	// To encapsulate a Collection of CourseOfferings within the AcademicBlock
	// class.

	// ------------
	// Attributes.
	// ------------

	// This HashMap stores Course object references, using
	// the courseOffering no. of the CourseOffering (a String) as the key.
	String ID;
	String name;
	Date startDate;
	Date endDate;
	int Semester;
	private HashMap<String, CourseOffering> offerings;
	private HashMap<String, Session> sessions;
	

	// ----------------
	// Constructor(s).
	// ----------------

	public AcademicBlock() {
		// Note that we're instantiating empty support Collection(s).

		offerings = new HashMap<String, CourseOffering>();
		sessions = new HashMap<String, Session>();
	}

	// ------------------
	// Accessor methods.
	// ------------------

	// None!

	// -----------------------------
	// Miscellaneous other methods.
	// -----------------------------

	public void displayCourseOffering() {
		// Iterate through the HashMap and display all entries.

		for (CourseOffering c : offerings.values()) {
			c.toString();
			System.out.println();
		}
	}
	
	public void displaySession() {
		// Iterate through the HashMap and display all entries.

		for (Session s : sessions.values()) {
			 s.toString();
			System.out.println();
		}
	}

	public void addCourseOffering(CourseOffering c) {
		// We use the courseOffering no. as the key.

		String key = c.getId();
		offerings.put(key, c);
	}
	
	public void addSession(Session s) {
		// We use the session no. as the key.

		String key = s.getSessionNo();
		sessions.put(key, s);
	}

	public CourseOffering findCourseOffering(String courseOffrNo) {
		return offerings.get(courseOffrNo);
	}

	public boolean isEmpty() {
		if (offerings.size()==0||sessions.size() == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		AcademicBlock ab = new AcademicBlock();
		//ab.addCourseOffering(new CourseOffering());
		//ab.addSession();
		//ab.displayCourseOffering();
		//ab.findCourseOffering();
		
		
	}
}

