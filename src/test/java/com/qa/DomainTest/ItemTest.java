//package com.qa.DomainTest;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
//import org.junit.Test;
//
//import com.qa.persistence.domain.Item;
//
//public class ItemTest {
//	
//		private Item item;
//		private Item other;
//		@Before
//		public void setUp() {
//			item = new Item(1L, "A", 1L, 1.00);
//			other = new Item(1L, "A", 1L, 1.00);
//		}
//		@Test
//		public void settersTest() {
//			assertNotNull(item.getId());
//			assertNotNull(item.getName());
//			assertNotNull(item.getValue());
//			assertNotNull(item.getQuantiy());
//			assertNull(item.getId());
//			
//		
//			item.setName(null);
//			assertNull(item.getName());
//			assertNull(item.getQuantiy());
//			assertNull(item.getName());
//		}
//		@Test
//		public void equalsWithNull() {
//			assertFalse(item.equals(null));
//		}
//		@Test
//		public void equalsWithDifferentObject() {
//			assertFalse(item.equals(new Object()));
//		}
//		@Test
//		public void createProductWithId() {
//			assertEquals(1L, item.getId(), 0);
//			assertEquals("A", item.getName());
//			assertEquals("B", item.getQuantiy());
//			assertEquals("C", item.getName());
//		}
//		@Test
//		public void checkEquality() {
//			assertTrue(item.equals(item));
//		}
//		@Test
//		public void checkEqualityBetweenDifferentObjects() {
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void productNameNullButOtherNameNotNull() {
//			item.setName(null);
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void productNamesNotEqual() {
//			other.setName("Q");
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void checkEqualityBetweenDifferentObjectsNullName() {
//			item.setName(null);
//			other.setName(null);
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void nullId() {
//			item.setId(null);
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void nullIdOnBoth() {
//			item.setId(null);
//			other.setId(null);
//			assertTrue(item.equals(other));
//		}
//		@Test
//		public void otherIdDifferent() {
//			other.setId(2L);
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void nullQuantity() {
//			item.setQuantiy(null);
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void nullQuantityOnBoth() {
//			item.setQuantiy(null);
//			other.setQuantiy(null);
//			assertTrue(item.equals(other));
//		}
//		@Test
//		public void otherQuantityDifferent() {
//			other.setQuantiy(2L);
//			assertFalse(item.equals(other));
//		}
//		@Test
//		public void constructorWithoutId() {
//			Item item = new Item("A", 1L, 1.00);
//			assertNull(item.getId());
//			assertNotNull(item.getName());
//			assertNotNull(item.getQuantiy());
//			assertNotNull(item.getName());
//		}
//		@Test
//		public void toStringTest() {
//			String toString = "id: 1 , Product name: B , quantity: 2 , value: 1.00";
//			assertEquals(toString, item.toString());
//		}
//	}
//}
//
//		
//	
//	
