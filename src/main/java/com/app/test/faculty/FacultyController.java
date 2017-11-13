package com.app.test.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {
	
	@Autowired
	FacultyService facultyService;
	
	

}
