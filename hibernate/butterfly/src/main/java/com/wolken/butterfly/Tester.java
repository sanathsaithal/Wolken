package com.wolken.butterfly;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.butterfly.entity.ButterflyDetails;

public class Tester {
	public static void main(String[] args)
	{
		Session session=null;
		SessionFactory factory=null;
		try {
			Configuration configuration= new Configuration();
			configuration.configure("hibernate.cfg.xml");
			factory=configuration.buildSessionFactory();
			session=factory.openSession();
			ButterflyDetails details=(ButterflyDetails)session.get(ButterflyDetails.class, 1);
			System.out.println(details);
		}
		finally
		{
			session.close();
			factory.close();
		}
	}
}
