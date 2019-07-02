package com.musicstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.musicstore.model.Product;

public class ProductDaoImpl implements ProductDao {

	private List<Product> productList;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setProductname("Guitar ");
		p.setProductDescription("Played by popular Imagine Dragons Drummer");
		p.setProductPrice(19191.91);
		p.setProductCategory("Instrument");
		p.setProductCondition("Heavily Used");
		p.setProductManufacturer("Yamaha");
		p.setUnitsInStock(1);

		Product p1 = new Product();
		p1.setProductname("Speaker");
		p1.setProductDescription("This is a folk self speaker");
		p1.setProductPrice(251.91);
		p1.setProductCategory("Accessory");
		p1.setProductCondition("New");
		p1.setProductManufacturer("Folk");
		p1.setUnitsInStock(1);

		Product p2 = new Product();
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

}
