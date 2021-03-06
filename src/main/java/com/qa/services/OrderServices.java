package com.qa.services;

import java.util.List;

import com.qa.persistence.dao.Dao;
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
	public void create(Order order) {
		 orderDao.create(order);
	}

	@Override
	public void update(long id, Order order) {
		orderDao.update(id, order);

	}

	@Override
	public void delete(long id) {
		orderDao.delete(id);

	}

}
