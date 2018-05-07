package edu.mum.es.cs401.attendance;

public class Faculty {
	private String ID;
	private String name;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Faculty(String ID, String name) {		
		this.ID = ID;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Faculty [ID=" + ID + ", name=" + name + "]";
	}
	
	
}
