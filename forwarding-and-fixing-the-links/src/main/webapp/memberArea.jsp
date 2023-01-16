<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>memberArea</title>
</head>
<body>
	<%
		String username = null, sessionID = null;
	    if(request.getSession().getAttribute("username") == null){
	    	response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
	    }else{
	    	username = request.getSession().getAttribute("username").toString();
	    	sessionID = request.getSession().getId();
	    }
	 

	%>
	Username:
	<%=username%><br /> Current session:
	<%=sessionID%><br /> memberArea!!
    <form action="<%= request.getContextPath()%>/MemberAreaController" method="get">
    <input type="hidden" name="action" value="destroy">
    <input type="submit" value="logout">
    </form>
</body>
</html>
