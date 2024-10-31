package jdbc_connection;

import java.sql.*;

public class Insert_data {
	
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
		 
		 // define SQL insert statements for each row of data
		 String[] insertStatements = {
		 "insert into teacher1(first_name, last_name, school, hire_date, salary) values('Aster', 'Nega', 'Yekatit 12', '2021-01-01', 8000)",
		 "insert into teacher1(first_name, last_name, school, hire_date, salary) values('Jemal', 'Edris', 'Bole', '2021-09-11', 20000)",
		 "insert into teacher1(first_name, last_name, school, hire_date, salary) values('Haile', 'Anaol', 'Saris', '2022-01-22', 15000)",
		 "insert into teacher1(first_name, last_name, school, hire_date, salary) values('Teddy', 'Anbesaw', 'Bole', '2021-01-01', 8000)"
		};
		 for(String stmt : insertStatements) {
		 statement.executeUpdate(stmt);
		 }
		 System.out.println("Data Inserted Successfullly.");
	}


}

