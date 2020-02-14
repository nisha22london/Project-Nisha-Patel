package com.qa.services;

import java.util.List;

import com.qa.persistence.dao.Dao;
import com.qa.persistence.domain.Item;

public class Itemservice implements CrudServices<Item> {
	
	Dao<Item>  itemDao;
	
	public Itemservice(Dao<Item> itemDao) {
		this.itemDao = itemDao;
	}

	public void create(Item item) {
		itemDao.create(item);
	}

	public void update(long id, Item item) {
		itemDao.update(id, item);
	}
	
	@Override
	public List<Item> readAll() {
		return itemDao.readAll();
	}

	@Override
	public void delete(long t) {
		itemDao.delete(t);
		
	}
}
