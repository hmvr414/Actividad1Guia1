package edu.ean.tienda;

import java.time.LocalDate;

class Product {
	private int code;
	private String name;
	private String manufacturer;
	private int stock;
	private double unitPrice;
	private LocalDate expirationDate;
	private ProductType type;
	
	public Product(int code, String name, ProductType type, LocalDate expirationDate, String manufacturer, int stock, double unitPrice) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.expirationDate = expirationDate;
		this.manufacturer = manufacturer;
		this.stock = stock;
		this.unitPrice = unitPrice;
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

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int quantityInStock) {
		this.stock = quantityInStock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
