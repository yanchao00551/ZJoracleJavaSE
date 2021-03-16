<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
     String path = request.getContextPath();
     String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

     request.setCharacterEncoding("UTF-8");
     String name = request.getParameter("userName");
     String pwd = request.getParameter("pwd");
     out.print(name);
     out.print(pwd);

%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>欢迎界面</title>
</head>
<body>

<div align="center">
<h1>欢迎来到这里！！</h1>
</div>
</body>
</html>