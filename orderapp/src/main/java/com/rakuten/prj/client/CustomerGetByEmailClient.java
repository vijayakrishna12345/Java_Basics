package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.service.OrderService;

public class CustomerGetByEmailClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		// new ClassPathXMLApplicationContext("beans.xml");
		ctx.register(OrderService.class);
		ctx.register(CustomerDaoJpaImpl.class);
		ctx.register(ProductDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();

		OrderService os = ctx.getBean("orderService", OrderService.class);
		
		System.out.println(os.getCustomer("vijay12345@gmail.com"));

	}

}
