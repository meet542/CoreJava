package com.rays.overriding;

public class TestShapes1 {
	
	public static void main(String[] args) {
		Shapes s1 = new Circle();
		
		// type cast s1(parent obj) into c(child obj)
		Circle c = (Circle) s1;
		
		c.setColor("Blue");
		c.setBorderWidth(2);
		c.setRadius(5);

		c.area();
		
		Shapes s2 = new Rectangle();

		Rectangle r = (Rectangle) s2;

		r.setColor("red");
		r.setBorderWidth(2);
		r.setLength(1);
		r.setBreadth(3);

		r.area();
		
		Shapes s3 = new Triangle();
		
		Triangle t = (Triangle) s3;
		
		t.setColor("green");
		t.setBorderWidth(3);
		t.setBase(8);
		t.setHeight(5);
		
		t.area();
		
	}
}
