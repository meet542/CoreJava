package com.rays.oop.abstraction.shape;

public class Triangle extends Shapes {

	private double height;
	private double base;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void area() {
		System.out.println("Area of triangle : " + (0.5 * base * height));
	}

}
