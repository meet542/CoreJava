package com.rays.collection.sort.comparator;

import java.util.Comparator;

public class OrderByProducCategoryAsc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return o1.productCategory.compareTo(o2.productCategory);
	}
}
