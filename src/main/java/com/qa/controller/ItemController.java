package com.qa.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Item;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;

public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = Logger.getLogger(ItemController.class);

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
		LOGGER.info("Please enter a item name");
		String name = Utils.getInput();
		LOGGER.info("Please enter a item quantity");
		Long quantity = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter a item value");
		Double value = Double.valueOf(Utils.getInput());
		itemService.create(new Item(name, quantity, value));
		LOGGER.info("Item created");
	}

	public void update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long ItemID = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter Item name");
		String name = Utils.getInput();
		LOGGER.info("Please enter a item quantity");
		Long quantity = Long.valueOf(Utils.getInput());
		LOGGER.info("Please enter Item value");
		Double value = Double.valueOf(Utils.getInput());
		itemService.update(ItemID, new Item(name, quantity, value));
		LOGGER.info("Item updated");
	}

	public void delete() {
		LOGGER.info("Please enter ID ");
		long itemID = Long.valueOf(Utils.getInput());
		itemService.delete(itemID);
		LOGGER.info("Item deleted");
	}

}
