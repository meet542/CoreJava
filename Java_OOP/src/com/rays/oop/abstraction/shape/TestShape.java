package com.rays.oop.abstraction.shape;

public class TestShape {

	public static void main(String[] args) {

		Shapes s1 = new Circle();

		Circle c = (Circle) s1;

		c.setRadius(5);
		
		s1.area(); // ye area call to circle se hi hoga
		// or c.area();

		Shapes s2 = new Rectangle();

		Rectangle r = (Rectangle) s2;

		r.setBreadth(9);
		r.setLength(7);

		s2.area(); // or r.area()

		Shapes s3 = new Triangle();

		Triangle t = (Triangle) s3;
		
		t.setBase(4);
		t.setHeight(6);
		
		t.area(); // or s3.area()
	}

}
