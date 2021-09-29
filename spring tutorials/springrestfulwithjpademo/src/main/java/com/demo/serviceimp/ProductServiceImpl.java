package com.demo.serviceimp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jparepositories.ProductRepository;
import com.demo.model.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	//dependency injection  busines logic class
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProductDetails(Product product) {
				
		Product productdetails = productRepository.save(product);
		
		return productdetails;
	}

	@Override
	public ArrayList<Product> ListOfProducts(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProductById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOfProductById(long id) {
		// TODO Auto-generated method stub
		
	}

}
