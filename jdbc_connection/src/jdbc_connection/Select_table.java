package jdbc_connection;

import java.sql.*;

public class Select_table {
	
	public static void main(String[] args) throws SQLException {
		 String jdbcURL = "jdbc:mysql://localhost:3306/teachersdb";
		 String username = "root";
		 String pwd = "0911688327";
		 Connection connection = DriverManager.getConnection(jdbcURL,
		username, pwd);
		 Statement statement = connection.createStatement();
		 String query = "Select * from teachers";
		 ResultSet res = statement.executeQuery(query);
		 while(res.next()) {
		 int id = res.getInt("id");
		 String fname = res.getString("first_name");
		// String lname = res.getString("last_name");
		// String school = res.getString("school");
		 Date hire_date = res.getDate("hire_date");
		 double salary = res.getDouble("salary");
		 System.out.println("Teacher ID: " + id);
		 System.out.println("Teacher Name: " + fname);
		 System.out.println("Teacher Hire Date: " + hire_date);
		 System.out.println("Teacher Salary: " + salary);
		 System.out.println("...............");
		 }
		 res.close(); statement.close(); connection.close();
		 }

}
