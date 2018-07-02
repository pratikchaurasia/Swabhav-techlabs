package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class TestSQLInjection {
	public static void main(String args[]) {
		Connection conn = null;
		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:4040/techlabs?allowMultiQueries=true&"
							+ "user=root&password=root");
			java.sql.Statement stmt = null;
			ResultSet rs = null;

			stmt = conn.createStatement();
			System.out.println("Enter the Dept No");
			Scanner sc=new Scanner(System.in);
			String deptNo=sc.nextLine();
			
			stmt.executeQuery("select * from dept where deptno="+deptNo);
			rs = stmt.getResultSet();
			while (rs.next()) {
					System.out.print(rs.getString("deptno"));
					System.out.print(rs.getString("dname"));
					System.out.println(rs.getString("loc"));
					
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
