package com.wolken.Crops.DI;

public class Fertilizer {
	
	private String fname;
	private int quantity;
	private int area;
	
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Fertilizer [fname=" + fname + ", quantity=" + quantity + ", area=" + area + "]";
	}
	
	
	
	

}
