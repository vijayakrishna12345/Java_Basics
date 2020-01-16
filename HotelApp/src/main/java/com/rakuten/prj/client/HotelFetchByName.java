package com.rakuten.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.BookingDaoJpaImpl;
import com.rakuten.prj.dao.HotelDaoJpaImpl;
import com.rakuten.prj.dao.UserDaoJpaImpl;
import com.rakuten.prj.entity.Hotel;
import com.rakuten.prj.service.HotelService;

public class HotelFetchByName {

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
		
		//String s="NY";
		//String s="sydney";
		String s="ritz";
		s.toLowerCase();
		List<Hotel> hotels = os.getHotelByName(s);
		
//		System.out.println(hotels);
		for (Hotel c : hotels) {

			System.out.println(c);

		}
		System.out.println("Hotels Fetched!!!");
		
		

	}

}
