package com.rays.oop.constructor;

public class Automobile {

	private String color;
	private int speed;
	private String company;
	
	public Automobile(String color, int speed, String company) {
		this.color = color;
		this.speed = speed;
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public String getCompany() {
		return company;
	}

}
