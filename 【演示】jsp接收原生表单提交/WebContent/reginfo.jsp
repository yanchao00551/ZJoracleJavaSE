<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册信息</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
String[] channels = request.getParameterValues("channel");
%>


<div align = "center">你输入的注册信息
    用户名：<% out.print(name); %>    <br/>
  密码：  <%= pwd %>
  信息来源：
  <%
       if(channels != null){
    	   for(String channel:channels){
    		   out.print(channel + "&nbsp;");
    	   }
       }
  %>
</div>

</body>
</html>