package com.techlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SQLInjectionSolution {
	public static void main(String args[]) {
		Connection conn = null;
		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:4040/techlabs?allowMultiQueries=true&"
							+ "user=root&password=root");
			ResultSet rs = null;

			System.out.println("Enter the Dept No");
			Scanner sc=new Scanner(System.in);
			String deptNo=sc.nextLine();
			
			String query="select * from dept where deptno=?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, deptNo);
			rs=ps.executeQuery();
			
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
