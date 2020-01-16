package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.OrderDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.service.OrderService;

public class OrderInsertClient {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(OrderService.class);
		ctx.register(CustomerDaoJpaImpl.class);
		ctx.register(ProductDaoJpaImpl.class);
		ctx.register(OrderDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		OrderService os = ctx.getBean("orderService",OrderService.class);
		
		int[] pids = {3,5,6};
		int[] qts = {4,2,1};
		
		os.placeOrder("vijay@12345", pids, qts);
	
		System.out.println("Order Placed");

	}

}
