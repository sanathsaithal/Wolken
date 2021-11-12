package com.wolken.matrimony.service;

import com.wolken.matrimony.dao.RegistrationDAO;
import com.wolken.matrimony.dao.RegistrationDAOImpl;
import com.wolken.matrimony.dto.UserDTO;
import com.wolken.matrimony.entity.MatrimonyEntity;

public class RegistrationServiceImpl implements RegistrationService {

	RegistrationDAO dao=new RegistrationDAOImpl();
	
	
	public String validateAndSave(UserDTO dto) {
		MatrimonyEntity entity=new MatrimonyEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setGender(dto.getGender());
		entity.setFatherName(dto.getFatherName());
		entity.setMotherName(dto.getMotherName());
		entity.setDob(dto.getDob());
		entity.setContact(dto.getContact());
		entity.setHeight(dto.getHeight());
				
		int rows=dao.save(entity);
		System.out.println(rows);
		return null;
		
		
	}

}
