<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1</title>
</head>
<body>

	<h1>test1</h1>
	<form:form modelAttribute="dataBean" action="#">
		hidden : <form:hidden path="a1" /> <br />
		text : <form:input path="a2" /> <br />
		password : <form:password path="a3" showPassword="true"/> <br />
		textarea : <form:textarea path="a4" /> <br />
		<form:button>확인</form:button>
	</form:form>


<%-- 	<form action="result" method="post">
		<h2>TEXT</h2>
		hidden : <input type="text" name="a1" value="${requestScope.bean.a1 }"> <br />
		text : <input type="text" name="a2" value="${requestScope.bean.a2 }"/> <br />
		password : <input type="password" name="a3" value="${requestScope.bean.a3 }"/> <br />
		textarea : <input type="textarea" name="a4" value="${requestScope.bean.a4 }"/> <br />
		<button type="submit">확인 버튼</button>
	</form> --%>
</body>
</html>