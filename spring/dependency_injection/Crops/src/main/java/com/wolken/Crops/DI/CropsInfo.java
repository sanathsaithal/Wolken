package com.wolken.Crops.DI;

public class CropsInfo {
	
	private String name;
	private String type;
	Fertilizer fertilizer;
	
	public CropsInfo()
	{
		System.out.println("default constructor calling");
	}

	public CropsInfo(String name,String type,Fertilizer fertilizer)
	{
		this.name=name;
		this.type=type;
		this.fertilizer=fertilizer;
		
	}
	
	public void printName()
	{
		System.out.println(name);
		System.out.println(type);
		System.out.println(fertilizer);
	}

	
	
	
}
