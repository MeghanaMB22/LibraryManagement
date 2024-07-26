package com.library.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.Entity.Books;

@Repository
public interface BookCrudRepo extends JpaRepository<Books , Long>  {

}
