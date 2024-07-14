package com.library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.library.Entity.User;
import com.library.Service.UserServiceInterface;

@RestController
@RequestMapping("/home")
public class UserController {
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User userSaved = userServiceInterface.addUser(user); //calling addEmployee method from service interface
		return new ResponseEntity<User>(userSaved, HttpStatus.CREATED);
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
