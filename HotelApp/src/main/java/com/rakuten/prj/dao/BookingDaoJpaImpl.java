package com.rakuten.prj.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Bookings;

@Repository
public class BookingDaoJpaImpl implements BookingDao {

	
	@PersistenceContext
	private EntityManager em;
	@Override
	public void addBooking(Bookings p) {
		
		em.persist(p);
	
	}

	@Override
	public Bookings getBooking(int id) {
		return em.find(Bookings.class, id);
	}

	@Override
	public List<Bookings> getBookings() {
		String jpql= "from Bookings";
		TypedQuery<Bookings> query = em.createQuery(jpql, Bookings.class);
		return query.getResultList();
	}

	@Override
	public List<Bookings> getBookingsBetweenDates(String date1, String date2) {
		System.out.println(date1);
		System.out.println(date2);
		String jpql= "from Bookings where checkInDate between '"+date1+"' and '"+date2+"'" ;
//		String jpql= "from Bookings where checkInDate >='"+date1+"'" ;
		TypedQuery<Bookings> query = em.createQuery(jpql, Bookings.class);
		return query.getResultList();
	}

}
