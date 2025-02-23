package edu.ean.universidad;

import java.util.List;
import java.time.LocalDate;

class Professor extends Person {
	private String profession;
	private String nationality;
	private double salary;
	private Faculty faculty;
	private List<Course> courses;

	public Professor(String id, String name, LocalDate dateOfBirth, Place placeOfBirth, String profession, String nationality, double salary, Faculty faculty, List<Course> courses) {
		super(id, name, dateOfBirth, placeOfBirth);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
