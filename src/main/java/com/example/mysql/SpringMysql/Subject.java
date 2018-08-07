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


@Entity
@Table(name = "subjects")
public class Subject {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stream_id")
	private Stream streams;
	
  
    public Subject() {
    	
    }
    
    public Subject(String name) {
    	this.name=name;
    }
    
    public Subject(String name,Stream streams) {
    	this.name=name;
    	this.streams=streams;
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


	@Override
	public String toString() {
		return "Subjects [id=" + id + ", name=" + name + ", streams=" + streams + "]";
	}

    

}
