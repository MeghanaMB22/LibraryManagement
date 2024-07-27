package com.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.Entity.Books;
import com.library.Entity.User;
import com.library.Service.UserServiceInterface;

@RestController

public class UserController {
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	
	//---------------Add Users--------------------------------------
	@PostMapping("/users/add")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User userSaved=null;
		try {
			 userSaved = userServiceInterface.addUser(user); //calling addEmployee method from service interface
			} 
		catch (Exception e) {
			e.getMessage();
		} 
		return new ResponseEntity<User>(userSaved, HttpStatus.CREATED);
		
	}
	
	//---------------------------Get users List from database----------------------------
	@GetMapping("/users")
	public ResponseEntity<List<User>> viewAllUsers(){
		List<User> allUsers = userServiceInterface.viewAllUsers(); 
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	}
	
	//----------------------------Get single user by ID------------------------------
	@GetMapping("/users/{user_id}")
	public ResponseEntity<User> viewUserById(@PathVariable("user_id")Long user_id){
		User UserById = userServiceInterface.viewUserById(user_id);
		return new ResponseEntity<User>(UserById, HttpStatus.OK);
	}
	
	//-----------------------------Delete User by Id--------------------------------
	@DeleteMapping("/users/delete/{user_id}")
	public ResponseEntity<Void> deleteUserById(@PathVariable("user_id")Long user_id){
		userServiceInterface.deleteUserById(user_id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	//---------------------------Update User------------------------------------------
	@PutMapping("/users/update/{user_id}")
	public ResponseEntity<User> updateUser(@PathVariable("user_id") Long user_id,@RequestBody User user){
		userServiceInterface.updateUser(user_id,user);
		return new ResponseEntity<User>(HttpStatus.ACCEPTED);
	}
	
	
//	//-----------------------Add Book------------------------------------
	@PostMapping("/books/add")
	public ResponseEntity<Books> addBook(@RequestBody Books book){
		Books bookSaved= userServiceInterface.addBook(book);
		return new ResponseEntity<Books>(bookSaved, HttpStatus.CREATED);		
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Books>> viewAllBooks(){
		List<Books> allBooks = userServiceInterface.viewAllBooks(); 
		return new ResponseEntity<List<Books>>(allBooks, HttpStatus.OK);
	}
	
	
}
