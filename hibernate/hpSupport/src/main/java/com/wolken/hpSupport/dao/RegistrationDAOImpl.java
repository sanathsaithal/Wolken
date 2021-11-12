package com.wolken.hpSupport.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hibernateUtils.util.HibernateUtils;
import com.wolken.hpSupport.entity.UserEntity;

public class RegistrationDAOImpl implements RegistrationDAO {

	@Override
	public int save(UserEntity entity) {
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
