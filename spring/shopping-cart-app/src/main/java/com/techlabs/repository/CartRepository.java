package com.techlabs.repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Customer;
import com.techlabs.entity.Orders;
import com.techlabs.entity.Product;

@Repository
public class CartRepository {
	@Autowired
	private SessionFactory factory;

	public CartRepository() {
		// save();
		System.out.println("Repository created");
	}

	public List<Product> getProducts() {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		List<Product> productList = null;

		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion.createQuery("from Product");
			productList=query.list();
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
		return productList;
	}
	public Product getById(UUID id) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		Product product = null;
		try {

			trans = session.beginTransaction();
			product = (Product) session.get(Product.class, id);
			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return product;
	}
	public List<Customer> getCustomers() {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		List<Customer> users = null;

		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion.createQuery("from Customer");
			users=query.list();
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
		return users;
	}

	public void saveOrder(Customer c) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		List<Customer> users = null;

		try {
			trans = session.beginTransaction();
			Customer customer = (Customer) session.get(Customer.class, c.getCustid());
			customer.setOrders(c.getOrders());
			session.save(customer);
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			session.close();
		}
	}

	public Customer history(Customer c) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		Customer customer = null;
		try {
			trans = session.beginTransaction();
			customer = (Customer) session.get(Customer.class, c.getCustid());
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			session.close();
		}
		return customer;
	}

}
