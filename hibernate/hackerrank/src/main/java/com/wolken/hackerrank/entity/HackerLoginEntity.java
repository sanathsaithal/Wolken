package com.wolken.hackerrank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="hackerrankuserentity")
@ToString
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries({
	@NamedQuery(name="getByEmail", query="from HackerLoginEntity where email= :email"),
	@NamedQuery(name="updatePassword",query="update HackerLoginEntity set password=:newPassword where email=: email")
})

public class HackerLoginEntity {
	
	@Id
	private String email;
	private String password;

}
