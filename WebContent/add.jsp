<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="biege">
	<%@ include file="Header.jsp" %>
	<%-- <%@page import          
	  %>          
	                   										 Directive   --%>  
	<%!   																	//Declaration
		int a = 92;
	%>
	
	
	
	<%																		//Scriplet
		try{	
			int  i = Integer.parseInt(request.getParameter("num1"));
			int  j = Integer.parseInt(request.getParameter("num2"));
			int k = i + j; 
			int z = a/0;
			out.println("THis is the Result which is visible in JSP "+k);
			out.println("THis is the Result which is visible in JSP "+a);
		}
		catch(Exception e){
			out.println(e.getMessage());
		}

	%>
	<br>
	<%= "this is it" %>													<!-- Expression -->
</body>
</html>