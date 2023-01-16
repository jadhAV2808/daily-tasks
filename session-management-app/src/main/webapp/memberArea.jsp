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
	Member Area!!!
	
	<br/><br/>
	
	<%
	String username=null,sessionId=null;
	/*when logout using cookie
	Cookie[] cookies=request.getCookies();
	if(cookies!=null){
		
		for(Cookie c:cookies){
			if(c.getName().equals("username")){
				username=c.getValue();
			}
			if(c.getName().equals("JSESSIONID")){
				sessionId=c.getValue();
			}
		}
	}
	
	if(sessionId==null ||username==null){
		response.sendRedirect("login.jsp");
	}
	*/
	
	
	/*logout using session attribute*/
	if(request.getSession().getAttribute("username")==null)
		response.sendRedirect("login.jsp");
	else{
		username=request.getSession().getAttribute("username").toString();
		sessionId=request.getSession().getId();
	}
	
	%>
	
Username:-	<%=username %><br /><br/>
Current SessionId:- <%=sessionId %>


<form action="<%= request.getContextPath()%>/MemberAreaController" method="get">
<input type="hidden" name="action" value="destroy" />
<input type="submit"  value="logout"/>
</form>


</body>
</html>