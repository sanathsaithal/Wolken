package com.wolken.Movie;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.Movie.DI.Movie;



public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean("movie");
		Movie movie = (Movie) context.getBean("movie");
    	movie.printName();
	}

}
