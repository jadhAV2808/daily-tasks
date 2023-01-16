<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>jsp file</title>
</head>
<body>
	<h1>Hello from JSP page</h1>
	
	<%="The Expression Element is "+2*4 %>
	<br />
	
	
	<%
		int i=0;
		out.println("Scriptlet exampe is  ");
		out.print("<br/>");
		for(i=0;i<10;i++){
			
			out.print(i);
			out.print("<br/>");
		}
	%>
	
	<br />
	<%! 
		public String printInfo(){
			return "Declaration elements are used to declare methods.<br/> we can also use access specifiers in the declarations. ";
		}
	%>
	
	<%=printInfo() %>
	
	<br/>
	
	<%--this is the syntax to comment any code --%>
	
	
</body>
</html>