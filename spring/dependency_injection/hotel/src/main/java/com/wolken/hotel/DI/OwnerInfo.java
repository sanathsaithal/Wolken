package com.wolken.hotel.DI;

public class OwnerInfo {

	private String ownerName;
	private long contact;
	private String city;
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "OwnerInfo [ownerName=" + ownerName + ", contact=" + contact + ", city=" + city + "]";
	}
	
	
}
