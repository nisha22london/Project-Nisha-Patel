package com.qa.controller;


import static org.junit.Assert.assertEquals;
	import java.util.ArrayList;
	import java.util.List;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.Mockito;
	import org.mockito.Spy;
	import org.mockito.junit.MockitoJUnitRunner;

import com.qa.persistence.domain.Order;
import com.qa.services.OrderServices;
	@RunWith(MockitoJUnitRunner.class)
	public class OrderControllerTest {
		@Mock
		private OrderServices orderServices;
		@Spy
		@InjectMocks
		private OrderController orderController;
		@Test
		public void readAllTest() {
			OrderController orderController = new OrderController(orderServices);
			List<Order> orders = new ArrayList<Order>();
		    orders.add(new Order(1, 1L, 2.99));
			Mockito.when(orderServices.readAll()).thenReturn(orders);
			assertEquals(orders, orderController.readAll());
		}

}

	
	