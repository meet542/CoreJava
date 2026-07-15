package com.rays.oop.inheritance;

public class Triangle extends Shapes{
	private double height;
	private double base;

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return this.base;
	}
	
	public double area() {
		return (0.5 * base * height);
	}

}
