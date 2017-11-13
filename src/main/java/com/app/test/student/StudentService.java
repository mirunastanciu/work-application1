package com.app.test.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.test.profile.Profile;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public ArrayList<Student> getAllStudents(){
		ArrayList<Student> l = new ArrayList<>();
		studentRepository.findAll().forEach(l::add);
	    return l;
	}
	
	
	public Student getStudentById(int a) {
		ArrayList<Student> l = getAllStudents();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getIdstudent() == a) {
				return l.get(i);
			}
		}
		return null;
	}
}
