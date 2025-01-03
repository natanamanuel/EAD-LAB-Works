package com.itsc;

//import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	String query = "INSERT INTO books(TITLE,AUTHOR,PRICE) VALUES(?,?,?)";
	//DOGET End
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw= res.getWriter();
		
		//Set content type
		res.setContentType("text/html");
		
		//Get the book information
		String bookName = req.getParameter("title");
		String bookauthor = req.getParameter("author");
		float bookPrice = Float.parseFloat(req.getParameter("price"));
		//LOAD jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		
		// Generate the connection
		try(Connection con= DriverManager.getConnection("jdbc:mysql:///bookstoredb", "root", "0911688327");
				PreparedStatement ps = con.prepareStatement(query);){
			ps.setString(1, bookName);
			ps.setString(2, bookauthor);
			ps.setFloat(3, bookPrice);
			int count = ps.executeUpdate();
			if(count==1) {
				pw.println("<h2> Record is Registered Sucessfully</h2>");
			}else {
				pw.println("<h2> Record is not Registered Sucessfully</h2>");
			}
		}catch(SQLException se) {
			se.printStackTrace();
			pw.println("<h1>" +se.getMessage()+ "</h1>");
		}catch(Exception e) {
			pw.println("<h1>" +e.getMessage()+ "</h1>");
		}
		pw.println("<a href ='home.html'>Home</a>");
		pw.println("<br>");
		pw.println("<a href ='bookList'>Book List</a>");
	}
	//DOGET End
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}