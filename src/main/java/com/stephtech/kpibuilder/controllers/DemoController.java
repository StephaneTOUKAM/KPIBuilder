package com.stephtech.kpibuilder.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stephtech.kpibuilder.helpers.ModelHelper;

@RestController
@RequestMapping("/article")
public class DemoController {
	
	@Autowired
	private ModelHelper modelHelper;
	
	private static Logger logger = Logger.getLogger("DemoController");

	@SuppressWarnings("unchecked")
	@GetMapping("all")
	public <T> List<T> getAllData() throws ClassNotFoundException {
		
		var modelClass = modelHelper.getClassFromModelName("article");
		
		var jpaRepository = modelHelper.getRepositoryFromClass(modelClass);

	    List<?> allEntities = jpaRepository.findAll();
	    List<T> allElements = new ArrayList<>();
	    allEntities.forEach(item -> {
	        allElements.add((T) item);
	    });
	    
	    logger.log(Level.INFO, "allElements::: ", allElements);

	    return allElements;
	}
	
}
