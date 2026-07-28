package com.rays.list.custom;

public class Employee {

	private String name;
	private int id;
	private String company;
	private double salary;
	
	public Employee(String name, int id, String company, double salary) {
		this.name = name;
		this.id = id;
		this.company = company;
		this.salary = salary; 
	}
	
	public String toString() {
		return "Name : " + name + ", Id : " + id + ", Company : " + company + ", Salary : " + salary;
	}
	
}
