/**
 * 
 */
package com.rakuten.prj.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rakuten.prj.entity.Triplets;

/**
 * @author vijaya
 *
 */
public class ArrayUtil {

	private ArrayUtil() {
	}

	/** Not a javadoc (ignored). */
	public static int getSum(int[] data) {
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return sum;
	}

	/** Not a javadoc (ignored). */
	public static int getOccurence(int[] data, int no) {
		int count = 0;
		for (int i : data) {
			if (i == no) {
				count++;
			}
		}
		return count;

	}

	/** Not a javadoc (ignored). */
	public static void sort(int[] data) {
		Arrays.parallelSort(data);
	}
	/**
	 * 
	 * @param items
	 */
	public static void sort(Comparable[] items) {
		
		for (int i = 0; i < items.length; i++) {
			for (int j = i+1; j < items.length; j++) {
				if(items[i].compareTo(items[j])>0)
				{
					Comparable temp = items[i];
					items[i]=items[j];
					items[j]=temp;
					
					
				}
			}
			
		}
	}
	
	public static List<Triplets> printTriplets(int[ ] data) { 
		
		
		List<Triplets> result=new ArrayList<>();
		//System.out.println("hi");
		for (int i = 0; i < data.length; i++) {
			
			for (int j = i+1; j < data.length; j++) {
				
				for (int k = i+1; k < data.length; k++) {
					if(data[i]+data[j]==data[k])
					{
						
						//System.out.println(data[i]);
						result.add(new Triplets(data[i],data[j],data[k]));
					}
				}
				
			}
			
			
	
			
			
			
			
			
			
		}
		return result;
		
		
	}

}
