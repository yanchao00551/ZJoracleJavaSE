<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
     String path = request.getContextPath();
     String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学员注册</title>
</head>
<body>

<div align="center">
   <form name="form1" method="post" action="reginfo.jsp">
           用户名：<input type="text" name="name"/><br/>
           密码：<input type="text" name="pwd"/><br/>
           信息来源： 
           <input type="checkbox" name="channel" value="报刊">报刊
           <input type="checkbox" name="channel" value="网络">网络
           <input type="checkbox" name="channel" value="朋友推荐">朋友推荐
           <input type="checkbox" name="channel" value="电视">电视
           <br/>
    <input type="submit" name="Submit" value="提交"/>
    
    <img src="<%= basePath %>/files/1.jpg"/>
    <br/>
    
    
    取相对路径：<%= path %>
    取完整基础绝对路径：<%= basePath %>
    
   </form>
</div>
</body>
</html>