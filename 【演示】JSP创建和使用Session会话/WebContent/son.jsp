<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>子窗口获取sessionId</title>
</head>
<body>


<%
out.print("sessionid:" + session.getId());
out.print("<br/>");
%>

子窗口


</body>
</html>