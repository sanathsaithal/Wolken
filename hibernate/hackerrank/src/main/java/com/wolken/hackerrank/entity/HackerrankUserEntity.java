package com.wolken.hackerrank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;

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

public class HackerrankUserEntity {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private long contact;
}


