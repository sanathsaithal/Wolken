package com.wolken.hackerrank.dao;

import com.wolken.hackerrank.entity.HackerLoginEntity;
import com.wolken.hackerrank.entity.HackerrankUserEntity;

public interface RegistrationDAO {

	int save(HackerrankUserEntity entity);

	HackerLoginEntity getByEmail(String name);

	int forgotPassword(HackerLoginEntity entity);

}
