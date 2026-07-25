package com.rays.oop.polymorphism.shape;

public class Shapes {
	
	public void area() {
		System.out.println("area of shape.");
	}
	
	public static Shapes getShape(int i) {

        if (i == 1) {
            return new Rectangle();
        }

        if (i == 2) {
            return new Circle();
        }

        if (i == 3) {
            return new Triangle();
        }

        return null;
    }

}
