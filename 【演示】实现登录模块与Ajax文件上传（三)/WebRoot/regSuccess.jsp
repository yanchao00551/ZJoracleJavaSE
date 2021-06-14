<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用EL展示 Servlet传递过来的数据</title>
</head>
<body>

用户名：${requestScope.userObj.name} <br/>
密码：   ${requestScope.userObj.habits} 


</body>
</html>