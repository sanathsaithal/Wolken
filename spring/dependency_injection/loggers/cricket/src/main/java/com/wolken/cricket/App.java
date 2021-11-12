package com.wolken.cricket;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.cricket.dto.CricketDto;
import com.wolken.cricket.service.CricketService;



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
            CricketDto dto=new CricketDto();
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter team name");
            String name=sc.nextLine();
            System.out.println("enter team coach");
            String coachName=sc.nextLine();
            System.out.println("enter team sponcer");
            String sName=sc.nextLine();
            System.out.println("enter rank");
            int position=sc.nextInt();
            
            CricketService service= (CricketService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("cricketservice");
            
            dto.setId(id);
            dto.setTeamName(name);
            dto.setTeamCoach(coachName);
            dto.setTeamSponcer(sName);
            dto.setPosition(position); 
            
            
            
            String result=service.validateAndSave(dto);
    		logger.info(result);
            
        
    }
}
