package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.mysql.jdbc.Statement;

public class TestStatement {
	public static void main(String args[]){
		
	
	Connection conn=null;
	
	try{
		conn=DriverManager.getConnection("jdbc:mysql://localhost/techlabs?" +
				"user=root&password=root");
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from dept");
		if(stmt.execute("select * from dept")){
			rs=stmt.getResultSet();
		}
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
		       for (int i = 1; i <= columnsNumber; i++) {
		          
		           String columnValue = rs.getString(i);
		           System.out.print(columnValue +"\t");
		       }
		       System.out.println("");
		}
		
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	}

}
