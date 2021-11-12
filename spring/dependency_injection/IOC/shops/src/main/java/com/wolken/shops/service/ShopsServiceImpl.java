package com.wolken.shops.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.shops.dao.ShopsDAO;
import com.wolken.shops.dao.ShopsDAOImpl;
import com.wolken.shops.dto.ShopsDTO;
import com.wolken.shops.entity.ShopsEntity;

public class ShopsServiceImpl implements ShopsService{

	ShopsDAO dao=new ShopsDAOImpl();
	public String validateAndSave(ShopsDTO dto) {
		ShopsEntity entity=new ShopsEntity();
		ShopsDAO dao= (ShopsDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("shopsdao");
		
		if(dto.getId()>0) {
			if(!dto.getName().equals(null) && !dto.getName().equals("")) {
				if(!dto.getType().equals(null) && !dto.getType().equals("")) {
					if(!dto.getLocation().equals(null) && !dto.getLocation().equals("")) {
						if(!dto.getOwner().equals(null) && !dto.getOwner().equals("")) {
							entity.setId(dto.getId());
							entity.setName(dto.getName());
							entity.setType(dto.getType());
							entity.setLocation(dto.getLocation());
							entity.setOwner(dto.getOwner());
							
							String rows=dao.save(entity);
							return rows;
						} 
							
								return "owner info not added";
						} else
							return "location not added";
					}else
						return "shop type not added";
				}else
					return "enter valid name";
			}else
				return "enter valid id";
		}
		
	

}
