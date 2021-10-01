package com.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.model.Product;

public interface ProductService {

	// add for product
	Product addProductDetails(Product product);

	// list of all products

	ArrayList<Product> ListOfProducts(Product product);

	// Delete of Product

	void deleteProductById(long id);

	// view of particular Product by id

     Optional<Product> getProductById(long id);

	// update of particular Product by id

	void updateOfProductById(long id);

}
