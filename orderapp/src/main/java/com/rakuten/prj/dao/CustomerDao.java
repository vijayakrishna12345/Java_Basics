package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Customer;

public interface CustomerDao {
	
	void addCustomer(Customer c);
	Customer getCustomer(String email);
	List<Customer> getCustomers();

}
