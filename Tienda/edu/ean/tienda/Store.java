package edu.ean.tienda;

import java.util.List;

class Store {
	private String name;
	private String address;
	private String phoneNumber;
	private List<Product> products;
	public Store(String name, String address, String phoneNumber, List<Product> products) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
