<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>#5. JSR-250 </title>
</head>
<body>
<h1>input</h1>
<form:form action="input_proJsr250" modelAttribute="dataBean6" method="post">
data1 : <form:radiobutton path="data1" value="true"/> true
<form:radiobutton path="data1" value="false"/> false <br />
<form:errors path="data1"/> <br />
data2 : <form:radiobutton path="data2" value="true"/> true
<form:radiobutton path="data2" value="false"/> false <br />
<form:errors path="data2"/> <br />
data3: <form:input path="data3" type="text"/> <br />
<form:errors path="data3"/> <br />

data4: <form:input path="data4" type="text"/> <br />
<form:errors path="data4"/> <br />

data5: <form:checkbox path="data5" value="check1"/>checkbox1 <br />
<form:errors path="data5"/> <br />
data6: <form:checkbox path="data6" value="check2"/>checkbox2 <br />
<form:errors path="data6"/> <br />


data7: <form:input path="data7" type="txt"/> <br />
<form:errors path="data7"/> <br />

패스워드 : <form:password path="password"/> <br />
<form:errors path="password"/> <br />

<form:button type="submit">확인</form:button>

</form:form>

</body>
</html>