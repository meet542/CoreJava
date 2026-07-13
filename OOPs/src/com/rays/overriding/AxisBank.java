package com.rays.overriding;

public class AxisBank extends Bank{
	
	private String name = "Axis Bank";
	
	public String getName() {
		return name;
	}
	
	public double interestRate() {
		return 11.1;
	}
}
