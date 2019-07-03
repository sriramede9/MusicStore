package com.musicstore.dao;

import java.util.List;

import com.musicstore.model.Product;;

public interface ProductDao {

	List<Product> getAllProducts();

	Product getProductById(int id);

	void addProduct(Product product);
	
	void deleteProduct(Product product);
}
