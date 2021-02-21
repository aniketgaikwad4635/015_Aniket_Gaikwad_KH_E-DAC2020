<%@page import="java.util.Arrays" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    List<String>list=Arrays.asList("Delhi","kolkata","Mumbai","Chennai");
    request.setAttribute("cityList",list);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP For Loop</h1>
<%
for(int i=0;i<list.size();i++)
{
	String str=list.get(i);
	%>
	<%if(i%2==0){ %>
	<div style="color:red"><%=str %></div>
	<%}
	else{%>
	<div style="color:green"><%= str %></div>

<% }%>
<%}%>
</body>
</html>