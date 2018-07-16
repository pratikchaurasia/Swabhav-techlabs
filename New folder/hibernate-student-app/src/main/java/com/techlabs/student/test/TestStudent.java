package com.techlabs.student.test;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.student.Student;

public class TestStudent {
	static List<UUID> studentList;
	static Configuration config = new Configuration();

	static Transaction trans = null;

	static SessionFactory factory = config.configure().buildSessionFactory();
	

	public static void main(String args[]) {
		config.configure("hibernate.cfg.xml");
		//UUID id=UUID.fromString("0xC81B634F9964413BA666DF62694");
		//display();
		add();

	}

	public static void display(UUID uid) {
		Session session = factory.openSession();
		try {
			
			trans = session.beginTransaction();
			Query query = session
					.createQuery("SELECT s.id FROM Student s WHERE s.id=:uid");
			query.setParameter("uid", uid);
			
			System.out.println(query.uniqueResult());
			trans.commit();
		} catch (HibernateException e) {
			trans.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}
	public static void display() {
		Session session = factory.openSession();
		try {
			
			trans = session.beginTransaction();
			Query query = session
					.createQuery("select s.id from Student s");
			studentList=query.list();
			for(UUID student:studentList){
				System.out.println(student);
			}
		} catch (HibernateException e) {
			trans.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}

	public static void add() {
		Session session = factory.openSession();
		try {
			
			trans = session.beginTransaction();
			Student student = new Student();
			student.setId(UUID.randomUUID());
			System.out.println(student.getId());
			session.save(student);
			trans.commit();
		} catch (HibernateException ex) {
			trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

}
