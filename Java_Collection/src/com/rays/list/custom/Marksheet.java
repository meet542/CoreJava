package com.rays.list.custom;

public class Marksheet {
	
	private String name;
	private int rollNo;
	private int phy;
	private int chem;
	private int math;
	
	public Marksheet(String name, int rollNo, int phy, int chem, int math) {
		this.name = name;
		this.rollNo = rollNo;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
	
	public String toString() {
		return "Name : " + name + ", Roll No. : " + rollNo + ", Physics Marks : " + phy + ", Chemistry Marks : " + chem + ", Maths Marks : " + math;
	}
}
