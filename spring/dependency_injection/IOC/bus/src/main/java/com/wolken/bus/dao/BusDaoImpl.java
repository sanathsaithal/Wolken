package com.wolken.bus.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.bus.entity.BusEntity;

public class BusDaoImpl implements BusDao {
	
	SessionFactory factory=null;
	Session session=null;
	String result=null;
	Logger logger=Logger.getLogger(BusDaoImpl.class);
	public String save(BusEntity entity) {
		
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			result="Saved";
		} catch(Exception e) {
			logger.info(e.getMessage());
		}finally {
		}
			if(session!=null) {
				session.close();
			}
		
		return result;
	}
		
	}


