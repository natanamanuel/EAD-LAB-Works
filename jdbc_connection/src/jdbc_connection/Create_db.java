package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_db {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root"; //your username
		String password = "0911688327"; //your password
		Class.forName(driver); //optional
		Connection conn = DriverManager.getConnection(url, 
		username, password);
		System.out.println("Established Connection");
		
		// Create a statement
		 Statement statement = conn.createStatement();
		 // Execute the SQL query to create the new database
		 String databaseName = "";
		 String createDatabaseSQL = "CREATE DATABASE " + databaseName;
		 statement.executeUpdate(createDatabaseSQL); 
		 System.out.println("Database '" + databaseName + "' created successfully.");
		 // close resources
		 statement.close();
		 conn.close();
		 

		
	}

}
