<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriptlet and Expression with for and If</h1>
<%
for(int i=0;i<10;i++){
	%>}
	<%if(i%2==0){
		%><div style="color:red">Hello</div>
		<%}else{
			%><div style="color:blue">Hello
</div>
<%} %>
<% }%>
</body>
</html>