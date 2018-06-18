
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>DATE</title>
        <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    </head>
    <body>
       <h3>select operation</h3>
       <div class="top_links">
            <a href="${pageContext.request.contextPath}/welcome">welcome</a>
            <a href="${pageContext.request.contextPath}/addCurrency">currency</a>
            <a href="${pageContext.request.contextPath}/addRate">rate</a>
        </div> 
    </body>
</html>
