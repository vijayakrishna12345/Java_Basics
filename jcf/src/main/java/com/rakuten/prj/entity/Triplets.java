package com.rakuten.prj.entity;

import java.util.ArrayList;
import java.util.List;

public class Triplets {
	private int first;
	private int second;
	private int sum;
	/**
	 * 
	 */
	public Triplets() {
	}
	/**
	 * @param first
	 * @param second
	 * @param sum
	 */
	public Triplets(int first, int second, int sum) {
		this.first = first;
		this.second = second;
		this.sum = sum;
	}
	/**
	 * @return the first
	 */
	public int getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(int first) {
		this.first = first;
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int first,int second) {
		this.sum = first+second;
	}
	
	
	public List<Triplets> add(int first,int second,int sum) {
		
		List<Triplets> result=new ArrayList<>();
		result.add(new Triplets(first,second,sum));
		return result;
	}
	
    @Override
    public String toString() {
        return "Triplets <" + first + "," + second + "," + sum + ">";
        
        
    }
	public Integer size() {
		// TODO Auto-generated method stub
		return 3;
	}
 	
	

}
