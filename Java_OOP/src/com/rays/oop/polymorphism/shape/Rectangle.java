package com.rays.oop.polymorphism.shape;

public class Rectangle extends Shapes{
	
	private double length;
	private double breadth;
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
	
	@Override
	public void area() {
		System.out.println("area of rectangle : " + (length * breadth));
	}

}
