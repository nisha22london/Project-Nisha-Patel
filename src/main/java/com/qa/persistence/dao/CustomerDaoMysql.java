package com.qa.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.controller.CustomerController;
import com.qa.persistence.domain.Customer;
import com.qa.utils.Config;

public class CustomerDaoMysql implements Dao<Customer> {

	public static final Logger logger = Logger.getLogger(CustomerController.class);

	private Connection connection;

	public List<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password); Statement statement = connection.createStatement();) {
			System.out.println("hello");
			ResultSet resultSet = statement.executeQuery("select * from customers");

			while (resultSet.next()) {

				int customerID = resultSet.getInt("customerID");
				String Name = resultSet.getString("Name");
				String Address = resultSet.getString("Address");

//				Customer customer = new Customer(id, Name);
				customers.add(new Customer(customerID, Name, Address));
				logger.info("The customer table has been read");
			}
		} catch (Exception e) {
			logger.error("The customer table has been not read");
		} finally {
		}
		;

		return customers;
	}

	public void create(Customer customer) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into customers(Name, Address) values('" + customer.getName() + "','"
					+ customer.getAddress() + "')");
			logger.info("The customer has been created");
		} catch (Exception e) {
			logger.error(e);
		} finally {
		}
		;

		}
	

	public void update(long id, Customer customer) {
		String sql = "UPDATE customer set Name = ?, Address=?, where id = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getAddress());
			stmt.setLong(3, id);
			stmt.execute();
			logger.info("The customer has been updated");
		} catch (Exception e) {
			logger.error("The customer has not been updated");
		} finally {
		}
		;

		}
			

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM customer WHERE id = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, customer.getId());
			stmt.execute();
			logger.info("The customer has been deleted");
			connection.close();
		} catch (Exception e) {
			logger.error("The customer has not been deleted");

		} finally {
		}
		;

		}
	}


