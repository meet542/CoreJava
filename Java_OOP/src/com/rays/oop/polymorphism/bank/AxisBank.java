package com.rays.oop.polymorphism.bank;

public class AxisBank extends Banks{
	
	@Override
	public String getName() {
		return "Axis Bank";
	}
	
	@Override
	public double InterestRate() {
		return 11.25;
	}

}
