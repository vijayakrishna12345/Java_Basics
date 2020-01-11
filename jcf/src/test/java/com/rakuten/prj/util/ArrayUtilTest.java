package com.rakuten.prj.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rakuten.prj.entity.Product;

class ArrayUtilTest {

	@Test
	void testGetSum() {
		int[] values = { 45, 10, -5 };
		int expected = 50;
		assertEquals(expected, ArrayUtil.getSum(values));
	}

	@Test
	void testGetOccurence() {
		int[] values = { 43, 6, 77, 6, 12, 6 };
		int expected = 3;
		assertEquals(expected, ArrayUtil.getOccurence(values, 6));
	}

	@Test
	void testSort() {
		int[] values = { 2, 3, 5, 1, -9, 0 };
		ArrayUtil.sort(values);
		int[] expected = { -9, 0, 1, 2, 3, 5 };
		assertArrayEquals(expected, values);
	}

	@Test
	void testComparable() {
		String[] names = { "George", "Charlie", "John" };
		ArrayUtil.sort(names);
		String[] sorted = { "Charlie", "George", "John" };
		assertArrayEquals(sorted, names);

		Product[] products = new Product[6];
		products[0] = new Product(645, "Hp Laptop", 135000.00, "computer");
		products[1] = new Product(224, "iPhone", 98000.00, "mobile");
		products[2] = new Product(834, "Logitech Mouse", 600.00, "computer");
		products[3] = new Product(5, "Sony Bravia", 125000.00, "tv");
		products[4] = new Product(912, "One Plus", 32000.00, "mobile");
		products[5] = new Product(88, "HP Printer", 19000.00, "computer");
		ArrayUtil.sort(products);

		Product[] sps = new Product[6];
		sps[3] = new Product(645, "Hp Laptop", 135000.00, "computer");
		sps[2] = new Product(224, "iPhone", 98000.00, "mobile");
		sps[4] = new Product(834, "Logitech Mouse", 600.00, "computer");
		sps[0] = new Product(5, "Sony Bravia", 125000.00, "tv");
		sps[5] = new Product(912, "One Plus", 32000.00, "mobile");
		sps[1] = new Product(88, "HP Printer", 19000.00, "computer");

		assertArrayEquals(sps, products);
	}

}