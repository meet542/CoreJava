package com.rays.dates;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws InterruptedException {
//		Date date = new Date();
//		System.out.println("Date : " + date);
//		System.out.println("Long time : " + date.getTime());
		
		// to print time after every 1 sec 
		
		
		while(true) {
			Date d  = new Date();
			System.out.println(d);
			Thread.sleep(1000); // this provide delay of 1 sec (here input is given in milisec)
		}
	}

}
