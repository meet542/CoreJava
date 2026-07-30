package com.rays.list.custom;

import java.util.ArrayList;
import java.util.List;

public class TestMarksheetForEachMethod {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		Marksheet m1 = new Marksheet("Meet", 104, 88, 80, 90);
		Marksheet m2 = new Marksheet("Shyam", 101, 60, 80, 80);
		Marksheet m3 = new Marksheet("Geeta", 103, 80, 40, 80);
		Marksheet m4 = new Marksheet("Ishu", 105, 80, 30, 80);
		Marksheet m5 = new Marksheet("Raju", 102, 80, 50, 80);

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		list.forEach(System.out::println);
		
		
	}

}
