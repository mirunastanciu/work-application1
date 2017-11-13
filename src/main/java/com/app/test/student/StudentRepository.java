package com.app.test.student;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student , String> {
	
	@Query(value="",nativeQuery=true)
	public ArrayList<StudentDetails> findAllStudentsDetails();

}
