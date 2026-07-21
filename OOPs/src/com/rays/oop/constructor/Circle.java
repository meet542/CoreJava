package com.rays.oop.constructor;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {
		System.out.println("This is defaut constructor of circle.");
	}
	
	public Circle(String color) {
		super(color);
	}
	
	
	public Circle(String color, int borderWidth, double radius) {
		super(color,borderWidth);
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
	}
	
}
