<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<%
	List<String> list = Arrays.asList("Delhi","Kolkata", "Mumbai", "Chennai");
	request.setAttribute("cityList", list);
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>JSP For Loop</h1>


<c:forEach var="city" items="${cityList}" varStatus="myIndex">
	
	<c:if test="${myIndex.index % 2 == 0 }">
		<div style="color:green">${city}</div>
	</c:if>
	
	<c:if test="${myIndex.index % 2 != 0 }">
		<div style="color:red">${city}</div>
	</c:if>
	
</c:forEach>


</body>
</html>
