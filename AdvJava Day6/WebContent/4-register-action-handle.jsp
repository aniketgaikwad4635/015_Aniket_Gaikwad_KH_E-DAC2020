<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	
	 String db_driver = "com.mysql.cj.jdbc.Driver";
	 String db_url = "jdbc:mysql://192.168.64.5:3306/edac";
	 String db_user = "mysql";
	 String db_password = "mysql";
	 
 	 Class.forName(db_driver);
 	 
 	 Connection con = DriverManager.getConnection(db_url, db_user, db_password);
	 
 	 String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL, MOBILE) VALUES (?, ?, ?, ?)";
 	 PreparedStatement ps = con.prepareStatement(sql);
 	 ps.setString(1, username);
 	 ps.setString(2, password);
 	 ps.setString(3, email);
 	 ps.setString(4, mobile);
 	 
 	 ps.executeUpdate();
 	 
 	 con.close();
 	 
 	 request.setAttribute("operation", "1");
%>    
    
<jsp:forward page="4-register-ui.jsp"></jsp:forward> 
