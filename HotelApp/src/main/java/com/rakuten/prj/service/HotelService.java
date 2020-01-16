package com.rakuten.prj.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.prj.dao.BookingDao;
import com.rakuten.prj.dao.HotelDao;
import com.rakuten.prj.dao.UserDao;
import com.rakuten.prj.entity.Bookings;
import com.rakuten.prj.entity.Hotel;
import com.rakuten.prj.entity.User;

@Service
@Transactional
public class HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	@Autowired
	private BookingDao bookingDao;
	
	@Autowired
	private UserDao userDao;
	
	public void insertUser(User p)
	{
		userDao.addUser(p);
	}
	
	public User getProduct(int id)
	{
		return userDao.getUser(id);
		
	}
	
	public List<User> getAllUser()

	{
		return userDao.getUsers();
	}
	
	public void insertBooking(Bookings b)
	{
		bookingDao.addBooking(b);;
	}
	
	public Bookings getBooking(int id)
	{
		return bookingDao.getBooking(id);
		
	}
	
	public List<Bookings> getAllBooking()

	{
		return bookingDao.getBookings();
	}
	
	public List<Bookings> getBookingsBetweenDates(String d1,String d2)

	{
		
//		Date date1 = new Date(), date2 = new Date();
//		
//		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy/MM/dd");
//		try {
//			date1 = formatter1.parse(d1);
//		} catch (ParseException e1) {
//
//			e1.printStackTrace();
//		}
//
//		
//		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy/MM/dd");
//		try {
//			date2 = formatter2.parse(d2);
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
	    String[] st1 = d1.split("/");
	    String[] st2 = d2.split("/");
		
		return bookingDao.getBookingsBetweenDates(st1[2]+"-"+st1[1]+"-"+st1[0], st2[2]+"-"+st2[1]+"-"+st2[0]);
	}
	
	public List<Hotel> getHotelByName(String s)

	{
		
		return hotelDao.getHotelBasedOnSearch(s);
	}

}
