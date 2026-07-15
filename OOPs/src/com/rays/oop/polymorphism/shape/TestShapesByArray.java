package com.rays.oop.polymorphism.shape;

public class TestShapesByArray {

	public static void main(String[] args) {

		Shapes[] s = new Shapes[3];

		s[0] = new Circle();

		Circle c = (Circle) s[0];
		c.setRadius(3);

		s[1] = new Rectangle();

		Rectangle r = (Rectangle) s[1];

		r.setBreadth(6);
		r.setLength(9);

		s[2] = new Triangle();

		Triangle t = (Triangle) s[2];

		t.setBase(5);
		t.setHeight(2);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}

}
