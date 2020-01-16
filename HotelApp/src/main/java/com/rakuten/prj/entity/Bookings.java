package com.rakuten.prj.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	
	@ManyToOne
	@JoinColumn(name="hotel_booked")
	private Hotel hotelBooked;
	
	@ManyToOne
	@JoinColumn(name="user_booked")
	private User userBooked;
	
	@Column(name="checkin_date")
	
	private Date checkInDate;
	
	@Column(name="checkout_date")
	private Date checkOutDate;

	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}

	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}

	/**
	 * @return the hotelBooked
	 */
	public Hotel getHotelBooked() {
		return hotelBooked;
	}

	/**
	 * @param hotelBooked the hotelBooked to set
	 */
	public void setHotelBooked(Hotel hotelBooked) {
		this.hotelBooked = hotelBooked;
	}

	/**
	 * @return the userBooked
	 */
	public User getUserBooked() {
		return userBooked;
	}

	/**
	 * @param userBooked the userBooked to set
	 */
	public void setUserBooked(User userBooked) {
		this.userBooked = userBooked;
	}

	/**
	 * @return the checkInDate
	 */
	public Date getCheckInDate() {
		return checkInDate;
	}

	/**
	 * @param checkInDate the checkInDate to set
	 */
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	/**
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * @param checkOutDate the checkOutDate to set
	 */
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "Bookings [bid=" + bid + ", hotelBooked=" + hotelBooked + ", userBooked=" + userBooked + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}

	

}
