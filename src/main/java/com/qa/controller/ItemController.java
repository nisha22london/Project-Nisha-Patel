package com.qa.controller;

import org.apache.log4j.Logger;


import com.qa.persistence.domain.Item;

import com.qa.services.CrudServices;
import com.qa.services.Itemservice;
import com.qa.utils.Utils;

	public class ItemController implements CrudController<Item>{

		public static final Logger LOGGER = Logger.getLogger(CustomerController.class);
		
		private CrudServices<Item> ItemService;
		
		public ItemController(Itemservice itemServices) {
			this.ItemService = itemServices;
		}
		
		public void readAll() {
			for(Item item: ItemService.readAll()) {
				LOGGER.info(item.toString());
			}
		}

		public void create() {
			LOGGER.info("Please enter a Item ID number");
			String ItemID = Utils.getInput();
			long longg = Long.parseLong(ItemID);
			LOGGER.info("Please enter your name");
			String name = Utils.getInput();
		ItemService.create(new Item(longg,name));
			LOGGER.info("Item created");
		}

		public void update() {
			LOGGER.info("Please enter Item ID number");
			String ItemID = Utils.getInput();
			long longg = Long.parseLong(ItemID);
			LOGGER.info("Please enter Item ID");
			String name = Utils.getInput();
		ItemService.create(new Item(longg,name));
			LOGGER.info("Item updated");
			
			
		}

		public void delete() {
			LOGGER.info("Please enter ID ");
			long id = Long.valueOf(Utils.getInput());
			String name = Utils.getInput();
			ItemService.delete(new Item(id, name));
			LOGGER.info("order deleted");
			
			
		}
		
	} 




