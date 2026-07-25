package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(true);
		c.add("Apple");
		c.add(45.02);
		c.add('c');
		c.add(98);

		System.out.println("Size of c : " + c.size()); // .size() give size of c
		System.out.println(c);
		System.out.println(c.contains(98)); // .contains(element) check whether element is present or not.
		System.out.println(c.contains("Mango")); // false
		System.out.println(c.remove('c'));
		System.out.println("New size of c : " + c.size());
		c.clear(); // delete all element
		System.out.println("New size of c : " + c.size());

	}

}
