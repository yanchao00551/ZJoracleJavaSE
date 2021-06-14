<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
<%
     Integer i = (Integer)application.getAttribute("count");
     out.print("统计访问量：目前有，" + i + " 个人访问过本网站");
%>