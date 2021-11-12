package com.wolken.collections;

public class Park implements Comparable<Park>{
	private String name;
	private String city;
	private byte pool;
	private byte ride;
	private long contact;
	private String food;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public byte getPool() {
		return pool;
	}
	public void setPool(byte pool) {
		this.pool = pool;
	}
	public byte getRide() {
		return ride;
	}
	public void setRide(byte ride) {
		this.ride = ride;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public int compareTo(Park p) {
		// TODO Auto-generated method stub
		return Integer.compare(this.pool,p.pool);
	}
	
}
