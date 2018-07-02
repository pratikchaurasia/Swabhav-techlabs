package com.techlabs;

import java.sql.DriverManager;



public class Connection {
	public static void main(String arg[]) {
		java.sql.Connection con=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:58895;DatabaseName=swabhav;integratedSecurity=true");
			System.out.println("Connected");
			System.out.println(con);
			System.out.println(con.getCatalog());
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}
}
