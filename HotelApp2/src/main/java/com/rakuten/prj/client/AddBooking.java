package com.rakuten.prj.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.BookingDaoJpaImpl;
import com.rakuten.prj.dao.HotelDaoJpaImpl;
import com.rakuten.prj.dao.UserDaoJpaImpl;
import com.rakuten.prj.entity.Bookings;
import com.rakuten.prj.entity.Hotel;
import com.rakuten.prj.entity.User;
import com.rakuten.prj.service.HotelService;

public class AddBooking {

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

		Hotel t = new Hotel();
		t.setId(1);
		User o = new User();
		o.setId(1);
		Bookings e = new Bookings();
		e.setHotelBooked(t);
		e.setUserBooked(o);

		Date d11111 = new Date();
//		System.out.println(d1);
		Date date1 = new Date(), date2 = new Date();
		String sDate1 = "16/01/2020";
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date1 = formatter1.parse(sDate1);
		} catch (ParseException e1) {

			e1.printStackTrace();
		}

		String sDate2 = "20/01/2020";
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date2 = formatter2.parse(sDate2);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.setCheckInDate(date1);
		e.setCheckOutDate(date2);
		
		System.out.println(date1);
		//os.insertBooking(e);
		System.out.println("Bookings Confirmed!!!");

	}

}
