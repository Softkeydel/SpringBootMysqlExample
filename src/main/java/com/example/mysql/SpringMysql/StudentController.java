package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	
	 @Autowired
	    private StudentService studentService;

	    @RequestMapping("student")
	    @ResponseBody
	    public String home() {
	        return "Hello World!";
	    }

	  
	    @RequestMapping(value="/student/add", method= RequestMethod.POST)	
	    public @ResponseBody Student addstudent(@RequestBody Student student) {
	        return studentService.addStudent(student);
	    }

//	    @RequestMapping("/pessoa/findById/{pessoaId}")
//	    public @ResponseBody Pessoa findPersonById(@PathVariable("pessoaId") String pessoaId) {
//	        return pessoaService.findById(pessoaId);
//	    }
//
	    @RequestMapping("/student/all")
	    public @ResponseBody List findAll() {
//	    	List<Student> students=studentService.findAll();
//	    	
//	    	System.out.println(":"+students.get(0).get);
	    	
	    	
	        return studentService.findAll();
	    }
	
	

}
