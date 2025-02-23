package edu.ean.universidad;

import java.util.List;

class University {
	private String name;
	private String rectorName;
	private String city;
	private List<Faculty> faculties;

	public University(String name, String rectorName, String city, List<Faculty> faculties) {
		this.name = name;
		this.rectorName = rectorName;
		this.city = city;
		this.faculties = faculties;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRectorName() {
		return rectorName;
	}

	public void setRectorName(String rectorName) {
		this.rectorName = rectorName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}

}
