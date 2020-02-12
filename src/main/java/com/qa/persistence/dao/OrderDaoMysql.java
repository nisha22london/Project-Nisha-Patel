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
import com.qa.persistence.domain.Order;
import com.qa.utils.Config;

public class OrderDaoMysql implements Dao<Order> {
	
public static final Logger logger = Logger.getLogger(CustomerController.class);
	
	private Connection connection;
	
	public List<Order> readAll() {
		ArrayList<Order> Orders = new ArrayList<Order>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims", Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Orders");
			while (resultSet.next()) {
				Long OrderID = resultSet.getLong("OrderID");
				int CustomerID = resultSet.getInt("CustomerID");
				Order orders = new Order(OrderID,CustomerID);
				orders.add(orders);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return Orders;
	}

	public void create(Order order) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into order(orderID,customerID,order_date) values('" + order.getId() + "','" + order.getCustomerId()+"')");
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
	}
	
		public void delete(long orderID) {
			String sql = "DELETE FROM order WHERE orderID = ?";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setLong(1, orderID);
				stmt.execute();
				System.out.println("Delete complete ");
				connection.close();
			} catch (Exception e) {
				logger.info(e);
			}

	}public void update(long OrderID, Order order) {
		String sql = "UPDATE orders set orderID = ?,customerID= ? where order_date = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, order.getId());
			stmt.setInt(2, order.getCustomerId());
			stmt.setLong(3, OrderID);
			stmt.execute();
			System.out.println("Update complete");
		} catch (Exception e) {
			logger.info(e);
		}
	}





	@Override
	public void delete(Order t) {
		// TODO Auto-generated method stub
		
	}




}


