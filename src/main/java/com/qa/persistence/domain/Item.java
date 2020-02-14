package com.qa.persistence.domain;

public class Item {
	private long id;
	private String name; 
	private float value; 
	private long quantity;
	
	

	public Item(long id, String name, float value, long quantity) {
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

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public long getQuantiy() {
		return quantity;
	}

	//public void setQuantiy(invalid invalid) {
	//	this.quantity = invalid;
	}
	
	
	



