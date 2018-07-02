package com.techlabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TestConnection {
	public static void main (String args[]){

	Connection conn = null;
	
	try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost/techlabs?" +
	"user=root&password=root");
	System.out.println("Connected");
	System.out.println(conn.getClass());
	System.out.println(conn.getCatalog());
	
	} catch (SQLException ex) {
	// handle any errors
	System.out.println("SQLException: " + ex.getMessage());
	System.out.println("SQLState: " + ex.getSQLState());
	System.out.println("VendorError: " + ex.getErrorCode());
	}
	}
}
