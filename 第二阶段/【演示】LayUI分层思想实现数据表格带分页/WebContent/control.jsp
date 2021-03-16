<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
<%@ page import="org.news.entity.NewsUser" %>
<%@ page import="org.news.dao.NewUserDao" %>
<%@ page import="org.news.dao.impl.NewUserDaoImpl" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册处理页面</title>
</head>
<body>

<%

if(request.getMethod().equals("POST")){
    String name = (String)request.getParameter("username");
    String pwd = (String)request.getParameter("password");
    
    NewsUser newsUser = new NewsUser();
    newsUser.setUname(name);
    newsUser.setUpwd(pwd);

    
    NewUserDao newUserDao = new NewUserDaoImpl();  //DAO实例化  调用插入方法
    int result = newUserDao.insert(newsUser);
    
    if(result > 0){
    	response.sendRedirect("login.jsp");
    }else{
    	request.getRequestDispatcher("register.jsp").forward(request, response);
    }
}

   
%>

</body>
</html>