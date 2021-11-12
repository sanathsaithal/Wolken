package com.wolken.hotel.DI;



public class Hotel {
	private String name;
	private String location;
	OwnerInfo ownerInfo;
	
	public Hotel()
	{
		System.out.println("default constructor calling");
	}

	public Hotel(String name,String location,OwnerInfo ownerInfo)
	{
		this.name=name;
		this.location=location;
		this.ownerInfo=ownerInfo;
		
	}
	
	public void printName()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(ownerInfo);
	}

}
