package com.wolken.facebookRegLogin.service;

import com.wolken.facebookRegLogin.dto.FacebookLoginDTO;
import com.wolken.facebookRegLogin.dto.FacebookRegisterDTO;

public interface RegisterService {

	String validateAndSave(FacebookRegisterDTO dto);

	String validateAndLogin(FacebookLoginDTO dto);

	

	String validateAndUpdate(FacebookLoginDTO dto);

	String validateAndDelete(String email);

}
