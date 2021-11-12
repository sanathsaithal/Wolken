package com.wolken.facebookRegLogin.dao;

import com.wolken.facebookRegLogin.entity.FacebookRegisterEntity;
import com.wolken.facebookRegLogin.entity.LoginEntity;

public interface FacebookRegisterDAO {

	String save(FacebookRegisterEntity entity);

	LoginEntity getByEmail(String email);

	int updatePassword(LoginEntity entity);

	int deleteData(String email);

	

}
