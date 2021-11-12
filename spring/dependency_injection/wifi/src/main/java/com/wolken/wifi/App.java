package com.wolken.wifi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.wifi.DI.Wifi;

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
    	Wifi wifi = (Wifi) beanfactory.getBean("wifi");
    	wifi.printName();
    }
}
