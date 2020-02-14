//
//
//	import org.junit.Test;
//	import org.junit.runner.RunWith;
//	import org.mockito.InjectMocks;
//	import org.mockito.Mock;
//	import org.mockito.Mockito;
//	import org.mockito.Spy;
//	import org.mockito.junit.MockitoJUnitRunner;
//
//import com.qa.persistence.dao.Dao;
//import com.qa.persistence.domain.Customer;
//
//	
//	@RunWith(MockitoJUnitRunner.class)
//	
//	public class CustomerServicesTest {
//		
//		@Mock
//		private Dao<Customer> customerDao;
//		
//		@InjectMocks
//		private CustomerServices customerServices;
//		
//		@Test
//		public void customerServicesCreate() {
//			Customer customers = new Customer("Nisha", "Patel");
//			customerServices.create(customers);
//			Mockito.verify(customerDao, Mockito.times(1)).create(customers);
//		}
//		
//		@Test
//		public void customersServicesRead() {
//			customerServices.readAll();
//			Mockito.verify(customerDao, Mockito.times(1)).readAll();
//		}
//		
//		@Test
//		public void customersServicesUpdate() {
//			Customer customer = new Customer("Nisha", "Patel");
//			customerServices.update(0, customer);
//			Mockito.verify(customerDao, Mockito.times(1)).update(0, customer);
//		}
//		
//		@Test
//		public void customerServicesDelete() {
//			customerServices.delete(1L);;
//			Mockito.verify(customerDao, Mockito.times(1)).delete(1L);
//		}
//	}
//
//	


