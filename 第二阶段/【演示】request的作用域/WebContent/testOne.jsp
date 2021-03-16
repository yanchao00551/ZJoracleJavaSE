<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%
    String name = "request";
    request.setAttribute("name",name);
    request.getRequestDispatcher("testTwo.jsp").forward(request,response);
   // response.sendRedirect("testTwo.jsp");
%>


</body>
</html>