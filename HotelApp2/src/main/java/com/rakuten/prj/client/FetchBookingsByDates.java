package com.rakuten.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.BookingDaoJpaImpl;
import com.rakuten.prj.dao.HotelDaoJpaImpl;
import com.rakuten.prj.dao.UserDaoJpaImpl;
import com.rakuten.prj.entity.Bookings;
import com.rakuten.prj.service.HotelService;

public class FetchBookingsByDates {

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
		
		String s1="16/01/2020";
		String s2="20/01/2020";
		
		
		List<Bookings> bookings = os.getBookingsBetweenDates(s1, s2);
		
		System.out.println(bookings);
//		for (Hotel c : hotels) {
//
//			System.out.println(c);
//
//		}
		System.out.println("Bookings Fetched!!!");
		

	}

}
