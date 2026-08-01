package com.rays.collection.sort.comparator;

import java.util.Comparator;

public class OrderByProductPriceAsc implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.productPrice - o2.productPrice;
	}

}
