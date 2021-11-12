package com.wolken.cricket.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.cricket.entity.CricketEntity;

public class CricketDaoImpl implements CricketDao{
	
	SessionFactory factory=null;
	Session session=null;
	String result=null;


	public String save(CricketEntity entity) {
		
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			result="Saved";
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return result;
	}
		
	

}
