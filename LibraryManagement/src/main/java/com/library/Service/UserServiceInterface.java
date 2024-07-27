package com.library.Service;

import java.util.List;

import com.library.Entity.User;

public interface UserServiceInterface {

	public User addUser(User user);

	public List<User> viewAllUsers();

	public User viewUserById(Long user_id);

	public void deleteUserById(Long user_id);

	public User updateUser(Long user_id,User user);

//	public Books addBook(Books book);
//
//	public List<Books> viewAllBooks();

	

}
