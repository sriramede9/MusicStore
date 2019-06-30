package com.musicstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.musicstore.model.Product;

public class ProductDaoImpl implements ProductDao {

	private List<Product> productList;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setProductname("Drums");
		p.setProductDescription("Played by popular Imagine Dragons Drummer");
		p.setProductPrice(19191.91);
		p.setProductCategory("Instrument");
		p.setProductCondition("Heavily Used");
		p.setProductManufacturer("Yamaha");
		p.setUnitsInStock(1);

		productList = new ArrayList();

		productList.add(p);

		return productList;
	}

}
