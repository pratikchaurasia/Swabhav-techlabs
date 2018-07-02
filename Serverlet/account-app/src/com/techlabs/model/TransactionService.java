package com.techlabs.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.repository.BankRepository;

public class TransactionService {
	private List<Transaction> transactionList;
	BankRepository repo = new BankRepository();

	private static TransactionService service;

	static {
		service = new TransactionService();
	}

	public static TransactionService getInstance() {
		return service;
	}

	public TransactionService() {
		transactionList = new ArrayList<Transaction>();

		// contactList.add(new
		// Contact("pratik","pratik@gmail.com","7507587701"));

	}

	public List<Transaction> getTransactions(String user) {
		transactionList = repo.display(user);
		if (!(transactionList.isEmpty())) {
			return transactionList;
		}
		return null;
	}

	public Boolean transaction(String user, String type, String amount) throws IOException, SQLException {
		if (repo.transaction(user, type, amount)) {
			return true;
		}
		return false;
	}
}
