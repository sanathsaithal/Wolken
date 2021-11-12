package com.wolken.wifi;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.wolken.wifi.DI.Wifi;

public class Test {
	public static void main( String[] args )
    {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean("wifi");
		Wifi wifi = (Wifi) context.getBean("wifi");
    	wifi.printName();
    }
}
