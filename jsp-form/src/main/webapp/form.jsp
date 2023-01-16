<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>jsp form</title>
</head>

<body>

	<!--  <form action="submit.jsp" method="get">  -->
	<form action=<%= request.getContextPath()%>/Controller  method="get">
		Full Name: <input type="text" name="name" required/> <br />
		Gender: <input type="radio" name="gender" value="male" checked="checked" />Male
		        <input type="radio" name="gender" value="male" />Female<br />
		        
        Language Know: <input type="checkbox" name="language" value="english" />English
                       <input type="checkbox" name="language" value="hindi" />Hindi
                       <input type="checkbox" name="language" value="marathi" />Marathi<br />
        Country: <select name="country">
        			<option value="india">India</option>
        			<option value="Russia">Russia</option>
        			<option value="USA">USA</option>
        			<option value="UK">UK</option>
        			<option value="china">china</option>
                </select><br/>
                <input  type="submit" value="Submit"/>
                
	</form>

</body>
</html>