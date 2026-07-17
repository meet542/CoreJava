package com.rays.oop.polymorphism.bank;

public class IciciBank extends Banks{
	
	@Override
	public String getName() {
		return "ICICI Bank";
	}
	
	
	@Override
	public double InterestRate() {
		return 9.75;
	}

}
