<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    String email=request.getParameter("email");
    String mobile=request.getParameter("mobile");
    
    String db_driver="com.mysql.cj.jdbc.Driver";
    String db_url="jdbc:mysql://localhost/edac";
    String db_user="root";
    String db_password="edac2020";
    Class.forName(db_driver);
    
    Connection con=DriverManager.getConnection(db_url,db_user,db_password);
    String sql="INSERT INTO USER(USERNAME,PASSWORD,EMAIL,MOBILE)VALUES(?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setString(1,username);
    ps.setString(2,password);
    ps.setString(3,email);
    ps.setString(4,mobile);
    ps.executeUpdate();
    con.close();
    %>
    
