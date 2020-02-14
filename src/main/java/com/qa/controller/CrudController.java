package com.qa.controller;

import java.util.List;

/**
 * Create, Read, Update and Delete controller.
 * Takes in inputs for each action to be sent to a service class
 */

public interface CrudController<T> {
    
	List<T> readAll();
     
    void create();
     
    void update();
     
    void delete();

   
}
