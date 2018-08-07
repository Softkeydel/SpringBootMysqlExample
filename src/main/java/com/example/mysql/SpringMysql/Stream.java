package com.example.mysql.SpringMysql;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "streams")
public class Stream {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    
    @OneToMany(mappedBy = "streams",fetch = FetchType.EAGER)
    private Set<Subject> subjects;
    
   
    @OneToMany(mappedBy = "streams",fetch = FetchType.EAGER)
    private Set<Student> students;
    
   
    
    public Stream() {
    	
    }
    
   
    public Stream(String name) {
    	this.name=name;
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
    
    public Set<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}


//	@Override
//	public String toString() {
//		return "Stream [id=" + id + ", name=" + name + ", subjects=" + subjects + ", students=" + students + "]";
//	}




   

}
