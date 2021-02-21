<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${q==1}"> 
   <div>success</div>
</c:if>

   <form action="register" method="get">
   
      <div>
        <input name="name" type="text" placeholder=" enter name"  />
      </div>
   
    <div>
        <input name="mobile" type="text" placeholder=" enter mobile"  />
      </div>
   
    <div>
        <input class="btn btn-primary btn-block" type="submit" value="register"/>
      </div>
   
   </form>



</body>
</html>