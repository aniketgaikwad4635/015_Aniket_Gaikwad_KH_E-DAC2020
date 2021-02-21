<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>

<%

List<String>list=Arrays.asList("A","B","C","D");
request.setAttribute("list",list);
%>

<jsp:forward page="4-2.jsp"></jsp:forward>