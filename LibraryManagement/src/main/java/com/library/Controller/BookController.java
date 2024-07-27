package com.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.Entity.Books;
import com.library.Service.BookServiceInterface;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Autowired
	private BookServiceInterface bookServiceInterface;
	
	@PostMapping("/books/add")
	public ResponseEntity<Books> addBook(@RequestBody Books book){
		System.out.println("Inside Add Books");
		Books bookSaved= bookServiceInterface.addBook(book);
		return new ResponseEntity<Books>(bookSaved, HttpStatus.CREATED);		
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Books>> viewAllBooks(){
		System.out.println("Inside View All Books");
		List<Books> allBooks = bookServiceInterface.viewAllBooks(); 
		return new ResponseEntity<List<Books>>(allBooks, HttpStatus.OK);
	}

	
	@RequestMapping("/helloworld")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  
}
