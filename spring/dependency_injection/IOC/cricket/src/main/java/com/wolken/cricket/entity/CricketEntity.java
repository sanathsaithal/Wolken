package com.wolken.cricket.entity;

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

public class CricketEntity {
	
	@Id
	private int id;
	private String teamName;
	private String teamCoach;
	private String teamSponcer;
	private int position;

}
