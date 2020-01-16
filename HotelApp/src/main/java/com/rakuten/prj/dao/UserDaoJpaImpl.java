package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.User;
@Repository
public class UserDaoJpaImpl implements UserDao {

	
	@PersistenceContext
	private EntityManager em;
	@Override
	public void addUser(User p) {
		em.persist(p);

	}

	@Override
	public User getUser(int id) {
		return em.find(User.class, id);
	}

	@Override
	public List<User> getUsers() {
		String jpql= "from User";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		return query.getResultList();
	}

}
