package com.qa.persistence.domain;

public class Order {
	
	private long id;
	private int customerId;

	public Order(long id, int customerId) {
		this.id = id;
		this.customerId = customerId;
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

	

}
