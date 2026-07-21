package com.rays.oop.abstraction.shape;

public class Rectangle extends Shapes{

	private double length;
	private double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public void area() {
		System.out.println("Area of rectangle : " + (length * breadth));
		
	}

}
