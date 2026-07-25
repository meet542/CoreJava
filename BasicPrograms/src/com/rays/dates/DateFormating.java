package com.rays.dates;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormating {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

		String formatedDate1 = sdf1.format(d);// here format method is used form SimpleDateFormate class by making sdf
												// object and stored in formatedDate variable
		String formatedDate2 = sdf2.format(d);

		System.out.println("Default formate date: " + formatedDate1);
		System.out.println("Default formate date: " + formatedDate2);

		System.out.println("-------------------------------------------------");

		// we can also take date input as a string and then convert it into date

		String dob = "2026-04-07";
		
		Date dateOfBirth = sdf1.parse(dob);
		
		System.out.println("Your Entered dated of birth: " + dateOfBirth);

		

	}

}
