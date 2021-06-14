<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
     String login = (String)session.getAttribute("login");
     if(login == null){
    	 response.sendRedirect("index.jsp");
    	 return;
     }
     
%>
<%=login%> 你好！欢迎你！