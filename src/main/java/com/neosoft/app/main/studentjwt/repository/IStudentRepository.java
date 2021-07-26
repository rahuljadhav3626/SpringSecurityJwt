package com.neosoft.app.main.studentjwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.app.main.studentjwt.model.StudentDao;

@Repository
public interface IStudentRepository extends CrudRepository<StudentDao, Integer> {
	
	StudentDao findByUsername(String username);
	
}