package com.rays.oop.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Person person = new Person("Rahul", sdf.parse("30/03/2004"), "Indore");
		
		System.out.println("Person name : " + person.getName());
		System.out.println("Person address : " + person.getAddress());
		System.out.println("Person dob : " + sdf.format(person.getDob()));
	}

}
