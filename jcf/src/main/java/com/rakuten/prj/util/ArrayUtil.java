/**
 * 
 */
package com.rakuten.prj.util;

import java.util.Arrays;

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

}
