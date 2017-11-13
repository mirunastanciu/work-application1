package com.app.test.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.test.faculty.Faculty;
import com.app.test.faculty.FacultyService;
import com.app.test.profile.ProfileService;

@RestController
public class StudentsController {
	
	@Autowired
	StudentService studentService ;
	
	@Autowired
	FacultyService facultyService ;
	
	@Autowired
	ProfileService profilService;
	
	@RequestMapping(path="/allStudents" , method=RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	/*
	@RequestMapping(value="/details/{id}", method=RequestMethod.GET)
	public String getDetailsFacultyName(int id) {
		
		List<Faculty> f = facultyService.getAllFaculty();
		String rs;
		
			for(int j=0;i<f.size();i++) {
				if( == f.get(j).getIdf()) {
					rs=f.get(j).getFname();
				}
			}
			
		}
		
	}*/
	
	
	@RequestMapping(value="/getStudentDetails" , method=RequestMethod.GET)
	public StudentDetails getStudentDetails() {
		Student s = studentService.getStudentById(1);
		
		StudentDetails sd = new StudentDetails();
		sd.setId(s.getIdstudent());
		sd.setFaculty(facultyService.getFacultyById(s.getFaculty()).getFname());
		sd.setName(s.getName());
		sd.setProfil(profilService.getProfileById(s.getProfil()).getName());
		
		return sd;
		
		
	}
}
