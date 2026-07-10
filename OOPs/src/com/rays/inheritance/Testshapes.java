package com.rays.inheritance;

public class Testshapes {

	public static void main(String[] args) {

		System.out.println("=============Circle=============");
		Circle c1 = new Circle();

		c1.setRadius(5);
		c1.setBorderWidth(1);
		c1.setColor("green");
		c1.setNumberOfVertices(0);

		System.out.println("Radius of circle : " + c1.getRadius());
		System.out.println("Width of border of circle : " + c1.getBorderWidth());
		System.out.println("Color of circle : " + c1.getColor());
		System.out.println("Number of vertices of circle : " + c1.getNumberOfVertices());
		System.out.println("Area of circle : " + c1.area());

		System.out.println();
		System.out.println("=============Rectangle=============");
		Rectangle r1 = new Rectangle();

		r1.setLength(4);
		r1.setBreadth(8);
		r1.setBorderWidth(1);
		r1.setColor("blue");
		r1.setNumberOfVertices(4);

		System.out.println("Length of rectangle : " + r1.getLength());
		System.out.println("Breadth of rectangle : " + r1.getBreadth());
		System.out.println("Width of border of rectangle : " + r1.getBorderWidth());
		System.out.println("Color of rectangle : " + r1.getColor());
		System.out.println("Number of vertices of rectangle : " + r1.getNumberOfVertices());

		System.out.println();
		System.out.println("=============Triangle=============");
		Triangle t1 = new Triangle();
		
		t1.setHeight(3);
		t1.setBase(4);		
		t1.setBorderWidth(1);
		t1.setColor("red");
		t1.setNumberOfVertices(3);
		
		System.out.println("Height of Triangle : " + t1.getHeight());
		System.out.println("Base of Triangle : " + t1.getBase());
		System.out.println("Width of border of Triangle : " + t1.getBorderWidth());
		System.out.println("Color of Triangle : " + t1.getColor());
		System.out.println("Number of vertices of Triangle : " + t1.getNumberOfVertices());
		System.out.println("Area of Triangle : " + t1.area());

	}

}
