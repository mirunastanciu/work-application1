package com.app.test.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student , String> {

}
