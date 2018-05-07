package edu.mum.es.cs401.attendance;

import java.util.List;

public class CourseOffering {
	private String id;
	private Course course;
	private AcademicBlock block;
	private Location location;
	private Faculty faculty;
	private List<Session> sessions;
	private int requiredSession;

	public CourseOffering(String id, Course course, AcademicBlock block, Location location, Faculty faculty,
			List<Session> sessions, int requiredSession) {
		this.id = id;
		this.course = course;
		this.block = block;
		this.location = location;
		this.faculty = faculty;
		this.sessions = sessions;
		this.requiredSession = requiredSession;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public AcademicBlock getBlock() {
		return block;
	}

	public void setBlock(AcademicBlock block) {
		this.block = block;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions.addAll(sessions);
	}

	public int getRequiredSession() {
		return requiredSession;
	}

	public void setRequiredSession(int requiredSession) {
		this.requiredSession = requiredSession;
	}
	
	@Override
	public String toString() {
		return "CourseOffering {id " + id + ", course " + course + ", block " + block + ", location " + location
				+ ", faculty " + faculty + ", requiredSessions " + requiredSession + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block == null) ? 0 : block.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + requiredSession;
		result = prime * result + ((sessions == null) ? 0 : sessions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseOffering other = (CourseOffering) obj;
		if (block == null) {
			if (other.block != null)
				return false;
		} else if (!block.equals(other.block))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (requiredSession != other.requiredSession)
			return false;
		if (sessions == null) {
			if (other.sessions != null)
				return false;
		} else if (!sessions.equals(other.sessions))
			return false;
		return true;
	}
	
	

}
