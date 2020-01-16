package com.rakuten.prj.client;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		String str = "Java is OOP,Java is open source";
		String[] strArray = str.split(" |,");
		for (String string : strArray) {
			System.out.println(string);
		}

		Map<String, Integer> map = new HashMap<>();
		for (String w : strArray) {
			Integer n = map.get(w);
			n = (n == null) ? 1 : ++n;
			map.put(w, n);
		}
		
		System.out.println(map);
	}
}
