package com.rays.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//1. map does not contain duplicate key
//2. map contain only one null key
//3. value can be duplicate
//4. map can contain multiple null value

public class TestMap {
	
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(1, "one");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		
		int size = map.size();
		String val = (String) map.get(2);
		map.remove("1");
		
		boolean flag = map.containsKey("1");
		flag = map.containsValue("Two");
		
		Set keys = map.keySet();
		

//		System.out.println(m.get(5));
//		System.out.println(m.entrySet());
//		System.out.println(m.containsKey(5));
//		System.out.println(m.containsValue(5));
//		System.out.println(m.keySet());
//		System.out.println(m.values());
	}

}
