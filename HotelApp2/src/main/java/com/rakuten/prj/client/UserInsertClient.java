package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.BookingDaoJpaImpl;
import com.rakuten.prj.dao.HotelDaoJpaImpl;
import com.rakuten.prj.dao.UserDaoJpaImpl;
import com.rakuten.prj.entity.User;
import com.rakuten.prj.service.HotelService;

public class UserInsertClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		// new ClassPathXMLApplicationContext("beans.xml");
		ctx.register(HotelService.class);
		ctx.register(BookingDaoJpaImpl.class);
		ctx.register(HotelDaoJpaImpl.class);
		ctx.register(UserDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();

		HotelService os = ctx.getBean("hotelService", HotelService.class);
		
        User emp1 = new User();
        emp1.setEmail("vijay12345@gmail.com");
        emp1.setFirstName("Vijay");
        os.insertUser(emp1);
    
		
//		User u1= new User(0,"Vijay","vijay@123");
//		u1.setFirstName("Vijay");
//		u1.setEmail("vijay@123");
//		os.insertUser(u1);
        System.out.println("Users inserted!!!");
	}

}
