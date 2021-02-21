<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
    String city=(String) request.getAttribute("city");
    int id = (Integer)request.getAttribute("id");
    List<String>list=(List<String>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div><%=city %><%=id %>
	</body>
</html>