package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService user;
	
	@RequestMapping("/user")
	public String sayHi() {
		return "Hi";
	}
	
    //@RequestMapping(value = "/allUsers", method = RequestMethod.POST)
	@RequestMapping("/allUsers")
	public List<User> getAllUsers() {
		return user.getAllUsers();
	}

}
