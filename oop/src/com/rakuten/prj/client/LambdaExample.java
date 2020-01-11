/**
 * 
 */
package com.rakuten.prj.client;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author vijaya
 *
 */
public class LambdaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer t) {

				return t / 2.0;
			}

		};
		System.out.println(f1.apply(5));

		Function<Integer, Double> f2 = (Integer t) -> {

			return t / 2.0;
		};
		System.out.println(f2.apply(7));

		Function<Integer, Double> f3 = t -> t / 2.0;
		System.out.println(f3.apply(9));

		BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {

				return t + u;
			}

		};
		System.out.println(add.apply(5, 4));

		BiFunction<Integer, Integer, Integer> multiply = (t, u) -> t * u;
		System.out.println(multiply.apply(5, 4));

	}
}