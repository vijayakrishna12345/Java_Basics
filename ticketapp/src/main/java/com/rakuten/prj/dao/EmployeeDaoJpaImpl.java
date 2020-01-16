package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Employee;
import com.rakuten.prj.entity.Ticket;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addEmployee(Employee p) {
		em.persist(p);

	}
	@Override
	public Employee findById(int id)
	{
		return em.find(Employee.class, id);
	}

}
