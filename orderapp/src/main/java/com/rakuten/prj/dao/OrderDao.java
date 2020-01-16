package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Order;

public interface OrderDao {

	void placeOrder(Order order);

	List<Order> getorders();

}
