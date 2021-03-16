<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>

<%
         Integer count = (Integer)application.getAttribute("count");
         if(count != null){
        	 count = 1 + count;
         }else{
        	 count = 1;
         }
         application.setAttribute("count",count);

%>


</head>
<body>

<form name="form1" method="post" action="showCount.jsp">
用户名：
<input type="text" name="userName">
密码：
<input type="password" name="pwd">
<input type="submit" value="登录">
</form>

</body>
</html>