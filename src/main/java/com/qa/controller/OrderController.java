package com.qa.controller;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Customer;
import com.qa.persistence.domain.Item;
import com.qa.persistence.domain.Order;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;


	public class OrderController implements CrudController<Order>{

		public static final Logger LOGGER = Logger.getLogger(OrderController.class);
		
		private CrudServices<Order> orderService;

		public OrderController(CrudServices<Order> orderService) {
			this.orderService = orderService;
		}
		
		public void readAll() {
			for(Order order: orderService.readAll()) {
				LOGGER.info(order.toString());
			}
		}

		public void create(Order order) {
			LOGGER.info("Please enter orderID");
			String orderID = Utils.getInput();
			long longg = Long.parseLong(orderID);
			LOGGER.info("Please enter orderID");
			
			String OrderID = Utils.getInput();
			int intt = Integer.parseInt(orderID);
			orderService.create(new Order(longg, intt));
			LOGGER.info("Order created");
		}

		public void update() {
			LOGGER.info("Please enter orderID");
			String orderID = Utils.getInput();
			long longg = Long.parseLong(orderID);
			LOGGER.info("Please enter orderID");
			
			String OrderID = Utils.getInput();
			int intt = Integer.parseInt(orderID);
			orderService.create(new Order(longg, intt));
			LOGGER.info("order created");
			
			
		}

		public void delete() {
			LOGGER.info("Please enter ID ");
			long id = Long.valueOf(Utils.getInput());
			int cID = Integer.valueOf(Utils.getInput());
			orderService.delete(new Order(id, cID));
			LOGGER.info("order deleted");
			
			
		}

		@Override
		public void create() {
			// TODO Auto-generated method stub
			
		}
		
	} 




