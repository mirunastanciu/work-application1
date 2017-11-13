package com.app.test.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="idSTUDENT")
	private int idstudent;
	
	@Column(name="STUDENTNAME")
	private String name;
	
	@Column(name="STUDENTFACULTY")
	private int faculty;
	
	@Column(name="YEAR")
	private int year;
	
	@Column(name="STUDENTPROFIL")
	private int profil;
	
	
	public int getIdstudent() {
		return idstudent;
	}
	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFaculty() {
		return faculty;
	}
	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getProfil() {
		return profil;
	}
	public void setProfil(int profil) {
		this.profil = profil;
	}
	
	
	
	

}
