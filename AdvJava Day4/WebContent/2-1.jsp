<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    request.setAttribute("city","Nagar");
    request.setAttribute("id", 100);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Using  Expression Language.
<div>${requestScope.city}${requestScope.id}</div>
</body>
</html>