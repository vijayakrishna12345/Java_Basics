package com.rakuten.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.OrderDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.entity.Product;
import com.rakuten.prj.service.OrderService;

public class ProductClient {

	public static void main(String[] args) {
		
		//creates a spring container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		//new ClassPathXMLApplicationContext("beans.xml");
        ctx.register(OrderService.class);
        ctx.register(ProductDaoJpaImpl.class);
        ctx.register(CustomerDaoJpaImpl.class);
        ctx.register(OrderDaoJpaImpl.class);
        ctx.register(AppConfig.class);
        ctx.refresh();
        
        OrderService os = ctx.getBean("orderService",OrderService.class);
//		Product[] products = new Product[6];
//		products[0] = new Product(0, "Hp Laptop", 135000.00, "computer");
//		products[1] = new Product(0, "iPhone", 98000.00, "mobile");
//		products[2] = new Product(0, "Logitech Mouse", 600.00, "computer");
//		products[3] = new Product(0, "Sony Bravia", 125000.00, "tv");
//		products[4] = new Product(0, "One Plus", 32000.00, "mobile");
//		products[5] = new Product(0, "HP Printer", 19000.00, "computer");
		
		
//		for (Product p : products) {
//
//			os.insertProduct(p);
//			
//		}
//		
//		System.out.println("Products inserted!!!");
        
        List<Product> products = os.getAllProducts();
        for (Product p : products) {
        	
        	System.out.println(p);
			
		}

	}

}
