package com.qa.persistence.domain;

public class Order {
	
	private long id;
	private int customerId;
	private long orderQuantity; 
	private Double orderTotal;

	public Order(int customerId, Long orderQuantity, Double orderTotal) {
		this.customerId = customerId;
		this.orderQuantity = orderQuantity;
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

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String toString() {
		return "order ID : " + id + " , " + "customer ID: " + customerId + " , " + "order quantity: " + orderQuantity + " , "+ "order total: " + orderTotal;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}


}
