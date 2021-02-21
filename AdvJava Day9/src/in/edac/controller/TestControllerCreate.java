package in.edac.controller;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.edac.dao.UserDao;

@WebServlet("/test-user")
public class TestControllerCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		try {
			
			
		String un=request.getParameter("USERNAME");
		String em=request.getParameter("EMAIL");
		String mob=request.getParameter("MOBILE");
		
		String DB_DRIVER="com.mysql.cj.jdbc.Driver";
		String DB_URL="jdbc:mysql://localhost:3306/PROJECT";
		String DB_USER="root";
		String DB_PASSWORD="edac20";
				
		
		Class.forName(DB_DRIVER);
		Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		String sql = "INSERT INTO USER (USERNAME, EMAIL,MOBILE) VALUES (?, ?, ?)";
		PreparedStatement ps =  con.prepareStatement(sql);
		ps.setString(1, un);
		ps.setString(2, em);
		ps.setString(3, mob);
		ps.executeUpdate();
		
		request.getRequestDispatcher("success.jsp").forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}
