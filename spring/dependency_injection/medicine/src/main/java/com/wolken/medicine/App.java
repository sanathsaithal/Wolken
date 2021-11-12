package com.wolken.medicine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.medicine.DI.Medicine;



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
    	Medicine medicine = (Medicine) beanfactory.getBean("medicine");
    	medicine.printName();
    }
}
