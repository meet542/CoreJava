package com.rays.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		list.add("Apple");
		list.add("Watermelon");

		System.out.println("list: " + list);

		System.out.println("---------------");

		Iterator it = list.iterator();
		
//		list.add("Mango"); // ConcurrentModificationException --> Fail-Fast

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			if(o.equals("Orange")) {
				it.remove();
			}
		}

		System.out.println("---------------");

		System.out.println("list: " + list);

	}

}
