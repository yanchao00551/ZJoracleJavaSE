<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>管理员</title>
</head>
<body>
<%
String login = (String)session.getAttribute("login");
if(login == null){
	response.sendRedirect("index.jsp");
}
%>
<%=login%> 你好！欢迎你！
</body>
</html>