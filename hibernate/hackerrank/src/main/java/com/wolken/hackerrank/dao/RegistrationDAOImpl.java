package com.wolken.hackerrank.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.hackerrank.entity.HackerLoginEntity;
import com.wolken.hackerrank.entity.HackerrankUserEntity;
import com.wolken.hibernateUtils.util.HibernateUtils;

public class RegistrationDAOImpl implements RegistrationDAO {

	@Override
	public int save(HackerrankUserEntity entity) {
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

	@Override
	public HackerLoginEntity getByEmail(String email) {
		Session session=null;
		HackerLoginEntity entity=null;
		try {
			SessionFactory factory=HibernateUtils.getInstance();
			session=factory.openSession();
			
			@SuppressWarnings("unchecked")
			Query<HackerLoginEntity> query=session.createNamedQuery("getByEmail");
			query.setParameter("email", email);
			entity=(HackerLoginEntity) query.uniqueResult();
		}
		finally {
			session.close();
		}
		return entity;
			
	}

	@Override
	public int forgotPassword(HackerLoginEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<HackerLoginEntity> query=session.createNamedQuery("updatePassword");
			query.setParameter("newPassword", entity.getPassword());
			query.setParameter("email", entity.getEmail());
			rows=query.executeUpdate();
			transaction.commit();
		}finally {
			session.close();
		}
		return rows;	
		
	}

}
