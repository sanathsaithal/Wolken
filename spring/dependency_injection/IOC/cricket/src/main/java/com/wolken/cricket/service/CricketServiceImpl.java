package com.wolken.cricket.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.cricket.dao.CricketDao;
import com.wolken.cricket.dao.CricketDaoImpl;
import com.wolken.cricket.dto.CricketDto;
import com.wolken.cricket.entity.CricketEntity;

public class CricketServiceImpl implements CricketService {
	
	CricketDao dao=new CricketDaoImpl();

	public String validateAndSave(CricketDto dto) {
		CricketEntity entity=new CricketEntity();
		CricketDao dao= (CricketDao) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("cricketdao");
		
		if(dto.getId()>0) {
			if(!dto.getTeamName().equals(null) && !dto.getTeamName().equals("")) {
				if(!dto.getTeamCoach().equals(null) && !dto.getTeamCoach().equals("")) {
					if(!dto.getTeamSponcer().equals(null) && !dto.getTeamSponcer().equals("")) {
						if(dto.getPosition()>0) {
							entity.setId(dto.getId());
							entity.setTeamName(dto.getTeamName());
							entity.setTeamCoach(dto.getTeamCoach());
							entity.setTeamSponcer(dto.getTeamSponcer());
							entity.setPosition(dto.getPosition());
							
							String rows=dao.save(entity);
							return rows;
						} 
							
								return "position not valid";
						} else
							return "sponcer added";
					}else
						return "team coach not addes";
				}else
					return "enter valid name";
			}else
				return "enter valid id";
		}
	}
	
	


