package com.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

//SortedSet is order set in asc
//does not contain null value
//It is sorted in ASC order, null element can not be sorted its throw NullPointerException
//does not contain duplicate value

public class TestSortedSet {

		public static void main(String[] args) {

			SortedSet s = new TreeSet();

			s.add('c');
			s.add('b');
			s.add('a');
			s.add('d');
			s.add('b');
			s.add('a');

			System.out.println("Set : " + s);

		}

}
