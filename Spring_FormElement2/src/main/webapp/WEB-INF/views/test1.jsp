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
	<form:form action="#" modelAttribute="dataBean" method="post">
		<form:select path="a1">
			<form:option value="data1">항목1</form:option>
			<form:option value="data2">항목2</form:option>
			<form:option value="data3">항목3</form:option>
		</form:select>
		
		<!-- 간단하게 배열을 불러옴 -->
		<br />
		<form:select path="a2">
			<form:options items="${list1 }" />
		</form:select>
		
		<br />
		<form:select path="a3">
			<form:options items="${list2 }" />
		</form:select>
		
		<br />
		<form:select path="a4">
			<form:options items="${list3 }" itemLabel="key" itemValue="value" />
		</form:select>
		<br />
		
		<form:checkbox path="a5" value="data1"/>항목1
		<form:checkbox path="a5" value="data2"/>항목2
		<form:checkbox path="a5" value="data3"/>항목3
		<br />
		<form:checkboxes items="${list1}" path="a6"/>
		<br />
		<form:checkboxes items="${list2}" path="a7"/>
		<br />
		<form:radiobutton path="a8" value="data1"/>항목1
		<form:radiobutton path="a8" value="data2"/>항목2
		<form:radiobutton path="a8" value="data3"/>항목3
		<br />
		<form:radiobuttons path="a9" items="${list1 }"/>
		<br />
		<form:radiobuttons path="a10" items="${list2 }"/>
		
		<form:button>제출</form:button>
	</form:form>
</body>
</html>