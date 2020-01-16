package com.rakuten.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.prj.dao.CustomerDao;
import com.rakuten.prj.dao.OrderDao;
import com.rakuten.prj.dao.ProductDao;
import com.rakuten.prj.entity.Customer;
import com.rakuten.prj.entity.LineItem;
import com.rakuten.prj.entity.Order;
import com.rakuten.prj.entity.Product;

@Service
@Transactional  //Mandatory for commit and roll back purposes.
public class OrderService {

	@Autowired      //instead of us creating the objects, the framework creates for us.
	private ProductDao productDao;
	
	public void insertProduct(Product p)
	{
		productDao.addProduct(p);
	}
	
	public Product getProduct(int id)
	{
		return productDao.getProduct(id);
		
	}
	
	public List<Product> getAllProducts()

	{
		return productDao.getProducts();
	}
	
	@Autowired
	private CustomerDao customerDao;
	
	public void insertCustomer(Customer c)
	{
		customerDao.addCustomer(c);
	}
	
	public Customer getCustomer(String email)
	{
		return customerDao.getCustomer(email);
		
	}
	
	public List<Customer> getAllCustomers()

	{
		return customerDao.getCustomers();
	}
	
	@Autowired
	private OrderDao orderDao;
	
	public void placeOrder(String email,int[] productIds, int[] qts)
	{
		Order order = new Order(); // sets order date
		Customer c = customerDao.getCustomer(email);
		order.setCustomer(c);   // which customer is placing the order
		double total = 0.0;
		
		for(int i=0; i < productIds.length; i++)
		{
			LineItem item = new LineItem();
			Product p = productDao.getProduct(productIds[i]);
			item.setProduct(p);
			item.setQuantity(qts[i]);
			item.setAmount(p.getPrice() * qts[i]);
			order.getItems().add(item);
			p.setQty(p.getQty() - qts[i]);  //dirty checking
			total +=item.getAmount();
		}
		order.setTotal(total);
		orderDao.placeOrder(order);
	}
	
}
