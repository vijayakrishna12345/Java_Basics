package com.rakuten.prj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")

public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oid")
	private int orderId;
	
	@Column(name = "order_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate = new Date();
	
	
	@ManyToOne
	@JoinColumn(name="customer_fk")
	private Customer customer;  //order belongs to a customer
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="order_fk")
	private List<LineItem> items= new ArrayList<>();
	private double total;
	
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}


	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}


	public int getOrderId() {
		return orderId;
	}

	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	
	public Date getOrderDate() {
		return orderDate;
	}

	
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<LineItem> getItems() {
		return items;
	}

	
	public void setItems(List<LineItem> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customer=" + customer + ", items=" + items
				+ "]";
	}
	
	
	
	

}
