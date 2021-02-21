<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	// Ideally set is done in some other program :: Servlet :: JSP
	request.setAttribute("city", "Mumbai");
	request.setAttribute("id", 100);
	
	
	// Now get the value from the request.
	String city = (String)request.getAttribute("city");
	int id = (Integer)request.getAttribute("id");
%>    
    
    
<!DOCTYPE html><html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

2nd program <%= city %> <%= id %>

</body>
</html>