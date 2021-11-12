package com.wolken.Movie.DI;

public class Movie {
	private String name;
	private String language;
	Info info;
	
	public Movie()
	{
		System.out.println("default constructor calling");
	}

	public Movie(String name,String language,Info info)
	{
		this.name=name;
		this.language=language;
		this.info=info;
		
	}
	
	public void printName()
	{
		System.out.println(name);
		System.out.println(language);
		System.out.println(info);
	}
}
