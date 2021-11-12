package com.wolken.pg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PGEntity {
	
	@Id
	private int id;
	private String name;
	private String location;
	private String owner;
	private long contact;

}
