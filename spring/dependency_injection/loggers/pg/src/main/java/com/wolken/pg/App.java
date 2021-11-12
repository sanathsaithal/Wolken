package com.wolken.pg;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.pg.dto.PGDto;
import com.wolken.pg.service.PGService;


/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	Logger logger=Logger.getLogger(App.class);
        PGDto dto=new PGDto();
        System.out.println("enter id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter location");
        String location=sc.nextLine();
        System.out.println("enter owner name");
        String owner=sc.nextLine();
        System.out.println("enter contact no");
        long contact=sc.nextLong();
        
        PGService service=(PGService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("pgservice");
        
        dto.setId(id);
        dto.setName(name);
        dto.setLocation(location);
        dto.setOwner(owner);
        dto.setContact(contact);
        
        String result=service.validateAndSave(dto);
		logger.info(result);
        
    }
}
