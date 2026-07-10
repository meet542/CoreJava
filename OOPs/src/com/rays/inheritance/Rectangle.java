package com.rays.inheritance;

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

	public double area() {
		return length * breadth;
	}

}
