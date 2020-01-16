package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Hotel;

public interface HotelDao {
	
	
	Hotel getHotel(int id);
	List<Hotel> getHotels();
	List<Hotel> getHotelBasedOnSearch(String search);

}
