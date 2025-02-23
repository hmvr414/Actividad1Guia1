package edu.ean.universidad;

import java.time.LocalDate;
import java.util.List;

class Student extends Person {
	private String highschool;
	private LocalDate enrollmentDate;
	private List<Course> courses;

	public Student(String id, String name, LocalDate birthdate, Place birthplace, String highschool, LocalDate enrollmentDate, List<Course> courses) {
		super(id, name, birthdate, birthplace);
		this.highschool = highschool;
		this.enrollmentDate = enrollmentDate;
		this.courses = courses;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
