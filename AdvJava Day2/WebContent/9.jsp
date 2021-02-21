<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Condition in jsp</h1>
<%
String message="horray!!";
boolean checkFriday=false;
if(checkFriday=true)
{
	%>
	<div>Its friday<%=message %></div>
	
<%}
else{%>
<div>Its not Friday!!!!!!!!</div>
<%}%>
</body>
</html>