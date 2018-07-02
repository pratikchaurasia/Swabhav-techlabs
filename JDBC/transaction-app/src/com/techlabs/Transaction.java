package com.techlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction {
	
	public static void main(String args[]) {
		Connection conn = null;
		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:4040/techlabs?allowMultiQueries=true&"
							+ "user=root&password=root");
			ResultSet rs = null;
			System.out.println("Enter the Amount :");
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();

			conn.setAutoCommit(false);
			String query1 = "UPDATE CUSTOMER SET AMOUNT=AMOUNT-?";
			String query2 = "UPDATE MERCHANT SET AMOUNT=AMOUNT+?";

			
			PreparedStatement ps = conn.prepareStatement(query1);
			ps.setLong(1, amount);
			ps.execute();
			
			ps = conn.prepareStatement(query2);
			ps.setLong(1, amount);
			ps.execute();
			System.out.println("Transaction Successfull");
			conn.commit();
			String balance = "SELECT AMOUNT FROM CUSTOMER";
			ps = conn.prepareStatement(balance);
			rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("Your balance is : " +rs.getString("AMOUNT"));
			}
		} catch (Exception ex) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
