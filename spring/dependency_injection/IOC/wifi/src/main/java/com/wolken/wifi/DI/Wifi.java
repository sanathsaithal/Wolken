package com.wolken.wifi.DI;

public class Wifi {

	private String provider;
	private String location;
	Package plan;
	
	public Wifi()
	{
		System.out.println("default constructor calling");
	}

	public Wifi(String provider,String location,Package plan)
	{
		this.provider=provider;
		this.location=location;
		this.plan=plan;
		
	}
	
	public void printName()
	{
		System.out.println(provider);
		System.out.println(location);
		System.out.println(plan);
	}
	
}
