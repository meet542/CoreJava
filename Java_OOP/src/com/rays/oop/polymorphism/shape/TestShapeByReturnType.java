package com.rays.oop.polymorphism.shape;

public class TestShapeByReturnType {
	public static void main(String[] args) {

        Shapes[] s = new Shapes[3];

        s[0] = Shapes.getShape(1); // Rectangle
        s[1] = Shapes.getShape(2); // Circle
        s[2] = Shapes.getShape(3); // Triangle

        // Rectangle
        Rectangle r = (Rectangle) s[0];
        r.setLength(10);
        r.setBreadth(5);

        // Circle
        Circle c = (Circle) s[1];
        c.setRadius(7);

        // Triangle
        Triangle t = (Triangle) s[2];
        t.setBase(10);
        t.setHeight(8);

        calculateArea(s);
    }

    static void calculateArea(Shapes[] s) {

        for (Shapes s1 : s) {
            s1.area();
        }
    }
}
