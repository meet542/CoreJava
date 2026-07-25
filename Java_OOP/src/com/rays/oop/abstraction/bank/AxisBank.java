package com.rays.oop.abstraction.bank;

public class AxisBank extends Bank{
	
	@Override
	public String getName() {
		return "Axis Bank";
	}
	
	@Override
	public double interestRate() {
		return 11.1;
	}

}
