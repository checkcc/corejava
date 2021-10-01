package com.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.model.Status;
import com.demo.serviceimp.ProductServiceImpl;

//Pressing Shift-Alt-J on the method declaration gives: javac
/**
 * @author Mantha.chakradhar
 *
 */
@RestController
@Validated
public class ProductController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	// injecting the dependencies of product implementation
	@Autowired
	ProductServiceImpl service;

	// inserting product details like id ,name,manufacturer

	/**
	 * @param product
	 * @return
	 */
	@PostMapping("/addproductdetails")
	ResponseEntity<Product> addProductDetails(@Valid @RequestBody Product product) {
		LOGGER.info("inside ProductController.addProductDetails() method");
		Product prod = service.addProductDetails(product);
		LOGGER.info("demo of logger" + prod.getCategory());

		return new ResponseEntity<Product>(prod, HttpStatus.ACCEPTED);
	}

	/**
	 * @param product
	 * @param id
	 * @return
	 */
	@GetMapping("/getProductById/{id}")
	ResponseEntity<Optional<Product>> viewProductDetails(@Valid @RequestBody Product product, @PathVariable("") long id) {
		LOGGER.info("inside ProductController.getProductById(id); method");
		Optional<Product> prod = service.getProductById(id);
		return new ResponseEntity<>( HttpStatus.ACCEPTED);
	}

}
