package com.musicstore.dao;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musicstore.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public List<Product> getAllProducts() {

		List<Product> loadAll = hibernateTemplate.loadAll(Product.class);
		return loadAll;

	}

	@Transactional
	public Product getProductById(int id) {
		// TODO Auto-generated method stub

		Product product = hibernateTemplate.get(Product.class, id);

		return product;
	}

	@Transactional(readOnly = false)
	public void addProduct(Product product) {

		hibernateTemplate.setCheckWriteOperations(false);

		// hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);

		System.out.println("product object received" + product);

		hibernateTemplate.save(product);

		// hibernateTemplate.getSessionFactory().getCurrentSession().getTransaction().commit();

		hibernateTemplate.flush();

	}

	@Transactional
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub

		Product product = hibernateTemplate.get(Product.class, id);
		hibernateTemplate.setCheckWriteOperations(false);
		hibernateTemplate.delete(product);

	}

//	@Autowired
//	private SessionFactory sessionFactory;
//
//	public void addProduct(Product product) {
//		Session session = sessionFactory.getCurrentSession();
//		session.saveOrUpdate(product);
//		session.flush();
//	}
//
//	public Product getProductById(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		Product product = (Product) session.get(Product.class, id);
//		session.flush();
//
//		return product;
//	}
//
//	public List<Product> getAllProducts() {
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createQuery("from Product");
//		List<Product> products = query.list();
//		session.flush();
//
//		return products;
//	}
//
//	public void deleteProduct(int id) {
//		Session session = sessionFactory.getCurrentSession();
//		session.delete(getProductById(id));
//		session.flush();
//	}

}
