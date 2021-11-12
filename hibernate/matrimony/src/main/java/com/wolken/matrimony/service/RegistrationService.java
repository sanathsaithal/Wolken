package com.wolken.matrimony.service;

import com.wolken.matrimony.dto.UserDTO;

public interface RegistrationService {

	String validateAndSave(UserDTO dto);

}
