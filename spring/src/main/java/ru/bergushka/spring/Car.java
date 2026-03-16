package ru.bergushka.spring;

public class Car {
	private String model;
	private String brand;
	private int year;
	private String color;
	
	public Car() {
		
	}
	
	public Car(String model, String brand, int year, String color) {
		this.setBrand(brand);
		this.setModel(model);
		this.setYear(year);
		this.setColor(color);
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
