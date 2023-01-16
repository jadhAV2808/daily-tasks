<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"  content="text/html; t-Type" />
		<title>xml tag </title>
	</head>
	<body>
		<h2>Reading data from .xml file</h2>
		<c:import url="/Users.xml"  var="XMLFile"/>
		<x:parse xml="${XMLFile}" var="XMLdoc" />
		Name: <x:out select="$XMLdoc/users/user[1]/name" /> <br/>
		Gender: <x:out select="$XMLdoc/users/user[1]/gender" /> <br/>
		Age: <x:out select="$XMLdoc/users/user[1]/age" /> <br/>
		<hr></hr>
		
		<h2>mxl's forEach and if tag</h2>
		<%-- 
		<x:forEach select="$XMLdoc/users/user">
		<x:if select="age > 24"></x:if>
			Name: <x:out select="name" /> <br />
			Gender: <x:out select="gender" /> <br />
			Age: <x:out select="age" /> <br />
		</x:forEach>
		
		
		<hr></hr>
		<h2>Table info</h2>
		 <table border="1">
		    <x:forEach var="info" select="$XMLdoc/users/user">
		        <tr>       
		      <td><x:out select="name" /></td>
		         <td><x:out select="gender" /></td>
		      <td><x:out select="age" /></td>                      
		        </tr>       
		   </x:forEach>
		  </table>
		--%>
		
		
	</body>
</html>