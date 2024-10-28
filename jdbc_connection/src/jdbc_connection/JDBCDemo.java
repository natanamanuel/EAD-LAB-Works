package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root"; //your username
		String password = "0911688327"; //your password
		Class.forName(driver); //optional
		Connection conn = DriverManager.getConnection(url, 
		username, password);
		System.out.println("Established Connection");
		
	}

}
