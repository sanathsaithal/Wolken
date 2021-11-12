package com.wolken.hpSupport.service;


import com.wolken.hpSupport.dao.RegistrationDAO;
import com.wolken.hpSupport.dao.RegistrationDAOImpl;
import com.wolken.hpSupport.dto.UserDTO;
import com.wolken.hpSupport.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {
	
RegistrationDAO dao=new RegistrationDAOImpl();
@Override
public String validateAndSave(UserDTO dto) {
	UserEntity entity=new UserEntity();
	entity.setId(dto.getId());
	entity.setName(dto.getName());
	entity.setEmail(dto.getEmail());
	entity.setPassword(dto.getPassword());
	entity.setProductId(dto.getProductId());
	entity.setComplaint(dto.getComplaint());
	entity.setComplaintRegDate(dto.getComplaintRegDate());
			
	int rows=dao.save(entity);
	System.out.println(rows);
	return null;
	}

}
