<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>AddCurrency</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>

<body>

 	<div class="form-container">
 	
 	<h1>ADD Currency</h1>
 	
	<form:form method="POST" modelAttribute="currency" class="form-horizontal">

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="cod">COD</label>
				<div class="col-md-7">
					<form:input type="text" path="cod" id="cod" class="form-control input-sm"/>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="nameCurrency">Name Currency</label>
				<div class="col-md-7">
					<form:input type="text" path="nameCurrency" id="nameCurrency" class="form-control input-sm"/>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="ADD" class="btn btn-primary btn-sm">
			</div>
		</div>
	</form:form>
	</div>
</body>
</html>