package com.rays.overriding;

public class TestShapes {
	public static void main(String[] args) {
		Circle c = new Circle();

		System.out.println("========Circle============");
		c.setColor("red");
		c.setRadius(9);
		c.setBorderWidth(2);
		
		c.area();
		System.out.println();
		
		System.out.println("=========Triangle=========");
		
		Triangle t = new Triangle();
		t.setColor("blue");
		t.setBorderWidth(4);
		t.setBase(6);
		t.setHeight(4);
		
		t.area();
		System.out.println();
		
		System.out.println("=======Rectangle===========");
		
		Rectangle r= new Rectangle();
		
		r.setColor("green");
		r.setBorderWidth(1);
		r.setLength(5);
		r.setBreadth(7);
		
		r.area();
	}
}
