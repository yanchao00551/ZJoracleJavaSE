<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录处理页面</title>
</head>
<body>

<%
       request.setCharacterEncoding("UTF-8");
       String name = request.getParameter("userName");
       String pwd = request.getParameter("pwd");
       if ("sa".equals(name) && "sa".equals(pwd)) { //重定向转发
  		   request.getRequestDispatcher("welcome.jsp").forward(request,response);
  	   }
%>
</body>
</html>