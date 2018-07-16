package com.techlabs.department.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.department.Department;
import com.techlabs.employee.Employee;

public class OneToManyTest {
	private static Configuration conf = new Configuration();
	private static SessionFactory factory = conf.configure("hibernate.cfg.xml")
			.buildSessionFactory();

	public static void main(String[] args) {
		
		Session sesion=factory.openSession();
		org.hibernate.Transaction trans=null;
		
		Department dept=new Department();
		dept.setName("Comps");
		Set<Employee> employee=new HashSet<Employee>();
		
		Employee emp1=new Employee();
		emp1.setEname("pratik");
		emp1.setDept(dept);
		
		Employee emp2=new Employee();
		emp2.setEname("himu");
		emp2.setDept(dept);
		
		employee.add(emp1);
		employee.add(emp2);
		
		dept.setEmployee(employee);
		
		try{
			trans=sesion.beginTransaction();
			sesion.save(dept);
			trans.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			trans.rollback();
			
		}finally{
			sesion.close();
		}
		
	}
}
