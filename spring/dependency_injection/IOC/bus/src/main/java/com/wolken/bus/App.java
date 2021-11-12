package com.wolken.bus;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.bus.dto.BusDto;
import com.wolken.bus.services.BusService;



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
            BusDto dto=new BusDto();
            logger.info("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            logger.info("enter name");
            String name=sc.nextLine();
            logger.info("enter capacity");
            int capacity=sc.nextInt();
            sc.nextLine();
            logger.info("enter bus model");
            String model=sc.nextLine();
            logger.info("enter contact no");
            long contact=sc.nextLong();
            
            BusService service=(BusService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("busservice");
            
            dto.setId(id);
            dto.setName(name);     
            dto.setCapacity(capacity);
            dto.setModel(model);
            dto.setContact(contact);
            logger.info(dto);
            
            String result=service.validateAndSave(dto);
    		logger.info(result);
            
        }
    }

