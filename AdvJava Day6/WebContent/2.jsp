<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Register Here</h1>

<form id="f1" action="1.jsp" method="get">
	<div>
		<input type="text" name="username" placeholder="Enter Username..." autocomplete="#adfadf!qweqrwe"> 
	</div>
	<div>
		<input type="password" name="password" placeholder="Enter Password...">
	</div>
	<div>
		<input type="text" name="email" placeholder="Enter Email...">
	</div>
	<div>
		<input type="text" name="mobile" placeholder="Enter Mobile">
	</div>
	<div>
		<input type="button" value="Register Here" onclick="document.getElementById('f1').submit();">
	</div>
</form>

</body>
</html>