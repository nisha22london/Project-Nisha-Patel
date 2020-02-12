package com.qa.persistence.domain;

public class Customer{

	private int id;
	private String Name;
	private String Address;
	
	public Customer(String Name, String Address) {
		this.Name = Name;
		this.Address = Address;
	}

	public Customer(int id, String Name, String Address) {
		this.id = id;
		this.Name = Name;
		this.Address = Address;
	}
	
	public Customer(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	
}



	
	
	