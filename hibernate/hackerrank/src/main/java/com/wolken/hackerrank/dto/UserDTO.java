package com.wolken.hackerrank.dto;

import lombok.Data;

@Data
public class UserDTO {
	private int id;
	private String name;
	private String email;
	private String password;
	private String conPassword;
	private long contact;
}
