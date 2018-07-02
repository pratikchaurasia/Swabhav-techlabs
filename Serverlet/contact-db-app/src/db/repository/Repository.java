package db.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.techlabs.contacts.model.Contact;

public class Repository {
	private Connection conn = null;
	private ResultSet result=null;
	private List<Contact> contactList;

	public List<Contact> display(){
		try{
			makeConnection();
			String query="select * from contact";
			
			PreparedStatement ps = conn.prepareStatement(query);
			result=ps.executeQuery();
			contactList=new ArrayList<Contact>();
			while (result.next()) {

				   contactList.add(new Contact(result.getString("id"),result.getString("name"),result.getString("email"),result.getString("number")));
				   
			}
		conn.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return contactList;
	}
	
	public void add(Contact contact){
		try{
			makeConnection();
			String query="INSERT INTO contact(id,name,email,number) " +"VALUES (?,?,?,?);";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,contact.getID());
			ps.setString(2,contact.getName());
			ps.setString(3,contact.getEmail());
			ps.setString(4,contact.getNumber());
			ps.execute();
			conn.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		}
	
	public void edit(String id,String name,String email,String number){
		try{
			makeConnection();
			String query="update contact set name=?, email=?, number=? where contact.id=?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,number);
			ps.setString(4,id);
			ps.execute();
			conn.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		}
	public Contact getContact(String id){
		Contact contact = null;
		try{
			makeConnection();
			String query="Select id,name,email,number from contact where contact.id=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,id);
			result=ps.executeQuery();
			while (result.next()) {

			contact=new Contact(result.getString("id"),result.getString("name"),result.getString("email"),result.getString("number"));
				   
			}
			conn.close();
		}
		catch(Exception exp){
			exp.printStackTrace();
		}
		return contact;
	}
	public void makeConnection() throws IOException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Properties prop = new Properties();
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream input = classLoader.getResourceAsStream("db/repository/app.config.properties");
			prop.load(input);
			String url=prop.getProperty("conn");
			conn=DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs = null;
		
	}

}

