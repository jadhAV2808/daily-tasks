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
	
	
	<!-- For adding static content -->
	<%@ include file="file1.txt" %>
	<br/>
	<!-- For adding dynamic content -->
	<jsp:include page="file2.txt"></jsp:include>

</body>
</html>