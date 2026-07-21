package com.rays.oop.abstraction.bank;

public class ICICIBank extends Bank {
	
	@Override
	public String getName() {
		return "ICICI Bank";
	}
	
	@Override
	public double interestRate() {
		return 9.8;
	}
}
