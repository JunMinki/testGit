<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result_message</title>
</head>
<body>
	<h1>#2 message</h1>
	<h3>aaa.a2: <spring:message code="aaa.a2" arguments="${args }" /> </h3> <!-- code: 가져올 key 값, args: model에 넣은 값 -->
	<!-- code: 가져올 key 값, args: model에 넣은 값 -->
</body>
</html>