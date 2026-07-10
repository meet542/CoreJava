package in.co.rays.dates;

import java.time.LocalDate;

public class TestDateLocal {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		System.out.println("-----------------");
		
		LocalDate dob = LocalDate.of(2005, 12, 21);
		
		System.out.println(dob.getDayOfWeek());
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getDayOfYear());
		System.out.println(dob.getMonth());
		System.out.println(dob.getYear());
		
		//age calculation
		
		System.out.println(date.getYear() - dob. getYear ()) ;
	}

}
