package com.qa.persistence.domain;

public class Order {
	
	private long id;
	private int customerId;
	private Double orderTotal;

	public Order(int customerId, Double orderTotal) {
		this.id = id;
		this.customerId = customerId;
		this.setOrderTotal(orderTotal);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void add(Order orders) {
		// TODO Auto-generated method stub
		
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	

}
