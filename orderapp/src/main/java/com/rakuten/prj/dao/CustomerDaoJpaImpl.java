package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Customer;
import com.rakuten.prj.entity.Product;


@Repository
public class CustomerDaoJpaImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addCustomer(Customer c) {
		em.persist(c);

	}

	@Override
	public Customer getCustomer(String email) {
		
		return em.find(Customer.class, email);
	}

	@Override
	public List<Customer> getCustomers() {
		
		String jpql= "from Customer";
		TypedQuery<Customer> query = em.createQuery(jpql, Customer.class);
		return query.getResultList();
	}

}
