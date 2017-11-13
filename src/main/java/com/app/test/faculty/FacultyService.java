package com.app.test.faculty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {
	
	@Autowired
	FacultyRepository facultyRepository;
	
	public ArrayList<Faculty> getAllFaculty(){
		ArrayList<Faculty> l = new ArrayList<>();
		facultyRepository.findAll().forEach(l::add);
		return l;
	}
	
	public Faculty getFacultyById(int a) {
		ArrayList<Faculty> l = getAllFaculty();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getIdf() == a) {
				return l.get(i);
			}
		}
		return null;
	}

}
