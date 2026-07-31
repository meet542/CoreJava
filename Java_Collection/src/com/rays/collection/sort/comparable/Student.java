package com.rays.collection.sort.comparable;

public class Student implements Comparable<Student>{
	
	private String name;
	private int rollNo;
	private String subject;
	
	public Student(String name, int rollNo, String subject) {
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Name = " + name + ", Roll No. = " + rollNo + ", subject = " + subject;
	}

	@Override
	public int compareTo(Student o) {
//		return o.rollNo - this.rollNo;
		return this.name.compareTo(o.name);
	}
}
