package com.musicstore.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicstore.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private List<Product> productList;

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public List<Product> getAllProducts() {

		List<Product> loadAll = hibernateTemplate.loadAll(Product.class);
		return loadAll;
	}

	@Transactional
	public Product getProductById(String id) {
		// TODO Auto-generated method stub

		Product product = hibernateTemplate.get(Product.class, id);

		return product;
	}

	@Transactional
	public void addProduct(Product product) {
		// TODO Auto-generated method stub

		hibernateTemplate.saveOrUpdate(product);
	}

	@Transactional
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub

		hibernateTemplate.delete(product);

	}

}
