package com.wolken.medicine.DI;

public class Details {

	private String action;
	private String manufacture;
	private String location;
	public void setAction(String action) {
		this.action = action;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Details [action=" + action + ", manufacture=" + manufacture + ", location=" + location + "]";
	}
	
	
}
