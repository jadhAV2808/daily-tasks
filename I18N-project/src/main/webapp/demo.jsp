<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
view in :
<a href="?locale=en_US">english</a>
<a href="?locale=es_AR">Argentina</a>
<a href="?locale=hi_IN">Hindi(India)</a>

<br/>
<br/>

<fmt:setLocale value="${param.locale}" />
<fmt:bundle basename="i18n/website">
<p><fmt:message key="label.hello"/> John ,
<p><fmt:message key="label.welcome"/> 
<p><fmt:message key="label.message" /> 
<p><fmt:message key="label.thanks"/> 
</fmt:bundle>
<br />

Locale : ${param.locale}
<%-- 
<p>Hello</p>
<p>Welcome to our country</p>
<p>We are pleased to have you.</p>
<p>Thank you!</p>
--%>
</body>
</html>