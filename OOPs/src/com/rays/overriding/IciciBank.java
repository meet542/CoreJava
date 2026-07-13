package com.rays.overriding;

public class IciciBank extends Bank{
	
	private String name = "ICICI Bank";

	public String getName() {
		return name;
	}

	public double interestRate() {
		return 9.8;
	}

}
