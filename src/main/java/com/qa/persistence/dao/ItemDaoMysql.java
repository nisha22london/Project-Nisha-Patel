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
import com.qa.persistence.domain.Item;
import com.qa.utils.Config;

public class ItemDaoMysql implements Dao<Item> {
	public static final Logger logger = Logger.getLogger(CustomerController.class);

	private Connection connection;

	public List<Item> readAll() {
		ArrayList<Item> items = new ArrayList<Item>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from ItemID");
			while (resultSet.next()) {
				Long ItemID = resultSet.getLong("ItemID");
				String name = resultSet.getString("name");
				long qtd = resultSet.getLong("qtd");
				float price = resultSet.getFloat("price");
				Item ItemIDA = new Item(ItemID, name, price, qtd);
				items.add(ItemIDA);
			}
		} catch (Exception e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				logger.debug(ele);
			}
			logger.error(e.getMessage());
		}
		return items;
	}

	public void create(Item item) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			statement.executeUpdate(
					"insert into items(itemID,name,qtd) values('" + item.getId() + "','" + item.getName() + "')");
		} catch (Exception e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				logger.debug(ele);
			}
			logger.error(e.getMessage());
		}

	}

	public void delete(long ItemID) {
		String sql = "DELETE FROM item WHERE ItemID = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, ItemID);
			stmt.execute();
			System.out.println("Delete complete ");
			connection.close();
		} catch (Exception e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				logger.debug(ele);
			}
			logger.error(e.getMessage());
		}

	}

	public void update(long id, Item item) {
		String sql = "UPDATE item set itemID = ?,name = ? where qtd = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, item.getId());
			stmt.setString(2, item.getName());
			stmt.setLong(3, id);
			stmt.execute();
			System.out.println("Update complete");
		} catch (Exception e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				logger.debug(ele);
			}
			logger.error(e.getMessage());
		}
	}
}
