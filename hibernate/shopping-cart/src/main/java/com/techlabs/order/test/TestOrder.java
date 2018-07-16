package com.techlabs.order.test;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.lineitem.LineItem;
import com.techlabs.order.Orders;
import com.techlabs.product.Product;

public class TestOrder {

	private static Configuration conf = new Configuration();
	private static SessionFactory factory = conf.configure("hibernate.cfg.xml").buildSessionFactory();
	public static void main(String[] args) {
		
		Session sesion=factory.openSession();
		org.hibernate.Transaction trans=null;
		
		Product p1=new Product();
		p1.setName("Mi note 4");
		p1.setPrice(10000);
		
		Product p2=new Product();
		p2.setName("Mi note 3");
		p2.setPrice(9000);
		
		Product p3=new Product();
		p3.setName("iphone X");
		p3.setPrice(69000);
		
		Orders order=new Orders();
		LineItem item1=new LineItem();
		item1.setProduct(p1);
		item1.setQuantity(2);
		item1.calculateItemCost();
		item1.setOrder(order);
		
		LineItem item2=new LineItem();
		item2.setProduct(p3);
		item2.setQuantity(3);
		item2.calculateItemCost();
		item2.setOrder(order);
		
		
		order.setDate(Calendar.getInstance().getTime());
		
		
		Set<LineItem> item=new HashSet<LineItem>();
		item.add(item1);
		item.add(item2);
		order.setItems(item);
		order.checkoutPrice();
		
		try{
			trans=sesion.beginTransaction();
			sesion.save(p1);
			sesion.save(p2);
			sesion.save(p3);
			//sesion.save(item1);
			//sesion.save(item2);
			//sesion.save(item);
			sesion.save(order);
			trans.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			trans.rollback();
			
		}finally{
			sesion.close();
		}
	}
}
