package com.wolken.solarSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solarsystem")
public class SolarSystem {

	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int planetNo;
	@Column
	private int size;
	@Column
	private String material;
	@Column
	private int daysForRevolution;
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
	public int getPlanetNo() {
		return planetNo;
	}
	public void setPlanetNo(int planetNo) {
		this.planetNo = planetNo;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getDaysForRevolution() {
		return daysForRevolution;
	}
	public void setDaysForRevolution(int daysForRevolution) {
		this.daysForRevolution = daysForRevolution;
	}
	@Override
	public String toString() {
		return "SolarSystem [id=" + id + ", name=" + name + ", planetNo=" + planetNo + ", size=" + size + ", material="
				+ material + ", daysForRevolution=" + daysForRevolution + "]";
	}
	
}
