package com.techlabs.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entities.Account;
import com.techlabs.entities.User;

public class Test {
	private static Configuration conf = new Configuration();
	private static SessionFactory factory = conf.configure("hibernate.cfg.xml")
			.buildSessionFactory();
	public static void main(String args[]){
		Session session = factory.openSession();
		Transaction txn = null;
		
		Account acc=new Account();
		com.techlabs.entities.Transaction trans=new com.techlabs.entities.Transaction();
		Set<com.techlabs.entities.Transaction> transactions=new HashSet<>();
		Set<Account> accounts=new HashSet<>();
		
		User user=new User();
		user.setUsername("pratik");
		user.setPassword("111");
		user.setRole("U");
		
		user.setIsActive("Active");
		user.setLoginAttempts(0);
		
		acc.setBalance(1500);
		acc.setType("S");
		acc.setUser(user);
		accounts.add(acc);
		user.setAccounts(accounts);
		
		trans.setAcc(acc);
		trans.setAmount(acc.getBalance());
		trans.setDate(new Date());
		trans.setType("D");
		
		transactions.add(trans);
		acc.setTransaction(transactions);
		
		try {
			txn = session.beginTransaction();
			session.save(user);

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
