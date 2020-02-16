package com.qa.persistence.domain;

public class Item {
	private long id;
	private String name; 
	private Double value; 
	private long quantity;
	
	public Item( String name, long quantity, Double value) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}
	
	

	public Item(long id, String name, long quantity, Double value) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}
	
	public Item(long id , String name) {
		this.id = id;
		this.name =name;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public long getQuantiy() {
		return quantity;
	}

	public String toString() {
		return "Item ID: " + id + " , " + "Name: " + name + " , " + "Quantity: " + quantity + " , " + "Order total: " + value;
	}
	}
	
	
	



