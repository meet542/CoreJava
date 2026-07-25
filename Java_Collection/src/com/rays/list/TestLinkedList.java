package com.rays.list;

import java.util.LinkedList;
import java.util.List;


public class TestLinkedList {
	
	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		list.add(0, "kiwi");
        list.add(1 , "Orange");
        list.add(2 , "Apple");
        list.add(3 , "Cherry");
        list.add(4 , "Mango");
        list.add(5 , "Strawberry");
        list.add(6 , "Banana");

        System.out.println(list);
        list.add(7 , "Guava");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.add(2, "pineapple");
        System.out.println(list);
		
	}

}
