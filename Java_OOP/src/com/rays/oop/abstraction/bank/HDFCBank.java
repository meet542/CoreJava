package com.rays.oop.abstraction.bank;

public class HDFCBank extends Bank{
	
	@Override
	public String getName() {
		return "HDFC Bank";
	}

	@Override
	public double interestRate() {
		return 10.10;
	}
}
