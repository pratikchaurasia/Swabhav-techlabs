package com.techlabs.product.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.product.Product;

public class TestProduct {
	
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
		
		try{
			trans=sesion.beginTransaction();
			sesion.save(p1);
			sesion.save(p2);
			sesion.save(p3);
			trans.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			trans.rollback();
			
		}finally{
			sesion.close();
		}
	}
}
