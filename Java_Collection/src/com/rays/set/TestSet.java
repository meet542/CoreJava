package com.rays.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(45);
		s.add("Orange");
		s.add('a');
		s.add(4.9);
		s.add(true);

		System.out.println("Set :" + s);
		System.out.println("Size of Set : " + s.size());
		System.out.println("Mango is available. : " + s.contains("Mango"));
		System.out.println("Orange is available. : " + s.contains("Orange"));
		s.remove("Orange");

		System.out.println("---------------------");
		System.out.println("New Size of Set : " + s.size());
		System.out.println("Set is empty : " + s.isEmpty());
		System.out.println("---------------------");

		s.clear();
		System.out.println("New Size of Set After clear() method : " + s.size());
		System.out.println("Set is empty after clear method : " + s.isEmpty());
		System.out.println();
	}

}
