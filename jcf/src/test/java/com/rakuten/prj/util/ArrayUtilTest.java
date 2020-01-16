package com.rakuten.prj.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.rakuten.prj.entity.Product;
import com.rakuten.prj.entity.Triplets;

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

	@Test
	void testTriplet() {
		int data[] = { 2, 3, 4, 5, 7 };
		List<Triplets> triplets = ArrayUtil.printTriplets(data);
		Triplets t = triplets.get(0);
        assertEquals(3, t.size());
		assertEquals(2, t.getFirst());
		assertEquals(3, t.getSecond());
		assertEquals(5, t.getSum());
		Triplets t1 = triplets.get(1);
        assertEquals(3, t1.size());
		assertEquals(2, t1.getFirst());
		assertEquals(5, t1.getSecond());
		assertEquals(7, t1.getSum());
		Triplets t3 = triplets.get(2);
        assertEquals(3, t3.size());
		assertEquals(3, t3.getFirst());
		assertEquals(4, t3.getSecond());
		assertEquals(7, t3.getSum());
	
		
		
		
//		List<Triplets> t = new ArrayList<>();
//		t.add(new Triplets(2, 3, 5));
//		t.add(new Triplets(2, 5, 7));
//		t.add(new Triplets(3, 4, 7));
//		System.out.println(triplets);
//		System.out.println(t);
//		
//		
//		assertEquals(triplets,t);
//		
//		int[] data1 = { 1, 2, 3, 4, 5, 7, 9 };
//		List<Triplets> triplets1 = ArrayUtil.printTriplets(data1);	
//		
//		List<Triplets> t1 = new ArrayList<>();
//		
//		t1.add(new Triplets(1,2,3));
//		t1.add(new Triplets(1,3,4));
//		t1.add(new Triplets(1,4,5));
//		t1.add(new Triplets(2,3,5));
//		t1.add(new Triplets(2,5,7));
//		t1.add(new Triplets(2,7,9));
//		t1.add(new Triplets(3,4,7));
//		t1.add(new Triplets(4,5,9));
		
		

	}

}