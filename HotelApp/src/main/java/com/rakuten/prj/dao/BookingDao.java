package com.rakuten.prj.dao;

import java.util.Date;
import java.util.List;

import com.rakuten.prj.entity.Bookings;

public interface BookingDao {
	
	void addBooking(Bookings p);
	Bookings getBooking(int id);
	List<Bookings> getBookings();
	List<Bookings> getBookingsBetweenDates(String date1,String Date2);
	

}
