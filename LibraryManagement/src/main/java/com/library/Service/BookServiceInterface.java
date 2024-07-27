package com.library.Service;

import java.util.List;

import com.library.Entity.Books;

public interface BookServiceInterface {
	public Books addBook(Books book);

	public List<Books> viewAllBooks();
}
