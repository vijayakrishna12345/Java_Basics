package com.rakuten.prj.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.rakuten.prj.entity.Product;

public class StreamExample {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));

		List<Product> mobiles = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("mobile"))
				.collect(Collectors.toList());
//        for (Product product : mobiles) {
//			System.out.println(product);
//		}

		mobiles.forEach(p -> System.out.println(p));
		System.out.println("####");
		mobiles.forEach(System.out::println);

		System.out.println("####");

		products.stream().map(p -> p.getName()).forEach(System.out::println);

		System.out.println("####");

		products.stream().filter(p -> p.getCategory().equalsIgnoreCase("mobile")).map(p -> p.getName())
				.forEach(System.out::println);

		System.out.println("####");

		double sum = products.stream().map(p -> p.getPrice()).reduce(0.0, (v1, v2) -> v1 + v2);
		System.out.println("Sum:"+sum);
		
		System.out.println("####");

		double mobile_sum = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("mobile")).map(p -> p.getPrice()).reduce(0.0, (v1, v2) -> v1 + v2);
		System.out.println("mobile_sum:"+mobile_sum);
		
		System.out.println("####");
		
		Map<String, List<Product>> productCat =  products.stream()
				.collect(Collectors.groupingBy(p->p.getCategory()));
		
		System.out.println(productCat);
		System.out.println("####");
		
		List<Product> computers = productCat.get("computer");
		for (Product product : computers) {
			System.out.println(product);
		}
		
		
		System.out.println("####");
		
		
		

	}

}
