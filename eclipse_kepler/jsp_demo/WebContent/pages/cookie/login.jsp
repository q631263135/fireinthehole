<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user logon</title>
<style type="text/css">
	body {
		background: #000 url("<%=path%>/images/20180124_115621_001.jpg") no-repeat fixed;
	}

</style>
</head>
<body>
	<form action="loginSuccess.jsp" method="post">
		userName: <input type="text" name="userName" />
		password: <input type="password" name="userPassWord" />
		
		<input type="submit" value="submit" />
	</form>
</body>
</html>