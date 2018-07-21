package com.techlabs.service;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.captcha.VerifyRecaptcha;
import com.techlabs.entity.Account;
import com.techlabs.entity.Transaction;
import com.techlabs.entity.User;
import com.techlabs.repository.BankRepository;

@Service("serviceSVC")
public class AccountService {

	@Autowired
	private BankRepository repo;
	private Set<Transaction> transactions = new HashSet<>();
	private String role;

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void addNewAccount(User user, double balance) {
		Date date = new Date();
		Account acc = new Account();
		acc.setBalance(balance);
		Transaction transaction = new Transaction();
		transaction.setType("D");
		transaction.setDate(date);
		transactions.add(transaction);
		acc.setTransaction(transactions);
		repo.newAccount(user, acc, transaction);
	}

	public boolean checkUser(String name, String password) {
		User user = repo.checkLogin(name, password);
		System.out.println(user);
		if (user != null) {
			setRole(user.getRole());
			return true;
		}
		System.out.println("inside");
		return false;
	}

	public Set<Transaction> passbook(String firstName) {
		Account acc = repo.getAccountHistory(firstName);
		transactions = acc.getTransaction();
		return transactions;
	}

	

	public boolean makeTransaction(String firstName, String type, double amount) {
		return repo.transaction(firstName, type, amount);

	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public List<User> getUsers() {
		return repo.getUsers();
	}

	public void changeStatus(String id) {
		UUID uid = UUID.fromString(id);
		repo.changeStatus(uid);
	}

	public boolean checkLocked(String name) {
		if (repo.checkLocked(name)) {
			return true;
		}
		return false;
	}

	public void remove(String id) {
		UUID uid = UUID.fromString(id);
		repo.remove(uid);
	}

	public boolean checkAttempts(String userName) {
		if (repo.checkAttempts(userName)) {
			return true;
		}
		return false;
	}

	public boolean verifyCaptcha(String gRecaptchaResponse) {
		try {
			if (VerifyRecaptcha.verify(gRecaptchaResponse)) {
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}