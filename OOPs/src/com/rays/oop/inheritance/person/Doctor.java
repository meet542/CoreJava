package com.rays.oop.inheritance.person;

public class Doctor extends Person{

	private String registrationNo;
	private String hospital;

	public void setRegisterationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}
