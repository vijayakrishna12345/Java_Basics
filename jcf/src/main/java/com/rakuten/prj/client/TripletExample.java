package com.rakuten.prj.client;

import java.util.List;

import com.rakuten.prj.entity.Triplets;
import com.rakuten.prj.util.ArrayUtil;

public class TripletExample {

	public static void main(String[] args) {
		int data[] = { 2, 3, 4, 5, 7 };
		List<Triplets> triplets = ArrayUtil.printTriplets(data);
		System.out.println(triplets);
		for (Triplets triplets2 : triplets) {
			System.out.println(triplets2);
		}
		
		System.out.println("************");
		
		int[] data1 = { 1, 2, 3, 4, 5, 7, 9 };
		List<Triplets> triplets1 = ArrayUtil.printTriplets(data1);
		System.out.println(triplets1);
		for (Triplets triplets2 : triplets1) {
			System.out.println(triplets2);
		}

	}

}
