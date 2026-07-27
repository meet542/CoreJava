package com.rays.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("orange");
		v.add("banana");
		v.add("mango");
		
		Enumeration e = v.elements();
		
		v.add("Apple"); // No Exception ----> Fail-Safe
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		
	}

}
