package com.techlabs.student;

import javax.management.Query;
import javax.transaction.SystemException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

import com.techlabs.student.Student;

public class StudentTest {
	private static List<Student> uuid;
	private static Configuration conf = new Configuration();
	private static SessionFactory factory = conf.configure("hibernate.cfg.xml")
			.buildSessionFactory();

	public static void main(String[] args) {

		System.out.println(factory.getClass());

		Student student = new Student();
		UUID uid = UUID.fromString("17a013db-9bbf-4a14-94c2-25f2989b0714");
		//addStudent(student);
		//update(uid);
		//delete(uid);
		display(uid);

	}

	public static void addStudent(Student student) {
		Session session = factory.openSession();
		Transaction txn = null;

		try {
			txn = session.beginTransaction();
			session.save(student);
			txn.commit();

		} catch (HibernateException ex) {
			if (txn != null)
				txn.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void display(UUID id) {

		Session session = factory.openSession();
		Transaction txn = null;
		System.out.println(factory.getClass());
		try {
			txn = session.beginTransaction();
			org.hibernate.Query query=session.createQuery("select id from Student where id=:uid");
			query.setParameter("uid", id);
			System.out.println(query.uniqueResult());
			txn.commit();

		} catch (HibernateException ex) {
			if (txn != null)
				txn.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
	public static void display() {

		Session session = factory.openSession();
		Transaction txn = null;
		System.out.println(factory.getClass());
		try {
			txn = session.beginTransaction();
			org.hibernate.Query query=session.createQuery("from Student");
			uuid=query.list();
			for(Student uid:uuid){
				System.out.println(uid.getId());
			}
			txn.commit();

		} catch (HibernateException ex) {
			if (txn != null)
				txn.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void update(UUID uid) {

		Session session = factory.openSession();
		Transaction txn = null;
		System.out.println(factory.getClass());
		try {
			txn = session.beginTransaction();
			Student s1 = (Student) session.get(Student.class, uid);

			//s1.setName("newName");
			session.save(s1);

			txn.commit();

		} catch (HibernateException ex) {
			if (txn != null)
				txn.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}