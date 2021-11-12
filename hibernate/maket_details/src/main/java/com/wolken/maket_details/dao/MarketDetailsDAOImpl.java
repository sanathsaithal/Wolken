package com.wolken.maket_details.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hibernateUtils.util.HibernateUtils;
import com.wolken.maket_details.entity.MarketDetails;


public class MarketDetailsDAOImpl implements MarketDetailsDAO {

	public boolean save(MarketDetails details) {
		boolean result =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(details);
			transaction.commit();
			if(result)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}

	public void getByid(int id) {
		SessionFactory factory=null;
		Session session=null;
		MarketDetails details=null;
		
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			System.out.println(id);
			details=session.get(MarketDetails.class, id);	
			System.out.println(details);
		}
		finally {
			session.close();
		}
	}

	@Override
	public boolean update(MarketDetails details) {
		boolean result =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(details);
			transaction.commit();
			if(result)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public boolean delete(MarketDetails details) {
		boolean result =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(details);
			transaction.commit();
			if(result)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}

}
