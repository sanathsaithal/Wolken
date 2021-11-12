package com.wolken.facebookRegLogin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.facebookRegLogin.entity.FacebookRegisterEntity;
import com.wolken.facebookRegLogin.entity.LoginEntity;
import com.wolken.facebookRegLogin.utils.HibernateUtils;

public class FacebookRegisterDAOImpl implements FacebookRegisterDAO {

	public String save(FacebookRegisterEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		String rows =null;
		
		
		 try {
			 	
			 	factory = HibernateUtils.getInstance();
			 	
			 	session = factory.openSession();
	            Transaction transaction = session.beginTransaction();
	            session.save(entity);
	            transaction.commit();
	            rows="saved";
	        } finally {
	        	if(session!=null)
	                session.close();
	            }
	        
		return rows;
	}

	

	public LoginEntity getByEmail(String email) {
		Session session=null;
		SessionFactory factory=null;
		LoginEntity entity=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			@SuppressWarnings("unchecked")
			Query query=session.getNamedQuery("getByEmail");
			query.setParameter("email", email);
			entity=(LoginEntity) query.uniqueResult();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return entity;
	}



	
	public int updatePassword(LoginEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<LoginEntity> query=session.getNamedQuery("updatePassword");
			query.setParameter("password", entity.getPassword());
			query.setParameter("email", entity.getEmail());
			rows=query.executeUpdate();
			transaction.commit();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return rows;	
	}




	public int deleteData(String email) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<LoginEntity> query=session.getNamedQuery("deleteData");
			query.setParameter("email", email);
			rows=query.executeUpdate();
			transaction.commit();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return rows;	
	}
	

}
