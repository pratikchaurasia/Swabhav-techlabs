package com.techlabs.repository;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Account;
import com.techlabs.entity.User;

@Repository
public class BankRepository {
	@Autowired
	private SessionFactory factory;

	public BankRepository() {
		System.out.println("Repository created");
	}

	public void newUser(User user) {
		Session session = factory.openSession();
		Transaction trans = null;

		try {
			trans = session.beginTransaction();
			session.save(user);
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			session.close();
		}

	}

	public User checkLogin(String userName, String password) {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		User user = null;

		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion
					.createQuery("from User where username=:name and password=:password");
			query.setParameter("name", userName);
			query.setParameter("password", password);
			user = (User) query.uniqueResult();
			if (user != null) {
				user.setLoginAttempts(0);
				sesion.save(user);
			}
			trans.commit();
			return user;
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
		return user;
	}

	//
	public Boolean checkAttempts(String userName) {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		User user = null;

		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion
					.createQuery("from User where username=:name");
			query.setParameter("name", userName);
			user = (User) query.uniqueResult();
			if (user != null) {
				if (user.getLoginAttempts() > 3) {
					changeStatus(user.getUserId());
					return false;
				}
				user.setLoginAttempts(user.getLoginAttempts() + 1);
			}
			trans.commit();

		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();
		}
		return true;
	}

	//
	// public Account getAccountHistory(String firstName) {
	//
	// Session session = factory.openSession();
	// Transaction txn = null;
	// Account acc = null;
	// try {
	// txn = session.beginTransaction();
	// org.hibernate.Query query = session
	// .createQuery("from User where username=:name");
	// query.setParameter("name", firstName);
	// User user = (User) query.uniqueResult();
	// acc = user.getAccount();
	// txn.commit();
	//
	// } catch (HibernateException ex) {
	// if (txn != null)
	// txn.rollback();
	// ex.printStackTrace();
	// } finally {
	// session.close();
	// }
	// return acc;
	// }
	//
	// public boolean transaction(String firstName, String type, double amount)
	// {
	// Session session = factory.openSession();
	// Transaction txn = null;
	// Account acc = null;
	// boolean flag = false;
	// try {
	// txn = session.beginTransaction();
	// org.hibernate.Query query = session
	// .createQuery("from User where username=:name");
	// query.setParameter("name", firstName);
	// User user = (User) query.uniqueResult();
	// acc = user.getAccount();
	// if (type.equals("D")) {
	// acc.deposit(amount);
	// } else {
	// try {
	// acc.withdrawl(amount);
	// } catch (Exception e) {
	// return false;
	// }
	// }
	// com.techlabs.entity.Transaction trans = new
	// com.techlabs.entity.Transaction();
	// Date date = new Date();
	// trans.setAcc(acc);
	//
	// trans.setDate(date);
	// trans.setAmount(amount);
	// trans.setType(type);
	// Set<com.techlabs.entity.Transaction> transactions = acc
	// .getTransaction();
	// transactions.add(trans);
	// acc.setTransaction(transactions);
	// session.save(acc);
	// flag = true;
	// txn.commit();
	//
	// } catch (HibernateException ex) {
	// if (txn != null)
	// txn.rollback();
	// ex.printStackTrace();
	// } finally {
	// session.close();
	// }
	// return flag;
	//
	// }
	//
	// public List<User> getUsers() {
	// Session sesion = factory.openSession();
	// org.hibernate.Transaction trans = null;
	// List<User> users = null;
	//
	// try {
	// trans = sesion.beginTransaction();
	// org.hibernate.Query query = sesion
	// .createQuery("from User where role='U'");
	// users = query.list();
	// trans.commit();
	// } catch (HibernateException ex) {
	// ex.printStackTrace();
	// trans.rollback();
	//
	// } finally {
	// sesion.close();
	// }
	// return users;
	// }
	//
	public void changeStatus(UUID uid) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		try {

			trans = session.beginTransaction();
			User user = (User) session.get(User.class, uid);
			if (user.getIsActive().equals("Active")) {
				user.setIsActive("Locked");
			} else {
				user.setIsActive("Active");
			}
			session.save(user);
			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	//
	public boolean checkLocked(String name) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		try {
			trans = session.beginTransaction();
			org.hibernate.Query query = session
					.createQuery("from User where username=:name");
			query.setParameter("name", name);
			User user = (User) query.uniqueResult();
			if (user.getIsActive().equals("Locked")) {
				return true;
			}
			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

	//
	// public void remove(UUID uid) {
	// Session sesion = factory.openSession();
	// org.hibernate.Transaction trans = null;
	// try {
	// trans = sesion.beginTransaction();
	// User user = (User) sesion.get(User.class, uid);
	// sesion.delete(user);
	// trans.commit();
	// } catch (HibernateException ex) {
	// ex.printStackTrace();
	// trans.rollback();
	//
	// } finally {
	// sesion.close();
	// }
	// }

	public void validate(UUID uid) {
		Session session = factory.openSession();
		org.hibernate.Transaction trans = null;
		try {

			trans = session.beginTransaction();
			User user = (User) session.get(User.class, uid);
			user.setValidated("yes");
			session.save(user);
			trans.commit();

		} catch (HibernateException ex) {
			if (trans != null)
				trans.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	public boolean checkValidUser(String name, String password) {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		String valid;

		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion
					.createQuery("SELECT validated from User WHERE username =:name AND password =:password");

			query.setParameter("name", name);
			query.setParameter("password", password);
			valid = (String) query.uniqueResult();
			System.out.println(valid);
			trans.commit();
			if (valid.equals("no")) {
				return true;
			}
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();

		}
		return false;
	}

	public User getUserByName(String firstName) {
		Session sesion = factory.openSession();
		org.hibernate.Transaction trans = null;
		User user=null;
		try {
			trans = sesion.beginTransaction();
			org.hibernate.Query query = sesion
					.createQuery("from User where username=:name");
			query.setParameter("name", firstName);
			user = (User) query.uniqueResult();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			sesion.close();

		}
		return user;
	}

	public void createNewAccount(Account acc) {
		Session session = factory.openSession();
		Transaction trans = null;

		try {
			trans = session.beginTransaction();
			session.save(acc);
			trans.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			trans.rollback();

		} finally {
			session.close();
		}

	}

}
