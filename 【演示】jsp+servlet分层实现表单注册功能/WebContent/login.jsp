<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="org.news.entity.NewsUser" %>
<%@ page import="org.news.dao.impl.NewUserDaoImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
</head>
<body>

<form name="form1" method="post" action="">
    用户名：<input type="text" name="userName">
    密码：<input type="password" name="pwd">
    <input type="submit" value="登录"/>
</form>
</body>
</html>