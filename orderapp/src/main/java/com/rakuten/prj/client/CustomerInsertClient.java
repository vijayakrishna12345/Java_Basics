package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.entity.Customer;
import com.rakuten.prj.service.OrderService;

public class CustomerInsertClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		
		ctx.register(OrderService.class);
		ctx.register(CustomerDaoJpaImpl.class);
		ctx.register(ProductDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();

		OrderService os = ctx.getBean("orderService", OrderService.class);
		Customer[] cust = new Customer[2];
		cust[0] = new Customer("vijay12345@gmail.com", "Vijay");
		cust[1] = new Customer("karthi22@gmail.com", "Karthik");

		for (Customer c : cust) {

			os.insertCustomer(c);

		}

		System.out.println("Customers inserted!!!");

	}

}
