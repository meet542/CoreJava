package com.rays.stream;

public class ContestWinner {
	
	public String name;
	public String phoneNo;
	
	public ContestWinner(String n, String p) {
		this.name = n;
		this.phoneNo = p;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Phone No. = " + phoneNo + "]";
	}
	
	
}
