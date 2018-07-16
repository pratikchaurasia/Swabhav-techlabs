package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentRepository {
	@Autowired
	private SessionFactory factory;

	public StudentRepository() {
		// save();
		System.out.println("Repository created");
	}

	public void save() {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;

		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setFirstName("pratik");
		s1.setLastName("Chaurasia");
		s1.setAddress("Vasai");

		Student s2 = new Student();
		s2.setRollNo(2);
		s2.setFirstName("Prasad");
		s2.setLastName("Patik");
		s2.setAddress("Kalyan");

		Student s3 = new Student();
		s3.setRollNo(3);
		s3.setFirstName("Beulah");
		s3.setLastName("Alexander");
		s3.setAddress("Malad");

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		try {
			trans = sesion.beginTransaction();
			sesion.save(s1);
			sesion.save(s1);
			sesion.save(s1);
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
	}

	public List<Student> get() {
		List<Student> studentList = new ArrayList<>();

		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion.createQuery("from Student");
			studentList = query.list();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
		return studentList;
	}

	public void add(Student student) {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		try {
			trans = sesion.beginTransaction();
			sesion.save(student);
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
	}

	public void edit(int rollNo, String firstName, String lastName,
			String address) {

		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Student s1 = (Student) session.get(Student.class, rollNo);

			s1.setFirstName(firstName);
			s1.setLastName(lastName);
			s1.setAddress(address);
			session.save(s1);

			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void delete(int rollNo) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		System.out.println(factory.getClass());
		try {

			trans = session.beginTransaction();
			Student s1 = (Student) session.get(Student.class, rollNo);

			session.delete(s1);
			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	public Student getById(int rollNo) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		System.out.println(factory.getClass());
		Student student = null;
		try {

			trans = session.beginTransaction();
			student = (Student) session.get(Student.class, rollNo);
			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return student;
	}

}
