package com.wolken.bus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BusEntity {

	@Id
	private int id;
	private String name;
	private int capacity;
	private String model;
	private long contact;
	
}
