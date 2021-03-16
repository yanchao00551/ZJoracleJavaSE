<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>获取sessionid</title>
</head>
<body>


<%
out.print("sessionid: " + session.getId());
out.print("<br/>");
%>


<a href="son.jsp">子窗口</a>

</body>
</html>