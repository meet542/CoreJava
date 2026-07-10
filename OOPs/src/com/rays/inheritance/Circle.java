package com.rays.inheritance;

public class Circle extends Shapes{
	
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return (Math.PI * radius * radius);
	}

}
