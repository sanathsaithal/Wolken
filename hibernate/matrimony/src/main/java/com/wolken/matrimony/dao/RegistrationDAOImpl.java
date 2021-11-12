package com.wolken.matrimony.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hibernateUtils.util.HibernateUtils;
import com.wolken.matrimony.entity.MatrimonyEntity;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(MatrimonyEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
		}			
		finally {
			session.close();
		}
		return 0;
	}

}
