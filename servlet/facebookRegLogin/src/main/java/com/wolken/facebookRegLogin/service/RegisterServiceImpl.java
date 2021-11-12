package com.wolken.facebookRegLogin.service;

import java.util.Objects;

import com.wolken.facebookRegLogin.dao.FacebookRegisterDAO;
import com.wolken.facebookRegLogin.dao.FacebookRegisterDAOImpl;
import com.wolken.facebookRegLogin.dto.FacebookLoginDTO;
import com.wolken.facebookRegLogin.dto.FacebookRegisterDTO;
import com.wolken.facebookRegLogin.entity.FacebookRegisterEntity;
import com.wolken.facebookRegLogin.entity.LoginEntity;

public class RegisterServiceImpl implements RegisterService{
	FacebookRegisterDAO dao=new FacebookRegisterDAOImpl() ;
	public String validateAndSave(FacebookRegisterDTO dto) {
		
		
			FacebookRegisterEntity entity=new FacebookRegisterEntity();
			if(!dto.getName().equals(null) && !dto.getName().equals("")) {
				if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
					if(!dto.getContact().equals(null) && !dto.getContact().equals("")) {
						if(!dto.getDob().equals(null) && !dto.getDob().equals("")) {
							if(!dto.getGender().equals(null) && !dto.getGender().equals("")) {
								if(!dto.getRelationship().equals(null) && !dto.getRelationship().equals("")) {
									if(!dto.getCity().equals(null) && !dto.getCity().equals("")) {
										if(!dto.getNationality().equals(null) && !dto.getNationality().equals("")) {
											if(!dto.getPassword().equals(null) && !dto.getPassword().equals("")) {
												entity.setName(dto.getName());
												entity.setEmail(dto.getEmail());
												entity.setContact(dto.getContact());
												entity.setDob(dto.getDob());
												entity.setGender(dto.getGender());
												entity.setRelationship(dto.getRelationship());
												entity.setCity(dto.getCity());
												entity.setNationality(dto.getNationality());
												entity.setPassword(dto.getPassword());
												
												String rows = dao.save(entity);
												if(!rows.equals(null)) {
													return "Data Saved";
												}else {
													return "Data not saved";
												}
											}else {
												return "Invalid password";
											}
										}else {
											return "Invalid city";
										}
									}else {
										return "Invalid city";
									}
								}else {
									return "Invalid status";
								}
							}else {
								return "Invalid gander";
							}
						}else {
							return "Invalid date of birth";
						}
					}else {
						return "Invalid contact number";
					}
				}else {
					return "Invalid email";
				}
			}else {
				return "Invalid full name";
			}
			
		
		
	}

	public String validateAndLogin(FacebookLoginDTO dto) {
		if(!Objects.isNull(dto)) {
			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
				LoginEntity entity=dao.getByEmail(dto.getEmail());
				if(dto.getPassword().equals(entity.getPassword())) {
					return "Login Sucessfull";
				}else {
					return "Enter valid Password";
				}
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Object is null";
		}
	}

	
	public String validateAndUpdate(FacebookLoginDTO loginDTO) {
		if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals("")) {
			LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
			if(entity!=null) {
		
					entity.setEmail(loginDTO.getEmail());
					entity.setPassword(loginDTO.getPassword());
					
					int isUpdate=dao.updatePassword(entity);
					if(isUpdate>0) {
						return "Password Updated";
						
					}else {
						return "Password not Updated";
					}
				
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Enter valid Email";
		}
	}

	
	public String validateAndDelete(String email) {

		if(!email.equals(null) && !email.equals("")) {
			LoginEntity entity=dao.getByEmail(email);
			if(entity!=null) {
					int isUpdate=dao.deleteData(email);
					if(isUpdate>0) {
						return "Data deleted";
						
					}else {
						return "Enter valid Email";
					}
				
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Enter valid Email";
		}
	}
}
