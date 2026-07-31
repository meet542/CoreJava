package com.rays.collection.sort.comparator;

import java.util.Comparator;

public class OrderByProductNameAsc implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.productName.compareTo(o2.productName);
	}

}
