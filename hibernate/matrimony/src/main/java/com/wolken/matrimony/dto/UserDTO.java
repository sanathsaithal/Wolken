package com.wolken.matrimony.dto;



import java.util.Date;


import lombok.Data;

@Data
public class UserDTO {

	private int id;
	private String name;
	private String email;
	private String gender;
	private String fatherName;
	private String motherName;
	private Date dob;
	private long contact;
	private int height;
}
