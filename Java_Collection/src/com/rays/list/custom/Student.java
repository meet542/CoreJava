package com.rays.list.custom;

public class Student {
	
	private String name;
	private int rollNo;
	private String subject;

	public Student(String name, int rollNo, String subject) {
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}
	
	@Override // this method is present in object class and overriden here
	public String toString() {
		return "Name : " + name + ", Roll No. : " + rollNo + ", Subject : " + subject;
	}
}
