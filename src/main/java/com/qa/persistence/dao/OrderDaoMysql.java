package com.qa.persistence.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.qa.controller.CustomerController;
import com.qa.persistence.domain.Order;
import com.qa.utils.Config;

public class OrderDaoMysql implements Dao<Order> {

	public static final Logger logger = Logger.getLogger(CustomerController.class);

	private Connection connection;
	
	public OrderDaoMysql() {
		
	}

	public ArrayList<Order> readAll() {
		ArrayList<Order> orders = new ArrayList<Order>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from orders");
			while (resultSet.next()) {
				int customerID = resultSet.getInt("customerID");
				Long orderQuantity = resultSet.getLong("order_quantity");
				Double order_total = resultSet.getDouble("order_total");
				orders.add(new Order(customerID, orderQuantity, order_total));
				logger.info("The order table has been read");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return orders;
	}

	public void create(Order order) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into orders(customerID,order_quantity,order_total) values('" + order.getCustomerId() 
							+ "','" + order.getOrderQuantity() + "','" + order.getOrderTotal() + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(long orderID) {
		String sql = "DELETE FROM orders WHERE orderID = ?";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, orderID);
			stmt.execute();
			System.out.println("Delete complete ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(long OrderID, Order order) {
		String sql = "UPDATE orders set customerID = ?, order_quantity = ?, order_total= ? where orderID = ?";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, order.getCustomerId());
			stmt.setLong(2, order.getOrderQuantity());
			stmt.setDouble(3, order.getOrderTotal());
			stmt.setLong(4, OrderID);
			stmt.execute();
			System.out.println("Update complete");
		} catch (Exception e) {
			logger.info(e);
		}
	}

}
