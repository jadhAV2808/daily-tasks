<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>jstl demo</title>
</head>
<body>
	<c:set var="name" value="pooja"></c:set>
	<c:out value="${name}"></c:out><br/>  
	<h1>${name}</h1>
	<c:remove var="name" />
	<c:out value="${name}"></c:out><br/>  
	<h1>${name}</h1>

	
	<h1>${param.msg}</h1>  <br/><br/>
	
		<hr></hr>
	
	<h1>Decision making in JSTL</h1>
	
	<c:if test="${param.name=='chan'}">
		Hello Chan
	</c:if>
	<c:if test="${param.name!='chan'}">
		Hello User
	</c:if>
	
	<hr></hr>
	
	
	
	<h1>Choose tag</h1><br/>
	<c:choose>
		<c:when test="${param.lang == 'java'}">Learning Java</c:when>
		<c:when test="${param.lang == 'php'}">Learning php</c:when>
		<c:when test="${param.lang == 'c++'}">Learning c++</c:when>
		<c:otherwise>Learning Something interesting!</c:otherwise>	
	</c:choose>
	<hr></hr>
	
	<h1>ForEach Loop</h1><br/>
	<h2>default stepping</h2>
	<c:forEach var="i" begin="1" end="10">
		${i}<br/>
	</c:forEach>
	<br/><br />
	<h2>custom stepping</h2>
	<c:forEach var="i" begin="1" end="10" step="3">
		${i}<br/>
	</c:forEach>
	
	<h2>now new Loop</h2>
	<%
		String []names=new String[3];
		names[0]="pooja";
		names[1]="raman";
		names[2]="rituu";
	%>
	<c:forEach items="<%=names %>" var="name">
		${name}<br/>
	</c:forEach>
	<hr></hr>
	
	<h2>forToken attribute</h2>
	<c:forTokens items="www.study.org.com" delims="." var="temp">
		 ${temp}<br /> 
	</c:forTokens>
	<br /><br />
	<%
		String str="www.study.org.com";
	%>
	<c:forTokens items="<%=str %>" delims="." var="temp">
		 ${temp}<br /> 
	</c:forTokens>
	<hr></hr>
	
	<h2>import and param tags</h2>
	<c:import url="/include/import.jsp"></c:import>
	
	
	<hr></hr>
	
	<h2>URL and Redirect tags</h2>
	<c:url  value="/urlPage.jsp" /> <br />
	<a href="<c:url  value="/urlPage.jsp" />">Another page</a><br/>
	
	<%--this is commented to move fwd --%>
	<%-- <c:redirect url="http://google.com" /> --%>
	
	<hr></hr>
	
	<h2>catch tag for exception</h2>
	<c:catch var="exception">
		<%int x=10/0; %>
	</c:catch>
	${exception}<br/>
	${exception.message}
	<br/>
	Testing.........
	
	<hr></hr>
	
	<h2>Servlet context</h2>
	<%
		String url="<a href='http://google.com'>Home</a>";
		ServletContext context=getServletContext();
		context.setAttribute("url", url);
		
		session.setAttribute("auther","chaand");
	%>
	${url}
	<br />
	<c:out value="${url}"></c:out>
	<br />
	${auther}
	
</body>
</html>