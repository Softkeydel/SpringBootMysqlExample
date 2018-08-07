package com.example.mysql.SpringMysql;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class Pessoa {
	
	
	@Id
	private String id;
    private String name;
    private String email;
    
    
    public Pessoa() {
    	
    }
    
    public Pessoa( String name,String email) {
    	this.name=name;
    	this.email=email;
    }
    
    public Pessoa(String id, String name,String email) {
    	this.id=id;
    	this.name=name;
    	this.email=email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email +
                '}';
}

}
