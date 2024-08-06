<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "test1?data1=100&data2=200&data3=300&data3=400">test1</a>
	<br />
	<hr />
	<form action="test2" method = "post">
		data1: <input type = "text" name="data1" /> <br />
		data2: <input type = "text" name="data2" /> <br />		
		data3: <input type = "checkbox" value="100" name="data3"/>100
			   <input type = "checkbox" value="200" name="data3"/>200
		<button type="submit">test2</button>
	</form>
	<br />
	<hr />
	<a href = "test3?data1=100&data2=200&data3=300&data3=400">test3</a>

	<br />
	<hr />
	<a href="test3/100/200/300">test3</a>
	
	<br />
	<hr />
	<a href = "test4?data1=100&data2=200&data3=300&data3=400">test4</a>
	
	<br />
	<hr />
	<a href = "test5?data1=100&data2=200&data3=300&data3=400">test5</a>
	
	<br />
	<hr />
	<a href = "test6?data1=100">test6</a>
</body>
</html>