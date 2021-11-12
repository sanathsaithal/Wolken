package com.wolken.medicine.DI;

;

public class Medicine {

	private String name;
	private String type;
	Details details;
	
	public Medicine()
	{
		System.out.println("default constructor calling");
	}

	public Medicine(String name,String type,Details details)
	{
		this.name=name;
		this.type=type;
		this.details=details;
		
	}
	
	public void printName()
	{
		System.out.println(name);
		System.out.println(type);
		System.out.println(details);
	}
}
