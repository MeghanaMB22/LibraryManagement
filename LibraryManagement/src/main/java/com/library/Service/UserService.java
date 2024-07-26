package com.library.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Dao.BookCrudRepo;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.library.Dao.UserCrudRepo;
import com.library.Entity.Books;
import com.library.Entity.User;
@Service
public class UserService implements UserServiceInterface{
	@Autowired
	private UserCrudRepo crudRepo;
	@Autowired
	private BookCrudRepo crudBooks;

	@Override
	public User addUser(User user) {
		User savedUser=crudRepo.save(user);
		return savedUser;
	}

	public List<User> viewAllUsers() {
		return crudRepo.findAll();
	}

	@Override
	public User viewUserById(Long user_id) {
		return crudRepo.findById(user_id).get();
	}

	@Override
	public void deleteUserById(Long user_id) {
		crudRepo.deleteById(user_id);
		
	}

	@Override
	public User updateUser(Long user_id,User user) {
    User UserDB = crudRepo.findById(user_id).get();
		
		if(Objects.nonNull(user.getUser_fname())&&
				!"".equalsIgnoreCase(user.getUser_fname())) {
			UserDB.setUser_fname(user.getUser_fname());
		}
		if(Objects.nonNull(user.getUser_lname())&&
				!"".equalsIgnoreCase(user.getUser_lname())) {
			UserDB.setUser_lname(user.getUser_lname());
		}
		if(Objects.nonNull(user.getUser_Role())&&
				!"".equalsIgnoreCase(user.getUser_Role())) {
			UserDB.setUser_Role(user.getUser_Role());
		}
		if(Objects.nonNull(user.getUser_email())&&
				!"".equalsIgnoreCase(user.getUser_email())) {
			UserDB.setUser_email(user.getUser_email());
		}
		if(Objects.nonNull(user.getUpdated_by())&&
				!"".equalsIgnoreCase(user.getUpdated_by())) {
			UserDB.setUpdated_by(user.getUpdated_by());
		}
		System.out.println(UserDB);
		return crudRepo.save(UserDB);
	}

	@Override
	public Books addBook(Books book) {
		Books savedBook=crudBooks.save(book);
		return savedBook;
	}

	@Override
	public List<Books> viewAllBooks() {
		
		return crudBooks.findAll();
	}
	
	
}
