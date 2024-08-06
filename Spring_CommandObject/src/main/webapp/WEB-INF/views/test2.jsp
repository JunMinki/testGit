<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2</title>
</head>
<body>
	<h1>test2</h1>
	<h3>data1 : ${requestScope.dataBean.data1 }</h3>
	<h3>data2 : ${requestScope.dataBean.data2 }</h3>
</body>
</html>
<!-- requestScope는 요청정보가 발생하고 그 응답 결과가 브라우저로 전달될때까지 정보가 담겨있는 작업 범 -->