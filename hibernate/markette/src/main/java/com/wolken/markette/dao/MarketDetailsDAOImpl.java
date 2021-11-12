package com.wolken.markette.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;import org.hibernate.query.Query;
import com.wolken.hibernateUtils.util.HibernateUtils;	import com.wolken.markette.entity.MarketDetails;


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

	@Override
	public List<MarketDetails> getDetails() {
		List<MarketDetails> details1=null;
		Session session=null;
		try {
			SessionFactory factory=HibernateUtils.getInstance();
			session=factory.openSession();
			session.createNamedQuery("getDetails");
			@SuppressWarnings("unchecked")
			Query<MarketDetails> query=session.createNamedQuery("getDetails");
			details1=query.list();
		}
		finally {
			session.close();
		}
		return details1;
	}
}


