package com.itsc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class DBConnectionManager {
	
	public static void main(String[] args) throws SQLException {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/bookstoredb";
		String username = "root";
		String pwd = "0911688327";
		
		Connection connection = DriverManager.getConnection (jdbcURL, username, pwd);
		
		connection.close();
	}
}
