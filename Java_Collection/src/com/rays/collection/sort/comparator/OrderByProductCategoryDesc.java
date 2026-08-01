package com.rays.collection.sort.comparator;

import java.util.Comparator;

public class OrderByProductCategoryDesc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return o2.productCategory.compareTo(o1.productCategory);
	}
}
