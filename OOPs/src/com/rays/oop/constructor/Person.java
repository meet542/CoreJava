package com.rays.oop.constructor;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;

	public Person(String name, Date dob, String address) {
		this.address = address;
		this.dob = dob;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

}
