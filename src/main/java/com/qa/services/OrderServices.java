package com.qa.services;

import java.util.List;

import com.qa.persistence.dao.Dao;
import com.qa.persistence.domain.Customer;
import com.qa.persistence.domain.Order;

public class OrderServices implements CrudServices<Order> {
		


Dao<Order> orderDao;
	public OrderServices(Dao<Order> orderDao) {
		this.orderDao = orderDao;
	
	}

	@Override
	public List<Order> readAll() {
	
		return orderDao.readAll();
	}

	@Override
	public void create(Order t) {
		orderDao.create(t);
		
	}

	@Override
	public void update(long id, Order t) {
		orderDao.update(id, t);
		
	}

	@Override
	public void delete(Order t) {
		orderDao.delete(t);
		
	}
	
	

}
