package com.rays.oop.constructor;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile("Red", 100, "Kia");
		
		System.out.println("Color of automobile : " + a.getColor());
		System.out.println("Speed of automobile : " + a.getSpeed());
		System.out.println("Company of automobile : " + a.getCompany());
	}
}
