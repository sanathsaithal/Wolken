package com.wolken.facebookRegLogin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class FacebookRegisterEntity {
	
	
	
	private String name;
	@Id
	private String email;
	private String contact;
	private String dob;
	private String gender;
	private String relationship;
	
	private String city;
	private String nationality;
	private String password;
	
}
