<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>使用session</title>
</head>
<body>

<%
session.setAttribute("test","hello");
response.sendRedirect("getSessionId.jsp");

%>

</body>
</html>