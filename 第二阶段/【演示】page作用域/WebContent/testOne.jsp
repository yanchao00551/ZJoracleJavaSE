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
    String name = "page";
    pageContext.setAttribute("name",name);
%>

<strong>
    testOne:<%= pageContext.getAttribute("name") %>
</strong>

<%
   pageContext.include("testTwo.jsp");
%>

</body>
</html>