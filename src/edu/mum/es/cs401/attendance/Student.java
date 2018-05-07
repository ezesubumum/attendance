package edu.mum.es.cs401.attendance;

import java.util.List;

public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private String barCode;
	private List<CourseOffering> courseOfferings;

	public Student(String id, String firstName, String lastName, String barCode) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.barCode = barCode;

	}

	public Student(String id, String firstName, String lastName, String barCode, CourseOffering courseOfferings) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.barCode = barCode;
		if (!this.courseOfferings.contains(courseOfferings)) {
			this.courseOfferings.add(courseOfferings);
		}
	}

	public void addCourseOffering(CourseOffering courseOffering) {
		if (!this.courseOfferings.contains(courseOffering)) {
			this.courseOfferings.add(courseOffering);
		}
	}

	public List<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}

	public void setCourseOfferings(List<CourseOffering> courseOfferings) {
		this.courseOfferings.addAll(courseOfferings);
	}

	public void setCourseOfferings(CourseOffering courseOfferings) {
		if (!this.courseOfferings.contains(courseOfferings)) {
			this.courseOfferings.add(courseOfferings);
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firstName;
	}

	public void setFirtsName(String firtsName) {
		this.firstName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	@Override
	public String toString() {
		return "Student {id " + id + ", firstName " + firstName + ", lastName " + lastName + ", barCode " + barCode
				+ "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barCode == null) ? 0 : barCode.hashCode());
		result = prime * result + ((courseOfferings == null) ? 0 : courseOfferings.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		Student other = (Student) obj;
		if (barCode == null) {
			if (other.barCode != null)
				return false;
		} else if (!barCode.equals(other.barCode))
			return false;
		if (courseOfferings == null) {
			if (other.courseOfferings != null)
				return false;
		} else if (!courseOfferings.equals(other.courseOfferings))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
