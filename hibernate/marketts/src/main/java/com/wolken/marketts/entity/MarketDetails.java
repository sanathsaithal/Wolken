package com.wolken.marketts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marketDetails")
public class MarketDetails {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private int noOfShops;
	@Column
	private int area;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfShops() {
		return noOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "MarketDetails [id=" + id + ", name=" + name + ", location=" + location + ", noOfShops=" + noOfShops
				+ ", area=" + area + "]";
	}
	
}
