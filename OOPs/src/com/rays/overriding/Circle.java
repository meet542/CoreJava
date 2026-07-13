package com.rays.overriding;

public class Circle extends Shapes{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void area(){
		System.out.println("Area of circle : " + (Math.PI * radius * radius));
	}
}
