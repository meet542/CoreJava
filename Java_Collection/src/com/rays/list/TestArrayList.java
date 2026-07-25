package com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(0,"Ram");
		list.add(1, 2);
		list.add(2, true);
		list.add(3, 'g');
		list.add(4, 4.7);
		list.add(5, "Lakhan");
		list.add(5, 's');
		list.add(4, true);
		
		System.out.println("list : " + list);
		System.out.println(list.get(6));
		System.out.println("--------------------");
		
		System.out.println(list.remove(7));
		System.out.println("list : " + list);
		System.out.println("--------------------");
		
		System.out.println(list.set(1, 2.1));
		System.out.println(list);
		System.out.println("--------------------");
		
		System.out.println(list.indexOf('g'));
		System.out.println(list.lastIndexOf(true));
		
		System.out.println(list.subList(3, 5));
		
	}
	
}
