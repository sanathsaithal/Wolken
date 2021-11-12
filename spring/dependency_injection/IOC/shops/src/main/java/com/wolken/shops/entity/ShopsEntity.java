package com.wolken.shops.entity;

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
public class ShopsEntity {

	@Id
	private int id;
	private String name;
	private String type;
	private String location;
	private String owner;
	
}
