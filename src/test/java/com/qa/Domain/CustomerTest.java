package com.qa.Domain;


	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertFalse;
	import static org.junit.Assert.assertNotNull;
	import static org.junit.Assert.assertNull;
	import static org.junit.Assert.assertTrue;

	import org.junit.Before;
	import org.junit.Test;

import com.qa.persistence.domain.Customer;
	
	public class CustomerTest {
		
		private Customer customer;
		private Customer other;
		
		@Before
		public void setUp() {
			customer = new Customer(1, "Chris", "Perrins");
			other = new Customer(1, "Chris", "Perrins");
		}
		
		@Test
		public void settersTest() {
			assertNotNull(customer.getId());
			assertNotNull(customer.getName());
			assertNotNull(customer.getAddress());
			

			customer.setName(null);
			assertNull(customer.getName());
			customer.setAddress(null);;
			assertNull(customer.getAddress());
			
		}
		
		@Test
		public void equalsWithNull() {
			assertFalse(customer.equals(null));
		}
		
		@Test
		public void equalsWithDifferentObject() {
			assertFalse(customer.equals(new Object()));
		}
		
		@Test
		public void createCustomerWithId() {
			assertEquals(1, customer.getId(), 0);
			assertEquals("Chris", customer.getName());
			assertEquals("Perrins", customer.getAddress());
		}
		
		@Test
		public void checkEquality() {
			assertTrue(customer.equals(customer));
		}
		
		@Test
		public void checkEqualityBetweenDifferentObjects() {
			assertTrue(customer.equals(other));
		}
		
		@Test
		public void customerNameNullButOtherNameNotNull() {
			customer.setName(null);
			assertFalse(customer.equals(other));
		}
		
		@Test
		public void customerNamesNotEqual() {
			other.setName("rhys");
			assertFalse(customer.equals(other));
		}
		
		@Test
		public void checkEqualityBetweenDifferentObjectsNullName() {
			customer.setName(null);
			other.setName(null);
			assertTrue(customer.equals(other));
		}
		
		@Test
		public void nullId() {
			customer.setId(null);
			assertFalse(customer.equals(other));
		}
		
		@Test
		public void nullIdOnBoth() {
			customer.setId(null);
			other.setId(null);
			assertTrue(customer.equals(other));
		}
		
		@Test
		public void otherIdDifferent() {
			other.setId(2L);
			assertFalse(customer.equals(other));
		}
		
		@Test
		public void nullSurname() {
			customer.setSurname(null);
			assertFalse(customer.equals(other));
		}
		
		@Test
		public void nullSurnameOnBoth() {
			customer.setSurname(null);
			other.setSurname(null);
			assertTrue(customer.equals(other));
		}
		
		@Test
		public void otherSurnameDifferent() {
			other.setSurname("thompson");
			assertFalse(customer.equals(other));
		}
		
		@Test
		public void constructorWithoutId() {
			Customer customer = new Customer("Nisha", "Patel");
			assertNull(customer.getId());
			assertNotNull(customer.getName());
			assertNotNull(customer.getAddress());
			
		}

		@Test
		public void toStringTest() {
			String toString = "id:1 first name:Chris surname:Perrins";
			assertEquals(toString, customer.toString());
		}


}
