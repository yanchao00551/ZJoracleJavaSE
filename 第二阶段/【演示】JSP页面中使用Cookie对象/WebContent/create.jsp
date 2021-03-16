<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加cookie</title>
</head>
<body>

<%
   Cookie newCookie = new Cookie("test","hello"); 
   Cookie newCookie1 = new Cookie("test2","world!");
   response.addCookie(newCookie);
   response.addCookie(newCookie1);
   response.sendRedirect("getCookie.jsp");
%>
</body>
</html>