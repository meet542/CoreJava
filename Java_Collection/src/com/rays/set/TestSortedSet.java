package com.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

//SortedSet is order set in asc
//does not contain null value
//It is sorted in ASC order, null element can not be sorted its throw NullPointerException
//does not contain duplicate value

public class TestSortedSet {

		public static void main(String[] args) {

			SortedSet<Character> s = new TreeSet<Character>();

			s.add('c');
			s.add('b');
			s.add('a');
			s.add('d');
			s.add('b');
			s.add('a');

			for(Object object : s) {
				System.out.print(object);
			}
			System.out.println();
			System.out.println("---------------");
			
			//get first element
			System.out.println("First element : " + s.first());
			
			//get last element
			System.out.println("Last element : " + s.last());
			
			//set head value
			System.out.println(s.headSet('x'));
			
			//set tail value
			System.out.println(s.tailSet('z'));
			
			System.out.println(s);
			

		}

}
