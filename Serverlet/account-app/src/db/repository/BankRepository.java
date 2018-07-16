package db.repository;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.techlabs.model.Account;
import com.techlabs.model.Transaction;

public class BankRepository {
	private List<Transaction> transactionList;

	public List<Transaction> display(String user) {
		try {
			MakeConnection makeConnection = new MakeConnection();
			java.sql.Connection conn = makeConnection.makeConnection();

			String query = "select * from BANK_TRANSACTION where NAME=? ";
			ResultSet result = null;
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user);
			result = ps.executeQuery();
			transactionList = new ArrayList<Transaction>();
			while (result.next()) {
				transactionList.add(new Transaction(result.getString("name"),
						result.getString("amount"), result.getString("type"),
						result.getString("date")));
			}
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return transactionList;
	}

	public void newAccount(Account acc) throws IOException, SQLException {
		MakeConnection makeConnection = new MakeConnection();
		java.sql.Connection conn = makeConnection.makeConnection();
		try {
			System.out.println("inside repo");
			conn.setAutoCommit(false);
			String query = "INSERT INTO BANK_MASTER VALUES (?,?,?);";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, acc.getName());
			ps.setString(2, acc.getPassword());
			ps.setString(3, acc.getBalance());
			ps.execute();
			String type = "D";
			query = "INSERT INTO BANK_TRANSACTION VALUES (?,?,?,NOW());";

			ps = conn.prepareStatement(query);
			ps.setString(1, acc.getName());
			ps.setString(2, acc.getBalance());
			ps.setString(3, type);
			ps.execute();
			conn.commit();
			conn.close();
		} catch (SQLException ex) {
			conn.rollback();
			ex.printStackTrace();
		}
	}

	public Boolean transaction(String user, String type, String amount)
			throws Exception {
		// TODO Auto-generated method stub
		MakeConnection makeConnection = new MakeConnection();
		java.sql.Connection conn = makeConnection.makeConnection();
		try {
			
			conn.setAutoCommit(false);
			String query = "INSERT INTO BANK_TRANSACTION VALUES (?,?,?,NOW());";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, amount);
			ps.setString(3, type);
			ps.execute();

			if (type.equals("D")) {
				query = "UPDATE BANK_MASTER SET BALANCE=BALANCE+? WHERE NAME=?;";
			} else {
				query = "UPDATE BANK_MASTER SET BALANCE=BALANCE-? WHERE NAME=?;";
			}
			ps = conn.prepareStatement(query);
			ps.setDouble(1, Double.parseDouble(amount));
			ps.setString(2, user);
			ps.execute();
			conn.commit();
			conn.close();
			return true;
		} catch (SQLException ex) {
				conn.rollback();
				throw new Exception(ex.getMessage());
			
		}

	}

}
