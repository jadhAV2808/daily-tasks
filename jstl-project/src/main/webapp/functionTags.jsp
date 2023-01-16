<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Insert title here</title>
	</head>
	<body>
			<h2>Length function</h2>
			${fn:length("pooja")}<br />
			<%
				String names[]={"pooja","sdsds","Sfsfcssss","sdsd"};
			%>
			<c:set var="namesAray" value="<%=names %>"></c:set>
			${fn:length(namesAray)}<br />
			<br/>
			
			<h2>trim function</h2>
			${fn:trim(" dgdfd     df           dddd")}
			<br/>
			
			<h2>escapeXml function</h2>
			
			${fn:escapeXml("<h2>escapeXml function</h2>")}
			<br/>
			
			<h2>More String related functions</h2>
			<c:set var="var" value="hi i am pooja living in pune"></c:set>
			startsWith: ${fn:startsWith(var,"hi")} <br/>
			endsWith:  ${fn:endsWith(var,"pune")} <br />
			contains: ${fn:contains(var,"pooja")} <br/>
			containsIgnoreCase:  ${fn:containsIgnoreCase(var,"I")} <br />
			
			
			<h2>More  functions</h2>
			toUpperCase: ${fn:toUpperCase("pooja jadhav") } <br />
			toLowerCase: ${fn:toLowerCase("POOJA jaDHav") } <br/>
			indexOf: ${fn:indexOf("pooja jadhav","a") } <br/>
			replace: ${fn:replace("sitaa jadhav","jadhav","mane") } <br/>
			substring: ${fn:substring("pooja jadhav",2,5) } <br/>
			substringBefore: ${fn:substringBefore("pooja jadhav"," ") } <br/>
			substringAfter: ${fn:substringAfter("pooja jadhav"," ") } <br/>
			
			
		    <h2>Split and join  functions</h2>
		    Split function: <br />
		    <c:set var="elements" value="${fn:split('www.std.eee.efe.com' ,'.')}"></c:set>
		    <c:forEach var="element" items="${elements}">${element} <br/> </c:forEach>
		    <br/>
		    Join function:  &nbsp;&nbsp; ${fn:join(elements,".")}
			
			
			
	</body>
</html>