package com.rays.oop.inheritance.person;

public class Businessman extends Person{

	private double income;
	private String company;

	public void setIncome(double income) {
		this.income = income;
	}
	
	public double getIncome() {
		return this.income;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return this.company;
	}
		
}