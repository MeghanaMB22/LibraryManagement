package com.library.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.Entity.User;

@Repository
public interface UserCrudRepo extends JpaRepository<User, Long> {

}
