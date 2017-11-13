package com.app.test.faculty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class Faculty {
	
	@Id
	@Column(name="idFaculty")
	private int idf;
	
	@Column(name="FacultyName")
	private String fname;

	public int getIdf() {
		return idf;
	}

	public void setIdf(int idf) {
		this.idf = idf;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	

}
