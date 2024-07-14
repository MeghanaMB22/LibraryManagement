package com.library.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Dao.UserCrudRepo;
import com.library.Entity.User;
@Service
public class UserService implements UserServiceInterface{
	@Autowired
	private UserCrudRepo crudRepo;

	@Override
	public User addUser(User user) {
		User savedUser=crudRepo.save(user);
		return savedUser;
	}
}
