package com.musicstore.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.musicstore.model.Product;

public class ProductDaoImpl implements ProductDao {

	private List<Product> productList;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setId("1");
		p.setProductname("Guitar ");
		p.setProductDescription("Played by popular Imagine Dragons");
		p.setProductPrice(19191.91);
		p.setProductCategory("Instrument");
		p.setProductCondition("Heavily Used");
		p.setProductManufacturer("Yamaha");
		p.setUnitsInStock(1);

		Product p1 = new Product();
		p1.setId("2");
		p1.setProductname("Speaker");
		p1.setProductDescription("This is a folk self speaker");
		p1.setProductPrice(251.91);
		p1.setProductCategory("Accessory");
		p1.setProductCondition("New");
		p1.setProductManufacturer("Folk");
		p1.setUnitsInStock(1);

		Product p2 = new Product();
		p2.setId("3");
		p2.setProductname("Record");
		p2.setProductDescription("Mix of hitlist of 20th Century");
		p2.setProductPrice(191.91);
		p2.setProductCategory("Record");
		p2.setProductCondition("New");
		p2.setProductManufacturer("Dolby");
		p2.setUnitsInStock(1);

		productList = new ArrayList();

		productList.add(p);
		productList.add(p1);
		productList.add(p2);
		return productList;
	}

	public Product getProductbyId(String id) throws IOException {
		// TODO Auto-generated method stub

		for (Product p : getAllProducts()) {
			if (p.getId().equals(id)) {
				return p;
			}
		}

		throw new IOException();
	}

}
