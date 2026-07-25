package com.rays.oop.abstraction.shape;

public class Circle extends Shapes {

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void area() {
		System.out.println("Area of circle : " + (Math.PI * radius * radius));
	}

}
