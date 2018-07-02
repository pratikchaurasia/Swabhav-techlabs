package db.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class LoginRepository {
	private HashMap<String, String> users;
	private Connection conn = null;

	public HashMap<String, String> getCredential() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:4040/techlabs?"
							+ "user=root&password=root");
			ResultSet rs = null;
			String query = "Select * from loginCredentials";
			PreparedStatement ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			users=new HashMap<>();
			while (rs.next()) {
				users.put(rs.getString("username"), rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}

}
