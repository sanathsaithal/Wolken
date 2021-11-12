package com.wolken.hpSupport.entity;

import java.util.Date;

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

public class UserEntity {
	
	@Id
	private int id;
	private String name;
	private String Email;
	private String Password;
	private String productId;
	private String complaint;
	private Date complaintRegDate;
}
