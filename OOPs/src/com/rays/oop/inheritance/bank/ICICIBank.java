package com.rays.oop.inheritance.bank;

public class ICICIBank extends Bank{
	protected float interestRate;
	protected String name;
	
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String getName) {
		this.name = getName;
	}
}
