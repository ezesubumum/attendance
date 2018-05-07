package edu.mum.es.cs401.attendance;

public class Course {
	
	private String ID;
	private String name;
	private String description;
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	public Course(String ID, String name, String description) {
		this.ID = ID;
		this.name = name;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [ID=" + ID + ", name=" + name + ", description=" + description + "]";
	}
	
	public static void main(String[] args) {
		Course crs = new Course("123456", "Intro to CS", "An introduction to Computer Science");
		System.out.println(crs);
	}
	
	
}
