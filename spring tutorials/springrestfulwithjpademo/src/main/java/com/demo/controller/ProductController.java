package com.demo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.model.Status;
import com.demo.serviceimp.ProductServiceImpl;

@RestController
@Validated
public class ProductController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
  //injecting the dependencies of product implementation
	@Autowired
	ProductServiceImpl service;

	//inserting product details like id ,name,manufacturer
	
	@PostMapping("/addproductdetails")
	ResponseEntity<Product> addProductDetails(@Valid @RequestBody Product product) {
		LOGGER.info("inside ProductController.addProductDetails() method");
		Product prod = service.addProductDetails(product);
		LOGGER.info("demo of logger"+prod.getCategory());
		
		
		return new  ResponseEntity<Product>(prod,HttpStatus.ACCEPTED);
	}
}
