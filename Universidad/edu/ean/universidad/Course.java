package edu.ean.universidad;

import java.util.List;

class Course {
	private int code;
	private String name;
	private int credits;
	private int classroom;
	private String buildingName;
	private DegreeProgram degreeProgram;
	private List<Professor> professors;
	private List<Student> students;

	public Course(int code, String name, int credits, int classroom, String buildingName, DegreeProgram degreeProgram, List<Professor> professors, List<Student> students) {
		this.code = code;
		this.name = name;
		this.credits = credits;
		this.classroom = classroom;
		this.buildingName = buildingName;
		this.degreeProgram = degreeProgram;
		this.professors = professors;
		this.students = students;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public DegreeProgram getDegreeProgram() {
		return degreeProgram;
	}

	public void setDegreeProgram(DegreeProgram degreeProgram) {
		this.degreeProgram = degreeProgram;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
