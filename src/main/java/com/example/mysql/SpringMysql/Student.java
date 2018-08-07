package com.example.mysql.SpringMysql;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "students")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    
    
	@ManyToOne
    @JoinColumn(name = "stream_id")
	//@JsonBackReference
	private Stream streams;
	
  
    public Student() {
    	
    }
    
    public Student( String name) {
    	this.name=name;
    }
    
    public Student(String name,Stream streams) {
    	this.name=name;
    	this.streams=streams;
    }

    
  
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
    
    

	public Stream getStreams() {
		return streams;
	}

	public void setStreams(Stream streams) {
		this.streams = streams;
	}

//	@Override
//	public String toString() {
//		return "Students [id=" + id + ", name=" + name + ", streams=" + streams + "]";
//	}




    

}
