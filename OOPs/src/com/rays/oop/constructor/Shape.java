package com.rays.oop.constructor;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public Shape(){
		System.out.println("This is default constructor");
	}
	
	public Shape(String color) {
		this();
		this.color = color;
	}
	
	public Shape(String color, int borderWidth) {
		this(color);
		this.borderWidth = borderWidth;
	}
	
	public static void main(String[] args) {
		
		Shape s = new Shape("red",2);
		System.out.println("Shape color : " + s.color);
		System.out.println("Shape border width : " + s.borderWidth);
	}
}
