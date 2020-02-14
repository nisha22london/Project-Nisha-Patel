package com.qa.controller;

import java.util.ArrayList;
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
		LOGGER.info("Please enter order price");
		Double orderTotal = Double.valueOf(Utils.getInput());
		LOGGER.info("Order created");
		orderService.create(new Order(customerID, orderTotal));	

	}
	
	
	LOGGER.info("Enter customer id:");
	Long id =Long.valueOf(Utils.getInput());
	Double totalPrice = 0.00;
	Long totalQuantity = 0L;
	ArrayList<Long> items = new ArrayList<Long>();
	ArrayList<Long> quantity = new ArrayList<Long>();
	ArrayList<Double> price = new ArrayList<Double>(); {
	while (true) {
		LOGGER.info("Please enter item id or enter 0 if order is complete:" );
		Long l = Long.valueOf(Utils.getInput());
		items.add(l);
		if(l==0) {
			break;
		}
		LOGGER.info("Please enter quantity of item");
		Long i = Long.valueOf(Utils.getInput());
		quantity.add(i);
		LOGGER.info("Please enter price of item");
		Double j = Double.valueOf(Utils.getInput());
		price.add(j);
		}
		for(int k=0; k<quantity.size();k++) {
			Double price1 =(quantity.get(k))* (price.get(k));
			totalPrice= totalPrice+price1;
			totalQuantity += quantity.get(k);
		}
		orderService.create((new Order(id, totalQuantity, totalPrice)));
		LOGGER.info("Order created successfully");
		return null;
		
}
}

	public void update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long OrderID = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter customer id to update");
		int customerId = Integer.valueOf(Utils.getInput());
		LOGGER.info("Please enter order price to update");
		Double orderTotal = Double.valueOf(Utils.getInput());
		orderService.update(OrderID, new Order(customerId, orderTotal));
		LOGGER.info("order created");
		orderService.create(new Order(customerId, orderTotal));

	}

	public void delete() {
		LOGGER.info("Please enter ID ");
		int cID = Integer.valueOf(Utils.getInput());
		LOGGER.info("order deleted");
		orderService.delete(cID);
		
	}

}
