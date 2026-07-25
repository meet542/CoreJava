package com.rays.oop.abstraction.bank;

public abstract class Bank {
	
	public String getName() {
		return "RBI bank";
	}

	public abstract double interestRate();
}
