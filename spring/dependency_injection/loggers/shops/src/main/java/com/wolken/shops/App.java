package com.wolken.shops;

import java.util.Scanner;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.wolken.shops.dto.ShopsDTO;
import com.wolken.shops.entity.ShopsEntity;
import com.wolken.shops.service.ShopsService;
import com.wolken.shops.service.ShopsServiceImpl;

public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	Logger logger=Logger.getLogger(App.class);
    	ShopsDTO dto=new ShopsDTO();
    	System.out.println("enter id");
    	int id=sc.nextInt();
    	sc.nextLine();
    	System.out.println("enter name");
    	String name=sc.nextLine();
    	System.out.println("enter type");
    	String type=sc.nextLine();
    	System.out.println("enter location");
    	String location=sc.nextLine();
    	System.out.println("enter owner");
    	String owner=sc.nextLine();
    	ShopsService service=(ShopsService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("shopsservice");
    	
    	dto.setId(id);
    	dto.setName(name);
    	dto.setType(type);
    	dto.setLocation(location);
    	dto.setOwner(owner);
    	
    	String result=service.validateAndSave(dto);
    	logger.info(result);
    }
}
