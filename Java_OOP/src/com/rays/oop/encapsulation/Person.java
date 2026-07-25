package com.rays.oop.encapsulation;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Person {
	
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	private String name;
	private Date dob;
	private String address;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Date getDob() {
		return this.dob;
	}
	
	public int getAge() {
		return this.age;
	}
	

}
