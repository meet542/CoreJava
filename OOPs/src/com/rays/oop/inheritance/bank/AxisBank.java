package com.rays.oop.inheritance.bank;

public class AxisBank extends Bank{
	protected float interestRate;
	protected String getName;
	
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public String getGetName() {
		return getName;
	}
	public void setGetName(String getName) {
		this.getName = getName;
	}
}
