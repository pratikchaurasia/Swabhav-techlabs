package db.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class LoginRepository {
	private HashMap<String, String> users;
	private Connection conn = null;

	public HashMap<String, String> getCredential() throws IOException {
		try {
			MakeConnection makeConnection=new MakeConnection();
			java.sql.Connection conn=makeConnection.makeConnection();
			ResultSet rs = null;
			String query = "SELECT NAME,PASSWORD FROM BANK_MASTER";
			PreparedStatement ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			users=new HashMap<>();
			while (rs.next()) {
				users.put(rs.getString("NAME"), rs.getString("PASSWORD"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}

}
