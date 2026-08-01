package com.rays.collection.sort.comparable;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int id;
	private String company;
	private double salary;
	
	public Employee(String name, int id, String company, double salary) {
		this.name = name;
		this.company = company;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", id = " + id + ", company = " + company + ", salary = " + salary;
	}
	
	@Override
	public int compareTo(Employee o) {
//		return this.id - o.id;
		return o.name.compareTo(this.name);
	}

}
