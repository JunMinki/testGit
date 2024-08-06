<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	<h3>정보수정이 완료되었습니다.</h3>
   이름 : ${requestScope.bean.user_name } <br />
   아이디 : ${bean.user_id } <br />
   비밀번호 : ${bean.user_pw } <br />
   우편번호 : ${bean.user_postcode } <br />
   주소1 : ${bean.user_address1 } <br />
   주소2 : ${bean.user_address2 } <br />
</body>
</html>