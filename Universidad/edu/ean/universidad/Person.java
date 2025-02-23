package edu.ean.universidad;

import java.time.LocalDate;

class Person {
	private String id;
	private String name;
	private LocalDate birthdate;
	private Place birthplace;

	public Person(String id, String name, LocalDate birthdate, Place birthplace) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.birthplace = birthplace;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBithdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Place getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(Place birthplace) {
		this.birthplace = birthplace;
	}
}
