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
//获取请求数据，并去除空格
String name = request.getParameter("userName").trim();
String pwd = request.getParameter("pwd").trim();

boolean valid = false;   //判断用户验证是否成功


if("admin".equals(name) && "admin".equals(pwd)){
	valid = true;
	//设置用户登录信息
	session.setAttribute("login",name);
	//设置session的过期时间
	session.setMaxInactiveInterval(10*60);
}

if(valid){  //登录成功
	request.getRequestDispatcher("admin.jsp").forward(request,response);
}else{  //登录失败
	response.sendRedirect("index.jsp");
}



%>
</body>
</html>