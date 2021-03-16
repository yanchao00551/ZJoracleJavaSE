<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<form id="regFrm" action="UserServlet" method="post">

用户名：<input id="userName" name="userName" type="text"> <br/>
密码：<input id="password" name="password" type="password"><br/>
业余爱好：
<input name="habit" type="checkbox" value="reading">看书
<input name="habit" type="checkbox" value="game">玩游戏
<input name="habit" type="checkbox" value="travelling">旅游
<input name="habit" type="checkbox" value="swimming">旅游

<br/>
<input type="submit" value="提交">
</form>
</body>
</html>