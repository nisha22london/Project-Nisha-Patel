package com.qa.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Customer;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;


/**
 * Takes in customer details for CRUD functionality
 *
 */

public class CustomerController implements CrudController<Customer> {

	public static final Logger LOGGER = Logger.getLogger(CustomerController.class);

	private CrudServices<Customer> customerService;

	public CustomerController(CrudServices<Customer> customerService) {
		this.customerService = customerService;
	}

	/**
	 * Reads all customers to the logger
	 */

	public List<Customer> readAll() {
		List<Customer> customers = customerService.readAll();
		for (Customer customer : customers) {
			LOGGER.info(customer.toString());
		}

		return customers;
	}

	/**
	 * Creates a customer by taking in user input
	 */

	public void create() {
		LOGGER.info("Please enter a first name");
		String firstName = Utils.getInput();
		LOGGER.info("Please enter the address");
		String address = Utils.getInput();
		LOGGER.info("Customer created");
		customerService.create(new Customer(firstName, address));

	}

	/**
	 * Updates an existing customer by taking in user input
	 */

	public void update() {
		LOGGER.info("Please enter the id of the customer you would like to update");
		Long id = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter a first name");
		String Name = Utils.getInput();
		LOGGER.info("Please enter the address");
		String Address = Utils.getInput();
		customerService.update(id, new Customer(Name, Address));
		LOGGER.info("Customer updated");

	}

	/**
	 * Deletes an existing customer by the id of the customer
	 */

	public void delete() {
		LOGGER.info("Please enter ID ");
		String id = Utils.getInput();
		int intt = Integer.parseInt(id);
		customerService.delete(intt);
		LOGGER.info("Customer deleted");
	}

	public void getInput() {
		// TODO Auto-generated method stub
		
	}



}
