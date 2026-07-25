package com.rays.oop.polymorphism.shape;

public class TestShapesByMethodArgument {
	public static void main(String[] args) {
		Shapes[] s = new Shapes[3];
		
		s[0] = new Circle();
		
		Circle c = (Circle) s[0];
		
		c.setRadius(9);
		
		s[1] = new Rectangle();
		
		Rectangle r = (Rectangle) s[1];
		
		r.setBreadth(3);
		r.setLength(5);
		
		s[2] = new Triangle();
		
		Triangle t = (Triangle) s[2];
		
		t.setBase(3);
		t.setHeight(1);
		
		printArea(s);
	}
	
	static void printArea(Shapes[] s) {
		for(int i=0;i<s.length;i++) {
			s[i].area();
		}
	}
}
