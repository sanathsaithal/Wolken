package com.wolken.hpSupport.dto;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

@Data

public class UserDTO {

	
	private int id;
	private String name;
	private String Email;
	private String Password;
	private String productId;
	private String complaint;
	private Date complaintRegDate;
}
