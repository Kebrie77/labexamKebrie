package jDBC;
import java.sql.*;
public class StudentRepo {
	public static void main(String[] args) throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String pwd = "Yabsera1184";
		 try { 
			 // Establish a connection to the MySQL server 
			 Connection connection = DriverManager.getConnection  (url, username, password); 
			 // Create a statement 
			 Statement statement = connection.createStatement();  // Execute the SQL query to create the new database  String createDatabaseSQL = "CREATE DATABASE " + databaseName;  statement.executeUpdate(createDatabaseSQL);  
			 System.out.println("Database '" + databaseName + "' created  successfully."); 
			 // close resources 
			 statement.close(); 
			 connection.close(); 
			 } catch (Exception e) {
			 e.printStackTrace(); 
			 } 
			 } 
			} 


