<%@page import="java.util.Arrays" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    List<String>list=Arrays.asList("Delhi","Kolkata","Mumbai","Chennai");
    request.setAttribute("cityList",list);
    request.setAttribute("title","My Project");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP For Loop</h1>
<div>
<div>Using Expression Tag</div>
<%=request.getAttribute("title") %>
</div>
</body>
</html>