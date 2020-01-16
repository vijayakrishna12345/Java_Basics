package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Hotel;

@Repository
public class HotelDaoJpaImpl implements HotelDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public Hotel getHotel(int id) {
		return em.find(Hotel.class, id);
	}

	@Override
	public List<Hotel> getHotels() {
		String jpql= "from Hotel";
		TypedQuery<Hotel> query = em.createQuery(jpql, Hotel.class);
		return query.getResultList();
	}

	@Override
	public List<Hotel> getHotelBasedOnSearch(String search) {
		//String jpql= "from Hotel where name like \"" + search + "\" or city like \"" +search+"\"" ;
		String jpql= "from Hotel where name LIKE '%"+search+"%' or city LIKE '%"+search+"%'";
		TypedQuery<Hotel> query = em.createQuery(jpql, Hotel.class);
		return query.getResultList();
		
	}

}
