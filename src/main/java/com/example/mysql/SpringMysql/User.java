package com.example.mysql.SpringMysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user1")
public class User {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String dob;
	
	public User() {
		
	}
	
	public User(String id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public User(String id,String name,String email,String dob) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.dob=dob;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob=dob;
	}
	


	

}
