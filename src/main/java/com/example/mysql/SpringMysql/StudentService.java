package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService { 
	
	@Autowired
	private StudentRepository repo;
	
	public List<Student> getAllstudents(){
		return repo.findAll();
	}

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
		//return null;
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
