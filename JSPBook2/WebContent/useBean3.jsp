<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request"/>
	<P>아이디 : <%=person.getId() %>
	<P>이름 : <%=person.getName() %>
</body>
</html>