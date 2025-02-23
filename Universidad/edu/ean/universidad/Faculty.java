package edu.ean.universidad;

import java.util.List;

class Faculty {
	private String name;
	private int code;
	private List<Professor> professors;
	private List<DegreeProgram> degreePrograms;

	public Faculty(String name, int code, List<Professor> professors, List<DegreeProgram> degreePrograms) {
		this.name = name;
		this.code = code;
		this.professors = professors;
		this.degreePrograms = degreePrograms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public List<DegreeProgram> getDegreePrograms() {
		return degreePrograms;
	}

	public void setDegreePrograms(List<DegreeProgram> degreePrograms) {
		this.degreePrograms = degreePrograms;
	}

}
