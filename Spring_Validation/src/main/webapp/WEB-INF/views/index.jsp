<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>10.유효성 검사</title>
</head>
<body>
	<!-- #1 properties -->
	<a href="properties">1.Properties</a>
	<br />

	<!-- #2 message -->
	<!-- <a href="message">2.message</a> -->
	<form action="message">
		2.Message <br /> 이름 : <input type="text" name="name" /> <br /> 나이 :
		<input type="text" name="age" /> <br /> <input type="submit"
			name="입력" /> <br />
	</form>
	<br />
	<!-- #3 Validate -->
	<a href="validate">3.Validate</a>
	<br />

	<!-- #4 -->
	<a href="validationMessage">4.Validation Message</a>
	<br />

	<!-- #5 JSR-250 -->
	<a href="jsr250">5.JSR-250</a>
	<br />
	
	<!-- #6 JSR-380 -->
	<a href="jsr380">6.JSR-380</a>
	<br />
	
	<!-- #7  < %> -->
	<a href="customValidator">7.Custom Validator</a> <br />
	
	
	
</body>
</html>