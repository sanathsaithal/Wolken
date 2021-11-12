package com.wolken.hackerrank.service;

import java.util.Objects;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.entity.HackerLoginEntity;
import com.wolken.hackerrank.entity.HackerrankUserEntity;
import com.wolken.hibernateUtils.util.HibernateUtils;

public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO dao=new RegistrationDAOImpl();
	@Override
	public String validateAndSave(UserDTO dto) {
		HackerrankUserEntity entity=new HackerrankUserEntity();
		
		if(dto.getId()>0) {
			if(!dto.getName().equals(null) && !dto.getName().equals("")) {
				if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
					if(dto.getContact()>5999999999l && dto.getContact()<=9999999999l) {
						if(dto.getPassword().equals(dto.getConPassword())) {
							entity.setId(dto.getId());
							entity.setName(dto.getName());
							entity.setEmail(dto.getEmail());
							entity.setPassword(dto.getPassword());
							entity.setContact(dto.getContact());
							
							int rows=dao.save(entity);
							if(rows > 0)
							{
								return "data saved";
							}
							else {
								return "data not saved";
							}
							} else 
								return "password doesnot match";
						} else
							return "enter valid contact no";
					}else
						return "enter valid email address";
				}else
					return "enter valid name";
			}else
				return "enter valid id";
		}
	@Override
	public String validateAndLogin(LoginDTO ldto) {
		if(!Objects.isNull(ldto))
		{
			if(!ldto.getEmail().equals(null) && !ldto.getEmail().equals("")) {
				HackerLoginEntity entity=dao.getByEmail(ldto.getEmail());
				if(ldto.getPassword().equals(entity.getPassword())) {
					return "login successful";
				} else {
					return "enter valid email id";
				} 
				} else {
					return "please provide valid email id";
					
				}
			}else { 
				return "object is null";
		}
		
	}
	@Override
	public String validateAndUpdatePassword(String email) {
		Scanner sc=new Scanner(System.in);
		if(!email.equals(null) && !email.equals(""))
		{
			HackerLoginEntity entity=dao.getByEmail(email);
			if(entity !=null)
			{
				System.out.println("enter new password");
				String password=sc.nextLine();
				System.out.println("confirm password");
				String conPassword=sc.nextLine();
				
				if(password.equals(conPassword))
				{
					entity.setEmail(email);
					entity.setPassword(password);
					
					int isUpdate=dao.forgotPassword(entity);
					if(isUpdate>0)
					{
						return "password updated";
					} else {
						return "password not updated";
					}
				
				} else {
					return "password doesnot match";
				} 
					
				} else {
					return "enter valid email";
			}
			
		}else {
			return "enter valid email id";
		}
		
	}
}

