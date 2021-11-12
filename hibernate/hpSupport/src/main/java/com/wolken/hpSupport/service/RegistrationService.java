package com.wolken.hpSupport.service;

import com.wolken.hpSupport.dto.UserDTO;

public interface RegistrationService {

	String validateAndSave(UserDTO dto);

}
