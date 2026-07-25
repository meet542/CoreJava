package com.rays.oop.polymorphism.bank;

public class HdfcBank  extends Banks{
	
	@Override
	public String getName() {
		return "HDFC Bank";
	}
	
	@Override
	public double InterestRate() {
		return 10.10;
	}

}
