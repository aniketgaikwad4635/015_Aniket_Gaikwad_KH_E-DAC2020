 <%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:include page="3-1.jsp"></jsp:include>
   <jsp:include page="3-2.jsp"></jsp:include>
   <%
   String city=(String)request.getAttribute("city");
   int id = (Integer)request.getAttribute("id");
   List<String>list=(List<String>)request.getAttribute("list");
   
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Include Demo::using request</h1>
<div><%=city %><%=id  %></div>
<%
for(int i=0;i<list.size();i++){
	%>
	<div style="color:green;font-family:cursive">
	<%=list.get(i) %>
	</div>
<% }
%>
</body>
</html>