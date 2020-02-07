package com.cms.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cms.deloitte.dao.ProductDAO;
import com.cms.deloitte.model.Product;

public class ProductDAOImpl implements ProductDAO{
	
	AnnotationConfiguration configuration;
	SessionFactory factory;
	
	public ProductDAOImpl() {
		configuration = new AnnotationConfiguration().configure();
		factory = configuration.buildSessionFactory();
	}

	@Override
	public boolean addProduct(Product product) {
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(product);
		transaction.commit();
		session.close();
		
		return false;
		
	}

	@Override
	public boolean updateProduct(Product product) {
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(product);
		transaction.commit();
		session.close();
		
		return true;
	}

	/*@Override
	public boolean deleteCustomer(int customerId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		
		session.delete(customer);
		transaction.commit();
		session.close();
		
		return true;
	}

	@Override
	public List<Customer> listCustomers() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Customer");
		return query.list();
	}

	@Override
	public Customer findCustomer(int customerId) {
		Session session = factory.openSession();
		Customer customer= (Customer) session.get(Customer.class, customerId);
		session.close();
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session = factory.openSession();
		Customer customer= (Customer) session.get(Customer.class, customerId);
		session.close();
		if(customer == null)
			return false;
		else
			return true;
	}
*/

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isProductExists(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
