package jdbc_connection;

import java.sql.*;

public class Create_table {
	
	public static void main(String[] args) throws SQLException {
		 String jdbcURL = "jdbc:mysql://localhost:3306/teachersdb";
		 String username = "root";
		 String pwd = "0911688327";
		 Connection connection = DriverManager.getConnection(jdbcURL,
		username, pwd);
		 Statement statement = connection.createStatement();
		 String query = "Select * from teachers";
		 String createTableSQL = "CREATE TABLE teacher1 (" +
		 "id int auto_increment primary key," +
		 "first_name varchar(255)," +
		 "last_name varchar(255)," +
		 "school varchar(255)," +
		 "hire_date date," +
		 "salary decimal(10, 2))";
		 statement.executeUpdate(createTableSQL);
		 System.out.println("Ttable ‘teachers’ created successfully.");
		 }

}
