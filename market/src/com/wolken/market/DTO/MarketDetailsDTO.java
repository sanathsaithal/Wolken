package com.wolken.market.DTO;

public class MarketDetailsDTO {
	private int id;
	private String name;
	private String location;
	private int noOfShops;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfShops() {
		return noOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}
	
	@Override
	public String toString() {
		return "MarketDetailsDTO [id=" + id + ", name=" + name + ", location=" + location + ", noOfShops=" + noOfShops
				+ "]";
	}
	
}
