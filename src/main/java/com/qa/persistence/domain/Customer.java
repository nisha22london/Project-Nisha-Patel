package com.qa.persistence.domain;

public class Customer{

	private int id;
	private String Name;
	private String Address;
	
	public Customer(String Name) {
		this.Name=Name;
	}
	
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
	
	public String toString() {
		return "id :" + id + " first name :" + Name + " Address :" + Address;
	}
	
//@Override
//public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + ((Name == null) ? 0 :Name.hashCode());
//	result = prime * result + ((id == null) ? 0 :id.hashCode());
//	result = prime * result + ((Address == null) ? 0 : Address.hashCode());
//	return result
//
//
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Customer other = (Customer) obj;
//	if (Name == null) {
//		if (other.Address != null)
//			return false;
//	} else if (Name.equals(other.Name))
//		return false;
//	if (id == null) {
//		if (other.id != null)
//			return false;
//	} else if (!id.equals(other.id))
//		return false;
//	if (Name == null) {
//		if (other Name != null)
//			return false;
//	} else if (!Name.equals(other.Name))
//		return false;
//	return true;


public void setId(Object object) {
	// TODO Auto-generated method stub
	
}

public void setSurname(Object object) {
	// TODO Auto-generated method stub
	
}

}
	
	
	