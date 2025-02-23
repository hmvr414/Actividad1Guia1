package edu.ean.universidad;

import java.util.List;

class DegreeProgram {
	private String name;
	private int totalCredits;
	private int semesters;
	private AcademicLevel level;
	private Faculty faculty;
	private List<Course> courses;

	public DegreeProgram(String name, int totalCredits, int semesters, AcademicLevel level, Faculty faculty, List<Course> courses) {
		this.name = name;
		this.totalCredits = totalCredits;
		this.semesters = semesters;
		this.level = level;
		this.faculty = faculty;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public int getSemesters() {
		return semesters;
	}

	public void setSemesters(int semesters) {
		this.semesters = semesters;
	}

	public AcademicLevel getLevel() {
		return level;
	}

	public void setLevel(AcademicLevel level) {
		this.level = level;
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
