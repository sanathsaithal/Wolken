package com.wolken.solarSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.solarSystem.entity.SolarSystem;

public class Tester {
	public static void main(String[] args)
	{
		Session session=null;
		SessionFactory factory=null;
		try {
			Configuration configuration= new Configuration();
			configuration.configure();
			factory=configuration.buildSessionFactory();
			session=factory.openSession();
			SolarSystem details=session.get(SolarSystem.class,1);
			System.out.println(details);
		}
		finally
		{
			session.close();
			factory.close();
		}
	}
}
