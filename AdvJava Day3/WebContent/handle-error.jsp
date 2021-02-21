<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="display:flex; flex-direction:column; align-items:center; justify-content: center; background: red; color:white; padding: 8px">
	
	<div>
		Sorry for the inconvinience!!!
		Server Error Occured.
	</div>
	
	<div>
		<%= exception %>
	</div>	
	
</div>



</body>
</html>