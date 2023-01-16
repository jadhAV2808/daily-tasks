<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>importing-class-in-jsp</title>
</head>
<body>

<!--  
	<% out.print(new java.util.Date()); %>
 -->
 
<!-- 
<%@ page import="java.util.Date" %>
<%= new Date() %>

<br />

<%@ page import="com.jsp.UserDefined" %>
<% out.print(new UserDefined().info()); %>
 --> 
 
 
 <!-- insead of doing in separate line we can use it in single line only and even we can put this line as first line. -->
 <%@ page import="java.util.Date,com.jsp.UserDefined"  %>
 
 <%
  Date d=new Date();
 
 out.print(new UserDefined().info() + " "+d);
 %>
 
 
</body>
</html>