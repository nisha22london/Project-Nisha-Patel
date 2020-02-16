package com.qa.persistence.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.controller.ItemController;
import com.qa.persistence.domain.Item;
import com.qa.utils.Config;

public class ItemDaoMysql implements Dao<Item> {
	public static final Logger logger = Logger.getLogger(ItemController.class);

	private Connection connection;

	public List<Item> readAll() {
		
		ArrayList<Item> items = new ArrayList<Item>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from items");
			while (resultSet.next()) {
				
				Long ItemID = resultSet.getLong("itemID");
				String name = resultSet.getString("name");
				Long qty = resultSet.getLong("qty");
				Double price = resultSet.getDouble("price");
				items.add(new Item(ItemID, name, qty, price));
				logger.info("The item table has been read");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			}
		return items;
	}

	public void create(Item item) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into items(name,qty,price) values('" + item.getName() + "','" + item.getQuantiy() + "','" + item.getValue() + "')");
		} catch (Exception e) {
			e.printStackTrace();
			}
	
		}


	public void delete(long itemID) {
		String sql = "DELETE FROM items WHERE itemID = ?";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)){
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, itemID);
			stmt.execute();
			logger.info("Delete complete");
		} catch (Exception e) {
			e.printStackTrace();
		
		}

	}

	public void update(long id, Item item) {
		String sql = "UPDATE items set name = ?, qty = ?, price = ? where itemID = ?";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.228.88.14:3306/custdb",
				Config.username, Config.password)){
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, item.getName());
			stmt.setLong(2, item.getQuantiy());
			stmt.setDouble(3, item.getValue());
			stmt.setLong(4, id);
			stmt.execute();
			logger.info("Update complete");
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		}
	
}
