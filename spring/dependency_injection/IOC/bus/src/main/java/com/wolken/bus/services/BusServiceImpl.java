package com.wolken.bus.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.bus.dao.BusDao;
import com.wolken.bus.dao.BusDaoImpl;
import com.wolken.bus.dto.BusDto;
import com.wolken.bus.entity.BusEntity;


public class BusServiceImpl implements BusService {

	BusDao dao=new BusDaoImpl();
	public String validateAndSave(BusDto dto) {
		
		BusEntity entity=new BusEntity();
				BusDao dao= (BusDao) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("busdao");
				
				if(dto.getId()>0) {
					if(!dto.getName().equals(null) && !dto.getName().equals("")) {
						if(dto.getCapacity()>0) {
							if(!dto.getModel().equals(null) && !dto.getModel().equals("")) {
								if(dto.getContact()>=5999999999l && dto.getContact()<=9999999999l) {
									entity.setId(dto.getId());
									entity.setName(dto.getName());
									entity.setCapacity(dto.getCapacity());
									entity.setModel(dto.getModel());
									entity.setContact(dto.getContact());
									
									String rows=dao.save(entity);
									return rows;
								} 
									
										return "contact no not valid";
								} else
									return "model not added";
							}else
								return "enter capacity of bus based on model";
						}else
							return "enter valid name";
					}else
						return "enter valid id";
				}
				
	}


