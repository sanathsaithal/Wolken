package com.wolken.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.Movie.DI.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource=new ClassPathResource("applicationContext.xml");
    	BeanFactory beanfactory=new XmlBeanFactory(resource);
    	System.out.println("main method started");
    	beanfactory.getBean("name");
    	Movie movie = (Movie) beanfactory.getBean("movie");
    	movie.printName();
    }
}
