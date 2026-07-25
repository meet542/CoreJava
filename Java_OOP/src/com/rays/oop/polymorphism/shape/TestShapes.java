package com.rays.oop.polymorphism.shape;

public class TestShapes {
	
	public static void main(String[] args) {
		
		Shapes s1 = new Circle();
		
		Circle c = (Circle)s1;
		
		c.setRadius(4);
		c.area();
		
		Shapes s2 = new Rectangle();
		
		Rectangle r = (Rectangle) s2;
		
		r.setBreadth(5);
		r.setLength(6);
		r.area();
		
		Shapes s3 = new Triangle();
		
		Triangle t = (Triangle) s3; 
		
		t.setBase(4);
		t.setHeight(3);
		t.area();
		
	}
	
}
