package com.wolken.hackerrank.service;

import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {

	String validateAndSave(UserDTO dto);

	String validateAndLogin(LoginDTO ldto);

	String validateAndUpdatePassword(String email);
	
}
