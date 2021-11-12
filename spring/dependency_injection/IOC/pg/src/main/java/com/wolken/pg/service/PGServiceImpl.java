package com.wolken.pg.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.pg.dao.PGDao;
import com.wolken.pg.dao.PGDaoImpl;
import com.wolken.pg.dto.PGDto;
import com.wolken.pg.entity.PGEntity;


public class PGServiceImpl implements PGService {

	PGDao dao=new PGDaoImpl();
	public String validateAndSave(PGDto dto) {
		
		
			PGEntity entity=new PGEntity();
			PGDao dao= (PGDao) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("pgdao");
			
			if(dto.getId()>0) {
				if(!dto.getName().equals(null) && !dto.getName().equals("")) {
					if(!dto.getLocation().equals(null) && !dto.getLocation().equals("")) {
						if(!dto.getOwner().equals(null) && !dto.getOwner().equals("")) {
							if(dto.getContact()>=5999999999l && dto.getContact()<=9999999999l) {
								entity.setId(dto.getId());
								entity.setName(dto.getName());
								entity.setLocation(dto.getLocation());
								entity.setOwner(dto.getOwner());
								entity.setContact(dto.getContact());
								
								String rows=dao.save(entity);
								return rows;
							} 
								
									return "contact no not valid";
							} else
								return "owner not added";
						}else
							return "location not added";
					}else
						return "enter valid name";
				}else
					return "enter valid id";
			}
			
		
	}


