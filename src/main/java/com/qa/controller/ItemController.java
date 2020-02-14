package com.qa.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Item;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;

public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = Logger.getLogger(CustomerController.class);

	private CrudServices<Item> itemService;

	public ItemController(CrudServices<Item> itemService) {
		this.itemService = itemService;
	}

	public List<Item> readAll() {
		List<Item> items = itemService.readAll();
		for (Item item : items) {
			LOGGER.info(item.toString());
		}
		return items;
	}

	public void create() {
		LOGGER.info("Please enter a Item ID number");
		String ItemID = Utils.getInput();
		long longg = Long.parseLong(ItemID);
		LOGGER.info("Please enter your name");
		String name = Utils.getInput();
		LOGGER.info("Item created");
		itemService.create(new Item(longg, name));
	}

	public void update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long ItemID = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter Item name");
		String name = Utils.getInput();
		LOGGER.info("Please enter Item value");
		Long value = Long.getLong(Utils.getInput());
		itemService.update(ItemID, new Item(value, name));
		LOGGER.info("Item updated");
	}

	public void delete() {
		LOGGER.info("Please enter ID ");
		long id = Long.valueOf(Utils.getInput());
		String name = Utils.getInput();
		itemService.delete(id);
		LOGGER.info("order deleted");
	}

}
