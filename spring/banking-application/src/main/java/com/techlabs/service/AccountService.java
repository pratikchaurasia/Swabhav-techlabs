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
import com.techlabs.mail.Mailer;
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

	public void addNewAccount(User user) {
		user.setIsActive("Active");
		user.setLoginAttempts(0);
		user.setRole("U");
		user.setValidated("no");
		repo.newUser(user);
		Mailer.send(user.getEmail(), user.getUserId());
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

	public Set<Transaction> passbook(String firstName,String type) {
		
		User user=repo.getUserByName(firstName);
		for(Account acc:user.getAccounts()){
			if(acc.getType().equals(type)){
				return acc.getTransaction();
			}
		}
		return null;
	}

	

//	public boolean makeTransaction(String firstName, String type, double amount) {
//		return repo.transaction(firstName, type, amount);
//
//	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
//
//	public List<User> getUsers() {
//		return repo.getUsers();
//	}
//
//	public void changeStatus(String id) {
//		UUID uid = UUID.fromString(id);
//		repo.changeStatus(uid);
//	}
//
	public boolean checkLocked(String name) {
		if (repo.checkLocked(name)) {
			return true;
		}
		return false;
	}
//
//	public void remove(String id) {
//		UUID uid = UUID.fromString(id);
//		repo.remove(uid);
//	}
//
	public boolean checkAttempts(String userName) {
		if (repo.checkAttempts(userName)) {
			return true;
		}
		return false;
	}
//
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

	public void validateUser(UUID uid) {
		System.out.println("heloo");
		repo.validate(uid);
	}

	public boolean checkValidUser(String name, String password) {
		if(repo.checkValidUser(name,password)){
			return true;
		}
		return false;
	}

	public void createNewAccount(Account acc, String firstName) {
		Date date = new Date();
		Transaction transaction = new Transaction();
		User user=repo.getUserByName(firstName);
		Set<Account> accounts;
		if(user.getAccounts()==null){
			accounts=new HashSet<Account>();
		}
		else{
			accounts=user.getAccounts();
		}
		acc.setUser(user);
		accounts.add(acc);
		
		transaction.setAmount(acc.getBalance());
		transaction.setAcc(acc);
		transaction.setType("D");
		transaction.setDate(date);
		transactions.add(transaction);
		
		acc.setTransaction(transactions);
		user.setAccounts(accounts);
		
		repo.createNewAccount(acc);
	}

}