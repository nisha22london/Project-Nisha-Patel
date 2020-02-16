package com.qa.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Order;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = Logger.getLogger(OrderController.class);

	private CrudServices<Order> orderService;

	public OrderController(CrudServices<Order> orderService) {
		this.orderService = orderService;
	}

	public List<Order> readAll() {
		List<Order> orders = orderService.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	public void create() {
		LOGGER.info("Please enter customerID");
		int customerID = Integer.valueOf(Utils.getInput());
		LOGGER.info("Please enter order quantity");
		Long orderQuantity = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter order price");
		Double orderTotal = Double.valueOf(Utils.getInput());
		LOGGER.info("Order created");
		orderService.create(new Order(customerID, orderQuantity, orderTotal));	

	}
	
	



	public void update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long OrderID = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter customer id to update");
		int customerId = Integer.valueOf(Utils.getInput());
		LOGGER.info("Please enter date to update");
		Long orderQuantity = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter order price to update");
		Double orderTotal = Double.valueOf(Utils.getInput());
		orderService.update(OrderID, new Order(customerId, orderQuantity, orderTotal));
		LOGGER.info("order updated");


	}

	public void delete() {
		LOGGER.info("Please enter ID ");
		int cID = Integer.valueOf(Utils.getInput());
		LOGGER.info("order deleted");
		orderService.delete(cID);
		
	}

}
