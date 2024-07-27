package com.library.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Dao.BookCrudRepo;
import com.library.Entity.Books;
@Service
public class BookService implements BookServiceInterface {
	@Autowired
	private BookCrudRepo crudBooks;

	@Override
	public Books addBook(Books book) {
		Books savedBook = crudBooks.save(book);
		return savedBook;
	}

	@Override
	public List<Books> viewAllBooks() {

		return crudBooks.findAll();
	}

}	
