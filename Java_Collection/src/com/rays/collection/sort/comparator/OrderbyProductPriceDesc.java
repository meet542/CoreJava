package com.rays.collection.sort.comparator;

import java.util.Comparator;

public class OrderbyProductPriceDesc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return o2.productPrice - o1.productPrice;
	}
}
