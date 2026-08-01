package com.rays.collection.sort.comparator;

import java.util.Comparator;

public class OrderByProductNameDesc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return o2.productName.compareTo(o1.productName);
	}
}
