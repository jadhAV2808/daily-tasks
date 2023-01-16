
<%-- 
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>template integration</title>
</head>
<body>

</body>
</html>

--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <jsp:include page="/include/header.jsp"/>--%>



<c:import  url="include/header.jsp" > 
<c:param name="title" value="demopage"></c:param> </c:import>

<div id="body" class="about">
	<div class="header">
		<div class="mydiv">Hello from vddfef efefsf fefef fefef</div>
		<div class="mydiv">fdevdfefsd xcsfefeffwfwf</div>
		<div class="mydiv">Hello from vddfef efefsf fefef fefef</div>
		<div class="mydiv">fdevdfefsd xcsfefeffwfwf</div>
		
	</div>
</div>

<c:import  url="include/footer.jsp"></c:import>

<%-- <jsp:include page="/include/footer.jsp"/>--%>
				
