package com.wolken.butterfly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="butterflyDetails")

public class ButterflyDetails {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="color")
	private String color;
	@Column(name="size")
	private int size;
	@Column(name="speciesName")
	private String speciesName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	@Override
	public String toString() {
		return "ButterflyDetails [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size
				+ ", speciesName=" + speciesName + "]";
	}
	
	
}
