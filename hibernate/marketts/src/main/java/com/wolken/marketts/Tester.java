package com.wolken.marketts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.marketts.entity.MarketDetails;

public class Tester {
	public static void main(String[] args)
	{
		Session session=null;
		SessionFactory factory=null;
		try {
			Configuration  configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			factory=configuration.buildSessionFactory();
			session=factory.openSession();
			MarketDetails details=(MarketDetails)session.get(MarketDetails.class,2);
			System.out.println(details);
		} 
		finally {
			session.close();
			factory.close();
		}
	}
}
