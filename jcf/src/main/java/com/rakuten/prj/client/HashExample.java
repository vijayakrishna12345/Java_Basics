package com.rakuten.prj.client;

import java.util.Set;
import java.util.TreeSet;

import com.rakuten.prj.entity.Product;

public class HashExample {

	public static void main(String[] args) {
		//Set<Product> products = new HashSet<>();
		//Set<Product> products = new TreeSet<>();
		
		Set<Product> products = new TreeSet<>((p1,p2) -> Double.compare(p1.getPrice(),p2.getPrice()));
		
        products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
        products.add(new Product(224, "iPhone", 98000.00, "mobile"));
        products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
        products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
        products.add(new Product(912, "One Plus", 32000.00, "mobile"));
        products.add(new Product(88, "HP Printer", 19000.00, "computer"));
        
       
        for (Product product : products) {
			System.out.println(product);
		}

	}

}
